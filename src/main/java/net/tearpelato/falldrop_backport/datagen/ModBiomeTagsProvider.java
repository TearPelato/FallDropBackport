package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.level.biome.Biome;
import net.tearpelato.falldrop_backport.init.ModBiomes;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagsProvider extends FabricTagsProvider<Biome> {

    public ModBiomeTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.BIOME,registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(BiomeTags.SPAWNS_COLD_VARIANT_FARM_ANIMALS)
                .add(TagEntry.element(ModBiomes.DAPPLED_FOREST.identifier()));
    }
}
