package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
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
                .add(ModBlocks.POPLAR_LOG.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.POPLAR_WOOD.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.WOODEN_TOOL_MATERIALS).add(ModBlocks.POPLAR_PLANKS.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.PLANKS).add(ModBlocks.POPLAR_PLANKS.asItem().builtInRegistryHolder().getKey());

        tag(ItemTags.WOODEN_BUTTONS).add(ModBlocks.POPLAR_BUTTON.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.WOODEN_DOORS).add(ModBlocks.POPLAR_DOOR.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.WOODEN_FENCES).add(ModBlocks.POPLAR_FENCE.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.WOODEN_SLABS).add(ModBlocks.POPLAR_SLAB.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.POPLAR_PRESSURE_PLATE.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.WOODEN_STAIRS).add(ModBlocks.POPLAR_STAIRS.asItem().builtInRegistryHolder().getKey());
        tag(ItemTags.WOODEN_TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.asItem().builtInRegistryHolder().getKey());

        tag(ModTags.Items.WOOL_SET)
                .add(ModBlocks.WHITE_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.GRAY_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.BLACK_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.BROWN_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.RED_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.ORANGE_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.YELLOW_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.LIME_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.GREEN_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.CYAN_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.BLUE_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.PURPLE_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.MAGENTA_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.PINK_WOOL_STAIRS.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.WHITE_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.GRAY_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.BLACK_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.BROWN_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.RED_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.ORANGE_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.YELLOW_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.LIME_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.GREEN_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.CYAN_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.BLUE_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.PURPLE_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.MAGENTA_WOOL_SLAB.asItem().builtInRegistryHolder().getKey())
                .add(ModBlocks.PINK_WOOL_SLAB.asItem().builtInRegistryHolder().getKey());

    }
}