package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemsTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        valueLookupBuilder(ModTags.Items.POPLAR_LOGS)
                .add(ModBlocks.POPLAR_LOG.asItem())
                .add(ModBlocks.POPLAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.asItem());
        valueLookupBuilder(ItemTags.WOODEN_TOOL_MATERIALS).add(ModBlocks.POPLAR_PLANKS.asItem());
        valueLookupBuilder(ItemTags.PLANKS).add(ModBlocks.POPLAR_PLANKS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS).add(ModBlocks.POPLAR_BUTTON.asItem());
        valueLookupBuilder(ItemTags.WOODEN_DOORS).add(ModBlocks.POPLAR_DOOR.asItem());
        valueLookupBuilder(ItemTags.WOODEN_FENCES).add(ModBlocks.POPLAR_FENCE.asItem());
        valueLookupBuilder(ItemTags.WOODEN_SLABS).add(ModBlocks.POPLAR_SLAB.asItem());
        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.POPLAR_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ItemTags.WOODEN_STAIRS).add(ModBlocks.POPLAR_STAIRS.asItem());
        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.asItem());
    }
}
