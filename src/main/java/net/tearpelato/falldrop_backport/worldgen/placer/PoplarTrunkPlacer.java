package net.tearpelato.falldrop_backport.worldgen.placer;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.IntProviders;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.tearpelato.falldrop_backport.init.ModTrunkPlacerTypes;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PoplarTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<PoplarTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec((i) -> trunkPlacerParts(i).and(i.group(IntProviders.codec(0, 8).fieldOf("trunk_height_above_branches").forGetter((t) -> t.trunkHeightAboveBranches), IntProviders.codec(1, 4).fieldOf("branch_amount").forGetter((t) -> t.branchAmount))).apply(i, PoplarTrunkPlacer::new));
    private final IntProvider trunkHeightAboveBranches;
    private final IntProvider branchAmount;

    public PoplarTrunkPlacer(final int baseHeight, final int heightRandA, final int heightRandB, final IntProvider trunkHeightAboveBranches, final IntProvider branchAmount) {
        super(baseHeight, heightRandA, heightRandB);
        this.trunkHeightAboveBranches = trunkHeightAboveBranches;
        this.branchAmount = branchAmount;
    }

    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.POPLAR_TRUNK_PLACER;
    }


    public List<FoliagePlacer.FoliageAttachment> placeTrunk(WorldGenLevel level, BiConsumer<BlockPos, BlockState> trunkSetter, RandomSource random, int treeHeight, BlockPos origin, TreeConfiguration tree) {
        placeBelowTrunkBlock(level, trunkSetter, random, origin.below(), tree);
        int trunkHeightUpToFoliageBranches = treeHeight - this.trunkHeightAboveBranches.sample(random);

        for(int y = 0; y < treeHeight; ++y) {
            this.placeLog(level, trunkSetter, random, origin.above(y), tree);
            List<Direction> getListOfDirections = getRandomBranchDirection(random);
            if (trunkHeightUpToFoliageBranches - 1 == y) {
                for(int x = 0; x < this.branchAmount.sample(random); ++x) {
                    Direction branchDirection = (Direction)getListOfDirections.get(x);
                    this.placeLog(level, trunkSetter, random, origin.above(y).relative(branchDirection, 1), tree, getSidewaysStateModifier(branchDirection));
                }
            }
        }

        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(origin.above(trunkHeightUpToFoliageBranches), 0, false));
    }

    private static Function<BlockState, BlockState> getSidewaysStateModifier(final Direction branchDirection) {
        return (state) -> (BlockState)state.trySetValue(RotatedPillarBlock.AXIS, branchDirection.getAxis());
    }

    private static List<Direction> getRandomBranchDirection(final RandomSource random) {
        return (List)Direction.allShuffled(random).stream().filter((direction) -> !direction.getAxis().isVertical()).collect(Collectors.toList());
    }
}
