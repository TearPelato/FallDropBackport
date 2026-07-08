package net.tearpelato.falldrop_backport.util;

import net.minecraft.core.Vec3i;
import net.minecraft.world.phys.Vec3;

public class Vec3Util extends Vec3 {
    public Vec3Util(double x, double y, double z) {
        super(x, y, z);
    }

    public static Vec3 atCenterOfWithY(final Vec3i pos, final double y) {
        return new Vec3((double)pos.getX() + (double)0.5F, y, (double)pos.getZ() + (double)0.5F);
    }
}