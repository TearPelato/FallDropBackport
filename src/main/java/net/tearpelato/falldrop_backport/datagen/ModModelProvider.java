package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.family(Blocks.WHITE_WOOL)
                .stairs(ModBlocks.WHITE_WOOL_STAIRS.get())
                .slab(ModBlocks.WHITE_WOOL_SLAB.get());

        blockModels.family(Blocks.LIGHT_GRAY_WOOL)
                .stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get());


        blockModels.family(Blocks.GRAY_WOOL)
                .stairs(ModBlocks.GRAY_WOOL_STAIRS.get())
                .slab(ModBlocks.GRAY_WOOL_SLAB.get());


        blockModels.family(Blocks.BLACK_WOOL)
                .stairs(ModBlocks.BLACK_WOOL_STAIRS.get())
                .slab(ModBlocks.BLACK_WOOL_SLAB.get());


        blockModels.family(Blocks.BROWN_WOOL)
                .stairs(ModBlocks.BROWN_WOOL_STAIRS.get())
                .slab(ModBlocks.BROWN_WOOL_SLAB.get());


        blockModels.family(Blocks.RED_WOOL)
                .stairs(ModBlocks.RED_WOOL_STAIRS.get())
                .slab(ModBlocks.RED_WOOL_SLAB.get());


        blockModels.family(Blocks.ORANGE_WOOL)
                .stairs(ModBlocks.ORANGE_WOOL_STAIRS.get())
                .slab(ModBlocks.ORANGE_WOOL_SLAB.get());


        blockModels.family(Blocks.YELLOW_WOOL)
                .stairs(ModBlocks.YELLOW_WOOL_STAIRS.get())
                .slab(ModBlocks.YELLOW_WOOL_SLAB.get());


        blockModels.family(Blocks.LIME_WOOL)
                .stairs(ModBlocks.LIME_WOOL_STAIRS.get())
                .slab(ModBlocks.LIME_WOOL_SLAB.get());


        blockModels.family(Blocks.GREEN_WOOL)
                .stairs(ModBlocks.GREEN_WOOL_STAIRS.get())
                .slab(ModBlocks.GREEN_WOOL_SLAB.get());


        blockModels.family(Blocks.CYAN_WOOL)
                .stairs(ModBlocks.CYAN_WOOL_STAIRS.get())
                .slab(ModBlocks.CYAN_WOOL_SLAB.get());


        blockModels.family(Blocks.LIGHT_BLUE_WOOL)
                .stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get());


        blockModels.family(Blocks.BLUE_WOOL)
                .stairs(ModBlocks.BLUE_WOOL_STAIRS.get())
                .slab(ModBlocks.BLUE_WOOL_SLAB.get());


        blockModels.family(Blocks.PURPLE_WOOL)
                .stairs(ModBlocks.PURPLE_WOOL_STAIRS.get())
                .slab(ModBlocks.PURPLE_WOOL_SLAB.get());


        blockModels.family(Blocks.MAGENTA_WOOL)
                .stairs(ModBlocks.MAGENTA_WOOL_STAIRS.get())
                .slab(ModBlocks.MAGENTA_WOOL_SLAB.get());


        blockModels.family(Blocks.PINK_WOOL)
                .stairs(ModBlocks.PINK_WOOL_STAIRS.get())
                .slab(ModBlocks.PINK_WOOL_SLAB.get());











    }
}
