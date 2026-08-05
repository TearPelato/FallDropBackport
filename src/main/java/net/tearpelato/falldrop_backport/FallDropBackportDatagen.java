package net.tearpelato.falldrop_backport;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.tearpelato.falldrop_backport.datagen.*;
import net.tearpelato.falldrop_backport.datagen.villager.ModVillagerTradesTagsProvider;
import net.tearpelato.falldrop_backport.datagen.villager.ModWanderingTraderTrades;
import net.tearpelato.falldrop_backport.init.ModBiomes;
import net.tearpelato.falldrop_backport.worldgen.ModConfiguredFeatures;
import net.tearpelato.falldrop_backport.worldgen.ModPlacedFeatures;

public class FallDropBackportDatagen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBlockLootableProvider::new);
        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModRecipeProvider.Runner::new);
        pack.addProvider(ModItemsTagsProvider::new);
        pack.addProvider(ModRegistryDataProvider::new);
        pack.addProvider(ModSoundsProvider::new);
        pack.addProvider(ModVillagerTradesTagsProvider::new);
        pack.addProvider(ModBiomeTagsProvider::new);


    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
        registryBuilder.add(Registries.BIOME, ModBiomes::bootstrap);
        registryBuilder.add(Registries.VILLAGER_TRADE, ModWanderingTraderTrades::bootstrap);

    }
}
