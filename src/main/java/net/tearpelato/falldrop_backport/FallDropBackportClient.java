package net.tearpelato.falldrop_backport;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.ShelfRenderer;
import net.minecraft.client.renderer.blockentity.StandingSignRenderer;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.state.MapRenderState;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.client.gui.map.IMapDecorationRenderer;
import net.neoforged.neoforge.client.gui.map.RegisterMapDecorationRenderersEvent;
import net.tearpelato.falldrop_backport.entity.client.CushionModel;
import net.tearpelato.falldrop_backport.entity.client.ModModelLayerLocations;
import net.tearpelato.falldrop_backport.entity.renderer.CushionRenderer;
import net.tearpelato.falldrop_backport.init.ModBlockEntities;
import net.tearpelato.falldrop_backport.init.ModEntities;
import net.tearpelato.falldrop_backport.init.ModMapDecorationTypes;
import net.tearpelato.falldrop_backport.init.ModParticleTypes;
import net.tearpelato.falldrop_backport.particle.PoplarProvider;

@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public class FallDropBackportClient {

    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntities.POPLAR_BOAT.get(), context -> new BoatRenderer(context, ModModelLayerLocations.POPLAR_BOAT));
        EntityRenderers.register(ModEntities.POPLAR_CHEST_BOAT.get(), context -> new BoatRenderer(context, ModModelLayerLocations.POPLAR_CHEST_BOAT));
        EntityRenderers.register(ModEntities.CUSHION.get(), context -> new CushionRenderer(context));

    }


    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
          event.registerBlockEntityRenderer(ModBlockEntities.SIGN.get(), StandingSignRenderer::new);
          event.registerBlockEntityRenderer(ModBlockEntities.HANGING_SIGN.get(), HangingSignRenderer::new);
          event.registerBlockEntityRenderer(ModBlockEntities.SHELF.get(), ShelfRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayerLocations.POPLAR_BOAT, BoatModel::createBoatModel);
        event.registerLayerDefinition(ModModelLayerLocations.POPLAR_CHEST_BOAT, BoatModel::createChestBoatModel);
        event.registerLayerDefinition(ModModelLayerLocations.CUSHION, CushionModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticleTypes.RED_POPLAR_LEAVES.get(), PoplarProvider::new);
        event.registerSpriteSet(ModParticleTypes.ORANGE_POPLAR_LEAVES.get(), PoplarProvider::new);
        event.registerSpriteSet(ModParticleTypes.YELLOW_POPLAR_LEAVES.get(), PoplarProvider::new);
    }

    @SubscribeEvent
    public static void registerMapDecorationRenderers(RegisterMapDecorationRenderersEvent event) {
        event.register(ModMapDecorationTypes.ABANDONED_CAMP.value(), new IMapDecorationRenderer() {
            @Override
            public boolean render(MapRenderState.MapDecorationRenderState decorationRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, MapRenderState mapRenderState, TextureAtlas decorationSprites, boolean inItemFrame, int packedLight, int index) {

                return false;
            }
        });
    }

}
