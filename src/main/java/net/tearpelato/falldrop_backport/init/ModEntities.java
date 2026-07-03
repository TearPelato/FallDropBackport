package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.tearpelato.falldrop_backport.Constants;

public class ModEntities {


    public static final ResourceKey<EntityType<?>> POPLAR_BOAT_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "poplar_boat"));
    public static final ResourceKey<EntityType<?>> POPLAR_CHEST_BOAT_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "poplar_chest_boat"));

    public static final EntityType<Boat> POPLAR_BOAT = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Constants.vanilla( "poplar_boat"),
            EntityType.Builder.<Boat>of((entityType, level) -> new Boat(entityType, level, () -> ModItems.POPLAR_BOAT),
                            MobCategory.MISC).sized(1.375f, 0.5625f)
                    .clientTrackingRange(10).build(POPLAR_BOAT_KEY));
    public static final EntityType<ChestBoat> POPLAR_CHEST_BOAT = Registry.register(BuiltInRegistries.ENTITY_TYPE,
            Constants.vanilla( "poplar_chest_boat"),
            EntityType.Builder.<ChestBoat>of((entityType, level) -> new ChestBoat(entityType, level, () -> ModItems.POPLAR_CHEST_BOAT),
                            MobCategory.MISC).sized(1.375f, 0.5625f)
                    .clientTrackingRange(10).build(POPLAR_CHEST_BOAT_KEY));





    public static void registerModEntities() {
        Constants.LOGGER.info("Registering Mod Entities for " + Constants.MOD_ID);
    }

}