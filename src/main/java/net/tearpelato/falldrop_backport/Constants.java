package net.tearpelato.falldrop_backport;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;

public class Constants {
    private Constants() {}

    public static final String MOD_ID = "falldrop_backport";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String NAMESPACE ="minecraft";

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID,path);
    }

    public static Identifier vanilla(String path) {
        return Identifier.withDefaultNamespace(path);
    }


    public static ResourceKey<Block> getBlockKey(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
    public static ResourceKey<Item> getItemKey(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

}
