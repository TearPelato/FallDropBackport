package net.tearpelato.falldrop_backport.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.ShelfBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.tearpelato.falldrop_backport.block.entity.ModShelfBlockEntity;
import org.jspecify.annotations.Nullable;

public class ModShelfBlock extends ShelfBlock {
    public ModShelfBlock(Properties properties) {
        super(properties);
    }


    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos worldPosition, BlockState blockState) {
        return new ModShelfBlockEntity(worldPosition, blockState);
    }

    @Override
    public MapCodec<ShelfBlock> codec() {
        return simpleCodec(ModShelfBlock::new);
    }
}
