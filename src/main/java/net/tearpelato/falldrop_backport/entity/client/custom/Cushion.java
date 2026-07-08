package net.tearpelato.falldrop_backport.entity.client.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.decoration.BlockAttachedEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;
import org.jspecify.annotations.Nullable;

public class Cushion extends BlockAttachedEntity {

    private static final DyeColor DEFAULT_COLOR;

    private static final EntityDataAccessor<Byte> DATA_COLOR;


    public Cushion(final EntityType<Cushion> type, final Level level) {
        super(type, level);
    }


    public DyeColor getColor() {
        return DyeColor.byId(this.entityData.get(DATA_COLOR));
    }


    public void setColor(final DyeColor color) {
        this.entityData.set(DATA_COLOR, (byte) color.getId());
    }


    public boolean dampensVibrations() {
        return true;
    }


    public void dropItem(final ServerLevel level, final @Nullable Entity causedBy) {

        //this.playSound(SoundEvents.CUSHION_BREAK, 1.0F, 1.0F);

        this.showBreakingParticles();

        if ((Boolean) level.getGameRules().get(GameRules.ENTITY_DROPS)) {

            if (causedBy instanceof Player player) {

                if (player.hasInfiniteMaterials()) {
                    return;
                }
            }


            this.spawnAtLocation(level, ModItems.WHITE_CUSHION);
        }
    }


    public InteractionResult interact(
            final Player player,
            final InteractionHand hand,
            final Vec3 location
    ) {

        if (!player.isSecondaryUseActive()
                && !this.isVehicle()
                && (this.level().isClientSide()
                || player.startRiding(this))) {


            if (!this.level().isClientSide()) {

                //this.playSound(SoundEvents.CUSHION_SIT, 1.0F, 1.0F);

                return InteractionResult.CONSUME;

            } else {

                return InteractionResult.SUCCESS;
            }

        } else {

            return InteractionResult.PASS;
        }
    }


    protected void removePassenger(final Entity passenger) {

        super.removePassenger(passenger);

        if (!this.level().isClientSide()
                && this.getRemovalReason() == null) {

            //this.playSound(SoundEvents.CUSHION_GET_UP, 1.0F, 1.0F);
        }
    }


    public ItemStack getPickResult() {
        return new ItemStack(ModItems.getCushion(this.getColor()));

    }


    protected void tickAtCheckInterval() {

        if (this.level() instanceof ServerLevel) {

            BlockPos blockPos = this.blockPosition();

            FluidState fluidState =
                    this.level().getBlockState(blockPos).getFluidState();


            if (this.collidedWithFluid(
                    fluidState,
                    blockPos,
                    this.position(),
                    this.position()
            )) {

                fluidState.entityInside(
                        this.level(),
                        blockPos,
                        this,
                        InsideBlockEffectApplier.NOOP
                );
            }
        }
    }


    public void setPos(
            final double x,
            final double y,
            final double z
    ) {

        this.setPosRaw(x, y, z);

        super.setPos(x, y, z);
    }


    private void showBreakingParticles() {

        Level var2 = this.level();


        if (var2 instanceof ServerLevel level) {

            level.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, ModBlocks.getWool(this.getColor()).defaultBlockState()),
                    this.getX(),
                    this.getY(2.0 / 3.0),
                    this.getZ(),
                    10,
                    this.getBbWidth() / 4.0,
                    this.getBbHeight() / 4.0,
                    this.getBbWidth() / 4.0,
                    0.05
            );


        }
    }


    public static boolean wouldSuriveAt(
            final Level level,
            final AABB boundingBox
    ) {

        AABB anchorBox = new AABB(
                boundingBox.minX,
                boundingBox.minY - (double) 0.015625F,
                boundingBox.minZ,
                Math.nextDown(boundingBox.maxX),
                boundingBox.minY,
                Math.nextDown(boundingBox.maxZ)
        );


        for (BlockPos blockPos : BlockPos.betweenClosed(anchorBox)) {

            BlockState blockState =
                    level.getBlockState(blockPos);

            VoxelShape shape =
                    blockState.getShape(level, blockPos);


            if (!shape.isEmpty()
                    && shape.bounds()
                    .move(blockPos)
                    .intersects(anchorBox)) {

                return true;
            }
        }


        return false;
    }


    public boolean survives() {

        Level level = this.level();

        AABB boundingBox = this.getBoundingBox();


        if (!wouldSuriveAt(level, boundingBox)) {

            return false;

        } else {


            for (BlockPos blockPos :
                    BlockPos.betweenClosed(
                            boundingBox.deflate(1.0E-7)
                    )) {


                if (!level.getBlockState(blockPos)
                        .isCollisionShapeFullBlock(level, blockPos)) {

                    return true;
                }
            }

            return false;
        }
    }


    protected void recalculateBoundingBox() {

        this.setBoundingBox(this.makeBoundingBox());
    }


    protected void defineSynchedData(final SynchedEntityData.Builder entityData) {
        entityData.define(DATA_COLOR, (byte) DEFAULT_COLOR.getId());
    }


    protected void addAdditionalSaveData(final ValueOutput output) {

        super.addAdditionalSaveData(output);
        output.store("color", DyeColor.CODEC, this.getColor());
    }


    protected void readAdditionalSaveData(final ValueInput input) {

        super.readAdditionalSaveData(input);
        this.setColor((DyeColor) input.read("color", DyeColor.CODEC).orElse(DEFAULT_COLOR));
    }


    static {
        DEFAULT_COLOR = DyeColor.WHITE;
        DATA_COLOR = SynchedEntityData.defineId(Cushion.class, EntityDataSerializers.BYTE);
    }
}