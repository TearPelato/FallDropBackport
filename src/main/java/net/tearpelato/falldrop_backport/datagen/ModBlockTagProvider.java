package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.LOGS)
                .add(ModBlocks.POPLAR_LOG.get())
                .add(ModBlocks.POPLAR_WOOD.get())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.get())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.get());

        tag(BlockTags.LEAVES)
                .add(ModBlocks.RED_POPLAR_LEAVES.get())
                .add(ModBlocks.ORANGE_POPLAR_LEAVES.get())
                .add(ModBlocks.YELLOW_POPLAR_LEAVES.get());

        tag(BlockTags.PLANKS)
                .add(ModBlocks.POPLAR_PLANKS.get());


        tag(BlockTags.STAIRS)
                .add(ModBlocks.POPLAR_STAIRS.get())
                .add(ModBlocks.WHITE_WOOL_STAIRS.get())
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get())
                .add(ModBlocks.GRAY_WOOL_STAIRS.get())
                .add(ModBlocks.BLACK_WOOL_STAIRS.get())
                .add(ModBlocks.BROWN_WOOL_STAIRS.get())
                .add(ModBlocks.RED_WOOL_STAIRS.get())
                .add(ModBlocks.ORANGE_WOOL_STAIRS.get())
                .add(ModBlocks.YELLOW_WOOL_STAIRS.get())
                .add(ModBlocks.LIME_WOOL_STAIRS.get())
                .add(ModBlocks.GREEN_WOOL_STAIRS.get())
                .add(ModBlocks.CYAN_WOOL_STAIRS.get())
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get())
                .add(ModBlocks.BLUE_WOOL_STAIRS.get())
                .add(ModBlocks.PURPLE_WOOL_STAIRS.get())
                .add(ModBlocks.MAGENTA_WOOL_STAIRS.get())
                .add(ModBlocks.PINK_WOOL_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(ModBlocks.POPLAR_SLAB.get())
                .add(ModBlocks.WHITE_WOOL_SLAB.get())
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get())
                .add(ModBlocks.GRAY_WOOL_SLAB.get())
                .add(ModBlocks.BLACK_WOOL_SLAB.get())
                .add(ModBlocks.BROWN_WOOL_SLAB.get())
                .add(ModBlocks.RED_WOOL_SLAB.get())
                .add(ModBlocks.ORANGE_WOOL_SLAB.get())
                .add(ModBlocks.YELLOW_WOOL_SLAB.get())
                .add(ModBlocks.LIME_WOOL_SLAB.get())
                .add(ModBlocks.GREEN_WOOL_SLAB.get())
                .add(ModBlocks.CYAN_WOOL_SLAB.get())
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get())
                .add(ModBlocks.BLUE_WOOL_SLAB.get())
                .add(ModBlocks.PURPLE_WOOL_SLAB.get())
                .add(ModBlocks.MAGENTA_WOOL_SLAB.get())
                .add(ModBlocks.PINK_WOOL_SLAB.get());

        tag(BlockTags.FENCES).add(ModBlocks.POPLAR_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.POPLAR_FENCE_GATE.get());
        tag(BlockTags.DOORS).add(ModBlocks.POPLAR_DOOR.get());
        tag(BlockTags.TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.get());
        tag(BlockTags.SAPLINGS).add(ModBlocks.POPLAR_SAPLING.get());
        tag(BlockTags.WOODEN_SHELVES).add(ModBlocks.POPLAR_SHELF.get());

        tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.POPLAR_LOG.get())
                .add(ModBlocks.POPLAR_WOOD.get())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.get())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.get());

        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POPLAR_SAPLING_POTTED.get())
                .add(ModBlocks.RED_SHRUB_POTTED.get());
    }
}
