package net.tearpelato.falldrop_backport.event;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerSetSpawnEvent;
import net.neoforged.neoforge.event.entity.player.PlayerWakeUpEvent;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.block.custom.StrawBedBlock;
import net.tearpelato.falldrop_backport.init.ModSounds;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onWakeUp(PlayerWakeUpEvent event) {
        Player player = event.getEntity();

        if (player.level().isClientSide())
            return;

        BlockPos headPos = StrawBedBlock.SLEEPERS.remove(player.getUUID());
        if (headPos == null)
            return;

        Level level = player.level();
        BlockState state = level.getBlockState(headPos);

        if (state.getBlock() instanceof StrawBedBlock) {
            BlockPos footPos = headPos.relative(state.getValue(BedBlock.FACING).getOpposite());
            level.playSound((Entity)null, headPos, ModSounds.STRAW_BED_BREAK_LEAVE.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
            level.destroyBlock(headPos, false);
            level.destroyBlock(footPos, false);
        }
    }

    @SubscribeEvent
    public static void onSetSpawn(PlayerSetSpawnEvent event) {
        BlockPos pos = event.getNewSpawn();
        if (pos == null) return;

        if (event.getEntity().level().getBlockState(pos).getBlock() instanceof StrawBedBlock) {
            event.setCanceled(true);
        }
    }
}