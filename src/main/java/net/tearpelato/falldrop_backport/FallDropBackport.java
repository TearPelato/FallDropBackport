package net.tearpelato.falldrop_backport;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.Sheets;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.tearpelato.falldrop_backport.init.*;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(FallDropBackport.MOD_ID)
public class FallDropBackport {
    public static final String MOD_ID = "falldrop_backport";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FallDropBackport(IEventBus modEventBus, ModContainer modContainer) {


        ModItems.init(modEventBus);
        ModBlocks.init(modEventBus);
        ModCreativeTabs.init(modEventBus);
        ModBlockEntities.init(modEventBus);
        ModEntities.init(modEventBus);


        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::commonSetup);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            Sheets.addWoodType(ModWoodType.POPLAR);
            ModBiomes.registerBiomes();
        });

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


}
