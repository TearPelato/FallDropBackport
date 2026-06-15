package net.tearpelato.falldrop_backport.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Constants.MOD_ID);

    //WoolSet
    public static final DeferredBlock<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            properties -> new StairBlock(Blocks.WHITE_WOOL.defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));


    public static final DeferredBlock<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }


}
