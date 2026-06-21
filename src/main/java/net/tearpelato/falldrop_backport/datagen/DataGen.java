package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.tearpelato.falldrop_backport.Constants;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class DataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));
        generator.addProvider(true , new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        generator.addProvider(true, new ModDatapackProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModBlockTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModItemsTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModDataMapProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModBiomeTagsProvider(packOutput, lookupProvider));
    }
}
