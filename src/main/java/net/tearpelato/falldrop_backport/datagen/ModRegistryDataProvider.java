package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.tearpelato.falldrop_backport.datagen.villager.ModWanderingTraderTrades;
import net.tearpelato.falldrop_backport.init.ModBiomes;
import net.tearpelato.falldrop_backport.worldgen.ModConfiguredFeatures;
import net.tearpelato.falldrop_backport.worldgen.ModPlacedFeatures;

import javax.print.DocFlavor;
import java.util.concurrent.CompletableFuture;

public class ModRegistryDataProvider extends FabricDynamicRegistryProvider {
    public ModRegistryDataProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {


        HolderLookup.RegistryLookup<ConfiguredFeature<?,?>> configuredFeatures =
                registries.lookupOrThrow(Registries.CONFIGURED_FEATURE);
        entries.add(ModConfiguredFeatures.FALLEN_POPLAR,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.FALLEN_POPLAR).value());
        entries.add(ModConfiguredFeatures.POPLAR_ORANGE,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.POPLAR_ORANGE).value());
        entries.add(ModConfiguredFeatures.POPLAR_RED,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.POPLAR_RED).value());
        entries.add(ModConfiguredFeatures.POPLAR_YELLOW,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.POPLAR_YELLOW).value());
        entries.add(ModConfiguredFeatures.POPLAR_TREE,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.POPLAR_TREE).value());
        entries.add(ModConfiguredFeatures.POPLAR_TREES,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.POPLAR_TREES).value());
        entries.add(ModConfiguredFeatures.RED_SHRUB,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_SHRUB).value());
        entries.add(ModConfiguredFeatures.SHELF_MUSHROOM,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.SHELF_MUSHROOM).value());
        entries.add(ModConfiguredFeatures.ORANGE_POPLAR_LEAF_LITTER,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_POPLAR_LEAF_LITTER).value());
        entries.add(ModConfiguredFeatures.YELLOW_POPLAR_LEAF_LITTER,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_POPLAR_LEAF_LITTER).value());
        entries.add(ModConfiguredFeatures.RED_POPLAR_LEAF_LITTER,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_POPLAR_LEAF_LITTER).value());



        HolderLookup.RegistryLookup<PlacedFeature> placedFeatures =
                registries.lookupOrThrow(Registries.PLACED_FEATURE);

        entries.add(ModPlacedFeatures.BROWN_MUSHROOM_DAPPLED_FOREST,
                placedFeatures.getOrThrow(ModPlacedFeatures.BROWN_MUSHROOM_DAPPLED_FOREST).value());
        entries.add(ModPlacedFeatures.POPLAR,
                placedFeatures.getOrThrow(ModPlacedFeatures.POPLAR).value());
        entries.add(ModPlacedFeatures.FALLEN_POPLAR,
                placedFeatures.getOrThrow(ModPlacedFeatures.FALLEN_POPLAR).value());
        entries.add(ModPlacedFeatures.RED_SHRUB,
                placedFeatures.getOrThrow(ModPlacedFeatures.RED_SHRUB).value());
        entries.add(ModPlacedFeatures.SHELF_MUSHROOM,
                placedFeatures.getOrThrow(ModPlacedFeatures.SHELF_MUSHROOM).value());


        HolderLookup.RegistryLookup<Biome> biomes =
                registries.lookupOrThrow(Registries.BIOME);
        entries.add(ModBiomes.DAPPLED_FOREST,
                biomes.getOrThrow(ModBiomes.DAPPLED_FOREST).value());

        HolderLookup.RegistryLookup<VillagerTrade> trades =
                registries.lookupOrThrow(Registries.VILLAGER_TRADE);

        entries.add(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_LOG,
                trades.getOrThrow(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_LOG).value());
        entries.add(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_SAPLING,
                trades.getOrThrow(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_SAPLING).value());
        entries.add(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_SHELF_MUSHROOM,
                trades.getOrThrow(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_SHELF_MUSHROOM).value());




    }

    @Override
    public String getName() {
        return "FallDropBackport Dynamic Registry";
    }
}