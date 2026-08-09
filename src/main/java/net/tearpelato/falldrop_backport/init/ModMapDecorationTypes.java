package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

public class ModMapDecorationTypes {
    public static final DeferredRegister<MapDecorationType> MAP_DECORATION_TYPES =
            DeferredRegister.create(Registries.MAP_DECORATION_TYPE, Constants.MOD_ID);

    public static final Holder<MapDecorationType> ANCIENT_CITY = register("ancient_city");
    public static final Holder<MapDecorationType> ABANDONED_CAMP = register("abandoned_camp");
    public static final Holder<MapDecorationType> DESERT_PYRAMID = register("desert_pyramid");
    public static final Holder<MapDecorationType> MINESHAFT = register("mineshaft");
    public static final Holder<MapDecorationType> WARM_OCEAN_RUINS = register("warm_ocean_ruins");


    public static void init(IEventBus bus) {
        MAP_DECORATION_TYPES.register(bus);
    }

    private static Holder<MapDecorationType> register(String string) {
        return MAP_DECORATION_TYPES.register(string, () -> new MapDecorationType(Constants.vanilla(string), true, 0, true, false));
    }

}
