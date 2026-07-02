package net.tearpelato.falldrop_backport.init;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlocks {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.POPLAR_LOG, ModBlocks.STRIPPED_POPLAR_LOG);
        StrippableBlockRegistry.register(ModBlocks.POPLAR_WOOD, ModBlocks.STRIPPED_POPLAR_WOOD);
    }
    
}
