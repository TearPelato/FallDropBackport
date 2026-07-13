package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.NAMESPACE);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_PLANKS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_FENCE.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_SIGN.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_WALL_SIGN.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_HANGING_SIGN.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_WALL_HANGING_SIGN.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_DOOR.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_TRAPDOOR.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_BUTTON.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_PRESSURE_PLATE.get()));

        tag(BlockTags.LOGS)
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_LOG.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_WOOD.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.STRIPPED_POPLAR_WOOD.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.STRIPPED_POPLAR_LOG.get()));

        tag(BlockTags.LEAVES)
                .add(ModBlocks.getResourceKey(ModBlocks.RED_POPLAR_LEAVES.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.ORANGE_POPLAR_LEAVES.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.YELLOW_POPLAR_LEAVES.get()));


        tag(BlockTags.STAIRS)
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.WHITE_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.GRAY_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.BLACK_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.BROWN_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.RED_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.ORANGE_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.YELLOW_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.LIME_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.GREEN_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.CYAN_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.BLUE_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.PURPLE_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.MAGENTA_WOOL_STAIRS.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.PINK_WOOL_STAIRS.get()));

        tag(BlockTags.SLABS)
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.WHITE_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.GRAY_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.BLACK_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.BROWN_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.RED_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.ORANGE_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.YELLOW_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.LIME_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.GREEN_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.CYAN_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.BLUE_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.PURPLE_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.MAGENTA_WOOL_SLAB.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.PINK_WOOL_SLAB.get()));

        tag(BlockTags.FENCES).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_FENCE.get()));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_FENCE_GATE.get()));
        tag(BlockTags.DOORS).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_DOOR.get()));
        tag(BlockTags.TRAPDOORS).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_TRAPDOOR.get()));
        tag(BlockTags.WOODEN_SHELVES).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_SHELF.get()));


        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.getResourceKey(ModBlocks.POPLAR_SAPLING_POTTED.get()))
                .add(ModBlocks.getResourceKey(ModBlocks.RED_SHRUB_POTTED.get()));

        tag(BlockTags.WOODEN_BUTTONS).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_BUTTON.get()));
        tag(BlockTags.WOODEN_DOORS).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_DOOR.get()));
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_FENCE.get()));
        tag(BlockTags.WOODEN_SLABS).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_SLAB.get()));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_PRESSURE_PLATE.get()));
        tag(BlockTags.WOODEN_STAIRS).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_STAIRS.get()));
        tag(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.getResourceKey(ModBlocks.POPLAR_TRAPDOOR.get()));



    }
}