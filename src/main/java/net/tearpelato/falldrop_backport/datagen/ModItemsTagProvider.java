package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagProvider extends ItemTagsProvider {
    public ModItemsTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.NAMESPACE);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.POPLAR_LOGS)
                .add(ModBlocks.POPLAR_LOG.asItem().builtInRegistryHolder().key())
                .add(ModBlocks.POPLAR_WOOD.asItem().builtInRegistryHolder().key())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.asItem().builtInRegistryHolder().key())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.asItem().builtInRegistryHolder().key());
        tag(ItemTags.WOODEN_TOOL_MATERIALS).add(ModBlocks.POPLAR_PLANKS.asItem().builtInRegistryHolder().key());


    }
}
