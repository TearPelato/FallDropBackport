package net.tearpelato.falldrop_backport.util;

import net.minecraft.world.phys.AABB;

public class AABBUtil extends AABB {
    public AABBUtil(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        super(minX, minY, minZ, maxX, maxY, maxZ);
    }

    public AABB nextDeflated() {
        return new AABB(Math.nextUp(this.minX), Math.nextUp(this.minY), Math.nextUp(this.minZ), Math.nextDown(this.maxX), Math.nextDown(this.maxY), Math.nextDown(this.maxZ));
    }
}
