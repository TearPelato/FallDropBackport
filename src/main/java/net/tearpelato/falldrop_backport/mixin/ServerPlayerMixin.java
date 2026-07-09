package net.tearpelato.falldrop_backport.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.tearpelato.falldrop_backport.block.custom.StrawBedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {

    @Inject(method = "setRespawnPosition", at = @At("HEAD"), cancellable = true)
    private void fallDropBackport$preventStrawBedSpawn(ServerPlayer.RespawnConfig respawnConfig, boolean showMessage, CallbackInfo ci) {
        if (respawnConfig == null || respawnConfig.respawnData() == null)
            return;

        BlockPos pos = respawnConfig.respawnData().pos();
        if (pos == null)
            return;


        ServerPlayer player = (ServerPlayer)(Object)this;
        BlockState state = player.level().getBlockState(pos);


        if (state.getBlock() instanceof StrawBedBlock) {
            ci.cancel();
        }
    }

    @Inject(method = "stopSleepInBed", at = @At("TAIL"))
    private void fallDropBackport$onWakeUp(boolean skipSleepTimer, boolean updateSleepingPlayers, CallbackInfo ci) {
        ServerPlayer player = (ServerPlayer)(Object)this;
        BlockPos headPos = StrawBedBlock.SLEEPERS.remove(player.getUUID());

        if (headPos == null)
            return;


        ServerLevel level = player.level();
        BlockState state = level.getBlockState(headPos);

        if (state.getBlock() instanceof StrawBedBlock) {

            BlockPos footPos = headPos.relative(state.getValue(BedBlock.FACING).getOpposite());


            level.destroyBlock(headPos, false);
            level.destroyBlock(footPos, false);
        }
    }




}

