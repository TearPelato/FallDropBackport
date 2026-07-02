package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
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
        blockModelGenerators.family(Blocks.WHITE_WOOL)
                .stairs(ModBlocks.WHITE_WOOL_STAIRS)
                .slab(ModBlocks.WHITE_WOOL_SLAB);

        blockModelGenerators.family(Blocks.LIGHT_GRAY_WOOL)
                .stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);


        blockModelGenerators.family(Blocks.GRAY_WOOL)
                .stairs(ModBlocks.GRAY_WOOL_STAIRS)
                .slab(ModBlocks.GRAY_WOOL_SLAB);


        blockModelGenerators.family(Blocks.BLACK_WOOL)
                .stairs(ModBlocks.BLACK_WOOL_STAIRS)
                .slab(ModBlocks.BLACK_WOOL_SLAB);


        blockModelGenerators.family(Blocks.BROWN_WOOL)
                .stairs(ModBlocks.BROWN_WOOL_STAIRS)
                .slab(ModBlocks.BROWN_WOOL_SLAB);


        blockModelGenerators.family(Blocks.RED_WOOL)
                .stairs(ModBlocks.RED_WOOL_STAIRS)
                .slab(ModBlocks.RED_WOOL_SLAB);


        blockModelGenerators.family(Blocks.ORANGE_WOOL)
                .stairs(ModBlocks.ORANGE_WOOL_STAIRS)
                .slab(ModBlocks.ORANGE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.YELLOW_WOOL)
                .stairs(ModBlocks.YELLOW_WOOL_STAIRS)
                .slab(ModBlocks.YELLOW_WOOL_SLAB);


        blockModelGenerators.family(Blocks.LIME_WOOL)
                .stairs(ModBlocks.LIME_WOOL_STAIRS)
                .slab(ModBlocks.LIME_WOOL_SLAB);


        blockModelGenerators.family(Blocks.GREEN_WOOL)
                .stairs(ModBlocks.GREEN_WOOL_STAIRS)
                .slab(ModBlocks.GREEN_WOOL_SLAB);


        blockModelGenerators.family(Blocks.CYAN_WOOL)
                .stairs(ModBlocks.CYAN_WOOL_STAIRS)
                .slab(ModBlocks.CYAN_WOOL_SLAB);


        blockModelGenerators.family(Blocks.LIGHT_BLUE_WOOL)
                .stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.BLUE_WOOL)
                .stairs(ModBlocks.BLUE_WOOL_STAIRS)
                .slab(ModBlocks.BLUE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.PURPLE_WOOL)
                .stairs(ModBlocks.PURPLE_WOOL_STAIRS)
                .slab(ModBlocks.PURPLE_WOOL_SLAB);


        blockModelGenerators.family(Blocks.MAGENTA_WOOL)
                .stairs(ModBlocks.MAGENTA_WOOL_STAIRS)
                .slab(ModBlocks.MAGENTA_WOOL_SLAB);


        blockModelGenerators.family(Blocks.PINK_WOOL)
                .stairs(ModBlocks.PINK_WOOL_STAIRS)
                .slab(ModBlocks.PINK_WOOL_SLAB);


        blockModelGenerators.woodProvider(ModBlocks.POPLAR_LOG).logWithHorizontal(ModBlocks.POPLAR_LOG).wood(ModBlocks.POPLAR_WOOD);
        blockModelGenerators.woodProvider(ModBlocks.STRIPPED_POPLAR_LOG).logWithHorizontal(ModBlocks.STRIPPED_POPLAR_LOG).wood(ModBlocks.STRIPPED_POPLAR_WOOD);
        blockModelGenerators.createTrivialBlock(ModBlocks.RED_POPLAR_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(ModBlocks.ORANGE_POPLAR_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createTrivialBlock(ModBlocks.YELLOW_POPLAR_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.registerSimpleItemModel(ModBlocks.RED_POPLAR_LEAVES,Constants.vanilla("block/red_poplar_leaves"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.ORANGE_POPLAR_LEAVES,Constants.vanilla("block/orange_poplar_leaves"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.YELLOW_POPLAR_LEAVES,Constants.vanilla("block/yellow_poplar_leaves"));


        blockModelGenerators.registerSimpleItemModel(ModBlocks.POPLAR_PLANKS,Constants.vanilla("block/poplar_planks"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.POPLAR_PRESSURE_PLATE,Constants.vanilla("block/poplar_pressure_plate"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.POPLAR_FENCE_GATE,Constants.vanilla("block/poplar_fence_gate"));
        blockModelGenerators.registerSimpleItemModel(ModBlocks.SHELF_MUSHROOM,Constants.vanilla("block/shelf_mushroom_stage0"));


        blockModelGenerators.family(ModBlocks.POPLAR_PLANKS).generateFor(ModBlockFamilies.POPLAR_PLANKS);
        blockModelGenerators.createHangingSign(ModBlocks.POPLAR_PLANKS, ModBlocks.POPLAR_HANGING_SIGN, ModBlocks.POPLAR_WALL_HANGING_SIGN);

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
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.POPLAR_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.POPLAR_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

    }

    
}
