package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final Supplier<CreativeModeTab> FALL_DROP_TAB = CREATIVE_TAB.register("falldrop_backport",
            ()->  CreativeModeTab.builder()
                    .title(Component.translatable(Constants.MOD_ID+ ".fall_drop_tab"))
                    .icon(()-> new ItemStack(Blocks.LEAF_LITTER))
                    .displayItems((provider, output)-> {
                        output.accept(ModBlocks.WHITE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.WHITE_CONCRETE_SLAB);
                        output.accept(ModBlocks.WHITE_WOOL_STAIRS);
                        output.accept(ModBlocks.WHITE_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.white());

                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                        output.accept(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.lightGray());

                        output.accept(ModBlocks.GRAY_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GRAY_CONCRETE_SLAB);
                        output.accept(ModBlocks.GRAY_WOOL_STAIRS);
                        output.accept(ModBlocks.GRAY_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.gray());

                        output.accept(ModBlocks.BLACK_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLACK_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLACK_WOOL_STAIRS);
                        output.accept(ModBlocks.BLACK_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.black());

                        output.accept(ModBlocks.BROWN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BROWN_CONCRETE_SLAB);
                        output.accept(ModBlocks.BROWN_WOOL_STAIRS);
                        output.accept(ModBlocks.BROWN_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.brown());

                        output.accept(ModBlocks.RED_CONCRETE_STAIRS);
                        output.accept(ModBlocks.RED_CONCRETE_SLAB);
                        output.accept(ModBlocks.RED_WOOL_STAIRS);
                        output.accept(ModBlocks.RED_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.red());

                        output.accept(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.ORANGE_CONCRETE_SLAB);
                        output.accept(ModBlocks.ORANGE_WOOL_STAIRS);
                        output.accept(ModBlocks.ORANGE_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.orange());

                        output.accept(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        output.accept(ModBlocks.YELLOW_CONCRETE_SLAB);
                        output.accept(ModBlocks.YELLOW_WOOL_STAIRS);
                        output.accept(ModBlocks.YELLOW_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.yellow());

                        output.accept(ModBlocks.LIME_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIME_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIME_WOOL_STAIRS);
                        output.accept(ModBlocks.LIME_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.lime());

                        output.accept(ModBlocks.GREEN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.GREEN_CONCRETE_SLAB);
                        output.accept(ModBlocks.GREEN_WOOL_STAIRS);
                        output.accept(ModBlocks.GREEN_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.green());

                        output.accept(ModBlocks.CYAN_CONCRETE_STAIRS);
                        output.accept(ModBlocks.CYAN_CONCRETE_SLAB);
                        output.accept(ModBlocks.CYAN_WOOL_STAIRS);
                        output.accept(ModBlocks.CYAN_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.cyan());

                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                        output.accept(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.lightBlue());

                        output.accept(ModBlocks.BLUE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.BLUE_CONCRETE_SLAB);
                        output.accept(ModBlocks.BLUE_WOOL_STAIRS);
                        output.accept(ModBlocks.BLUE_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.blue());

                        output.accept(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PURPLE_CONCRETE_SLAB);
                        output.accept(ModBlocks.PURPLE_WOOL_STAIRS);
                        output.accept(ModBlocks.PURPLE_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.purple());

                        output.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        output.accept(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        output.accept(ModBlocks.MAGENTA_WOOL_STAIRS);
                        output.accept(ModBlocks.MAGENTA_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.magenta());

                        output.accept(ModBlocks.PINK_CONCRETE_STAIRS);
                        output.accept(ModBlocks.PINK_CONCRETE_SLAB);
                        output.accept(ModBlocks.PINK_WOOL_STAIRS);
                        output.accept(ModBlocks.PINK_WOOL_SLAB);
                        output.accept(ModItems.CUSHION.pink());


                        output.accept(ModBlocks.POPLAR_LOG);
                        output.accept(ModBlocks.POPLAR_WOOD);
                        output.accept(ModBlocks.STRIPPED_POPLAR_LOG);
                        output.accept(ModBlocks.STRIPPED_POPLAR_WOOD);
                        output.accept(ModBlocks.POPLAR_PLANKS);
                        output.accept(ModBlocks.POPLAR_STAIRS);
                        output.accept(ModBlocks.POPLAR_SLAB);
                        output.accept(ModBlocks.POPLAR_FENCE);
                        output.accept(ModBlocks.POPLAR_FENCE_GATE);
                        output.accept(ModBlocks.POPLAR_DOOR);
                        output.accept(ModBlocks.POPLAR_TRAPDOOR);
                        output.accept(ModBlocks.POPLAR_PRESSURE_PLATE);
                        output.accept(ModBlocks.POPLAR_BUTTON);
                        output.accept(ModItems.POPLAR_SIGN);
                        output.accept(ModItems.POPLAR_HANGING_SIGN);
                        output.accept(ModItems.POPLAR_BOAT);
                        output.accept(ModItems.POPLAR_CHEST_BOAT);
                        output.accept(ModBlocks.POPLAR_SHELF);
                        output.accept(ModBlocks.RED_POPLAR_LEAVES);
                        output.accept(ModBlocks.ORANGE_POPLAR_LEAVES);
                        output.accept(ModBlocks.YELLOW_POPLAR_LEAVES);
                        output.accept(ModBlocks.RED_SHRUB);
                        output.accept(ModBlocks.POPLAR_SAPLING);
                        output.accept(ModBlocks.SHELF_MUSHROOM);
                        output.accept(ModBlocks.STRAW_BED);

                    }).build()
    );



    public static void init(IEventBus bus) {
        CREATIVE_TAB.register(bus);
    }
}