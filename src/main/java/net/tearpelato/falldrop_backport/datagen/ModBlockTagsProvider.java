package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
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

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.GRAY_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.BLACK_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.BROWN_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.RED_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.LIME_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.GREEN_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.CYAN_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.BLUE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.PINK_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.WHITE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.getKey())
                .add(ModBlocks.GRAY_CONCRETE_SLAB.getKey())
                .add(ModBlocks.BLACK_CONCRETE_SLAB.getKey())
                .add(ModBlocks.BROWN_CONCRETE_SLAB.getKey())
                .add(ModBlocks.RED_CONCRETE_SLAB.getKey())
                .add(ModBlocks.ORANGE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.YELLOW_CONCRETE_SLAB.getKey())
                .add(ModBlocks.LIME_CONCRETE_SLAB.getKey())
                .add(ModBlocks.GREEN_CONCRETE_SLAB.getKey())
                .add(ModBlocks.CYAN_CONCRETE_SLAB.getKey())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.BLUE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.PURPLE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB.getKey())
                .add(ModBlocks.PINK_CONCRETE_SLAB.getKey());


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
                .add(ModBlocks.PINK_WOOL_STAIRS.getKey())
                .add(ModBlocks.WHITE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.GRAY_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.BLACK_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.BROWN_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.RED_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.LIME_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.GREEN_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.CYAN_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.BLUE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.getKey())
                .add(ModBlocks.PINK_CONCRETE_STAIRS.getKey());

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
                .add(ModBlocks.PINK_WOOL_SLAB.getKey())
                .add(ModBlocks.WHITE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.getKey())
                .add(ModBlocks.GRAY_CONCRETE_SLAB.getKey())
                .add(ModBlocks.BLACK_CONCRETE_SLAB.getKey())
                .add(ModBlocks.BROWN_CONCRETE_SLAB.getKey())
                .add(ModBlocks.RED_CONCRETE_SLAB.getKey())
                .add(ModBlocks.ORANGE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.YELLOW_CONCRETE_SLAB.getKey())
                .add(ModBlocks.LIME_CONCRETE_SLAB.getKey())
                .add(ModBlocks.GREEN_CONCRETE_SLAB.getKey())
                .add(ModBlocks.CYAN_CONCRETE_SLAB.getKey())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.BLUE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.PURPLE_CONCRETE_SLAB.getKey())
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB.getKey())
                .add(ModBlocks.PINK_CONCRETE_SLAB.getKey());

        tag(BlockTags.FENCES).add(ModBlocks.POPLAR_FENCE.getKey());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.POPLAR_FENCE_GATE.getKey());
        tag(BlockTags.DOORS).add(ModBlocks.POPLAR_DOOR.getKey());
        tag(BlockTags.TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.getKey());
        tag(BlockTags.WOODEN_SHELVES).add(ModBlocks.POPLAR_SHELF.getKey());


        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POPLAR_SAPLING_POTTED.getKey())
                .add(ModBlocks.RED_SHRUB_POTTED.getKey());

        tag(BlockTags.WOODEN_BUTTONS).add(ModBlocks.POPLAR_BUTTON.getKey());
        tag(BlockTags.WOODEN_DOORS).add(ModBlocks.POPLAR_DOOR.getKey());
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.POPLAR_FENCE.getKey());
        tag(BlockTags.WOODEN_SLABS).add(ModBlocks.POPLAR_SLAB.getKey());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.POPLAR_PRESSURE_PLATE.getKey());
        tag(BlockTags.WOODEN_STAIRS).add(ModBlocks.POPLAR_STAIRS.getKey());
        tag(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.getKey());

        tag(BlockTags.WOOL)
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
                .add(ModBlocks.PINK_WOOL_STAIRS.getKey())
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

        tag(ModTags.Blocks.CUSHION_USES_COLLISION_SHAPE)
                .add(Blocks.CAULDRON.builtInRegistryHolder().getKey())
                .add(Blocks.WATER_CAULDRON.builtInRegistryHolder().getKey())
                .add(Blocks.LAVA_CAULDRON.builtInRegistryHolder().getKey())
                .add(Blocks.POWDER_SNOW_CAULDRON.builtInRegistryHolder().getKey())
                .add(Blocks.HOPPER.builtInRegistryHolder().getKey())
                .add(Blocks.COMPOSTER.builtInRegistryHolder().getKey());

    }
}