package net.tearpelato.falldrop_backport;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.tearpelato.falldrop_backport.init.*;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Constants.MOD_ID)
public class FallDropBackport {

    public FallDropBackport(IEventBus modEventBus, ModContainer modContainer) {


        ModItems.init(modEventBus);
        ModBlocks.init(modEventBus);
        ModCreativeTabs.init(modEventBus);
        ModBlockEntities.init(modEventBus);
        ModEntities.init(modEventBus);
        ModParticleTypes.init(modEventBus);
        ModTrunkPlacerTypes.init(modEventBus);
        ModFoliagePlacerTypes.init(modEventBus);
        ModTreeDecoratorType.init(modEventBus);
        ModStats.init(modEventBus);
        ModEnvironmentAttributes.init(modEventBus);


        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::commonSetup);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            ModBiomes.registerBiomes();
        });

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_SHRUB.getId(), ModBlocks.RED_SHRUB_POTTED);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.POPLAR_SAPLING.getId(), ModBlocks.POPLAR_SAPLING_POTTED);
    }


}
