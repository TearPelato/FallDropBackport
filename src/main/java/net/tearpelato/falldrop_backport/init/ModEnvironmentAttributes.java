package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.attribute.EnvironmentAttribute;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.util.StrawBedRules;

public class ModEnvironmentAttributes {

    public static final DeferredRegister<EnvironmentAttribute<?>> ENVIRONMENT_ATTRIBUTES =
            DeferredRegister.create(Registries.ENVIRONMENT_ATTRIBUTE, Constants.MOD_ID);


    public static final DeferredHolder<EnvironmentAttribute<?>, EnvironmentAttribute<StrawBedRules>> STRAW_BED_RULE =
            ENVIRONMENT_ATTRIBUTES.register("straw_bed_rule", () -> EnvironmentAttribute.builder(ModAttributeTypes.STRAW_BED_ATTRIBUTE.get()).defaultValue(StrawBedRules.DESTROY_ON_LEAVE).build()
            );

    public static void init(IEventBus modEventBus) {
        ENVIRONMENT_ATTRIBUTES.register(modEventBus);
    }
}
