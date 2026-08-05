package net.tearpelato.falldrop_backport.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.tearpelato.falldrop_backport.init.ModBlockEntities;

public class StrawBedBlockEntity extends BedBlockEntity {
    public StrawBedBlockEntity(BlockPos worldPosition, BlockState blockState) {
        super(worldPosition, blockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.BED_BLOCK_ENTITY;
    }

    @Override
    public boolean isValidBlockState(BlockState blockState) {
        return ModBlockEntities.BED_BLOCK_ENTITY.isValid(blockState);
    }
}