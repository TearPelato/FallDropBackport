package net.tearpelato.falldrop_backport.init;

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
            return BlockTags.create(Identifier.fromNamespaceAndPath(Constants.NAMESPACE, name));
        }
    }


    public static class Items{

        public static final TagKey<Item> POPLAR_LOGS = createTag("poplar_logs");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(Constants.NAMESPACE, name));
        }
    }
}
