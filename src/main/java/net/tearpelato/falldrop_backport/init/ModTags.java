package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.tearpelato.falldrop_backport.Constants;

public class ModTags {

    public static class Blocks{




        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Constants.vanilla(name));
        }
    }


    public static class Items{

        public static final TagKey<Item> POPLAR_LOGS = createTag("poplar_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Constants.vanilla(name));
        }
    }
}
