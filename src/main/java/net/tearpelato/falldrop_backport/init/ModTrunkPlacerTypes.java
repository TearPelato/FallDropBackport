package net.tearpelato.falldrop_backport.init;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.worldgen.placer.PoplarTrunkPlacer;

public class ModTrunkPlacerTypes {


    public static final TrunkPlacerType<PoplarTrunkPlacer> POPLAR_TRUNK_PLACER =
            register("poplar_trunk_placer", PoplarTrunkPlacer.CODEC);

    private static <P extends TrunkPlacer> TrunkPlacerType<P> register(String name, MapCodec<P> codec) {
        return Registry.register(
                BuiltInRegistries.TRUNK_PLACER_TYPE,
                Constants.vanilla(name),
                new TrunkPlacerType<>(codec)
        );
    }
    public static void registerTrunkPlacer() {
        Constants.LOGGER.info("Registering Trunk Placer for " + Constants.MOD_ID);
    }
}