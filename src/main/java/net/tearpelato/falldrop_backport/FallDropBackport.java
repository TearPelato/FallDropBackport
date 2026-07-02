package net.tearpelato.falldrop_backport;

import net.fabricmc.api.ModInitializer;
import net.tearpelato.falldrop_backport.init.*;
import terrablender.api.TerraBlenderApi;

public class FallDropBackport implements ModInitializer, TerraBlenderApi {

    @Override
    public void onInitialize() {
        ModCreativeTabs.registerCreativeModeTabs();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModParticleTypes.registerParticles();
        ModTrunkPlacerTypes.registerTrunkPlacer();
        ModFoliagePlacerTypes.registerFoliagePlacer();
        ModEntities.registerModEntities();

        ModBlockEntities.registerBlockEntities();


        ModFlammableBlocks.registerFlammableBlocks();
        ModStrippableBlocks.registerStrippableBlocks();



    }

    @Override
    public void onTerraBlenderInitialized() {
        ModBiomes.registerBiomes();

    }

}
