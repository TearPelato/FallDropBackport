package net.tearpelato.falldrop_backport.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ShelfBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.tearpelato.falldrop_backport.init.ModBlockEntities;

public class ModShelfBlockEntity extends ShelfBlockEntity {
    public ModShelfBlockEntity(BlockPos worldPosition, BlockState blockState) {
        super(worldPosition, blockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.SHELF.get();
    }
}
