package net.tearpelato.falldrop_backport;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.ShelfRenderer;
import net.minecraft.client.renderer.blockentity.StandingSignRenderer;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.tearpelato.falldrop_backport.entity.client.CushionModel;
import net.tearpelato.falldrop_backport.entity.client.ModModelLayerLocations;
import net.tearpelato.falldrop_backport.entity.renderer.CushionRenderer;
import net.tearpelato.falldrop_backport.init.ModWoodType;
import net.tearpelato.falldrop_backport.particle.PoplarParticles;
import net.tearpelato.falldrop_backport.init.ModBlockEntities;
import net.tearpelato.falldrop_backport.init.ModEntities;
import net.tearpelato.falldrop_backport.init.ModParticleTypes;

public class FallDropBackportClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.POPLAR_BOAT, BoatModel::createBoatModel);
        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.POPLAR_CHEST_BOAT, BoatModel::createChestBoatModel);
        ModelLayerRegistry.registerModelLayer(ModModelLayerLocations.CUSHION, CushionModel::createBodyLayer);
        EntityRenderers.register(ModEntities.POPLAR_BOAT, context -> new BoatRenderer(context, ModModelLayerLocations.POPLAR_BOAT));
        EntityRenderers.register(ModEntities.POPLAR_CHEST_BOAT, context -> new BoatRenderer(context, ModModelLayerLocations.POPLAR_CHEST_BOAT));
        EntityRenderers.register(ModEntities.CUSHION, context -> new CushionRenderer(context));


        ParticleProviderRegistry.getInstance().register(ModParticleTypes.RED_POPLAR_LEAVES, PoplarParticles.PoplarProvider::new);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.ORANGE_POPLAR_LEAVES, PoplarParticles.PoplarProvider::new);
        ParticleProviderRegistry.getInstance().register(ModParticleTypes.YELLOW_POPLAR_LEAVES, PoplarParticles.PoplarProvider::new);

        BlockEntityRenderers.register(ModBlockEntities.SHELF, ShelfRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.SIGN, StandingSignRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.HANGING_SIGN, HangingSignRenderer::new);


        Sheets.createSignSprite(ModWoodType.POPLAR);
        Sheets.createHangingSignSprite(ModWoodType.POPLAR);
    }
}
