package net.tearpelato.falldrop_backport.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class ShelfMushroomBlock extends HorizontalDirectionalBlock {
    public static final VoxelShape SHAPE_SOUTH = Block.box(3, 7, 0, 13, 10, 7);
    public static final VoxelShape SHAPE_NORTH = Block.box(3, 7, 9, 13, 10, 16);
    public static final VoxelShape SHAPE_WEST  = Block.box(9, 7, 3, 16,  10, 13);
    public static final VoxelShape SHAPE_EAST  = Block.box(0, 7, 3, 7, 10, 13);
    public static final MapCodec<ShelfMushroomBlock> CODEC = simpleCodec(ShelfMushroomBlock::new);


    public ShelfMushroomBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case SOUTH -> SHAPE_SOUTH;
            case WEST  -> SHAPE_WEST;
            case EAST  -> SHAPE_EAST;
            default    -> SHAPE_NORTH;
        };
    }

    @Override
    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, double fallDistance) {
        if (entity.isSuppressingBounce()) {
            super.fallOn(level, state, pos, entity, fallDistance);
        } else {
            entity.causeFallDamage(fallDistance, 0.0F, level.damageSources().fall());
        }
    }


    public void updateEntityMovementAfterFallOn(BlockGetter level, Entity entity) {
        if (entity.isSuppressingBounce()) {
        } else {
            this.bounceUp(entity);
        }
    }

    private void bounceUp(Entity entity) {
        Vec3 deltaMovement = entity.getDeltaMovement();
        if (deltaMovement.y < 0.0) {
            double multiplier = entity instanceof LivingEntity ? 1.0 : 0.8;
            entity.setDeltaMovement(deltaMovement.x, -deltaMovement.y * multiplier, deltaMovement.z);
        }
    }
    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

}
