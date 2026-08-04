package net.tearpelato.falldrop_backport.datagen.villager;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VillagerTradesTagsProvider;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;

import java.util.concurrent.CompletableFuture;

public class ModVillagerTradesTagsProvider extends VillagerTradesTagsProvider {
    public ModVillagerTradesTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
      getOrCreateRawBuilder(VillagerTradeTags.WANDERING_TRADER_UNCOMMON)
              .add(TagEntry.element(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_LOG.identifier()))
              .add(TagEntry.element(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_SAPLING.identifier()))
              .add(TagEntry.element(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_SHELF_MUSHROOM.identifier()));
    }
}
