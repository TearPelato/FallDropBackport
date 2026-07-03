package net.tearpelato.falldrop_backport.worldgen;

import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.worldgen.placer.util.VegetationPlacementsUtils;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> RED_SHRUB = registerKey("red_shrub");
    public static final ResourceKey<PlacedFeature> POPLAR = registerKey("poplar");
    public static final ResourceKey<PlacedFeature> SHELF_MUSHROOM = registerKey("shelf_mushroom");
    public static final ResourceKey<PlacedFeature> FALLEN_POPLAR = registerKey("fallen_poplar");
    public static final ResourceKey<PlacedFeature> BROWN_MUSHROOM_DAPPLED_FOREST = registerKey("brow_mushroom_dappled_forest");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RED_SHRUB, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_SHRUB), List.of(new PlacementModifier[]{InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome(), CountPlacement.of(6), RandomOffsetPlacement.ofTriangle(7, 3), BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE)}));

        register(context, POPLAR, configuredFeatures.getOrThrow(ModConfiguredFeatures.POPLAR_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1f, 2),
                        ModBlocks.POPLAR_SAPLING));

        register(context, FALLEN_POPLAR, configuredFeatures.getOrThrow(ModConfiguredFeatures.FALLEN_POPLAR),
               List.of(new PlacementModifier[]{PlacementUtils.filteredByBlockSurvival(ModBlocks.POPLAR_SAPLING)}));

        register(context, SHELF_MUSHROOM, configuredFeatures.getOrThrow(ModConfiguredFeatures.SHELF_MUSHROOM),
                List.of(              CountPlacement.of(1),
                        RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(50), VerticalAnchor.absolute(80)),
                        EnvironmentScanPlacement.scanningFor(
                                Direction.DOWN,
                                BlockPredicate.matchesBlocks(ModBlocks.POPLAR_LOG),
                                BlockPredicate.ONLY_IN_AIR_PREDICATE,
                                12
                        ),
                        BiomeFilter.biome()));
    register(context, BROWN_MUSHROOM_DAPPLED_FOREST, configuredFeatures.getOrThrow(VegetationFeatures.BROWN_MUSHROOM), VegetationPlacementsUtils.getMushroomPlacement(2, (PlacementModifier)null));


    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Constants.NAMESPACE, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}