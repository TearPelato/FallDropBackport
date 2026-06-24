package net.tearpelato.falldrop_backport.worldgen.placer.util;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class VegetationPlacementsUtils {
    public static List<PlacementModifier> getMushroomPlacement(final int rarity, final @Nullable PlacementModifier prefix) {
        ImmutableList.Builder<PlacementModifier> builder = ImmutableList.builder();
        if (prefix != null) {
            builder.add(prefix);
        }

        if (rarity != 0) {
            builder.add(RarityFilter.onAverageOnceEvery(rarity));
        }

        builder.add(InSquarePlacement.spread());
        builder.add(PlacementUtils.HEIGHTMAP);
        builder.add(BiomeFilter.biome());
        builder.add(CountPlacement.of(96));
        builder.add(RandomOffsetPlacement.ofTriangle(7, 3));
        builder.add(BlockPredicateFilter.forPredicate(BlockPredicate.ONLY_IN_AIR_PREDICATE));
        return builder.build();
    }
}
