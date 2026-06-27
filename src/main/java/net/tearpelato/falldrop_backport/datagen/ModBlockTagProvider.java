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
        super(output, lookupProvider, Constants.NAMESPACE);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.POPLAR_STAIRS.getKey())
                .add(ModBlocks.POPLAR_PLANKS.getKey())
                .add(ModBlocks.POPLAR_SLAB.getKey())
                .add(ModBlocks.POPLAR_FENCE.getKey())
                .add(ModBlocks.POPLAR_SIGN.getKey())
                .add(ModBlocks.POPLAR_WALL_SIGN.getKey())
                .add(ModBlocks.POPLAR_HANGING_SIGN.getKey())
                .add(ModBlocks.POPLAR_WALL_HANGING_SIGN.getKey())
                .add(ModBlocks.POPLAR_DOOR.getKey())
                .add(ModBlocks.POPLAR_TRAPDOOR.getKey())
                .add(ModBlocks.POPLAR_BUTTON.getKey())
                .add(ModBlocks.POPLAR_PRESSURE_PLATE.getKey());

        tag(BlockTags.LOGS)
                .add(ModBlocks.POPLAR_LOG.getKey())
                .add(ModBlocks.POPLAR_WOOD.getKey())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.getKey())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.getKey());

        tag(BlockTags.LEAVES)
                .add(ModBlocks.RED_POPLAR_LEAVES.getKey())
                .add(ModBlocks.ORANGE_POPLAR_LEAVES.getKey())
                .add(ModBlocks.YELLOW_POPLAR_LEAVES.getKey());


        tag(BlockTags.STAIRS)
                .add(ModBlocks.POPLAR_STAIRS.getKey())
                .add(ModBlocks.WHITE_WOOL_STAIRS.getKey())
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.getKey())
                .add(ModBlocks.GRAY_WOOL_STAIRS.getKey())
                .add(ModBlocks.BLACK_WOOL_STAIRS.getKey())
                .add(ModBlocks.BROWN_WOOL_STAIRS.getKey())
                .add(ModBlocks.RED_WOOL_STAIRS.getKey())
                .add(ModBlocks.ORANGE_WOOL_STAIRS.getKey())
                .add(ModBlocks.YELLOW_WOOL_STAIRS.getKey())
                .add(ModBlocks.LIME_WOOL_STAIRS.getKey())
                .add(ModBlocks.GREEN_WOOL_STAIRS.getKey())
                .add(ModBlocks.CYAN_WOOL_STAIRS.getKey())
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.getKey())
                .add(ModBlocks.BLUE_WOOL_STAIRS.getKey())
                .add(ModBlocks.PURPLE_WOOL_STAIRS.getKey())
                .add(ModBlocks.MAGENTA_WOOL_STAIRS.getKey())
                .add(ModBlocks.PINK_WOOL_STAIRS.getKey());

        tag(BlockTags.SLABS)
                .add(ModBlocks.POPLAR_SLAB.getKey())
                .add(ModBlocks.WHITE_WOOL_SLAB.getKey())
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.getKey())
                .add(ModBlocks.GRAY_WOOL_SLAB.getKey())
                .add(ModBlocks.BLACK_WOOL_SLAB.getKey())
                .add(ModBlocks.BROWN_WOOL_SLAB.getKey())
                .add(ModBlocks.RED_WOOL_SLAB.getKey())
                .add(ModBlocks.ORANGE_WOOL_SLAB.getKey())
                .add(ModBlocks.YELLOW_WOOL_SLAB.getKey())
                .add(ModBlocks.LIME_WOOL_SLAB.getKey())
                .add(ModBlocks.GREEN_WOOL_SLAB.getKey())
                .add(ModBlocks.CYAN_WOOL_SLAB.getKey())
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.getKey())
                .add(ModBlocks.BLUE_WOOL_SLAB.getKey())
                .add(ModBlocks.PURPLE_WOOL_SLAB.getKey())
                .add(ModBlocks.MAGENTA_WOOL_SLAB.getKey())
                .add(ModBlocks.PINK_WOOL_SLAB.getKey());

        tag(BlockTags.FENCES).add(ModBlocks.POPLAR_FENCE.getKey());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.POPLAR_FENCE_GATE.getKey());
        tag(BlockTags.DOORS).add(ModBlocks.POPLAR_DOOR.getKey());
        tag(BlockTags.TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.getKey());
        tag(BlockTags.WOODEN_SHELVES).add(ModBlocks.POPLAR_SHELF.getKey());

        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POPLAR_SAPLING_POTTED.getKey())
                .add(ModBlocks.RED_SHRUB_POTTED.getKey());
    }
}
