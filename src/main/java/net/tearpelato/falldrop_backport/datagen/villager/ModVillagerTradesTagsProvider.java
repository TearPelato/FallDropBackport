package net.tearpelato.falldrop_backport.datagen.villager;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VillagerTradesTagsProvider;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.concurrent.CompletableFuture;

public class ModVillagerTradesTagsProvider extends FabricTagsProvider<VillagerTrade> {
    public ModVillagerTradesTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.VILLAGER_TRADE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(VillagerTradeTags.WANDERING_TRADER_UNCOMMON)
                .add(TagEntry.element(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_LOG.identifier()))
                .add(TagEntry.element(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_POPLAR_SAPLING.identifier()))
                .add(TagEntry.element(ModWanderingTraderTrades.WANDERING_TRADER_UNCOMMON_SHELF_MUSHROOM.identifier()));
    }
}