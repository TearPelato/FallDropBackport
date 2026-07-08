package net.tearpelato.falldrop_backport.init;

import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.item.CushionItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.NAMESPACE);

    public static final DeferredItem<Item> POPLAR_SIGN = ITEMS.registerItem("poplar_sign",
            (properties)-> new SignItem( ModBlocks.POPLAR_WALL_SIGN.get(), ModBlocks.POPLAR_SIGN.get(), properties.stacksTo(16)));
    public static final DeferredItem<Item> POPLAR_HANGING_SIGN = ITEMS.registerItem("poplar_hanging_sign",
            (properties)-> new SignItem( ModBlocks.POPLAR_WALL_HANGING_SIGN.get(), ModBlocks.POPLAR_HANGING_SIGN.get(), properties.stacksTo(16)));


    public static final DeferredItem<Item> POPLAR_BOAT = ITEMS.registerItem("poplar_boat",
            properties -> new BoatItem(ModEntities.POPLAR_BOAT.get(), properties.stacksTo(1)));
    public static final DeferredItem<Item> POPLAR_CHEST_BOAT = ITEMS.registerItem("poplar_chest_boat",
            properties -> new BoatItem(ModEntities.POPLAR_CHEST_BOAT.get(), properties.stacksTo(1)));

    public static final DeferredItem<Item> WHITE_CUSHION = ITEMS.registerItem("white_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.WHITE));
    public static final DeferredItem<Item> LIGHT_GRAY_CUSHION = ITEMS.registerItem("light_gray_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.LIGHT_GRAY));
    public static final DeferredItem<Item> GRAY_CUSHION = ITEMS.registerItem("gray_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.GRAY));
    public static final DeferredItem<Item> BLACK_CUSHION = ITEMS.registerItem("black_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.BLACK));
    public static final DeferredItem<Item> BROWN_CUSHION = ITEMS.registerItem("brown_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.BROWN));
    public static final DeferredItem<Item> RED_CUSHION = ITEMS.registerItem("red_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.RED));
    public static final DeferredItem<Item> ORANGE_CUSHION = ITEMS.registerItem("orange_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.ORANGE));
    public static final DeferredItem<Item> YELLOW_CUSHION = ITEMS.registerItem("yellow_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.YELLOW));
    public static final DeferredItem<Item> LIME_CUSHION = ITEMS.registerItem("lime_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.LIME));
    public static final DeferredItem<Item> GREEN_CUSHION = ITEMS.registerItem("green_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.GREEN));
    public static final DeferredItem<Item> CYAN_CUSHION = ITEMS.registerItem("cyan_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.CYAN));
    public static final DeferredItem<Item> LIGHT_BLUE_CUSHION = ITEMS.registerItem("light_blue_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.LIGHT_BLUE));
    public static final DeferredItem<Item> BLUE_CUSHION = ITEMS.registerItem("blue_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.BLUE));
    public static final DeferredItem<Item> PURPLE_CUSHION = ITEMS.registerItem("purple_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.PURPLE));
    public static final DeferredItem<Item> MAGENTA_CUSHION = ITEMS.registerItem("magenta_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.MAGENTA));
    public static final DeferredItem<Item> PINK_CUSHION = ITEMS.registerItem("pink_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.PINK));

    public static Item getCushion(DyeColor color) {
        return switch (color) {
            case WHITE -> WHITE_CUSHION.get();
            case LIGHT_GRAY -> LIGHT_GRAY_CUSHION.get();
            case GRAY -> GRAY_CUSHION.get();
            case BLACK -> BLACK_CUSHION.get();
            case BROWN -> BROWN_CUSHION.get();
            case RED -> RED_CUSHION.get();
            case ORANGE -> ORANGE_CUSHION.get();
            case YELLOW -> YELLOW_CUSHION.get();
            case LIME -> LIME_CUSHION.get();
            case GREEN -> GREEN_CUSHION.get();
            case CYAN -> CYAN_CUSHION.get();
            case LIGHT_BLUE -> LIGHT_BLUE_CUSHION.get();
            case BLUE -> BLUE_CUSHION.get();
            case PURPLE -> PURPLE_CUSHION.get();
            case MAGENTA -> MAGENTA_CUSHION.get();
            case PINK -> PINK_CUSHION.get();
        };
    }




    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

}
