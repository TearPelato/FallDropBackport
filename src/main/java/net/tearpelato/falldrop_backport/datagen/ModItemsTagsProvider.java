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
                .add(ModBlocks.POPLAR_LOG.asItem())
                .add(ModBlocks.POPLAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.asItem());
        tag(ItemTags.WOODEN_TOOL_MATERIALS).add(ModBlocks.POPLAR_PLANKS.asItem());
        tag(ItemTags.PLANKS).add(ModBlocks.POPLAR_PLANKS.asItem());

        tag(ItemTags.WOODEN_BUTTONS).add(ModBlocks.POPLAR_BUTTON.asItem());
        tag(ItemTags.WOODEN_DOORS).add(ModBlocks.POPLAR_DOOR.asItem());
        tag(ItemTags.WOODEN_FENCES).add(ModBlocks.POPLAR_FENCE.asItem());
        tag(ItemTags.WOODEN_SLABS).add(ModBlocks.POPLAR_SLAB.asItem());
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.POPLAR_PRESSURE_PLATE.asItem());
        tag(ItemTags.WOODEN_STAIRS).add(ModBlocks.POPLAR_STAIRS.asItem());
        tag(ItemTags.WOODEN_TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.asItem());

        tag(ModTags.Items.WOOL_SET)
                .add(ModBlocks.WHITE_WOOL_STAIRS.asItem())
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.asItem())
                .add(ModBlocks.GRAY_WOOL_STAIRS.asItem())
                .add(ModBlocks.BLACK_WOOL_STAIRS.asItem())
                .add(ModBlocks.BROWN_WOOL_STAIRS.asItem())
                .add(ModBlocks.RED_WOOL_STAIRS.asItem())
                .add(ModBlocks.ORANGE_WOOL_STAIRS.asItem())
                .add(ModBlocks.YELLOW_WOOL_STAIRS.asItem())
                .add(ModBlocks.LIME_WOOL_STAIRS.asItem())
                .add(ModBlocks.GREEN_WOOL_STAIRS.asItem())
                .add(ModBlocks.CYAN_WOOL_STAIRS.asItem())
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.asItem())
                .add(ModBlocks.BLUE_WOOL_STAIRS.asItem())
                .add(ModBlocks.PURPLE_WOOL_STAIRS.asItem())
                .add(ModBlocks.MAGENTA_WOOL_STAIRS.asItem())
                .add(ModBlocks.PINK_WOOL_STAIRS.asItem())
                .add(ModBlocks.WHITE_WOOL_SLAB.asItem())
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.asItem())
                .add(ModBlocks.GRAY_WOOL_SLAB.asItem())
                .add(ModBlocks.BLACK_WOOL_SLAB.asItem())
                .add(ModBlocks.BROWN_WOOL_SLAB.asItem())
                .add(ModBlocks.RED_WOOL_SLAB.asItem())
                .add(ModBlocks.ORANGE_WOOL_SLAB.asItem())
                .add(ModBlocks.YELLOW_WOOL_SLAB.asItem())
                .add(ModBlocks.LIME_WOOL_SLAB.asItem())
                .add(ModBlocks.GREEN_WOOL_SLAB.asItem())
                .add(ModBlocks.CYAN_WOOL_SLAB.asItem())
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.asItem())
                .add(ModBlocks.BLUE_WOOL_SLAB.asItem())
                .add(ModBlocks.PURPLE_WOOL_SLAB.asItem())
                .add(ModBlocks.MAGENTA_WOOL_SLAB.asItem())
                .add(ModBlocks.PINK_WOOL_SLAB.asItem());
    }
}