package net.tearpelato.falldrop_backport.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tearpelato.falldrop_backport.block.custom.core.AbstractBedBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    public abstract Optional<BlockPos> getSleepingPos();

    @Inject(method = "checkBedExists", at = @At(value = "RETURN"), cancellable = true)
    private void checkBedExistsStraw(CallbackInfoReturnable<Boolean> cir) {
        if (!cir.getReturnValue()) {
            boolean hasStrawBed = this.getSleepingPos()
                    .map(bedPosition -> LivingEntity.class.cast(this).level().getBlockState(bedPosition).getBlock() instanceof AbstractBedBlock)
                    .orElse(false);
            if (hasStrawBed) cir.setReturnValue(true);
        }
    }

    @Inject(method = "getBedOrientation", at = @At(value = "TAIL"), cancellable = true)
    private void getBedOrientationStraw(CallbackInfoReturnable<Direction> cir, @Local(name = "bedPos") BlockPos bedPos) {
        if (cir.getReturnValue() == null) {
            Direction facing = bedPos != null ? AbstractBedBlock.getBedOrientation(LivingEntity.class.cast(this).level(), bedPos) : null;
            if (facing != null) cir.setReturnValue(facing);
        }
    }

    @Inject(method = "startSleeping", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;isBed(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z"))
    private void startSleepingStraw(BlockPos bedPosition, CallbackInfo ci, @Local(name = "blockState") BlockState blockState) {
        if (blockState.getBlock() instanceof AbstractBedBlock) {
            LivingEntity.class.cast(this).level().setBlock(bedPosition, blockState.setValue(AbstractBedBlock.OCCUPIED, true), 3);
        }
    }

    @Inject(method = "lambda$stopSleeping$0", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;isBed(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z"), cancellable = true)
    private void stopSleepingStraw(CallbackInfo ci, @Local(name = "state") BlockState state, @Local(argsOnly = true, name = "bedPosition") BlockPos bedPosition) {
        if (state.getBlock() instanceof AbstractBedBlock bed) {
            LivingEntity entity = LivingEntity.class.cast(this);
            Direction facing = state.getValue(AbstractBedBlock.FACING);
            entity.level().setBlock(bedPosition, state.setValue(AbstractBedBlock.OCCUPIED, false), 3);
            Vec3 standUp = AbstractBedBlock.findStandUpPosition(entity.getType(), entity.level(), bedPosition, facing, entity.getYRot()).orElseGet(() -> {
                BlockPos above = bedPosition.above();
                return new Vec3(above.getX() + 0.5, above.getY() + 0.1, above.getZ() + 0.5);
            });
            Vec3 lookDirection = Vec3.atBottomCenterOf(bedPosition).subtract(standUp).normalize();
            float yaw = (float) Mth.wrapDegrees(Mth.atan2(lookDirection.z, lookDirection.x) * 180.0F / (float) Math.PI - 90.0);
            entity.setPos(standUp.x, standUp.y, standUp.z);
            entity.setYRot(yaw);
            entity.setXRot(0.0F);
            bed.onStopSleeping(entity.level(), bedPosition);
        }
    }
}