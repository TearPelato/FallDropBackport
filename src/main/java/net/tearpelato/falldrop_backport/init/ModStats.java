package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.stats.Stat;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

import java.util.function.Supplier;

public class ModStats {
    public static final DeferredRegister<Identifier> CUSTOM_STATS =
            DeferredRegister.create(BuiltInRegistries.CUSTOM_STAT, Constants.MOD_ID);

    public static final Supplier<Identifier> SLEEP_IN_STRAW_BED = makeCustomStat("sleep_in_straw_bed");


    public static Stat<Identifier> STAT_SLEEP_IN_STRAW_BED;

    private static Supplier<Identifier> makeCustomStat(String key) {
        Identifier statIdentifier = Constants.id(key);
        return CUSTOM_STATS.register(key, () -> statIdentifier);
    }

    public static void init(IEventBus eventBus) {
        CUSTOM_STATS.register(eventBus);
        eventBus.addListener(ModStats::commonSetup);
    }

    public static void commonSetup(FMLCommonSetupEvent event) {
        STAT_SLEEP_IN_STRAW_BED = Stats.CUSTOM.get(SLEEP_IN_STRAW_BED.get(), StatFormatter.DEFAULT);
    }
}
