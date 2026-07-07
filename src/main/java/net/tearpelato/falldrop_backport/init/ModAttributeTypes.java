package net.tearpelato.falldrop_backport.init;

import com.mojang.serialization.Codec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.attribute.AttributeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.util.StrawBedRules;

public class ModAttributeTypes {
    public static final DeferredRegister<AttributeType<?>> CUSTOM_ATTRIBUTES =
            DeferredRegister.create(BuiltInRegistries.ATTRIBUTE_TYPE, Constants.MOD_ID);

    public static final DeferredHolder<AttributeType<?>, AttributeType<StrawBedRules>> STRAW_BED_ATTRIBUTE =
            CUSTOM_ATTRIBUTES.register("straw_bed_attribute", () -> AttributeType.ofNotInterpolated(StrawBedRules.CODEC));


    public static void init(IEventBus modEventBus){
        CUSTOM_ATTRIBUTES.register(modEventBus);
    }
}
