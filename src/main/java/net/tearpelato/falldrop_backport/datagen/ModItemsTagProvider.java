package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagProvider extends ItemTagsProvider {
    public ModItemsTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

      /*  tag(ModTags.Items.POPLAR_LOGS)
                .add(ModBlocks.POPLAR_LOG.asItem())
                .add(ModBlocks.POPLAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.asItem());*/


    }
}
