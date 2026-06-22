package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {


        itemModels.generateFlatItem(ModItems.POPLAR_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.POPLAR_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);



        blockModels.family(Blocks.WOOL.white())
                .stairs(ModBlocks.WHITE_WOOL_STAIRS.get())
                .slab(ModBlocks.WHITE_WOOL_SLAB.get());

        blockModels.family(Blocks.WOOL.lightGray())
                .stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get())
                .slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.gray())
                .stairs(ModBlocks.GRAY_WOOL_STAIRS.get())
                .slab(ModBlocks.GRAY_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.black())
                .stairs(ModBlocks.BLACK_WOOL_STAIRS.get())
                .slab(ModBlocks.BLACK_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.brown())
                .stairs(ModBlocks.BROWN_WOOL_STAIRS.get())
                .slab(ModBlocks.BROWN_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.red())
                .stairs(ModBlocks.RED_WOOL_STAIRS.get())
                .slab(ModBlocks.RED_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.orange())
                .stairs(ModBlocks.ORANGE_WOOL_STAIRS.get())
                .slab(ModBlocks.ORANGE_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.yellow())
                .stairs(ModBlocks.YELLOW_WOOL_STAIRS.get())
                .slab(ModBlocks.YELLOW_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.lime())
                .stairs(ModBlocks.LIME_WOOL_STAIRS.get())
                .slab(ModBlocks.LIME_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.green())
                .stairs(ModBlocks.GREEN_WOOL_STAIRS.get())
                .slab(ModBlocks.GREEN_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.cyan())
                .stairs(ModBlocks.CYAN_WOOL_STAIRS.get())
                .slab(ModBlocks.CYAN_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.lightBlue())
                .stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get())
                .slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.blue())
                .stairs(ModBlocks.BLUE_WOOL_STAIRS.get())
                .slab(ModBlocks.BLUE_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.purple())
                .stairs(ModBlocks.PURPLE_WOOL_STAIRS.get())
                .slab(ModBlocks.PURPLE_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.magenta())
                .stairs(ModBlocks.MAGENTA_WOOL_STAIRS.get())
                .slab(ModBlocks.MAGENTA_WOOL_SLAB.get());


        blockModels.family(Blocks.WOOL.pink())
                .stairs(ModBlocks.PINK_WOOL_STAIRS.get())
                .slab(ModBlocks.PINK_WOOL_SLAB.get());


        blockModels.woodProvider(ModBlocks.POPLAR_LOG.get()).logWithHorizontal(ModBlocks.POPLAR_LOG.get()).wood(ModBlocks.POPLAR_WOOD.get());
        blockModels.woodProvider(ModBlocks.STRIPPED_POPLAR_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_POPLAR_LOG.get()).wood(ModBlocks.STRIPPED_POPLAR_WOOD.get());
        blockModels.createTrivialBlock(ModBlocks.RED_POPLAR_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createTrivialBlock(ModBlocks.ORANGE_POPLAR_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createTrivialBlock(ModBlocks.YELLOW_POPLAR_LEAVES.get(), TexturedModel.LEAVES);

        blockModels.family(ModBlocks.POPLAR_PLANKS.get()).generateFor(ModBlockFamilies.POPLAR_PLANKS);
        //BlockModelGenerators.createHangingSign(ModBlocks.POPLAR_HANGING_SIGN.get(), MultiVariant.);

        blockModels.createPlantWithDefaultItem(ModBlocks.RED_SHRUB.get(), ModBlocks.RED_SHRUB_POTTED.get(), BlockModelGenerators.PlantType.TINTED);
        blockModels.createPlantWithDefaultItem(ModBlocks.POPLAR_SAPLING.get(), ModBlocks.POPLAR_SAPLING_POTTED.get(), BlockModelGenerators.PlantType.TINTED);

        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlocks.SHELF_MUSHROOM.get(),
                BlockModelGenerators.plainVariant(Constants.id("block/shelf_mushroom"))).with(BlockModelGenerators.ROTATION_HORIZONTAL_FACING));

        blockModels.createShelf(ModBlocks.POPLAR_SHELF.get(), ModBlocks.STRIPPED_POPLAR_LOG.get());
    }
}
