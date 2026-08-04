package net.tearpelato.falldrop_backport.datagen.villager;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModBlocks;

import java.util.List;
import java.util.Optional;

public class ModWanderingTraderTrades {

    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_UNCOMMON_POPLAR_SAPLING = createKey("wandering_trader/emerald_poplar_sapling");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_UNCOMMON_POPLAR_LOG = createKey("wandering_trader/emerald_poplar_log");
    public static final ResourceKey<VillagerTrade> WANDERING_TRADER_UNCOMMON_SHELF_MUSHROOM = createKey("wandering_trader/emerald_shelf_mushroom");

    public static void bootstrap(BootstrapContext<VillagerTrade> context) {
        var items = context.lookup(Registries.ITEM);

        context.register(WANDERING_TRADER_UNCOMMON_POPLAR_SAPLING, new VillagerTrade(
                new TradeCost(Items.EMERALD, 5),
                new ItemStackTemplate(ModBlocks.POPLAR_SAPLING.asItem(), 1),
                8, 0, 0.05f, Optional.empty(), List.of()));

        context.register(WANDERING_TRADER_UNCOMMON_SHELF_MUSHROOM, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(ModBlocks.POPLAR_LOG.asItem(), 8),
                16, 0, 0.05f, Optional.empty(), List.of()));

        context.register(WANDERING_TRADER_UNCOMMON_POPLAR_LOG, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(ModBlocks.POPLAR_LOG.asItem(), 3),
                12, 0, 0.05f, Optional.empty(), List.of()));

    }




    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Constants.vanilla(name));
    }

}
