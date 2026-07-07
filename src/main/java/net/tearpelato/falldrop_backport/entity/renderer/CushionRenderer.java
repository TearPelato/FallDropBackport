package net.tearpelato.falldrop_backport.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.item.DyeColor;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.entity.client.CushionModel;
import net.tearpelato.falldrop_backport.entity.client.ModModelLayerLocations;
import net.tearpelato.falldrop_backport.entity.client.custom.Cushion;

import java.util.EnumMap;

public class CushionRenderer extends EntityRenderer<Cushion, CushionRenderState> {
    private static final EnumMap<DyeColor, Identifier> TEXTURES_BY_COLOR = (EnumMap) Util.make(new EnumMap(DyeColor.class), (textures) -> {
        for(DyeColor color : DyeColor.values()) {
            textures.put(color, Constants.vanilla("textures/entity/cushion/" + color.getName() + "_cushion.png"));
        }

    });
    private final CushionModel model;

    public CushionRenderer(final EntityRendererProvider.Context context) {
        super(context);
        this.model = new CushionModel(context.bakeLayer(ModModelLayerLocations.CUSHION));
    }

    public void extractRenderState(final Cushion cushion, final CushionRenderState state, final float partialTicks) {
        super.extractRenderState(cushion, state, partialTicks);
        state.direction = Direction.fromYRot((double)cushion.getYRot());
        state.texture = (Identifier)TEXTURES_BY_COLOR.get(cushion.getColor());
    }

    public void submit(final CushionRenderState state, final PoseStack poseStack, final SubmitNodeCollector submitNodeCollector, final CameraRenderState camera) {
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(state.direction.toYRot()));
        poseStack.mulPose(Axis.XP.rotationDegrees(180.0F));
        poseStack.translate((double)0.0F, (double)-0.25F, (double)0.0F);
        submitNodeCollector.submitModel(this.model, state, poseStack, this.model.renderType(state.texture), state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
        poseStack.popPose();
        super.submit(state, poseStack, submitNodeCollector, camera);
    }

    public CushionRenderState createRenderState() {
        return new CushionRenderState();
    }
}