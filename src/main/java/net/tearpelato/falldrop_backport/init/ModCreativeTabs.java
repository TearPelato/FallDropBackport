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
            .displayItems((provider, output)->{
                output.accept(ModBlocks.WHITE_WOOL_STAIRS);
                output.accept(ModBlocks.WHITE_WOOL_SLAB);

                output.accept(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                output.accept(ModBlocks.LIGHT_GRAY_WOOL_SLAB);

                output.accept(ModBlocks.GRAY_WOOL_STAIRS);
                output.accept(ModBlocks.GRAY_WOOL_SLAB);

                output.accept(ModBlocks.BLACK_WOOL_STAIRS);
                output.accept(ModBlocks.BLACK_WOOL_SLAB);

                output.accept(ModBlocks.BROWN_WOOL_STAIRS);
                output.accept(ModBlocks.BROWN_WOOL_SLAB);

                output.accept(ModBlocks.RED_WOOL_STAIRS);
                output.accept(ModBlocks.RED_WOOL_SLAB);

                output.accept(ModBlocks.ORANGE_WOOL_STAIRS);
                output.accept(ModBlocks.ORANGE_WOOL_SLAB);

                output.accept(ModBlocks.YELLOW_WOOL_STAIRS);
                output.accept(ModBlocks.YELLOW_WOOL_SLAB);

                output.accept(ModBlocks.LIME_WOOL_STAIRS);
                output.accept(ModBlocks.LIME_WOOL_SLAB);

                output.accept(ModBlocks.GREEN_WOOL_STAIRS);
                output.accept(ModBlocks.GREEN_WOOL_SLAB);

                output.accept(ModBlocks.CYAN_WOOL_STAIRS);
                output.accept(ModBlocks.CYAN_WOOL_SLAB);

                output.accept(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                output.accept(ModBlocks.LIGHT_BLUE_WOOL_SLAB);

                output.accept(ModBlocks.BLUE_WOOL_STAIRS);
                output.accept(ModBlocks.BLUE_WOOL_SLAB);

                output.accept(ModBlocks.PURPLE_WOOL_STAIRS);
                output.accept(ModBlocks.PURPLE_WOOL_SLAB);

                output.accept(ModBlocks.MAGENTA_WOOL_STAIRS);
                output.accept(ModBlocks.MAGENTA_WOOL_SLAB);

                output.accept(ModBlocks.PINK_WOOL_STAIRS);
                output.accept(ModBlocks.PINK_WOOL_SLAB);

            }).build()
    );



    public static void init(IEventBus bus) {
        CREATIVE_TAB.register(bus);
    }
}
