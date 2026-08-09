package net.tearpelato.falldrop_backport.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Util;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.attribute.BedRule;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tearpelato.falldrop_backport.block.custom.core.AbstractBedBlock;
import net.tearpelato.falldrop_backport.init.ModSounds;
import net.tearpelato.falldrop_backport.init.ModStats;

import java.util.Map;
import java.util.OptionalDouble;

public class StrawBedBlock extends AbstractBedBlock {
    private static final VoxelShape BASE_SHAPE = Block.column(16.0, 0.0, 4.0);
    private static final VoxelShape PILLOW_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 5.0, 8.0);
    private static final Map<Direction, VoxelShape> FOOT_SHAPES = Util.make(() -> Shapes.rotateHorizontal(BASE_SHAPE));
    private static final Map<Direction, VoxelShape> HEAD_SHAPES = Util.make(() -> Shapes.rotateHorizontal(Shapes.or(BASE_SHAPE, PILLOW_SHAPE)));

    public static final MapCodec<StrawBedBlock> CODEC = simpleCodec(StrawBedBlock::new);

    public StrawBedBlock(final Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private void destroyBed(final Level level, final BlockPos pos) {
        BlockState state = level.getBlockState(pos);
        if (!state.is(this)) {
            return;
        }

        Direction otherDirection = state.getValue(PART) == BedPart.HEAD ? state.getValue(FACING).getOpposite() : state.getValue(FACING);
        BlockPos otherPos = pos.relative(otherDirection);
        BlockState otherState = level.getBlockState(otherPos);

        level.playSound(null, pos, ModSounds.STRAW_BED_BREAK_LEAVE.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
        level.removeBlock(pos, false);
        if (otherState.is(this) && otherState.getValue(PART) != state.getValue(PART) && otherState.getValue(FACING) == state.getValue(FACING)) {
            level.removeBlock(otherPos, false);
        }
    }

    @Override
    protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
        Map<Direction, VoxelShape> shapes = state.getValue(PART) == BedPart.HEAD ? HEAD_SHAPES : FOOT_SHAPES;
        return shapes.get(getConnectedDirection(state).getOpposite());
    }

    @Override
    public void spawnDestroyParticles(Level level, Player player, BlockPos pos, BlockState state) {
        level.levelEvent(2014, pos, getId(state));
    }

    @Override
    public Identifier getSleptInBedStatType() {
        return ModStats.SLEEP_IN_STRAW_BED.get();
    }

    @Override
    public OptionalDouble getSleepHeight(final BlockState state, final Level level, final BlockPos pos) {
        BlockPos layingOnPos;
        BlockState layingOnState;
        if (state.getValue(BedBlock.PART) == BedPart.HEAD) {
            layingOnPos = pos.relative(getConnectedDirection(state));
            layingOnState = level.getBlockState(layingOnPos);
            if (!layingOnState.is(this) || layingOnState.getValue(BedBlock.PART) != BedPart.FOOT) {
                return OptionalDouble.empty();
            }
        } else {
            layingOnPos = pos;
            layingOnState = state;
        }

        return super.getSleepHeight(layingOnState, level, layingOnPos);
    }

    @Override
    public boolean shouldDestroyOnUse(Level level, BlockPos pos, BedRule bedRule) {
        return bedRule.explodes();
    }

    @Override
    public boolean shouldDestroyOnLeave(Level level, BlockPos pos, BedRule bedRule) {
        return true;
    }

    @Override
    public boolean canSetSpawn() {
        return false;
    }

    @Override
    protected InteractionResult destroyOnUse(final BlockState state, final Level level, final BlockPos pos, final Player player) {
        this.destroyBed(level, pos);
        return InteractionResult.SUCCESS_SERVER;
    }

    @Override
    protected void destroyOnLeave(final Level level, final BlockPos pos) {
        this.destroyBed(level, pos);
    }
}