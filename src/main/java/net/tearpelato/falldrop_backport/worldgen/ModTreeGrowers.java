package net.tearpelato.falldrop_backport.worldgen;

import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {

    public static final TreeGrower POPLAR = new TreeGrower("poplar",
            Optional.empty(), Optional.of(ModConfiguredFeatures.POPLAR_TREES), Optional.empty());
}
