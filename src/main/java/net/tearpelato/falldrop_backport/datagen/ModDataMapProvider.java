package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
    builder(NeoForgeDataMaps.STRIPPABLES)
            .add(ModBlocks.POPLAR_LOG, new Strippable(ModBlocks.STRIPPED_POPLAR_LOG.get()), false)
            .add(ModBlocks.POPLAR_WOOD, new Strippable(ModBlocks.STRIPPED_POPLAR_WOOD.get()), false);
    }
}
