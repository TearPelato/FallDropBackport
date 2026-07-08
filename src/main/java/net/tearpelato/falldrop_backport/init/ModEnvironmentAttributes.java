package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.attribute.BedRule;
import net.minecraft.world.attribute.EnvironmentAttribute;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

import java.util.Optional;

public class ModEnvironmentAttributes {

    public static final DeferredRegister<EnvironmentAttribute<?>> ENV_ATTRIBUTES =
            DeferredRegister.create(BuiltInRegistries.ENVIRONMENT_ATTRIBUTE, Constants.MOD_ID);


    public static final DeferredHolder<EnvironmentAttribute<?>, EnvironmentAttribute<BedRule>> STRAW_BED_RULE =
            ENV_ATTRIBUTES.register("straw_bed_rule", () -> EnvironmentAttribute.builder(EnvironmentAttributes.BED_RULE.type()).defaultValue(new BedRule(BedRule.Rule.ALWAYS, BedRule.Rule.ALWAYS, false, Optional.empty())).build());


    public static void init(IEventBus bus){
        ENV_ATTRIBUTES.register(bus);
    }
}