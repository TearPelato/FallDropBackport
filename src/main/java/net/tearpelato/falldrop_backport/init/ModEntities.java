package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.entity.client.custom.Cushion;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.createEntities(Constants.MOD_ID);


    public static final ResourceKey<EntityType<?>> POPLAR_BOAT_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "poplar_boat"));
    public static final ResourceKey<EntityType<?>> POPLAR_CHEST_BOAT_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "poplar_chest_boat"));
    public static final ResourceKey<EntityType<?>> CUSHION_KEY =ResourceKey.create(Registries.ENTITY_TYPE, Constants.id("cushion"));

    public static final Supplier<EntityType<Boat>> POPLAR_BOAT = ENTITY_TYPES.register("poplar_boat",
            () -> EntityType.Builder.<Boat>of((entityType, level) -> new Boat(entityType, level, ModItems.POPLAR_BOAT),
                            MobCategory.MISC).eyeHeight(0.5625f).clientTrackingRange(10).noLootTable()
                    .sized(1.375f, 0.5625f).build(POPLAR_BOAT_KEY));
    public static final Supplier<EntityType<ChestBoat>> POPLAR_CHEST_BOAT = ENTITY_TYPES.register("poplar_chest_boat",
            () -> EntityType.Builder.<ChestBoat>of((entityType, level) -> new ChestBoat(entityType, level, ModItems.POPLAR_CHEST_BOAT),
                            MobCategory.MISC).eyeHeight(0.5625f).clientTrackingRange(10).noLootTable()
                    .sized(1.375f, 0.5625f).build(POPLAR_CHEST_BOAT_KEY));
    public static final Supplier<EntityType<Cushion>> CUSHION = ENTITY_TYPES.register("cushion",
            () -> EntityType.Builder.<Cushion>of((entityType, level) -> new Cushion(entityType, level),
                            MobCategory.MISC).noLootTable().sized(1.0F, 0.25F).clientTrackingRange(10).updateInterval(Integer.MAX_VALUE).build(CUSHION_KEY));






    public static void init(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }

}

