package net.tearpelato.falldrop_backport.mixin;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.datafixers.util.Either;
import net.minecraft.advancements.triggers.PlayerTrigger;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.player.Player;
import net.tearpelato.falldrop_backport.block.custom.core.AbstractBedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayer.class)
public abstract class ServerPlayerMixin {
    @Shadow
    public abstract ServerLevel level();

    private BlockPos bedPos;

    @Inject(method = "startSleepInBed", at = @At(value = "HEAD"))
    private void getBedPos(BlockPos pos, CallbackInfoReturnable<Either<Player.BedSleepingProblem, Unit>> cir) {
        this.bedPos = pos;
    }

    @WrapOperation(method = "startSleepInBed", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerPlayer;setRespawnPosition(Lnet/minecraft/server/level/ServerPlayer$RespawnConfig;Z)V"))
    private void startSleepInBedStraw(ServerPlayer player, ServerPlayer.RespawnConfig respawnConfig, boolean showMessage, Operation<Void> original, @Local(argsOnly = true) BlockPos pos) {
        if (this.level().getBlockState(pos).getBlock() instanceof AbstractBedBlock bed) {
            if (!bed.canSetSpawn()) return;
        }
        original.call(player, respawnConfig, showMessage);
    }

    @WrapOperation(method = "lambda$startSleepInBed$1", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerPlayer;awardStat(Lnet/minecraft/resources/Identifier;)V"))
    private void checkSleepingStat(ServerPlayer player, Identifier identifier, Operation<Void> original) {
        if (this.level().getBlockState(this.bedPos).getBlock() instanceof AbstractBedBlock bed) player.awardStat(bed.getSleptInBedStatType());
        else original.call(player, identifier);
    }

    @WrapOperation(method = "lambda$startSleepInBed$1", at = @At(value = "INVOKE", target = "Lnet/minecraft/advancements/triggers/PlayerTrigger;trigger(Lnet/minecraft/server/level/ServerPlayer;)V"))
    private void checkSleepingTrigger(PlayerTrigger trigger, ServerPlayer player, Operation<Void> original) {
        if (this.level().getBlockState(this.bedPos).getBlock() instanceof AbstractBedBlock bed && !bed.canSetSpawn()) return;
        original.call(trigger, player);
    }
}

