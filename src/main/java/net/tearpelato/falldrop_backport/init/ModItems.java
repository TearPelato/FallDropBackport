package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.MapDecorations;
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

    public static final DeferredItem<BlockItem> STRAW_BED = ITEMS.registerSimpleBlockItem("straw_bed",
            ModBlocks.STRAW_BED, properties -> properties.stacksTo(16));

    public static final DeferredItem<MapItem> OCEAN_MONUMENT_MAP = ITEMS.registerItem("ocean_monument_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> WOODLAND_MANSION_MAP = ITEMS.registerItem("woodland_mansion_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> BURIED_TRIAL_MAP = ITEMS.registerItem("buried_trial_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> JUNGLE_PYRAMID_MAP = ITEMS.registerItem("jungle_pyramid_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> SWAMP_HUT_MAP = ITEMS.registerItem("swamp_hut_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> DESERT_VILLAGE_MAP = ITEMS.registerItem("desert_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> PLAINS_VILLAGE_MAP = ITEMS.registerItem("plains_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> SAVANNA_VILLAGE_MAP = ITEMS.registerItem("savanna_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> SNOWY_VILLAGE_MAP = ITEMS.registerItem("snowy_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> TAIGA_VILLAGE_MAP = ITEMS.registerItem("taiga_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> BURIED_TREASURE_MAP = ITEMS.registerItem("buried_treasure_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> BURIED_ANCIENT_CITY_MAP = ITEMS.registerItem("buried_ancient_city_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> BURIED_MINESHAFT_MAP = ITEMS.registerItem("buried_mineshaft_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> DESERT_PYRAMID_MAP = ITEMS.registerItem("desert_pyramid_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> ABANDONED_CAMP_MAP = ITEMS.registerItem("abandoned_camp_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final DeferredItem<MapItem> WARM_OCEAN_RUINS_MAP = ITEMS.registerItem("warm_ocena_ruins_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));




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