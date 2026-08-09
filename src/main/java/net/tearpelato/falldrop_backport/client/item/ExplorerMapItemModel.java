package net.tearpelato.falldrop_backport.client.item;

import com.mojang.blaze3d.platform.Transparency;
import com.mojang.math.Quadrant;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.color.item.Constant;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.color.item.MapColor;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.block.dispatch.BlockModelRotation;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.item.*;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.ModelBaker;
import net.minecraft.client.resources.model.ResolvableModel;
import net.minecraft.client.resources.model.ResolvedModel;
import net.minecraft.client.resources.model.cuboid.CuboidFace;
import net.minecraft.client.resources.model.cuboid.FaceBakery;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.geometry.BakedQuad.MaterialInfo;
import net.minecraft.client.resources.model.sprite.SpriteGetter;
import net.minecraft.client.resources.model.sprite.SpriteId;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.ItemOwner;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.item.component.MapDecorations;
import net.minecraft.world.level.saveddata.maps.MapDecoration;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.minecraft.world.level.saveddata.maps.MapDecorationTypes;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.init.ModMapDecorationTypes;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ExplorerMapItemModel implements ItemModel {
    private static final Identifier FILLED_MAP_MODEL = Constants.vanilla("item/filled_map");
    private static final Identifier EXPLORER_MAP_MODEL = Constants.vanilla("item/explorer_map");
    private static final List<ItemTintSource> DEFAULT_TINTS = List.of(new Constant(-1), new MapColor(4603950));
    private static final Map<Holder<MapDecorationType>, Identifier> DECORATION_MODELS = new HashMap<>();
    public static final Identifier TYPE = Constants.id("explorer_map");

    private final ItemModel defaultBaseModel;
    private final ItemModel explorerBaseModel;
    private final Map<Holder<MapDecorationType>, ItemModel> decorationModels;
    private final ModelBaker modelBaker;
    private final SpriteGetter sprites;
    private final ModelRenderProperties properties;
    private final Matrix4fc transformation;
    private final Map<Identifier, List<BakedQuad>> overlayQuads = new ConcurrentHashMap<>();

    private ExplorerMapItemModel(
            ItemModel defaultBaseModel,
            ItemModel explorerBaseModel,
            Map<Holder<MapDecorationType>, ItemModel> decorationModels,
            ModelBaker modelBaker,
            SpriteGetter sprites,
            ModelRenderProperties properties,
            Matrix4fc transformation
    ) {
        this.defaultBaseModel = defaultBaseModel;
        this.explorerBaseModel = explorerBaseModel;
        this.decorationModels = decorationModels;
        this.modelBaker = modelBaker;
        this.sprites = sprites;
        this.properties = properties;
        this.transformation = transformation;
    }

    @Override
    public void update(
            ItemStackRenderState renderState,
            ItemStack stack,
            ItemModelResolver resolver,
            ItemDisplayContext displayContext,
            ClientLevel level,
            ItemOwner owner,
            int seed
    ) {
        DecorationRenderData decoration = this.findExplorationMapDecoration(stack, level);
        if (decoration == null) {
            this.defaultBaseModel.update(renderState, stack, resolver, displayContext, level, owner, seed);
            return;
        }

        ItemModel decorationModel = this.decorationModels.get(decoration.type());
        if (decorationModel != null) {
            renderState.appendModelIdentityElement(decoration.assetId());
            decorationModel.update(renderState, stack, resolver, displayContext, level, owner, seed);
            return;
        }

        this.explorerBaseModel.update(renderState, stack, resolver, displayContext, level, owner, seed);
        renderState.appendModelIdentityElement(decoration.assetId());
        ItemStackRenderState.LayerRenderState layer = renderState.newLayer();
        this.properties.applyToLayer(layer, displayContext);
        layer.setLocalTransform(this.transformation);
        layer.prepareQuadList().addAll(this.overlayQuads.computeIfAbsent(decoration.assetId(), this::createOverlayQuads));
    }

    private DecorationRenderData findExplorationMapDecoration(ItemStack stack, ClientLevel level) {
        DecorationRenderData componentDecoration = this.findComponentDecoration(stack);
        if (componentDecoration != null) {
            return componentDecoration;
        }

        if (level == null) {
            return null;
        }

        MapItemSavedData mapData = MapItem.getSavedData(stack, level);
        if (mapData == null || !mapData.isExplorationMap()) {
            return null;
        }

        for (MapDecoration decoration : mapData.getDecorations()) {
            if (decoration.type().value().explorationMapElement()) {
                return new DecorationRenderData(decoration.type(), decoration.getSpriteLocation());
            }
        }

        return null;
    }

    private DecorationRenderData findComponentDecoration(ItemStack stack) {
        MapDecorations decorations = stack.getOrDefault(DataComponents.MAP_DECORATIONS, MapDecorations.EMPTY);
        for (MapDecorations.Entry entry : decorations.decorations().values()) {
            return new DecorationRenderData(entry.type(), entry.type().value().assetId());
        }

        return null;
    }

    private List<BakedQuad> createOverlayQuads(Identifier decoration) {
        SpriteId spriteId = new SpriteId(Sheets.MAP_DECORATIONS_SHEET, decoration);
        TextureAtlasSprite sprite = this.sprites.get(spriteId);
        MaterialInfo materialInfo = new MaterialInfo(
                sprite,
                ChunkSectionLayer.byTransparency(Transparency.TRANSLUCENT),
                RenderTypes.text(sprite.atlasLocation()),
                CuboidFace.NO_TINT,
                false,
                0
        );

        BakedQuad quad = FaceBakery.bakeQuad(
                this.modelBaker.interner(),
                // do not touch z, and mirror any additions / subtractions on x + y across both vectors
                new Vector3f(5.0F, 3.0F, 8.6F),
                new Vector3f(13.0F, 11.0F, 8.6F),
                new CuboidFace.UVs(0.0F, 0.0F, 16.0F, 16.0F),
                Quadrant.R0,
                materialInfo,
                Direction.SOUTH,
                BlockModelRotation.IDENTITY,
                null
        );
        return List.of(quad);
    }

    public record Unbaked() implements ItemModel.Unbaked {
        public static final Unbaked INSTANCE = new Unbaked();
        public static final MapCodec<Unbaked> MAP_CODEC = MapCodec.unit(INSTANCE);

        @Override
        public MapCodec<Unbaked> type() {
            return MAP_CODEC;
        }

        @Override
        public void resolveDependencies(ResolvableModel.Resolver resolver) {
            resolver.markDependency(FILLED_MAP_MODEL);
            resolver.markDependency(EXPLORER_MAP_MODEL);
            DECORATION_MODELS.values().forEach(resolver::markDependency);
        }

        @Override
        public ItemModel bake(ItemModel.BakingContext context, Matrix4fc transformation) {
            ItemModel defaultBaseModel = new CuboidItemModelWrapper.Unbaked(FILLED_MAP_MODEL, Optional.empty(), DEFAULT_TINTS).bake(context, transformation);
            ItemModel explorerBaseModel = new CuboidItemModelWrapper.Unbaked(EXPLORER_MAP_MODEL, Optional.empty(), List.of()).bake(context, transformation);
            Map<Holder<MapDecorationType>, ItemModel> decorationModels = new HashMap<>();
            DECORATION_MODELS.forEach((type, model) -> decorationModels.put(
                    type,
                    new CuboidItemModelWrapper.Unbaked(model, Optional.empty(), List.of()).bake(context, transformation)
            ));
            ResolvedModel resolvedModel = context.blockModelBaker().getModel(EXPLORER_MAP_MODEL);
            ModelRenderProperties properties = ModelRenderProperties.fromResolvedModel(
                    context.blockModelBaker(),
                    resolvedModel,
                    resolvedModel.getTopTextureSlots()
            );
            return new ExplorerMapItemModel(defaultBaseModel, explorerBaseModel, Map.copyOf(decorationModels), context.blockModelBaker(), context.sprites(), properties, transformation);
        }
    }

    private record DecorationRenderData(Holder<MapDecorationType> type, Identifier assetId) {
    }

    public static void init() {
        registerDecorationModel(ModMapDecorationTypes.ANCIENT_CITY, Constants.vanilla("ancient_city_map"));
        registerDecorationModel(ModMapDecorationTypes.ABANDONED_CAMP, Constants.vanilla("abandoned_campsite_map"));
        registerDecorationModel(ModMapDecorationTypes.DESERT_PYRAMID, Constants.vanilla("desert_pyramid_map"));
        registerDecorationModel(ModMapDecorationTypes.MINESHAFT, Constants.vanilla("mineshaft_map"));
        registerDecorationModel(ModMapDecorationTypes.WARM_OCEAN_RUINS, Constants.vanilla("warm_ocean_ruins_map"));
        registerDecorationModel(MapDecorationTypes.RED_X, Constants.vanilla("buried_treasure_map"));
        registerDecorationModel(MapDecorationTypes.DESERT_VILLAGE, Constants.vanilla("desert_village_map"));
        registerDecorationModel(MapDecorationTypes.JUNGLE_TEMPLE, Constants.vanilla("jungle_temple_map"));
        registerDecorationModel(MapDecorationTypes.OCEAN_MONUMENT, Constants.vanilla("ocean_monument_map"));
        registerDecorationModel(MapDecorationTypes.PLAINS_VILLAGE, Constants.vanilla("plains_village_map"));
        registerDecorationModel(MapDecorationTypes.SAVANNA_VILLAGE, Constants.vanilla("savanna_village_map"));
        registerDecorationModel(MapDecorationTypes.SNOWY_VILLAGE, Constants.vanilla("snowy_village_map"));
        registerDecorationModel(MapDecorationTypes.SWAMP_HUT, Constants.vanilla("swamp_hut_map"));
        registerDecorationModel(MapDecorationTypes.TAIGA_VILLAGE, Constants.vanilla("taiga_village_map"));
        registerDecorationModel(MapDecorationTypes.TRIAL_CHAMBERS, Constants.vanilla("trial_chamber_map"));
        registerDecorationModel(MapDecorationTypes.WOODLAND_MANSION, Constants.vanilla("woodland_mansion_map"));
    }

    public static void registerDecorationModel(Holder<MapDecorationType> decorationType, Identifier model) {
        DECORATION_MODELS.put(decorationType, model.withPrefix("item/"));
    }
}