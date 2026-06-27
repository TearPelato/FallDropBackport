package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.custom.ShelfMushroomBlock;
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


        blockModels.woodProvider(ModBlocks.POPLAR_LOG.get()).logWithHorizontal(ModBlocks.POPLAR_LOG.get()).wood(ModBlocks.POPLAR_WOOD.get());
        blockModels.woodProvider(ModBlocks.STRIPPED_POPLAR_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_POPLAR_LOG.get()).wood(ModBlocks.STRIPPED_POPLAR_WOOD.get());
        blockModels.createTrivialBlock(ModBlocks.RED_POPLAR_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createTrivialBlock(ModBlocks.ORANGE_POPLAR_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.createTrivialBlock(ModBlocks.YELLOW_POPLAR_LEAVES.get(), TexturedModel.LEAVES);
        blockModels.registerSimpleItemModel(ModBlocks.RED_POPLAR_LEAVES.get(),Constants.vanilla("block/red_poplar_leaves"));
        blockModels.registerSimpleItemModel(ModBlocks.ORANGE_POPLAR_LEAVES.get(),Constants.vanilla("block/orange_poplar_leaves"));
        blockModels.registerSimpleItemModel(ModBlocks.YELLOW_POPLAR_LEAVES.get(),Constants.vanilla("block/yellow_poplar_leaves"));


        blockModels.registerSimpleItemModel(ModBlocks.POPLAR_PLANKS.get(),Constants.vanilla("block/poplar_planks"));
        blockModels.registerSimpleItemModel(ModBlocks.POPLAR_PRESSURE_PLATE.get(),Constants.vanilla("block/poplar_pressure_plate"));
        blockModels.registerSimpleItemModel(ModBlocks.POPLAR_FENCE_GATE.get(),Constants.vanilla("block/poplar_fence_gate"));
        blockModels.registerSimpleItemModel(ModBlocks.SHELF_MUSHROOM.get(),Constants.vanilla("block/shelf_mushroom_stage0"));


        blockModels.family(ModBlocks.POPLAR_PLANKS.get()).generateFor(ModBlockFamilies.POPLAR_PLANKS);
        blockModels.createHangingSign(ModBlocks.POPLAR_PLANKS.get(), ModBlocks.POPLAR_HANGING_SIGN.get(), ModBlocks.POPLAR_WALL_HANGING_SIGN.get());

        blockModels.createPlantWithDefaultItem(ModBlocks.RED_SHRUB.get(), ModBlocks.RED_SHRUB_POTTED.get(), BlockModelGenerators.PlantType.TINTED);
        blockModels.createPlantWithDefaultItem(ModBlocks.POPLAR_SAPLING.get(), ModBlocks.POPLAR_SAPLING_POTTED.get(), BlockModelGenerators.PlantType.TINTED);

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(ModBlocks.SHELF_MUSHROOM.get())
                        .with(PropertyDispatch.initial(ShelfMushroomBlock.AGE)
                                .select(0, BlockModelGenerators.plainVariant(Constants.vanilla("block/shelf_mushroom_stage0")))
                                .select(1, BlockModelGenerators.plainVariant(Constants.vanilla("block/shelf_mushroom_stage1"))))
                        .with(BlockModelGenerators.ROTATION_HORIZONTAL_FACING));
        blockModels.createShelf(ModBlocks.POPLAR_SHELF.get(), ModBlocks.STRIPPED_POPLAR_LOG.get());
    }
}
