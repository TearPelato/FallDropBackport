package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagsProvider extends ItemTagsProvider {
    public ModItemsTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.NAMESPACE);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.POPLAR_LOGS)
                .add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_LOG.asItem()))
                .add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_WOOD.asItem()))
                .add(ModBlocks.getResourceKeyItem(ModBlocks.STRIPPED_POPLAR_LOG.asItem()))
                .add(ModBlocks.getResourceKeyItem(ModBlocks.STRIPPED_POPLAR_WOOD.asItem()));
        tag(ItemTags.WOODEN_TOOL_MATERIALS).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_PLANKS.asItem()));
        tag(ItemTags.PLANKS).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_PLANKS.asItem()));

        tag(ItemTags.WOODEN_BUTTONS).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_BUTTON.asItem()));
        tag(ItemTags.WOODEN_DOORS).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_DOOR.asItem()));
        tag(ItemTags.WOODEN_FENCES).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_FENCE.asItem()));
        tag(ItemTags.WOODEN_SLABS).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_SLAB.asItem()));
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_PRESSURE_PLATE.asItem()));
        tag(ItemTags.WOODEN_STAIRS).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_STAIRS.asItem()));
        tag(ItemTags.WOODEN_TRAPDOORS).add(ModBlocks.getResourceKeyItem(ModBlocks.POPLAR_TRAPDOOR.asItem()));
    }
}