package net.tearpelato.falldrop_backport.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AttachedToLogsDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.custom.ShelfMushroomBlock;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_SHRUB = registerKey("red_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_TREE = registerKey("poplar_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_RED = registerKey("poplar_red");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_ORANGE = registerKey("poplar_orange");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_YELLOW = registerKey("poplar_yellow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHELF_MUSHROOM = registerKey("shelf_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_POPLAR = registerKey("fallen_poplar");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        register(context, RED_SHRUB, Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(PlacementUtils.inlinePlaced(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_SHRUB.get())),
                                CountPlacement.of(32),
                                RandomOffsetPlacement.ofTriangle(6, 3),
                                BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)))));



            context.register(POPLAR_RED, new ConfiguredFeature<>(Feature.TREE,
                    createPoplar(ModBlocks.RED_POPLAR_LEAVES.get()).build()));

            context.register(POPLAR_ORANGE, new ConfiguredFeature<>(Feature.TREE,
                    createPoplar(ModBlocks.ORANGE_POPLAR_LEAVES.get()).build()));

            context.register(POPLAR_YELLOW, new ConfiguredFeature<>(Feature.TREE,
                    createPoplar(ModBlocks.YELLOW_POPLAR_LEAVES.get()).build()));

            var lookup = context.lookup(Registries.CONFIGURED_FEATURE);

            context.register(POPLAR_TREE, new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(
                            List.of(
                                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(lookup.getOrThrow(POPLAR_RED)), 0.33f),
                                    new WeightedPlacedFeature(PlacementUtils.inlinePlaced(lookup.getOrThrow(POPLAR_ORANGE)), 0.33f)),
                                    PlacementUtils.inlinePlaced(lookup.getOrThrow(POPLAR_YELLOW)))));

        context.register(SHELF_MUSHROOM, new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(
                        BlockStateProvider.simple(ModBlocks.SHELF_MUSHROOM.get())
                )
        ));

        context.register(FALLEN_POPLAR, new ConfiguredFeature<>(Feature.FALLEN_TREE,
                createFallenPoplar().build()));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    private static TreeConfiguration.TreeConfigurationBuilder createPoplar(Block leaves) {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG.get()),
                new FancyTrunkPlacer(6, 2, 0),
                BlockStateProvider.simple(leaves),
                new FancyFoliagePlacer(
                        ConstantInt.of(3),
                        ConstantInt.of(4),
                        4
                ),
                new TwoLayersFeatureSize(1, 0, 2)
        ).ignoreVines();
    }



    private static FallenTreeConfiguration.FallenTreeConfigurationBuilder createFallenPoplar() {
        return new FallenTreeConfiguration.FallenTreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X)),
                UniformInt.of(3, 5))
                .logDecorators(ImmutableList.of(
        new AttachedToLogsDecorator(
                0.25f,
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(ModBlocks.SHELF_MUSHROOM.get().defaultBlockState(),2)
                                .add(ModBlocks.SHELF_MUSHROOM.get().defaultBlockState(), 2)
                                .add(ModBlocks.SHELF_MUSHROOM.get().defaultBlockState(), 2)
                                .add(ModBlocks.SHELF_MUSHROOM.get().defaultBlockState(), 2)),
                List.of(Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST))
                )).stumpDecorators(ImmutableList.of(TrunkVineDecorator.INSTANCE));
    }
}
