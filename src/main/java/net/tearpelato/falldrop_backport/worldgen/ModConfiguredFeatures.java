package net.tearpelato.falldrop_backport.worldgen;

import net.minecraft.core.Direction;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AttachedToLogsDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.PlaceOnGroundDecorator;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.worldgen.placer.PoplarFoliagePlacer;
import net.tearpelato.falldrop_backport.worldgen.placer.PoplarTrunkPlacer;
import net.tearpelato.falldrop_backport.worldgen.placer.decorator.ShelfMushroomDecorator;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_SHRUB = registerKey("red_shrub");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_TREE = registerKey("poplar_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_TREES = registerKey("poplar_trees");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_RED = registerKey("poplar_red");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_ORANGE = registerKey("poplar_orange");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_YELLOW = registerKey("poplar_yellow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHELF_MUSHROOM = registerKey("shelf_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FALLEN_POPLAR = registerKey("fallen_poplar");
    public static final ResourceKey<ConfiguredFeature<?,?>> RED_POPLAR_LEAF_LITTER = registerKey("red_poplar_leaf_litter");
    public static final ResourceKey<ConfiguredFeature<?,?>> ORANGE_POPLAR_LEAF_LITTER = registerKey("orange_poplar_leaf_litter");
    public static final ResourceKey<ConfiguredFeature<?,?>> YELLOW_POPLAR_LEAF_LITTER = registerKey("yellow_poplar_leaf_litter");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        PlaceOnGroundDecorator sparseLeafLitter = new PlaceOnGroundDecorator(96, 4, 2, new WeightedStateProvider(VegetationFeatures.leafLitterPatchBuilder(1, 3)));
        PlaceOnGroundDecorator thickLeafLitter = new PlaceOnGroundDecorator(150, 2, 2, new WeightedStateProvider(VegetationFeatures.leafLitterPatchBuilder(1, 4)));
        var lookup = context.lookup(Registries.CONFIGURED_FEATURE);


        context.register(SHELF_MUSHROOM, new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(
                        BlockStateProvider.simple(ModBlocks.SHELF_MUSHROOM)
                )
        ));

        context.register(FALLEN_POPLAR, new ConfiguredFeature<>(Feature.FALLEN_TREE,
                createFallenPoplar().build()));

        context.register(RED_POPLAR_LEAF_LITTER, new ConfiguredFeature<>(Feature.TREE,
                createPoplar(ModBlocks.RED_POPLAR_LEAVES).decorators(List.of(sparseLeafLitter, thickLeafLitter, new ShelfMushroomDecorator(0.4F))).build()));
        context.register(ORANGE_POPLAR_LEAF_LITTER, new ConfiguredFeature<>(Feature.TREE,
                createPoplar(ModBlocks.ORANGE_POPLAR_LEAVES).decorators(List.of(sparseLeafLitter, thickLeafLitter, new ShelfMushroomDecorator(0.4F))).build()));
        context.register(YELLOW_POPLAR_LEAF_LITTER, new ConfiguredFeature<>(Feature.TREE,
                createPoplar(ModBlocks.YELLOW_POPLAR_LEAVES).decorators(List.of(sparseLeafLitter, thickLeafLitter, new ShelfMushroomDecorator(0.4F))).build()));


        register(context, RED_SHRUB, Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(PlacementUtils.inlinePlaced(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_SHRUB)),
                                CountPlacement.of(24),
                                RandomOffsetPlacement.ofTriangle(6, 3),
                                BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)))));



            context.register(POPLAR_RED, new ConfiguredFeature<>(Feature.TREE,
                    createPoplar(ModBlocks.RED_POPLAR_LEAVES).decorators(List.of(new ShelfMushroomDecorator(0.4F))).build()));

            context.register(POPLAR_ORANGE, new ConfiguredFeature<>(Feature.TREE,
                    createPoplar(ModBlocks.ORANGE_POPLAR_LEAVES).decorators(List.of(new ShelfMushroomDecorator(0.4F))).build()));

            context.register(POPLAR_YELLOW, new ConfiguredFeature<>(Feature.TREE,
                    createPoplar(ModBlocks.YELLOW_POPLAR_LEAVES).decorators(List.of(new ShelfMushroomDecorator(0.4F))).build()));



        context.register(POPLAR_TREE, new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(
                        List.of(
                                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(lookup.getOrThrow(RED_POPLAR_LEAF_LITTER)), 0.33f),
                                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(lookup.getOrThrow(ORANGE_POPLAR_LEAF_LITTER)), 0.33f),
                                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(lookup.getOrThrow(FALLEN_POPLAR)), 0.30f)),
                        PlacementUtils.inlinePlaced(lookup.getOrThrow(YELLOW_POPLAR_LEAF_LITTER)))));

        context.register(POPLAR_TREES, new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(
                        List.of(
                                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(lookup.getOrThrow(POPLAR_RED)), 0.33f),
                                new WeightedPlacedFeature(PlacementUtils.inlinePlaced(lookup.getOrThrow(POPLAR_ORANGE)), 0.33f)),
                        PlacementUtils.inlinePlaced(lookup.getOrThrow(POPLAR_YELLOW)))));


    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Constants.vanilla(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    private static TreeConfiguration.TreeConfigurationBuilder createPoplar(Block leaves) {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG),
                new PoplarTrunkPlacer(7, 4, 0, ConstantInt.of(4), UniformInt.of(1, 4)),
                BlockStateProvider.simple(leaves),
                new PoplarFoliagePlacer(new WeightedListInt(
                        WeightedList.<IntProvider>builder()
                                .add(ConstantInt.of(5), 5)
                                .add(ConstantInt.of(6), 5)
                                .add(ConstantInt.of(7), 1)
                                .add(ConstantInt.of(8), 1)
                                .build()
                ),
                        ConstantInt.of(0), UniformInt.of(5, 6), 0.15F),
                new TwoLayersFeatureSize(1, 0, 2))
                .ignoreVines();
    }



    private static FallenTreeConfiguration.FallenTreeConfigurationBuilder createFallenPoplar() {
        return new FallenTreeConfiguration.FallenTreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG),
                UniformInt.of(4,7))
                .logDecorators(List.of(
        new AttachedToLogsDecorator(0.1F, BlockStateProvider.simple(Blocks.BROWN_MUSHROOM),
                List.of(Direction.UP)))).logDecorators(List.of(new ShelfMushroomDecorator(0.8F)));
    }
}
