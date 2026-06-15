package net.tearpelato.falldrop_backport;

import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.StandingSignRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.tearpelato.falldrop_backport.init.ModBlockEntities;

@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public class FallDropBackportClient {
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
          event.registerBlockEntityRenderer(ModBlockEntities.SIGN.get(), StandingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
