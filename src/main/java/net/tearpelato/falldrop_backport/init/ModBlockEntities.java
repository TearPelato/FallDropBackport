package net.tearpelato.falldrop_backport.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.entity.ModHangingSignBlockEntity;
import net.tearpelato.falldrop_backport.block.entity.ModShelfBlockEntity;
import net.tearpelato.falldrop_backport.block.entity.ModSignBlockEntity;
import net.tearpelato.falldrop_backport.block.entity.StrawBedBlockEntity;

public class ModBlockEntities {

    public static final BlockEntityType<ModSignBlockEntity> SIGN =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.id("sign"),
                    FabricBlockEntityTypeBuilder.create(ModSignBlockEntity::new, ModBlocks.POPLAR_SIGN, ModBlocks.POPLAR_WALL_SIGN).build());
    public static final BlockEntityType<ModHangingSignBlockEntity> HANGING_SIGN =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.id("hanging_sign"),
                    FabricBlockEntityTypeBuilder.create(ModHangingSignBlockEntity::new, ModBlocks.POPLAR_HANGING_SIGN, ModBlocks.POPLAR_WALL_HANGING_SIGN).build());
    public static final BlockEntityType<ModShelfBlockEntity> SHELF =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.id("shelf"),
                    FabricBlockEntityTypeBuilder.create(ModShelfBlockEntity::new, ModBlocks.POPLAR_SHELF).build());
    public static final BlockEntityType<StrawBedBlockEntity> BED_BLOCK_ENTITY =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.id("bed"),
                    FabricBlockEntityTypeBuilder.create(StrawBedBlockEntity::new, ModBlocks.STRAW_BED).build());


    public static void registerBlockEntities() {
        Constants.LOGGER.info("Registering Block Entities for " + Constants.MOD_ID);

    }
}