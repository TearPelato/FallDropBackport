package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.MapDecorations;
import net.minecraft.world.level.block.ColorCollection;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.item.CushionItem;

import java.util.function.BiFunction;

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

    public static final ColorCollection<DeferredItem<Item>> CUSHION = registerColoredItems(ColorCollection.prefixWithColor(ColorCollection.create("cushion")), (id, color) -> ITEMS.registerItem(id, properties -> new CushionItem(properties.stacksTo(16), color)));

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

    public static <Id> ColorCollection<DeferredItem<Item>> registerColoredItems(ColorCollection<Id> ids, BiFunction<Id, DyeColor, DeferredItem<Item>> factory ){
        return ColorCollection.zipMap(ColorCollection.VALUES, ids, (color, id) -> factory.apply(id, color));
    }




    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

}