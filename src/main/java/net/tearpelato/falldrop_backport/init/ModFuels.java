package net.tearpelato.falldrop_backport.init;

import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class ModFuels {
    public static void registerModFuels() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(ModTags.Items.WOOL_SET, 100);
        });
    }
}