package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.tearpelato.falldrop_backport.Constants;

public class ModMapDecorationTypes {


    public static final Holder<MapDecorationType> ANCIENT_CITY = register("ancient_city");
    public static final Holder<MapDecorationType> ABANDONED_CAMP = register("abandoned_camp");
    public static final Holder<MapDecorationType> DESERT_PYRAMID = register("desert_pyramid");
    public static final Holder<MapDecorationType> MINESHAFT = register("mineshaft");
    public static final Holder<MapDecorationType> WARM_OCEAN_RUINS = register("warm_ocean_ruins");

    public static void registerMapDecorationTypes() {
        Constants.LOGGER.info("Registering Mod Map Decorations Types for " + Constants.MOD_ID);
    }


    private static Holder<MapDecorationType> register(String string) {
        return Registry.registerForHolder(BuiltInRegistries.MAP_DECORATION_TYPE, ResourceKey.create(Registries.MAP_DECORATION_TYPE, Constants.vanilla(string)), new MapDecorationType(Constants.vanilla(string), true, 0, true, false));
    }

}
