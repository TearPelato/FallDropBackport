package net.tearpelato.falldrop_backport.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }


    @Override
    public void generate() {
        dropSelf(ModBlocks.WHITE_WOOL_STAIRS);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        dropSelf(ModBlocks.GRAY_WOOL_STAIRS);
        dropSelf(ModBlocks.BLACK_WOOL_STAIRS);
        dropSelf(ModBlocks.BROWN_WOOL_STAIRS);
        dropSelf(ModBlocks.RED_WOOL_STAIRS);
        dropSelf(ModBlocks.ORANGE_WOOL_STAIRS);
        dropSelf(ModBlocks.YELLOW_WOOL_STAIRS);
        dropSelf(ModBlocks.LIME_WOOL_STAIRS);
        dropSelf(ModBlocks.GREEN_WOOL_STAIRS);
        dropSelf(ModBlocks.CYAN_WOOL_STAIRS);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        dropSelf(ModBlocks.BLUE_WOOL_STAIRS);
        dropSelf(ModBlocks.PURPLE_WOOL_STAIRS);
        dropSelf(ModBlocks.MAGENTA_WOOL_STAIRS);
        dropSelf(ModBlocks.PINK_WOOL_STAIRS);


        add(ModBlocks.WHITE_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.LIGHT_GRAY_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.GRAY_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.BLACK_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.BROWN_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.RED_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.ORANGE_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.YELLOW_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.LIME_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.GREEN_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.CYAN_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.LIGHT_BLUE_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.BLUE_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.PURPLE_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.MAGENTA_WOOL_SLAB, this::createSlabItemTable);
        add(ModBlocks.PINK_WOOL_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS);
        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS);
        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS);
        dropSelf(ModBlocks.RED_CONCRETE_STAIRS);
        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS);
        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS);
        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS);
        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS);


        add(ModBlocks.WHITE_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.GRAY_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.BLACK_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.BROWN_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.RED_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.ORANGE_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.YELLOW_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.LIME_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.GREEN_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.CYAN_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.BLUE_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.PURPLE_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.MAGENTA_CONCRETE_SLAB, this::createSlabItemTable);
        add(ModBlocks.PINK_CONCRETE_SLAB, this::createSlabItemTable);


        dropSelf(ModBlocks.POPLAR_LOG);
        dropSelf(ModBlocks.POPLAR_WOOD);
        dropSelf(ModBlocks.POPLAR_PLANKS);
        dropSelf(ModBlocks.POPLAR_STAIRS);
        add(ModBlocks.POPLAR_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.POPLAR_FENCE);
        dropSelf(ModBlocks.POPLAR_FENCE_GATE);
        dropSelf(ModBlocks.POPLAR_PRESSURE_PLATE);
        dropSelf(ModBlocks.POPLAR_BUTTON);
        add(ModBlocks.POPLAR_DOOR, createDoorTable(ModBlocks.POPLAR_DOOR));
        dropSelf(ModBlocks.POPLAR_TRAPDOOR);
        dropSelf(ModBlocks.POPLAR_SHELF);

        dropSelf(ModBlocks.STRIPPED_POPLAR_LOG);
        dropSelf(ModBlocks.STRIPPED_POPLAR_WOOD);

        add(ModBlocks.ORANGE_POPLAR_LEAVES, block-> createLeavesDrops(block, ModBlocks.POPLAR_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.RED_POPLAR_LEAVES, block-> createLeavesDrops(block, ModBlocks.POPLAR_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.YELLOW_POPLAR_LEAVES, block-> createLeavesDrops(block, ModBlocks.POPLAR_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));

        add(ModBlocks.POPLAR_SIGN, block ->
                createSingleItemTable(ModItems.POPLAR_SIGN));

        add(ModBlocks.POPLAR_WALL_SIGN, block ->
                createSingleItemTable(ModItems.POPLAR_SIGN));

        add(ModBlocks.POPLAR_HANGING_SIGN, block ->
                createSingleItemTable(ModItems.POPLAR_HANGING_SIGN));

        add(ModBlocks.POPLAR_WALL_HANGING_SIGN, block ->
                createSingleItemTable(ModItems.POPLAR_HANGING_SIGN));


        dropSelf(ModBlocks.RED_SHRUB);
        dropSelf(ModBlocks.POPLAR_SAPLING);
        add( ModBlocks.STRAW_BED, LootTable.lootTable().withPool(
                LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                        .when(ExplosionCondition.survivesExplosion())
                        .add( LootItem.lootTableItem(ModBlocks.STRAW_BED))));

        add(ModBlocks.POPLAR_SAPLING_POTTED, createPotFlowerItemTable(ModBlocks.POPLAR_SAPLING));
        add(ModBlocks.RED_SHRUB_POTTED, createPotFlowerItemTable(ModBlocks.RED_SHRUB));
        add(ModBlocks.SHELF_MUSHROOM, block ->
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.SHELF_MUSHROOM)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(BlockStateProperties.AGE_1, 0)))))
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.SHELF_MUSHROOM)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(BlockStateProperties.AGE_1, 1)))))
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.SHELF_MUSHROOM)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(BlockStateProperties.AGE_1, 1)))))
        );

    }


}