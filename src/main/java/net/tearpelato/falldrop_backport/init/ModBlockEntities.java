package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.entity.ModHangingSignBlockEntity;
import net.tearpelato.falldrop_backport.block.entity.ModShelfBlockEntity;
import net.tearpelato.falldrop_backport.block.entity.ModSignBlockEntity;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Constants.MOD_ID);

    public static final Supplier<BlockEntityType<ModHangingSignBlockEntity>> HANGING_SIGN =
            BLOCK_ENTITIES.register("hanging_sign", () -> new BlockEntityType<>(
                    ModHangingSignBlockEntity::new, ModBlocks.POPLAR_HANGING_SIGN.get(), ModBlocks.POPLAR_WALL_HANGING_SIGN.get()));


    public static final Supplier<BlockEntityType<ModSignBlockEntity>> SIGN =
            BLOCK_ENTITIES.register("sign", () -> new BlockEntityType<>(
                    ModSignBlockEntity::new, ModBlocks.POPLAR_SIGN.get(),  ModBlocks.POPLAR_WALL_SIGN.get()));

    public static final Supplier<BlockEntityType<ModShelfBlockEntity>> SHELF =
            BLOCK_ENTITIES.register("shelf", () -> new BlockEntityType<>(
                    ModShelfBlockEntity::new, ModBlocks.POPLAR_SHELF.get()));

    public static void init(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
