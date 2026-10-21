package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.custom.*;
import net.tearpelato.falldrop_backport.worldgen.ModTreeGrowers;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ModBlocks {
    public static final Block WHITE_WOOL_STAIRS = registerCopy("white_wool_stairs", Blocks.WOOL.white(),
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties));
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerCopy("light_gray_wool_stairs",  Blocks.WOOL.lightGray(),
            properties -> new StairBlock(Blocks.WOOL.lightGray().defaultBlockState(),properties));
    public static final Block GRAY_WOOL_STAIRS = registerCopy("gray_wool_stairs", Blocks.WOOL.gray(),
            properties -> new StairBlock(Blocks.WOOL.gray().defaultBlockState(),properties));
    public static final Block BLACK_WOOL_STAIRS = registerCopy("black_wool_stairs", Blocks.WOOL.black(),
            properties -> new StairBlock(Blocks.WOOL.black().defaultBlockState(), properties));
    public static final Block BROWN_WOOL_STAIRS = registerCopy("brown_wool_stairs", Blocks.WOOL.brown(),
            properties -> new StairBlock(Blocks.WOOL.brown().defaultBlockState(), properties));
    public static final Block RED_WOOL_STAIRS = registerCopy("red_wool_stairs", Blocks.WOOL.red(),
            properties -> new StairBlock(Blocks.WOOL.red().defaultBlockState(), properties));
    public static final Block ORANGE_WOOL_STAIRS = registerCopy("orange_wool_stairs", Blocks.WOOL.orange(),
            properties -> new StairBlock(Blocks.WOOL.orange().defaultBlockState(), properties));
    public static final Block YELLOW_WOOL_STAIRS = registerCopy("yellow_wool_stairs", Blocks.WOOL.yellow(),
            properties -> new StairBlock(Blocks.WOOL.yellow().defaultBlockState(), properties));
    public static final Block LIME_WOOL_STAIRS = registerCopy("lime_wool_stairs", Blocks.WOOL.lime(),
            properties -> new StairBlock(Blocks.WOOL.lime().defaultBlockState(), properties));
    public static final Block GREEN_WOOL_STAIRS = registerCopy("green_wool_stairs", Blocks.WOOL.green(),
            properties -> new StairBlock(Blocks.WOOL.green().defaultBlockState(), properties));
    public static final Block CYAN_WOOL_STAIRS = registerCopy("cyan_wool_stairs", Blocks.WOOL.cyan(),
            properties -> new StairBlock(Blocks.WOOL.cyan().defaultBlockState(), properties));
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerCopy("light_blue_wool_stairs", Blocks.WOOL.lightBlue(),
            properties -> new StairBlock(Blocks.WOOL.lightBlue().defaultBlockState(), properties));
    public static final Block BLUE_WOOL_STAIRS = registerCopy("blue_wool_stairs", Blocks.WOOL.blue(),
            properties -> new StairBlock(Blocks.WOOL.blue().defaultBlockState(), properties));
    public static final Block PURPLE_WOOL_STAIRS = registerCopy("purple_wool_stairs", Blocks.WOOL.purple(),
            properties -> new StairBlock(Blocks.WOOL.purple().defaultBlockState(), properties));
    public static final Block MAGENTA_WOOL_STAIRS = registerCopy("magenta_wool_stairs", Blocks.WOOL.magenta(),
            properties -> new StairBlock(Blocks.WOOL.magenta().defaultBlockState(), properties));
    public static final Block PINK_WOOL_STAIRS = registerCopy("pink_wool_stairs", Blocks.WOOL.pink(),
            properties -> new StairBlock(Blocks.WOOL.pink().defaultBlockState(), properties));


    public static final Block WHITE_WOOL_SLAB = registerCopy("white_wool_slab", Blocks.WOOL.white(), SlabBlock::new);
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerCopy("light_gray_wool_slab", Blocks.WOOL.lightGray(), SlabBlock::new);
    public static final Block GRAY_WOOL_SLAB = registerCopy("gray_wool_slab", Blocks.WOOL.gray(), SlabBlock::new);
    public static final Block BLACK_WOOL_SLAB = registerCopy("black_wool_slab",Blocks.WOOL.black(), SlabBlock::new);
    public static final Block BROWN_WOOL_SLAB = registerCopy("brown_wool_slab", Blocks.WOOL.brown(), SlabBlock::new);
    public static final Block RED_WOOL_SLAB = registerCopy("red_wool_slab", Blocks.WOOL.red(), SlabBlock::new);
    public static final Block ORANGE_WOOL_SLAB = registerCopy("orange_wool_slab", Blocks.WOOL.orange(), SlabBlock::new);
    public static final Block YELLOW_WOOL_SLAB = registerCopy("yellow_wool_slab", Blocks.WOOL.yellow(), SlabBlock::new);
    public static final Block LIME_WOOL_SLAB = registerCopy("lime_wool_slab", Blocks.WOOL.lime(), SlabBlock::new);
    public static final Block GREEN_WOOL_SLAB = registerCopy("green_wool_slab", Blocks.WOOL.green(), SlabBlock::new);
    public static final Block CYAN_WOOL_SLAB = registerCopy("cyan_wool_slab", Blocks.WOOL.cyan(), SlabBlock::new);
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerCopy("light_blue_wool_slab", Blocks.WOOL.lightBlue(), SlabBlock::new);
    public static final Block BLUE_WOOL_SLAB = registerCopy("blue_wool_slab", Blocks.WOOL.blue(), SlabBlock::new);
    public static final Block PURPLE_WOOL_SLAB = registerCopy("purple_wool_slab", Blocks.WOOL.purple(), SlabBlock::new);
    public static final Block MAGENTA_WOOL_SLAB = registerCopy("magenta_wool_slab", Blocks.WOOL.magenta(), SlabBlock::new);
    public static final Block PINK_WOOL_SLAB = registerCopy("pink_wool_slab", Blocks.WOOL.pink(), SlabBlock::new);

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            properties -> new StairBlock(Blocks.CONCRETE.white().defaultBlockState(), properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));


    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            properties -> new SlabBlock(properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            properties -> new SlabBlock( properties.strength(1.8F).sound(SoundType.STONE).ignitedByLava()));






    public static final Block POPLAR_LOG = registerBlock("poplar_log",
            properties -> new RotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));

    public static final Block POPLAR_WOOD = registerBlock("poplar_wood",
            properties -> new RotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));

    public static final Block STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            properties -> new RotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));

    public static final Block STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            properties -> new RotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));


    public static final Block RED_POPLAR_LEAVES = registerBlock("red_poplar_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01f,ModParticleTypes.RED_POPLAR_LEAVES, properties.mapColor(MapColor.COLOR_RED)
                    .strength(0.2F).randomTicks().sound(ModSounds.POPLAR_LEAVES).noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot).isSuffocating((_, _, _) -> false)
                    .isViewBlocking((_, _, _) -> false)
                    .ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor((_, _, _) -> false)));

    public static final Block ORANGE_POPLAR_LEAVES = registerBlock("orange_poplar_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01f,ModParticleTypes.ORANGE_POPLAR_LEAVES, properties.mapColor(MapColor.COLOR_ORANGE)
                    .strength(0.2F).randomTicks().sound(ModSounds.POPLAR_LEAVES).noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot).isSuffocating((_, _, _) -> false)
                    .isViewBlocking((_, _, _) -> false)
                    .ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor((_, _, _) -> false)));


    public static final Block YELLOW_POPLAR_LEAVES = registerBlock("yellow_poplar_leaves",
            properties -> new UntintedParticleLeavesBlock(0.01f,ModParticleTypes.YELLOW_POPLAR_LEAVES, properties.mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.2F).randomTicks().sound(ModSounds.POPLAR_LEAVES).noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot).isSuffocating((_, _, _) -> false)
                    .isViewBlocking((_, _, _) -> false)
                    .ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor((_, _, _) -> false)));







    public static final Block POPLAR_PLANKS = registerBlock("poplar_planks",
            properties -> new Block(properties.mapColor(MapColor.WOOD).strength(2f)
                    .sound(SoundType.WOOD).ignitedByLava()));


    public static final Block POPLAR_STAIRS = registerBlock("poplar_stairs",
            properties -> new StairBlock(POPLAR_PLANKS.defaultBlockState(), properties.strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Block POPLAR_SLAB = registerBlock("poplar_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final Block POPLAR_FENCE = registerBlock("poplar_fence",
            properties -> new FenceBlock(properties.strength(2f).sound(SoundType.WOOD).ignitedByLava()));

    public static final Block POPLAR_FENCE_GATE = registerBlock("poplar_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2f).sound(SoundType.WOOD).ignitedByLava()));

    public static final Block POPLAR_DOOR = registerBlock("poplar_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.strength(2f)
                    .noOcclusion().pushReaction(PushReaction.DESTROY).ignitedByLava()));

    public static final Block POPLAR_TRAPDOOR = registerBlock("poplar_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.strength(2f)
                    .noOcclusion().isValidSpawn(Blocks::never).ignitedByLava()));

    public static final Block POPLAR_PRESSURE_PLATE = registerBlock("poplar_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK,
                    properties.strength(2f).forceSolidOn().noCollision().pushReaction(PushReaction.DESTROY)));

    public static final Block POPLAR_BUTTON = registerBlock("poplar_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 20,
                    properties.strength(2f).noCollision().pushReaction(PushReaction.DESTROY)));

    public static final Block STRAW_BED = registerSimpleBlock("straw_bed",
            properties-> new StrawBedBlock(properties.strength(0.2f).sound(ModSounds.STRAW_BED)));

    public static final Block POPLAR_SIGN = registerBlockWithoutBlockItem("poplar_sign",
            properties -> new ModStandingSignBlock(ModWoodType.POPLAR, properties.strength(1.0F).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().ignitedByLava()));

    public static final Block POPLAR_WALL_SIGN = registerBlockWithoutBlockItem("poplar_wall_sign",
            properties -> new ModWallSignBlock(ModWoodType.POPLAR, properties.forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).ignitedByLava()));

    public static final Block POPLAR_HANGING_SIGN = registerBlockWithoutBlockItem("poplar_hanging_sign",
            properties -> new ModHangingSignBlock(ModWoodType.POPLAR, properties.forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).ignitedByLava()));

    public static final Block POPLAR_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("poplar_wall_hanging_sign",
            properties -> new ModWallHangingSignBlock(ModWoodType.POPLAR, properties.forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).ignitedByLava()));

    public static final Block POPLAR_SHELF = registerBlock("poplar_shelf",
            properties -> new ModShelfBlock(properties.strength(2f).sound(SoundType.SHELF)));

    public static final Block RED_SHRUB = registerBlock("red_shrub",
            properties -> new BushBlock(properties.strength(0.2f).sound(ModSounds.RED_SHRUB).noCollision().instabreak().pushReaction(PushReaction.DESTROY)));

    public static final Block RED_SHRUB_POTTED = registerBlock("red_shrub_potted",
            properties -> new BushBlock(properties.strength(0.2f).sound(ModSounds.RED_SHRUB).noCollision().instabreak().pushReaction(PushReaction.DESTROY)));




    public static final Block POPLAR_SAPLING = registerBlock("poplar_sapling",
            properties -> new SaplingBlock(ModTreeGrowers.POPLAR, properties.mapColor(MapColor.PLANT).noCollision()
                    .randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));

    public static final Block POPLAR_SAPLING_POTTED = registerBlockWithoutBlockItem("potted_poplar_sapling",
            properties -> new FlowerPotBlock(POPLAR_SAPLING, properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)));

    public static final Block SHELF_MUSHROOM = registerBlock("shelf_mushroom",
            properties -> new ShelfMushroomBlock(properties.strength(1.0F).sound(ModSounds.SHELF_MUSHROOM)));




    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        return Registry.register(BuiltInRegistries.BLOCK, Constants.vanilla(name), function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Constants.vanilla(name)))));
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Constants.vanilla(name))));
        registerBlockItem(Constants.vanilla(name), toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Constants.vanilla(name), toRegister);
    }

    private static Block registerSimpleBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, Constants.vanilla(name))));

        return Registry.register(BuiltInRegistries.BLOCK, Constants.vanilla(name), toRegister);
    }

    private static void registerBlockItem(Identifier id, Block block) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id);
        Registry.register(BuiltInRegistries.ITEM, itemKey,
                new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix()));
    }

    private static <T extends Block> T registerCopy(String name, Block copyFrom,
                                                    UnaryOperator<BlockBehaviour.Properties> tweak,
                                                    Function<BlockBehaviour.Properties, T> function) {
        Identifier id = Identifier.fromNamespaceAndPath(Constants.NAMESPACE, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);

        BlockBehaviour.Properties props = tweak
                .apply(BlockBehaviour.Properties.ofFullCopy(copyFrom))
                .setId(blockKey);

        T block = Registry.register(BuiltInRegistries.BLOCK, blockKey, function.apply(props));
        registerBlockItem(id, block);
        return block;
    }

    private static <T extends Block> T registerCopy(String name, Block copyFrom,
                                                    Function<BlockBehaviour.Properties, T> function) {
        return registerCopy(name, copyFrom, UnaryOperator.identity(), function);
    }


    public static void registerModBlocks() {
        Constants.LOGGER.info("Registering Mod Blocks for " + Constants.MOD_ID);
    }


}
