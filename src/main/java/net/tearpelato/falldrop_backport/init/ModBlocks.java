package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.custom.*;
import net.tearpelato.falldrop_backport.worldgen.ModTreeGrowers;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Constants.NAMESPACE);

    //WoolSet
    public static final DeferredBlock<Block> WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            properties -> new StairBlock(Blocks.WOOL.white().defaultBlockState(), properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava().requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            properties -> new SlabBlock( properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
    public static final DeferredBlock<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            properties -> new SlabBlock(properties.strength(0.8F).sound(SoundType.WOOL).ignitedByLava()));
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


    public static final DeferredBlock<Block> POPLAR_LOG = registerBlock("poplar_log",
            properties -> new ModFlammablePillars(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));

    public static final DeferredBlock<Block> POPLAR_WOOD = registerBlock("poplar_wood",
            properties -> new ModFlammablePillars(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));

    public static final DeferredBlock<Block> STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            properties -> new ModFlammablePillars(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));

    public static final DeferredBlock<Block> STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            properties -> new ModFlammablePillars(properties.sound(SoundType.WOOD).strength(2.0F).ignitedByLava()));


    public static final DeferredBlock<Block> RED_POPLAR_LEAVES = registerBlock("red_poplar_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1f,ModParticleTypes.RED_POPLAR_LEAVES.get(), properties.mapColor(MapColor.PLANT)
                    .strength(0.2F).randomTicks().sound(SoundType.AZALEA_LEAVES).noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot).isSuffocating((_, _, _) -> false)
                    .isViewBlocking((_, _, _) -> false)
                    .ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor((_, _, _) -> false))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final DeferredBlock<Block> ORANGE_POPLAR_LEAVES = registerBlock("orange_poplar_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1f,ModParticleTypes.ORANGE_POPLAR_LEAVES.get(), properties.mapColor(MapColor.PLANT)
                    .strength(0.2F).randomTicks().sound(SoundType.AZALEA_LEAVES).noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot).isSuffocating((_, _, _) -> false)
                    .isViewBlocking((_, _, _) -> false)
                    .ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor((_, _, _) -> false))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });


    public static final DeferredBlock<Block> YELLOW_POPLAR_LEAVES = registerBlock("yellow_poplar_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1f,ModParticleTypes.YELLOW_POPLAR_LEAVES.get(), properties.mapColor(MapColor.PLANT)
                    .strength(0.2F).randomTicks().sound(SoundType.AZALEA_LEAVES).noOcclusion()
                    .isValidSpawn(Blocks::ocelotOrParrot).isSuffocating((_, _, _) -> false)
                    .isViewBlocking((_, _, _) -> false)
                    .ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor((_, _, _) -> false))
            {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });







    public static final DeferredBlock<Block> POPLAR_PLANKS = registerBlock("poplar_planks",
            properties -> new Block(properties.sound(SoundType.WOOD).strength(2F).ignitedByLava()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });


    public static final DeferredBlock<Block> POPLAR_STAIRS = registerBlock("poplar_stairs",
            properties -> new StairBlock(POPLAR_PLANKS.get().defaultBlockState(), properties.strength(2.0F).sound(SoundType.WOOD).ignitedByLava().requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POPLAR_SLAB = registerBlock("poplar_slab",
            properties -> new SlabBlock( properties.strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final DeferredBlock<Block> POPLAR_FENCE = registerBlock("poplar_fence",
            properties -> new FenceBlock(properties.strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POPLAR_FENCE_GATE = registerBlock("poplar_fence_gate",
            properties -> new FenceGateBlock(WoodType.PALE_OAK, properties.strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POPLAR_DOOR = registerBlock("poplar_door",
            properties -> new DoorBlock(BlockSetType.PALE_OAK, properties.strength(2f)
                    .requiresCorrectToolForDrops().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> POPLAR_TRAPDOOR = registerBlock("poplar_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.PALE_OAK, properties.strength(2f)
                    .requiresCorrectToolForDrops().noOcclusion().isValidSpawn(Blocks::never)));

    public static final DeferredBlock<Block> POPLAR_PRESSURE_PLATE = registerBlock("poplar_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.PALE_OAK,
                    properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn().noCollision().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> POPLAR_BUTTON = registerBlock("poplar_button",
            properties -> new ButtonBlock(BlockSetType.PALE_OAK, 20,
                    properties.strength(2f).requiresCorrectToolForDrops().noCollision().pushReaction(PushReaction.DESTROY)));


    public static final DeferredBlock<Block> POPLAR_SIGN = BLOCKS.registerBlock("poplar_sign",
            properties -> new ModStandingSignBlock(ModWoodType.POPLAR, properties.strength(2f).ignitedByLava()));

    public static final DeferredBlock<Block> POPLAR_WALL_SIGN = BLOCKS.registerBlock("poplar_wall_sign",
            properties -> new ModWallSignBlock(ModWoodType.POPLAR, properties.strength(2f).ignitedByLava()));

    public static final DeferredBlock<Block> POPLAR_HANGING_SIGN = BLOCKS.registerBlock("poplar_hanging_sign",
            properties -> new ModHangingSignBlock(ModWoodType.POPLAR, properties.strength(2f).ignitedByLava()));

    public static final DeferredBlock<Block> POPLAR_WALL_HANGING_SIGN = BLOCKS.registerBlock("poplar_wall_hanging_sign",
            properties -> new ModWallHangingSignBlock(ModWoodType.POPLAR, properties.strength(2f).ignitedByLava()));

    public static final DeferredBlock<Block> POPLAR_SHELF = registerBlock("poplar_shelf",
            properties -> new ModShelfBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.SHELF)));

        public static final DeferredBlock<Block> RED_SHRUB = registerBlock("red_shrub",
                properties -> new BushBlock(properties.strength(0.2f).sound(SoundType.GRASS).noCollision().instabreak().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> RED_SHRUB_POTTED = registerBlock("red_shrub_potted",
            properties -> new BushBlock(properties.strength(0.2f).sound(SoundType.GRASS).noCollision().instabreak().pushReaction(PushReaction.DESTROY)));




    public static final DeferredBlock<Block> POPLAR_SAPLING = registerBlock("poplar_sapling",
            properties -> new SaplingBlock(ModTreeGrowers.POPLAR, properties.mapColor(MapColor.PLANT).noCollision()
                    .randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> POPLAR_SAPLING_POTTED = BLOCKS.registerBlock("potted_poplar_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, POPLAR_SAPLING,
                    properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> SHELF_MUSHROOM = registerBlock("shelf_mushroom",
            properties -> new ShelfMushroomBlock(properties.strength(1.0F).mapColor(MapColor.PLANT).bounceRestitution(0.75F).sound(SoundType.WOOD).noOcclusion().pushReaction(PushReaction.DESTROY)));



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


    public static ResourceKey<Block> getResourceKey(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
    public static ResourceKey<Item> getResourceKeyItem(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

}
