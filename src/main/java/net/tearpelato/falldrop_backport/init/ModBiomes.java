package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.worldgen.biome.ModOverworldBiomes;
import net.tearpelato.falldrop_backport.worldgen.biome.region.OverworldRegion;
import terrablender.api.Regions;

public class ModBiomes {

    public static final ResourceKey<Biome> DAPPLED_FOREST = registerBiomeKey("dappled_forest");



    public static void registerBiomes() {
        Regions.register(new OverworldRegion(Constants.id("falldrop_backport_overworld"), 20));

    }


    public static void bootstrap(BootstrapContext<Biome> context) {
        var carver = context.lookup(Registries.CONFIGURED_CARVER);
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, DAPPLED_FOREST, ModOverworldBiomes.dappledForest(placedFeatures, carver));


    }



    private static void register(BootstrapContext<Biome> context, ResourceKey<Biome> key, Biome biome ) {
        context.register(key, biome);

    }

    private static ResourceKey<Biome> registerBiomeKey(String name) {
        return ResourceKey.create(Registries.BIOME, Constants.id(name));
    }
}
