package net.tearpelato.falldrop_backport.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.attribute.BedRule;
import net.minecraft.world.attribute.EnvironmentAttribute;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tearpelato.falldrop_backport.block.custom.util.AbstractBedBlock;
import net.tearpelato.falldrop_backport.init.ModStats;

import java.util.Map;

public class StrawBedBlock extends AbstractBedBlock {
    private static final VoxelShape BASE_SHAPE = Block.column((double)16.0F, (double)0.0F, (double)4.0F);
    private static final VoxelShape PILLOW_SHAPE = Block.box((double)0.0F, (double)0.0F, (double)0.0F, (double)16.0F, (double)5.0F, (double)8.0F);
    private static final Map<Direction, VoxelShape> FOOT_SHAPES = (Map) Util.make(() -> Shapes.rotateHorizontal(BASE_SHAPE));
    private static final Map<Direction, VoxelShape> HEAD_SHAPES = (Map)Util.make(() -> Shapes.rotateHorizontal(Shapes.or(BASE_SHAPE, PILLOW_SHAPE)));
    public static final MapCodec<StrawBedBlock> CODEC = simpleCodec(StrawBedBlock::new);

    public StrawBedBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private void destroyBed(final Level level, final BlockPos pos) {
        //level.playSound((Entity)null, pos, SoundEvents.STRAW_BED_BREAK_LEAVE, SoundSource.BLOCKS, 1.0F, 1.0F);
        level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
    }

    protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
        Map<Direction, VoxelShape> shapes = state.getValue(PART) == BedPart.HEAD ? HEAD_SHAPES : FOOT_SHAPES;
        return (VoxelShape)shapes.get(getConnectedDirection(state).getOpposite());
    }

    protected EnvironmentAttribute<BedRule> getBedEnvironmentAttribute() {
        return EnvironmentAttributes.BED_RULE;
    }

    public void spawnDestroyParticles(final Level level, final BlockPos pos, final BlockState state) {
        level.levelEvent(2014, pos, getId(state));
    }

    public Identifier getSleptInBedStatType() {
        return ModStats.SLEEP_IN_STRAW_BED.get();
    }

    public double getSleepHeight(final BlockState state, final Level level, final BlockPos pos) {
        BlockPos layingOnPos;
        BlockState layingOnState;
        if (state.getValue(BedBlock.PART) == BedPart.HEAD) {
            layingOnPos = pos.relative(getConnectedDirection(state));
            layingOnState = level.getBlockState(layingOnPos);
        } else {
            layingOnPos = pos;
            layingOnState = state;
        }

        return super.getSleepHeight(layingOnState, level, layingOnPos);
    }

    protected InteractionResult destroyOnUse(final BlockState state, final Level level, final BlockPos pos, final Player player) {
        this.destroyBed(level, pos);
        return InteractionResult.SUCCESS_SERVER;
    }

    protected void destroyOnLeave(final Level level, final BlockPos pos) {
        this.destroyBed(level, pos);
    }
}
