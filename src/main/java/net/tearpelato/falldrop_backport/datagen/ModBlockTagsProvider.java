package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        valueLookupBuilder(BlockTags.LOGS)
                .add(ModBlocks.POPLAR_LOG)
                .add(ModBlocks.POPLAR_WOOD)
                .add(ModBlocks.STRIPPED_POPLAR_WOOD)
                .add(ModBlocks.STRIPPED_POPLAR_LOG);

        valueLookupBuilder(BlockTags.LEAVES)
                .add(ModBlocks.RED_POPLAR_LEAVES)
                .add(ModBlocks.ORANGE_POPLAR_LEAVES)
                .add(ModBlocks.YELLOW_POPLAR_LEAVES);


        valueLookupBuilder(BlockTags.STAIRS)
                .add(ModBlocks.POPLAR_STAIRS)
                .add(ModBlocks.WHITE_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ModBlocks.GRAY_WOOL_STAIRS)
                .add(ModBlocks.BLACK_WOOL_STAIRS)
                .add(ModBlocks.BROWN_WOOL_STAIRS)
                .add(ModBlocks.RED_WOOL_STAIRS)
                .add(ModBlocks.ORANGE_WOOL_STAIRS)
                .add(ModBlocks.YELLOW_WOOL_STAIRS)
                .add(ModBlocks.LIME_WOOL_STAIRS)
                .add(ModBlocks.GREEN_WOOL_STAIRS)
                .add(ModBlocks.CYAN_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ModBlocks.BLUE_WOOL_STAIRS)
                .add(ModBlocks.PURPLE_WOOL_STAIRS)
                .add(ModBlocks.MAGENTA_WOOL_STAIRS)
                .add(ModBlocks.PINK_WOOL_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(ModBlocks.POPLAR_SLAB)
                .add(ModBlocks.WHITE_WOOL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ModBlocks.GRAY_WOOL_SLAB)
                .add(ModBlocks.BLACK_WOOL_SLAB)
                .add(ModBlocks.BROWN_WOOL_SLAB)
                .add(ModBlocks.RED_WOOL_SLAB)
                .add(ModBlocks.ORANGE_WOOL_SLAB)
                .add(ModBlocks.YELLOW_WOOL_SLAB)
                .add(ModBlocks.LIME_WOOL_SLAB)
                .add(ModBlocks.GREEN_WOOL_SLAB)
                .add(ModBlocks.CYAN_WOOL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ModBlocks.BLUE_WOOL_SLAB)
                .add(ModBlocks.PURPLE_WOOL_SLAB)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)
                .add(ModBlocks.PINK_WOOL_SLAB);

        valueLookupBuilder(BlockTags.FENCES).add(ModBlocks.POPLAR_FENCE);
        valueLookupBuilder(BlockTags.FENCE_GATES).add(ModBlocks.POPLAR_FENCE_GATE);
        valueLookupBuilder(BlockTags.DOORS).add(ModBlocks.POPLAR_DOOR);
        valueLookupBuilder(BlockTags.TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR);
        valueLookupBuilder(BlockTags.SAPLINGS).add(ModBlocks.POPLAR_SAPLING);
        valueLookupBuilder(BlockTags.WOODEN_SHELVES).add(ModBlocks.POPLAR_SHELF);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.POPLAR_LOG)
                .add(ModBlocks.POPLAR_WOOD)
                .add(ModBlocks.STRIPPED_POPLAR_LOG)
                .add(ModBlocks.STRIPPED_POPLAR_WOOD);

        valueLookupBuilder(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POPLAR_SAPLING_POTTED)
                .add(ModBlocks.RED_SHRUB_POTTED);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.POPLAR_BUTTON);
        valueLookupBuilder(BlockTags.WOODEN_DOORS).add(ModBlocks.POPLAR_DOOR);
        valueLookupBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.POPLAR_FENCE);
        valueLookupBuilder(BlockTags.WOODEN_SLABS).add(ModBlocks.POPLAR_SLAB);
        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.POPLAR_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.WOODEN_STAIRS).add(ModBlocks.POPLAR_STAIRS);
        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR);



    }
}