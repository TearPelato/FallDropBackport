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
            DeferredRegister.create(Registries.MAP_DECORATION_TYPE, Constants.NAMESPACE);

    public static final Holder<MapDecorationType> ANCIENT_CITY = register("ancient_city",  "ancient_city", true, MapColor.COLOR_LIGHT_GRAY.col, true, false);
    public static final Holder<MapDecorationType> ABANDONED_CAMP = register("abandoned_camp", "abandoned_camp",true,0,true, false);
    public static final Holder<MapDecorationType> DESERT_PYRAMID = register("desert_pyramid", "desert_pyramid", true,0, true,false);
    public static final Holder<MapDecorationType> MINESHAFT = register("mineshaft", "mineshaft",true,0,true,false);
    public static final Holder<MapDecorationType> OCEAN_RUIN_WARM = register("ocean_ruin_warm", "warm_ocean_ruins", true,0,true,false);


    public static void init(IEventBus bus) {
        MAP_DECORATION_TYPES.register(bus);
    }

    private static Holder<MapDecorationType> register(String name, String assetsName, boolean showOnItemFrame, int mapColor, boolean explorationMapElement, boolean trackCount) {
        return MAP_DECORATION_TYPES.register(name, () -> new MapDecorationType(Constants.vanilla(assetsName), showOnItemFrame, mapColor, explorationMapElement, trackCount));
    }

}
