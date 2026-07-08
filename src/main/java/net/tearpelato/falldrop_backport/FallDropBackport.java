package net.tearpelato.falldrop_backport;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.renderer.Sheets;
import net.tearpelato.falldrop_backport.init.ModBiomes;
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
        ModStats.registerStats();

        ModFlammableBlocks.registerFlammableBlocks();
        ModStrippableBlocks.registerStrippableBlocks();
        ModTreeDecoratorType.registerTreeDecorators();

        Sheets.createSignSprite(ModWoodType.POPLAR);
        Sheets.createHangingSignSprite(ModWoodType.POPLAR);


    }


    @Override
    public void onTerraBlenderInitialized() {

        ModBiomes.registerBiomes();
    }
}
