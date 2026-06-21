package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBiomes;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagsProvider extends BiomeTagsProvider {
    public ModBiomeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BiomeTags.SPAWNS_COLD_VARIANT_FARM_ANIMALS).addOptional(ModBiomes.DAPPLED_FOREST);
    }
}
