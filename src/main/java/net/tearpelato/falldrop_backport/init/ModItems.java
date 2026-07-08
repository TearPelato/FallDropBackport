package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.item.CushionItem;

import java.util.function.Function;

public class ModItems {

    public static final Item POPLAR_SIGN = registerItem("poplar_sign",
            properties -> new SignItem( ModBlocks.POPLAR_WALL_SIGN, ModBlocks.POPLAR_SIGN, properties.stacksTo(16)));
    public static final Item POPLAR_HANGING_SIGN = registerItem("poplar_hanging_sign",
            properties -> new SignItem( ModBlocks.POPLAR_WALL_HANGING_SIGN, ModBlocks.POPLAR_HANGING_SIGN, properties.stacksTo(16)));


    public static final Item POPLAR_BOAT = registerItem("poplar_boat",
            properties -> new BoatItem(ModEntities.POPLAR_BOAT, properties.stacksTo(1)));
    public static final Item POPLAR_CHEST_BOAT = registerItem("poplar_chest_boat",
            properties -> new BoatItem(ModEntities.POPLAR_CHEST_BOAT, properties.stacksTo(1)));

    public static final Item WHITE_CUSHION = registerItem("white_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.WHITE));
    public static final Item LIGHT_GRAY_CUSHION = registerItem("light_gray_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.LIGHT_GRAY));
    public static final Item GRAY_CUSHION = registerItem("gray_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.GRAY));
    public static final Item BLACK_CUSHION = registerItem("black_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.BLACK));
    public static final Item BROWN_CUSHION = registerItem("brown_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.BROWN));
    public static final Item RED_CUSHION = registerItem("red_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.RED));
    public static final Item ORANGE_CUSHION = registerItem("orange_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.ORANGE));
    public static final Item YELLOW_CUSHION = registerItem("yellow_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.YELLOW));
    public static final Item LIME_CUSHION = registerItem("lime_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.LIME));
    public static final Item GREEN_CUSHION = registerItem("green_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.GREEN));
    public static final Item CYAN_CUSHION = registerItem("cyan_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.CYAN));
    public static final Item LIGHT_BLUE_CUSHION = registerItem("light_blue_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.LIGHT_BLUE));
    public static final Item BLUE_CUSHION = registerItem("blue_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.BLUE));
    public static final Item PURPLE_CUSHION = registerItem("purple_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.PURPLE));
    public static final Item MAGENTA_CUSHION = registerItem("magenta_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.MAGENTA));
    public static final Item PINK_CUSHION = registerItem("pink_cushion",
            properties -> new CushionItem(properties.stacksTo(16), DyeColor.PINK));

    public static Item getCushion(DyeColor color) {
        return switch (color) {
            case WHITE -> WHITE_CUSHION;
            case LIGHT_GRAY -> LIGHT_GRAY_CUSHION;
            case GRAY -> GRAY_CUSHION;
            case BLACK -> BLACK_CUSHION;
            case BROWN -> BROWN_CUSHION;
            case RED -> RED_CUSHION;
            case ORANGE -> ORANGE_CUSHION;
            case YELLOW -> YELLOW_CUSHION;
            case LIME -> LIME_CUSHION;
            case GREEN -> GREEN_CUSHION;
            case CYAN -> CYAN_CUSHION;
            case LIGHT_BLUE -> LIGHT_BLUE_CUSHION;
            case BLUE -> BLUE_CUSHION;
            case PURPLE -> PURPLE_CUSHION;
            case MAGENTA -> MAGENTA_CUSHION;
            case PINK -> PINK_CUSHION;
        };
    }



    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Constants.vanilla(name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Constants.vanilla(name)))));
    }

    public static void registerModItems() {
        Constants.LOGGER.info("Registering Mod Items for " + Constants.MOD_ID);

    }

}