package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

        dropSelf(ModBlocks.STRIPPED_POPLAR_LOG.get());
        dropSelf(ModBlocks.STRIPPED_POPLAR_WOOD.get());

       add(ModBlocks.ORANGE_POPLAR_LEAVES.get(), block-> createLeavesDrops(block, Blocks.OAK_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));
       add(ModBlocks.RED_POPLAR_LEAVES.get(), block-> createLeavesDrops(block, Blocks.OAK_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));
       add(ModBlocks.YELLOW_POPLAR_LEAVES.get(), block-> createLeavesDrops(block, Blocks.OAK_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));

       add(ModBlocks.POPLAR_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_SIGN.get()));

       add(ModBlocks.POPLAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_SIGN.get()));

       add(ModBlocks.POPLAR_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_HANGING_SIGN.get()));

       add(ModBlocks.POPLAR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_HANGING_SIGN.get()));
       dropSelf(ModBlocks.RED_SHRUB.get());
       dropSelf(ModBlocks.RED_SHRUB_POTTED.get());
       dropSelf(ModBlocks.POPLAR_SAPLING.get());
       dropSelf(ModBlocks.POPLAR_SAPLING_POTTED.get());
       dropSelf(ModBlocks.SHELF_MUSHROOM.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
