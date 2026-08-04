package net.tearpelato.falldrop_backport.datagen;


import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;

import java.util.Set;

public class ModBlockLootableProvider extends BlockLootSubProvider {
    protected ModBlockLootableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.WHITE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
        dropSelf(ModBlocks.GRAY_WOOL_STAIRS.get());
        dropSelf(ModBlocks.BLACK_WOOL_STAIRS.get());
        dropSelf(ModBlocks.BROWN_WOOL_STAIRS.get());
        dropSelf(ModBlocks.RED_WOOL_STAIRS.get());
        dropSelf(ModBlocks.ORANGE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.YELLOW_WOOL_STAIRS.get());
        dropSelf(ModBlocks.LIME_WOOL_STAIRS.get());
        dropSelf(ModBlocks.GREEN_WOOL_STAIRS.get());
        dropSelf(ModBlocks.CYAN_WOOL_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.BLUE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.PURPLE_WOOL_STAIRS.get());
        dropSelf(ModBlocks.MAGENTA_WOOL_STAIRS.get());
        dropSelf(ModBlocks.PINK_WOOL_STAIRS.get());


        add(ModBlocks.WHITE_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.GRAY_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BLACK_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BROWN_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.RED_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.ORANGE_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.YELLOW_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.LIME_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.GREEN_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.CYAN_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BLUE_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.PURPLE_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.MAGENTA_WOOL_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.PINK_WOOL_SLAB.get(), this::createSlabItemTable);

        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());


        add(ModBlocks.WHITE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BLACK_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BROWN_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.RED_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.ORANGE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.YELLOW_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.LIME_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.GREEN_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.CYAN_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.PURPLE_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.PINK_CONCRETE_SLAB.get(), this::createSlabItemTable);



        dropSelf(ModBlocks.POPLAR_LOG.get());
        dropSelf(ModBlocks.POPLAR_WOOD.get());
        dropSelf(ModBlocks.POPLAR_PLANKS.get());
        dropSelf(ModBlocks.POPLAR_STAIRS.get());
        add(ModBlocks.POPLAR_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.POPLAR_FENCE.get());
        dropSelf(ModBlocks.POPLAR_FENCE_GATE.get());
        dropSelf(ModBlocks.POPLAR_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POPLAR_BUTTON.get());
        dropSelf(ModBlocks.POPLAR_DOOR.get());
        dropSelf(ModBlocks.POPLAR_TRAPDOOR.get());
        dropSelf(ModBlocks.POPLAR_SHELF.get());

        dropSelf(ModBlocks.STRIPPED_POPLAR_LOG.get());
        dropSelf(ModBlocks.STRIPPED_POPLAR_WOOD.get());

       add(ModBlocks.ORANGE_POPLAR_LEAVES.get(), block-> createLeavesDrops(block, ModBlocks.POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
       add(ModBlocks.RED_POPLAR_LEAVES.get(), block-> createLeavesDrops(block, ModBlocks.POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
       add(ModBlocks.YELLOW_POPLAR_LEAVES.get(), block-> createLeavesDrops(block, ModBlocks.POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

       add(ModBlocks.POPLAR_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_SIGN.get()));

       add(ModBlocks.POPLAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_SIGN.get()));

       add(ModBlocks.POPLAR_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_HANGING_SIGN.get()));

       add(ModBlocks.POPLAR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_HANGING_SIGN.get()));


       dropSelf(ModBlocks.RED_SHRUB.get());
       dropSelf(ModBlocks.POPLAR_SAPLING.get());
        add(ModBlocks.STRAW_BED.get(), bed -> LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(bed)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(BlockStateProperties.BED_PART, BedPart.FOOT)))
                        .add(LootItem.lootTableItem(bed))
                )
        );

       add(ModBlocks.POPLAR_SAPLING_POTTED.get(), createPotFlowerItemTable(ModBlocks.POPLAR_SAPLING.get()));
       add(ModBlocks.RED_SHRUB_POTTED.get(), createPotFlowerItemTable(ModBlocks.RED_SHRUB.get()));
        add(ModBlocks.SHELF_MUSHROOM.get(), block ->
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.SHELF_MUSHROOM.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(BlockStateProperties.AGE_1, 0)))))
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.SHELF_MUSHROOM.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(BlockStateProperties.AGE_1, 1)))))
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModBlocks.SHELF_MUSHROOM.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(BlockStateProperties.AGE_1, 1)))))
        );

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream()
                .map(Holder::value)
                ::iterator;
    }

}
