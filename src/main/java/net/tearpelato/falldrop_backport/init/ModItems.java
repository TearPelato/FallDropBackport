package net.tearpelato.falldrop_backport.init;

import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
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




    public static <Id> ColorCollection<DeferredItem<Item>> registerColoredItems(ColorCollection<Id> ids, BiFunction<Id, DyeColor, DeferredItem<Item>> factory ){
        return ColorCollection.zipMap(ColorCollection.VALUES, ids, (color, id) -> factory.apply(id, color));
    }




    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

}
