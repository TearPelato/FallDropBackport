package net.tearpelato.falldrop_backport.init;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.worldgen.placer.PoplarFoliagePlacer;

public class ModFoliagePlacerTypes {

    public static final FoliagePlacerType<PoplarFoliagePlacer> POPLAR_FOLIAGE_PLACER =
            register("poplar_foliage_placer", PoplarFoliagePlacer.CODEC);

    private static <P extends FoliagePlacer> FoliagePlacerType<P> register(String name, MapCodec<P> codec) {
        return Registry.register(
                BuiltInRegistries.FOLIAGE_PLACER_TYPE,
                Constants.vanilla(name),
                new FoliagePlacerType<>(codec)
        );
    }

    public static void registerFoliagePlacer() {
        Constants.LOGGER.info("Registering Foliage Placers for " + Constants.MOD_ID);
    }
}