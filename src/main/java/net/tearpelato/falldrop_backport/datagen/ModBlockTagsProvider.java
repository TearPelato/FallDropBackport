package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(Constants.getBlockKey(ModBlocks.POPLAR_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_PLANKS))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_SLAB))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_FENCE))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_SIGN))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_WALL_SIGN))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_HANGING_SIGN))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_WALL_HANGING_SIGN))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_DOOR))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_TRAPDOOR))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_BUTTON))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_PRESSURE_PLATE));

        tag(BlockTags.LOGS)
                .add(Constants.getBlockKey(ModBlocks.POPLAR_LOG))
                .add(Constants.getBlockKey(ModBlocks.POPLAR_WOOD))
                .add(Constants.getBlockKey(ModBlocks.STRIPPED_POPLAR_WOOD))
                .add(Constants.getBlockKey(ModBlocks.STRIPPED_POPLAR_LOG));

        tag(BlockTags.LEAVES)
                .add(Constants.getBlockKey(ModBlocks.RED_POPLAR_LEAVES))
                .add(Constants.getBlockKey(ModBlocks.ORANGE_POPLAR_LEAVES))
                .add(Constants.getBlockKey(ModBlocks.YELLOW_POPLAR_LEAVES));


        tag(BlockTags.STAIRS)
                .add(Constants.getBlockKey(ModBlocks.POPLAR_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.WHITE_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.LIGHT_GRAY_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.GRAY_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.BLACK_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.BROWN_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.RED_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.ORANGE_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.YELLOW_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.LIME_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.GREEN_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.CYAN_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.LIGHT_BLUE_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.BLUE_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.PURPLE_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.MAGENTA_WOOL_STAIRS))
                .add(Constants.getBlockKey(ModBlocks.PINK_WOOL_STAIRS));

        tag(BlockTags.SLABS)
                .add(Constants.getBlockKey(ModBlocks.POPLAR_SLAB))
                .add(Constants.getBlockKey(ModBlocks.WHITE_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.LIGHT_GRAY_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.GRAY_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.BLACK_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.BROWN_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.RED_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.ORANGE_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.YELLOW_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.LIME_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.GREEN_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.CYAN_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.LIGHT_BLUE_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.BLUE_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.PURPLE_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.MAGENTA_WOOL_SLAB))
                .add(Constants.getBlockKey(ModBlocks.PINK_WOOL_SLAB));

        tag(BlockTags.FENCES).add(Constants.getBlockKey(ModBlocks.POPLAR_FENCE));
        tag(BlockTags.FENCE_GATES).add(Constants.getBlockKey(ModBlocks.POPLAR_FENCE_GATE));
        tag(BlockTags.DOORS).add(Constants.getBlockKey(ModBlocks.POPLAR_DOOR));
        tag(BlockTags.TRAPDOORS).add(Constants.getBlockKey(ModBlocks.POPLAR_TRAPDOOR));

        tag(BlockTags.WOODEN_SHELVES).add(Constants.getBlockKey(ModBlocks.POPLAR_SHELF));


        tag(BlockTags.FLOWER_POTS)
                .add(Constants.getBlockKey(ModBlocks.POPLAR_SAPLING_POTTED))
                .add(Constants.getBlockKey(ModBlocks.RED_SHRUB_POTTED));

        tag(BlockTags.WOODEN_BUTTONS).add(Constants.getBlockKey(ModBlocks.POPLAR_BUTTON));
        tag(BlockTags.WOODEN_DOORS).add(Constants.getBlockKey(ModBlocks.POPLAR_DOOR));
        tag(BlockTags.WOODEN_FENCES).add(Constants.getBlockKey(ModBlocks.POPLAR_FENCE));
        tag(BlockTags.WOODEN_SLABS).add(Constants.getBlockKey(ModBlocks.POPLAR_SLAB));
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(Constants.getBlockKey(ModBlocks.POPLAR_PRESSURE_PLATE));
        tag(BlockTags.WOODEN_STAIRS).add(Constants.getBlockKey(ModBlocks.POPLAR_STAIRS));
        tag(BlockTags.WOODEN_TRAPDOORS).add(Constants.getBlockKey(ModBlocks.POPLAR_TRAPDOOR));



    }
}