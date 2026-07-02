package net.tearpelato.falldrop_backport.init;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POPLAR_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POPLAR_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_POPLAR_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_POPLAR_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POPLAR_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_POPLAR_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_POPLAR_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_POPLAR_LEAVES, 30, 60);
    }
    
}
