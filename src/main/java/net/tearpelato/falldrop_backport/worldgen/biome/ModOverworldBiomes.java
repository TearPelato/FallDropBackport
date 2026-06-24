package net.tearpelato.falldrop_backport.worldgen.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.attribute.BackgroundMusic;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.tearpelato.falldrop_backport.worldgen.ModPlacedFeatures;

public class ModOverworldBiomes {

    public static Biome dappledForest(final HolderGetter<PlacedFeature> placedFeatures, final HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        BiomeGenerationSettings.Builder generation = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generation);
        BiomeDefaultFeatures.addDefaultCrystalFormations(generation);
        BiomeDefaultFeatures.addDefaultMonsterRoom(generation);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generation);
        BiomeDefaultFeatures.addDefaultSprings(generation);
        BiomeDefaultFeatures.addSurfaceFreezing(generation);
        BackgroundMusic music = new BackgroundMusic(SoundEvents.MUSIC_BIOME_FLOWER_FOREST);
        BiomeDefaultFeatures.addDefaultOres(generation);
        BiomeDefaultFeatures.addDefaultSoftDisks(generation);
        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.POPLAR);
        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.BROWN_MUSHROOM_DAPPLED_FOREST);
        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.RED_SHRUB);
        BiomeDefaultFeatures.addForestGrass(generation);
        MobSpawnSettings.Builder mobs = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.farmAnimals(mobs);
        BiomeDefaultFeatures.commonSpawns(mobs);
        mobs.addSpawn(MobCategory.CREATURE, 4, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 2, 4)).addSpawn(MobCategory.CREATURE, 4, new MobSpawnSettings.SpawnerData(EntityType.FOX, 2, 4));
        return new Biome.BiomeBuilder().hasPrecipitation(true)
                .temperature(0.6F).downfall(0.6F)
                .putAttributes(EnvironmentAttributeMap.builder()
                        .set(EnvironmentAttributes.BACKGROUND_MUSIC, music)
                        .set(EnvironmentAttributes.SKY_COLOR, 8168447)
                        .set(EnvironmentAttributes.FOG_COLOR, 13424866)
                        .set(EnvironmentAttributes.WATER_FOG_COLOR, 3625300)
                        .build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(3625300).grassColorOverride(14641191)
                        .foliageColorOverride(15109680)
                        .dryFoliageColorOverride(9189892)
                        .build()).mobSpawnSettings(mobs.build())
                .generationSettings(generation.build()).build();

    }
}
