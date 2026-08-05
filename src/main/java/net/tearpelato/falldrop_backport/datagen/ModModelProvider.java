package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.custom.ShelfMushroomBlock;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }


    private static final PropertyDispatch<VariantMutator> ROTATION_HORIZONTAL_FACING = PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING)
            .select(Direction.EAST, BlockModelGenerators.Y_ROT_90)
            .select(Direction.SOUTH, BlockModelGenerators.Y_ROT_180)
            .select(Direction.WEST, BlockModelGenerators.Y_ROT_270)
            .select(Direction.NORTH, BlockModelGenerators.NOP);

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

        blockModelGenerators.family(Blocks.WOOL.white())
                .stairs(ModBlocks.WHITE_WOOL_STAIRS)
                .slab(ModBlocks.WHITE_WOOL_SLAB);

        blockModelGenerators.family(Blocks.WOOL.lightGray())
                .stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.gray())
                .stairs(ModBlocks.GRAY_WOOL_STAIRS)
                .slab(ModBlocks.GRAY_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.black())
                .stairs(ModBlocks.BLACK_WOOL_STAIRS)
                .slab(ModBlocks.BLACK_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.brown())
                .stairs(ModBlocks.BROWN_WOOL_STAIRS)
                .slab(ModBlocks.BROWN_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.red())
                .stairs(ModBlocks.RED_WOOL_STAIRS)
                .slab(ModBlocks.RED_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.orange())
                .stairs(ModBlocks.ORANGE_WOOL_STAIRS)
                .slab(ModBlocks.ORANGE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.yellow())
                .stairs(ModBlocks.YELLOW_WOOL_STAIRS)
                .slab(ModBlocks.YELLOW_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.lime())
                .stairs(ModBlocks.LIME_WOOL_STAIRS)
                .slab(ModBlocks.LIME_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.green())
                .stairs(ModBlocks.GREEN_WOOL_STAIRS)
                .slab(ModBlocks.GREEN_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.cyan())
                .stairs(ModBlocks.CYAN_WOOL_STAIRS)
                .slab(ModBlocks.CYAN_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.lightBlue())
                .stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.blue())
                .stairs(ModBlocks.BLUE_WOOL_STAIRS)
                .slab(ModBlocks.BLUE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.purple())
                .stairs(ModBlocks.PURPLE_WOOL_STAIRS)
                .slab(ModBlocks.PURPLE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.magenta())
                .stairs(ModBlocks.MAGENTA_WOOL_STAIRS)
                .slab(ModBlocks.MAGENTA_WOOL_SLAB);


        blockModelGenerators.family(Blocks.WOOL.pink())
                .stairs(ModBlocks.PINK_WOOL_STAIRS)
                .slab(ModBlocks.PINK_WOOL_SLAB);

        blockModelGenerators.family(Blocks.CONCRETE.white())
                .stairs(ModBlocks.WHITE_CONCRETE_STAIRS)
                .slab(ModBlocks.WHITE_CONCRETE_SLAB);

        blockModelGenerators.family(Blocks.CONCRETE.lightGray())
                .stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.gray())
                .stairs(ModBlocks.GRAY_CONCRETE_STAIRS)
                .slab(ModBlocks.GRAY_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.black())
                .stairs(ModBlocks.BLACK_CONCRETE_STAIRS)
                .slab(ModBlocks.BLACK_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.brown())
                .stairs(ModBlocks.BROWN_CONCRETE_STAIRS)
                .slab(ModBlocks.BROWN_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.red())
                .stairs(ModBlocks.RED_CONCRETE_STAIRS)
                .slab(ModBlocks.RED_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.orange())
                .stairs(ModBlocks.ORANGE_CONCRETE_STAIRS)
                .slab(ModBlocks.ORANGE_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.yellow())
                .stairs(ModBlocks.YELLOW_CONCRETE_STAIRS)
                .slab(ModBlocks.YELLOW_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.lime())
                .stairs(ModBlocks.LIME_CONCRETE_STAIRS)
                .slab(ModBlocks.LIME_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.green())
                .stairs(ModBlocks.GREEN_CONCRETE_STAIRS)
                .slab(ModBlocks.GREEN_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.cyan())
                .stairs(ModBlocks.CYAN_CONCRETE_STAIRS)
                .slab(ModBlocks.CYAN_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.lightBlue())
                .stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.blue())
                .stairs(ModBlocks.BLUE_CONCRETE_STAIRS)
                .slab(ModBlocks.BLUE_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.purple())
                .stairs(ModBlocks.PURPLE_CONCRETE_STAIRS)
                .slab(ModBlocks.PURPLE_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.magenta())
                .stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                .slab(ModBlocks.MAGENTA_CONCRETE_SLAB);


        blockModelGenerators.family(Blocks.CONCRETE.pink())
                .stairs(ModBlocks.PINK_CONCRETE_STAIRS)
                .slab(ModBlocks.PINK_CONCRETE_SLAB);


        blockModelGenerators.woodProvider(ModBlocks.POPLAR_LOG).logWithHorizontal(ModBlocks.POPLAR_LOG).wood(ModBlocks.POPLAR_WOOD);
        blockModelGenerators.woodProvider(ModBlocks.STRIPPED_POPLAR_LOG).logWithHorizontal(ModBlocks.STRIPPED_POPLAR_LOG).wood(ModBlocks.STRIPPED_POPLAR_WOOD);
        blockModelGenerators.createTrivialBlock(ModBlocks.RED_POPLAR_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(ModBlocks.ORANGE_POPLAR_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(ModBlocks.YELLOW_POPLAR_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.registerSimpleItemModel(ModBlocks.RED_POPLAR_LEAVES,Constants.vanilla("block/red_poplar_leaves"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.ORANGE_POPLAR_LEAVES,Constants.vanilla("block/orange_poplar_leaves"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.YELLOW_POPLAR_LEAVES,Constants.vanilla("block/yellow_poplar_leaves"));


        blockModelGenerators.registerSimpleItemModel(ModBlocks.POPLAR_PLANKS, Constants.vanilla("block/poplar_planks"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.POPLAR_PRESSURE_PLATE,Constants.vanilla("block/poplar_pressure_plate"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.POPLAR_FENCE_GATE,Constants.vanilla("block/poplar_fence_gate"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.SHELF_MUSHROOM,Constants.vanilla("block/shelf_mushroom_stage0"));


        blockModelGenerators.family(ModBlocks.POPLAR_PLANKS).generateFor(ModBlockFamilies.POPLAR_PLANKS);


        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.RED_SHRUB, ModBlocks.RED_SHRUB_POTTED, BlockModelGenerators.PlantType.TINTED);
        blockModelGenerators.createPlantWithDefaultItem(ModBlocks.POPLAR_SAPLING, ModBlocks.POPLAR_SAPLING_POTTED, BlockModelGenerators.PlantType.TINTED);

        blockModelGenerators.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(ModBlocks.SHELF_MUSHROOM)
                        .with(PropertyDispatch.initial(ShelfMushroomBlock.AGE)
                                .select(0, BlockModelGenerators.plainVariant(Constants.vanilla("block/shelf_mushroom_stage0")))
                                .select(1, BlockModelGenerators.plainVariant(Constants.vanilla("block/shelf_mushroom_stage1"))))
                        .with(ROTATION_HORIZONTAL_FACING));
        blockModelGenerators.createShelf(ModBlocks.POPLAR_SHELF, ModBlocks.STRIPPED_POPLAR_LOG);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(ModItems.POPLAR_BOAT, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.POPLAR_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.white(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.lightGray(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.gray(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.black(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.brown(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.red(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.orange(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.yellow(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.lime(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.green(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.cyan(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.lightBlue(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.blue(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.purple(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.magenta(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.pink(), ModelTemplates.FLAT_ITEM);

    }


}