package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.ColorCollection;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.item.CushionItem;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    public static final Item POPLAR_SIGN = registerItem("poplar_sign",
            properties -> new SignItem( ModBlocks.POPLAR_WALL_SIGN, ModBlocks.POPLAR_SIGN, properties.stacksTo(16)));
    public static final Item POPLAR_HANGING_SIGN = registerItem("poplar_hanging_sign",
            properties -> new SignItem( ModBlocks.POPLAR_WALL_HANGING_SIGN, ModBlocks.POPLAR_HANGING_SIGN, properties.stacksTo(16)));


    public static final Item POPLAR_BOAT = registerItem("poplar_boat",
            properties -> new BoatItem(ModEntities.POPLAR_BOAT, properties.stacksTo(1)));
    public static final Item POPLAR_CHEST_BOAT = registerItem("poplar_chest_boat",
            properties -> new BoatItem(ModEntities.POPLAR_CHEST_BOAT, properties.stacksTo(1)));

    public static final ColorCollection<Item> CUSHION = registerColoredItems(ColorCollection.prefixWithColor(ColorCollection.create("cushion")), (id, color) -> registerItem(id, properties -> new CushionItem(properties.stacksTo(16), color)));


    public static <Id> ColorCollection<Item> registerColoredItems(ColorCollection<Id> ids, BiFunction<Id, DyeColor, Item> factory) {
        return ColorCollection.zipMap(ColorCollection.VALUES, ids, (color, id) -> factory.apply(id, color));
    }




    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Constants.vanilla(name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Constants.vanilla(name)))));
    }

    public static void registerModItems() {
        Constants.LOGGER.info("Registering Mod Items for " + Constants.MOD_ID);

    }

}