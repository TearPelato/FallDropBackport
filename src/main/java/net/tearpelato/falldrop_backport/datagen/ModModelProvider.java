package net.tearpelato.falldrop_backport.datagen;

import com.mojang.math.Transformation;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.custom.ShelfMushroomBlock;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {


        itemModels.generateFlatItem(ModItems.POPLAR_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.POPLAR_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.white().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.lightGray().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.gray().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.black().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.brown().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.red().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.orange().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.yellow().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.lime().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.green().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.cyan().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.lightBlue().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.blue().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.purple().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.magenta().get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CUSHION.pink().get(), ModelTemplates.FLAT_ITEM);

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
        blockModels.registerSimpleItemModel(ModBlocks.RED_POPLAR_LEAVES.get(),Constants.vanilla("block/red_poplar_leaves"));
        blockModels.registerSimpleItemModel(ModBlocks.ORANGE_POPLAR_LEAVES.get(),Constants.vanilla("block/orange_poplar_leaves"));
        blockModels.registerSimpleItemModel(ModBlocks.YELLOW_POPLAR_LEAVES.get(),Constants.vanilla("block/yellow_poplar_leaves"));


        blockModels.registerSimpleItemModel(ModBlocks.POPLAR_PLANKS.get(),Constants.vanilla("block/poplar_planks"));
        blockModels.registerSimpleItemModel(ModBlocks.POPLAR_PRESSURE_PLATE.get(),Constants.vanilla("block/poplar_pressure_plate"));
        blockModels.registerSimpleItemModel(ModBlocks.POPLAR_FENCE_GATE.get(),Constants.vanilla("block/poplar_fence_gate"));
        blockModels.registerSimpleItemModel(ModBlocks.SHELF_MUSHROOM.get(),Constants.vanilla("block/shelf_mushroom_stage0"));


        blockModels.family(ModBlocks.POPLAR_PLANKS.get()).generateFor(ModBlockFamilies.POPLAR_PLANKS);

        blockModels.createPlantWithDefaultItem(ModBlocks.RED_SHRUB.get(), ModBlocks.RED_SHRUB_POTTED.get(), BlockModelGenerators.PlantType.TINTED);
        blockModels.createPlantWithDefaultItem(ModBlocks.POPLAR_SAPLING.get(), ModBlocks.POPLAR_SAPLING_POTTED.get(), BlockModelGenerators.PlantType.TINTED);

      // createStrawBed(ModBlocks.STRAW_BED.get(), null,null);
        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(ModBlocks.SHELF_MUSHROOM.get())
                        .with(PropertyDispatch.initial(ShelfMushroomBlock.AGE)
                                .select(0, plainVariant(Constants.vanilla("block/shelf_mushroom_stage0")))
                                .select(1, plainVariant(Constants.vanilla("block/shelf_mushroom_stage1"))))
                        .with(BlockModelGenerators.ROTATION_HORIZONTAL_FACING));
        blockModels.createShelf(ModBlocks.POPLAR_SHELF.get(), ModBlocks.STRIPPED_POPLAR_LOG.get());


    }
   /* private void createStrawBed() {
        Block strawBed = ModBlocks.STRAW_BED.get();
        Identifier head = ModelLocationUtils.getModelLocation(strawBed, "_head");
        Identifier foot = ModelLocationUtils.getModelLocation(strawBed, "_foot");
        blockStateOutput.accept(createStrawBed(strawBed, plainVariant(head), plainVariant(foot)));
        Transformation headTransformation = new Transformation(new Vector3f(0.85F, 0.0F, 0.6F), (new Quaternionf()).rotationY((float)Math.PI), (Vector3fc)null, (Quaternionfc)null);
        Transformation footTransformation = new Transformation(new Vector3f(0.85F, 0.0F, 1.6F), (new Quaternionf()).rotationY((float)Math.PI), (Vector3fc)null, (Quaternionfc)null);
        ItemModel.Unbaked itemModelHead = ItemModelUtils.plainModel(head, headTransformation);
        ItemModel.Unbaked itemModelFoot = ItemModelUtils.plainModel(foot, footTransformation);
        itemModelOutput.accept(strawBed.asItem(), ItemModelUtils.composite(new ItemModel.Unbaked[]{itemModelHead, itemModelFoot}));
    }

    private static BlockModelDefinitionGenerator createStrawBed(final Block block, final MultiVariant headModel, final MultiVariant footModel) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.BED_PART).select(Direction.NORTH, BedPart.HEAD, headModel.with(BlockModelGenerators.Y_ROT_180)).select(Direction.SOUTH, BedPart.HEAD, headModel).select(Direction.EAST, BedPart.HEAD, headModel.with(BlockModelGenerators.Y_ROT_270)).select(Direction.WEST, BedPart.HEAD, headModel.with(BlockModelGenerators.Y_ROT_90)).select(Direction.NORTH, BedPart.FOOT, footModel.with(BlockModelGenerators.Y_ROT_180)).select(Direction.SOUTH, BedPart.FOOT, footModel).select(Direction.EAST, BedPart.FOOT, footModel.with(BlockModelGenerators.Y_ROT_270)).select(Direction.WEST, BedPart.FOOT, footModel.with(BlockModelGenerators.Y_ROT_90)));
    }*/


}
