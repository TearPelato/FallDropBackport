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
                .add(ModBlocks.POPLAR_STAIRS.get().builtInRegistryHolder().key());

        tag(BlockTags.LOGS)
                .add(ModBlocks.POPLAR_LOG.get().builtInRegistryHolder().key())
                .add(ModBlocks.POPLAR_WOOD.get().builtInRegistryHolder().key())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.get().builtInRegistryHolder().key())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.get().builtInRegistryHolder().key());

        tag(BlockTags.LEAVES)
                .add(ModBlocks.RED_POPLAR_LEAVES.get().builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_POPLAR_LEAVES.get().builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_POPLAR_LEAVES.get().builtInRegistryHolder().key());


        tag(BlockTags.STAIRS)
                .add(ModBlocks.POPLAR_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.RED_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.LIME_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_WOOL_STAIRS.get().builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_STAIRS.get().builtInRegistryHolder().key());

        tag(BlockTags.SLABS)
                .add(ModBlocks.POPLAR_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.RED_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.LIME_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_WOOL_SLAB.get().builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_SLAB.get().builtInRegistryHolder().key());

        tag(BlockTags.FENCES).add(ModBlocks.POPLAR_FENCE.get().builtInRegistryHolder().key());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.POPLAR_FENCE_GATE.get().builtInRegistryHolder().key());
        tag(BlockTags.DOORS).add(ModBlocks.POPLAR_DOOR.get().builtInRegistryHolder().key());
        tag(BlockTags.TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.get().builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_SHELVES).add(ModBlocks.POPLAR_SHELF.get().builtInRegistryHolder().key());

        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POPLAR_SAPLING_POTTED.get().builtInRegistryHolder().key())
                .add(ModBlocks.RED_SHRUB_POTTED.get().builtInRegistryHolder().key());
    }
}
