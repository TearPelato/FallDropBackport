package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.data.BlockFamily;
import net.tearpelato.falldrop_backport.init.ModBlocks;

public class ModBlockFamilies {
    public static final BlockFamily POPLAR_PLANKS = new BlockFamily.Builder(ModBlocks.POPLAR_PLANKS)
            .stairs(ModBlocks.POPLAR_STAIRS)
            .slab(ModBlocks.POPLAR_SLAB)
            .fence(ModBlocks.POPLAR_FENCE)
            .fenceGate(ModBlocks.POPLAR_FENCE_GATE)
            .pressurePlate(ModBlocks.POPLAR_PRESSURE_PLATE)
            .button(ModBlocks.POPLAR_BUTTON)
            .sign(ModBlocks.POPLAR_SIGN, ModBlocks.POPLAR_WALL_SIGN)
            .hangingSign(ModBlocks.POPLAR_HANGING_SIGN, ModBlocks.POPLAR_WALL_HANGING_SIGN)
            .door(ModBlocks.POPLAR_DOOR)
            .trapdoor(ModBlocks.POPLAR_TRAPDOOR)
            .getFamily();
}