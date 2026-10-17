package net.tearpelato.falldrop_backport.init;

import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.world.item.DyeColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.tearpelato.falldrop_backport.Constants;

public class ModEntityDataSerializer {
    public static final DeferredRegister<EntityDataSerializer<?>> ENTITY_DATA_SERIALIZER =
            DeferredRegister.create(NeoForgeRegistries.ENTITY_DATA_SERIALIZERS, Constants.MOD_ID);

    public static final DeferredHolder<EntityDataSerializer<?>,EntityDataSerializer<DyeColor>> DYE_COLOR =
            ENTITY_DATA_SERIALIZER.register("dye_color", ()-> EntityDataSerializer.forValueType(DyeColor.STREAM_CODEC));

    public static void init(IEventBus bus) {
        ENTITY_DATA_SERIALIZER.register(bus);
    }


}
