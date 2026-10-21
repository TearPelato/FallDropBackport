package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.MapDecorations;
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

    public static final Item STRAW_BED = registerItem("straw_bed",
            properties -> new BlockItem(ModBlocks.STRAW_BED, properties.stacksTo(16)));


    public static final MapItem OCEAN_MONUMENT_MAP = (MapItem) registerItem("ocean_monument_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem WOODLAND_MANSION_MAP = (MapItem) registerItem("woodland_mansion_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem BURIED_TRIAL_MAP = (MapItem) registerItem("buried_trial_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem JUNGLE_PYRAMID_MAP = (MapItem) registerItem("jungle_pyramid_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem SWAMP_HUT_MAP = (MapItem) registerItem("swamp_hut_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem DESERT_VILLAGE_MAP = (MapItem) registerItem("desert_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem PLAINS_VILLAGE_MAP = (MapItem) registerItem("plains_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem SAVANNA_VILLAGE_MAP = (MapItem) registerItem("savanna_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem SNOWY_VILLAGE_MAP = (MapItem) registerItem("snowy_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem TAIGA_VILLAGE_MAP = (MapItem) registerItem("taiga_village_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem BURIED_TREASURE_MAP = (MapItem) registerItem("buried_treasure_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem BURIED_ANCIENT_CITY_MAP = (MapItem) registerItem("buried_ancient_city_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem BURIED_MINESHAFT_MAP = (MapItem) registerItem("buried_mineshaft_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem DESERT_PYRAMID_MAP = (MapItem) registerItem("desert_pyramid_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem ABANDONED_CAMP_MAP = (MapItem) registerItem("abandoned_camp_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));
    public static final MapItem WARM_OCEAN_RUINS_MAP = (MapItem) registerItem("warm_ocena_ruins_map",
            properties -> new MapItem(properties.component(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY)));



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