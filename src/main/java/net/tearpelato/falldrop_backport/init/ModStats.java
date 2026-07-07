package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

import java.util.function.Supplier;

public class ModStats {
    public static final DeferredRegister<Identifier> CUSTOM_STATS =
            DeferredRegister.create(BuiltInRegistries.CUSTOM_STAT, Constants.MOD_ID);

    public static final Supplier<Identifier> SLEEP_IN_STRAW_BED = makeCustomStat("sleep_in_straw_bed");


    private static Supplier<Identifier> makeCustomStat(String key) {
        Identifier statIdentifier = Constants.id(key);
        return CUSTOM_STATS.register(key, () -> statIdentifier);
    }

    public static void init(IEventBus eventBus) {
        CUSTOM_STATS.register(eventBus);
    }
}
