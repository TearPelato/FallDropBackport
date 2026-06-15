package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.LOGS)
                .add(ModBlocks.POPLAR_LOG.get())
                .add(ModBlocks.POPLAR_WOOD.get());

        tag(BlockTags.LEAVES)
                .add(ModBlocks.RED_POPLAR_LEAVES.get())
                .add(ModBlocks.ORANGE_POPLAR_LEAVES.get())
                .add(ModBlocks.YELLOW_POPLAR_LEAVES.get());
        tag(BlockTags.PLANKS)
                .add(ModBlocks.POPLAR_PLANKS.get());




    }
}
