package net.tearpelato.falldrop_backport;

import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.ShelfRenderer;
import net.minecraft.client.renderer.blockentity.StandingSignRenderer;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.tearpelato.falldrop_backport.entity.client.CushionModel;
import net.tearpelato.falldrop_backport.entity.client.ModModelLayerLocations;
import net.tearpelato.falldrop_backport.entity.renderer.CushionRenderer;
import net.tearpelato.falldrop_backport.init.ModBlockEntities;
import net.tearpelato.falldrop_backport.init.ModEntities;
import net.tearpelato.falldrop_backport.init.ModParticleTypes;
import net.tearpelato.falldrop_backport.particle.PoplarParticles;

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
        event.registerSpriteSet(ModParticleTypes.RED_POPLAR_LEAVES.get(), PoplarParticles.PoplarProvider::new);
        event.registerSpriteSet(ModParticleTypes.ORANGE_POPLAR_LEAVES.get(), PoplarParticles.PoplarProvider::new);
        event.registerSpriteSet(ModParticleTypes.YELLOW_POPLAR_LEAVES.get(), PoplarParticles.PoplarProvider::new);
    }

   /* @SubscribeEvent
    public static void onSetSpawn(PlayerSetSpawnEvent event) {
        BlockPos pos = event.getNewSpawn();
        if (pos == null) return;

        Player player = event.getEntity();
        if (player.level().getBlockState(pos).getBlock() instanceof TestBedBlock) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void onWakeUp(PlayerWakeUpEvent event) {
        Player player = event.getEntity();
        if (player.level().isClientSide()) return;

        BlockPos headPos = TestBedBlock.SLEEPERS.remove(player.getUUID());
        if (headPos == null) return;

        Level level = player.level();
        BlockState state = level.getBlockState(headPos);
        if (state.getBlock() instanceof TestBedBlock) {
            BlockPos footPos = headPos.relative(state.getValue(BedBlock.FACING).getOpposite());
            level.destroyBlock(headPos, false);
            level.destroyBlock(footPos, false);
        }
    }*/

}
