package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.data.BlockFamily;
import net.tearpelato.falldrop_backport.init.ModBlocks;

public class ModBlockFamilies {
    public static final BlockFamily POPLAR_PLANKS = new BlockFamily.Builder(ModBlocks.POPLAR_PLANKS.get())
            .stairs(ModBlocks.POPLAR_STAIRS.get())
            .slab(ModBlocks.POPLAR_SLAB.get())
            .fence(ModBlocks.POPLAR_FENCE.get())
            .fenceGate(ModBlocks.POPLAR_FENCE_GATE.get())
            .pressurePlate(ModBlocks.POPLAR_PRESSURE_PLATE.get())
            .button(ModBlocks.POPLAR_BUTTON.get())
            .sign(ModBlocks.POPLAR_SIGN.get(), ModBlocks.POPLAR_WALL_SIGN.get())
            .door(ModBlocks.POPLAR_DOOR.get())
            .trapdoor(ModBlocks.POPLAR_TRAPDOOR.get())
            .getFamily();
}