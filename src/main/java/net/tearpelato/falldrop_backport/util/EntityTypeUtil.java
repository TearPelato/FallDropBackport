package net.tearpelato.falldrop_backport.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Optional;

public class EntityTypeUtil extends EntityType {
    public EntityTypeUtil(EntityFactory factory, MobCategory category, boolean serialize, boolean summon, boolean fireImmune, boolean canSpawnFarFromPlayer, TagKey immuneTo, EntityDimensions dimensions, float spawnDimensionsScale, int clientTrackingRange, int updateInterval, String descriptionId, Optional lootTable, FeatureFlagSet requiredFeatures, boolean allowedInPeaceful) {
        super(factory, category, serialize, summon, fireImmune, canSpawnFarFromPlayer, immuneTo, dimensions, spawnDimensionsScale, clientTrackingRange, updateInterval, descriptionId, lootTable, requiredFeatures, allowedInPeaceful);
    }

    public AABB getSpawnAABB(final Vec3 at) {
        return this.getSpawnAABB(at.x, at.y, at.z);
    }
}
