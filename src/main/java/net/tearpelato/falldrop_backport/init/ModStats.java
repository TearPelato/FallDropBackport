package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.stats.Stat;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;
import net.tearpelato.falldrop_backport.Constants;

public class ModStats {
    public static Stat<?> SLEEP_IN_STRAW_BED = makeCustomStat("sleep_in_straw_bed");


    private static Stat<?> makeCustomStat(String key) {
        Identifier identifier = Identifier.fromNamespaceAndPath(Constants.MOD_ID, key);
        Identifier newStat = Registry.register(BuiltInRegistries.CUSTOM_STAT, key, identifier);

        return Stats.CUSTOM.get(newStat, StatFormatter.DEFAULT);
    }



    public static void registerStats() {
        Constants.LOGGER.info("Registering Stats for " + Constants.MOD_ID);
    }
}