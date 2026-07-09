package net.tearpelato.falldrop_backport.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Util;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StrawBedBlock extends BedBlock {
    public static final Map<UUID, BlockPos> SLEEPERS = new HashMap<>();
    private static final VoxelShape BASE_SHAPE = Block.column((double)16.0F, (double)0.0F, (double)4.0F);
    private static final VoxelShape PILLOW_SHAPE = Block.box((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)5.0F, (double)8.0F);
    private static final Map<Direction, VoxelShape> FOOT_SHAPES = (Map) Util.make(() -> Shapes.rotateHorizontal(BASE_SHAPE));
    private static final Map<Direction, VoxelShape> HEAD_SHAPES = (Map)Util.make(() -> Shapes.rotateHorizontal(Shapes.or(BASE_SHAPE, PILLOW_SHAPE)));

    public StrawBedBlock(DyeColor color, Properties properties) {
        super(color, properties);
    }

    @Override
    protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
        Map<Direction, VoxelShape> shapes = state.getValue(PART) == BedPart.HEAD ? HEAD_SHAPES : FOOT_SHAPES;
        return (VoxelShape)shapes.get(getConnectedDirection(state).getOpposite());
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                               Player player, BlockHitResult hit) {
        InteractionResult result = super.useWithoutItem(state, level, pos, player, hit);

        if (!level.isClientSide() && result.consumesAction()) {
            BlockPos headPos = state.getValue(PART) == BedPart.HEAD
                    ? pos
                    : pos.relative(state.getValue(FACING));

            SLEEPERS.put(player.getUUID(), headPos);
        }

        return result;
    }

}
