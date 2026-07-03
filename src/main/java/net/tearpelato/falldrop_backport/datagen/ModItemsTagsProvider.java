package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemsTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.POPLAR_LOGS)
                .add(Constants.getItemKey(ModBlocks.POPLAR_LOG.asItem()))
                .add(Constants.getItemKey(ModBlocks.POPLAR_WOOD.asItem()))
                .add(Constants.getItemKey(ModBlocks.STRIPPED_POPLAR_LOG.asItem()))
                .add(Constants.getItemKey(ModBlocks.STRIPPED_POPLAR_WOOD.asItem()));
        tag(ItemTags.WOODEN_TOOL_MATERIALS).add(Constants.getItemKey(ModBlocks.POPLAR_PLANKS.asItem()));
        tag(ItemTags.PLANKS).add(Constants.getItemKey(ModBlocks.POPLAR_PLANKS.asItem()));

        tag(ItemTags.WOODEN_BUTTONS).add(Constants.getItemKey(ModBlocks.POPLAR_BUTTON.asItem()));
        tag(ItemTags.WOODEN_DOORS).add(Constants.getItemKey(ModBlocks.POPLAR_DOOR.asItem()));
        tag(ItemTags.WOODEN_FENCES).add(Constants.getItemKey(ModBlocks.POPLAR_FENCE.asItem()));
        tag(ItemTags.WOODEN_SLABS).add(Constants.getItemKey(ModBlocks.POPLAR_SLAB.asItem()));
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(Constants.getItemKey(ModBlocks.POPLAR_PRESSURE_PLATE.asItem()));
        tag(ItemTags.WOODEN_STAIRS).add(Constants.getItemKey(ModBlocks.POPLAR_STAIRS.asItem()));
        tag(ItemTags.WOODEN_TRAPDOORS).add(Constants.getItemKey(ModBlocks.POPLAR_TRAPDOOR.asItem()));
    }
}