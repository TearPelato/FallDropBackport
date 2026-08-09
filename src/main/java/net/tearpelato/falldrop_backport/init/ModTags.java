package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.tearpelato.falldrop_backport.Constants;

public class ModTags {

    public static class Blocks{




        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(Constants.NAMESPACE, name));
        }
    }


    public static class Items{

        public static final TagKey<Item> POPLAR_LOGS = createTag("poplar_logs");
        public static final TagKey<Item> WOOL_SET = createTag("wool_set");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(Constants.NAMESPACE, name));
        }
    }

}
