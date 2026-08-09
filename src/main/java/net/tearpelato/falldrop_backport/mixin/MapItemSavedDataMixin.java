package net.tearpelato.falldrop_backport.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.minecraft.world.level.saveddata.maps.MapDecorationTypes;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(MapItemSavedData.class)
public abstract class MapItemSavedDataMixin {
    @Shadow
    private byte calculateRotation(LevelAccessor level, double yRot) {
        throw new AssertionError();
    }

    @ModifyReturnValue(method = "playerDecorationTypeAndRotation", at = @At("RETURN"))
    private Pair<Holder<MapDecorationType>, Byte> rotateOffMapPlayerDecorations(Pair<Holder<MapDecorationType>, Byte> original, Holder<MapDecorationType> type, LevelAccessor level, double yRot, float xDeltaFromCenter, float yDeltaFromCenter) {
        if (original != null) {
            Holder<MapDecorationType> decorationType = original.getFirst();
            if (decorationType.is(MapDecorationTypes.PLAYER_OFF_MAP) || decorationType.is(MapDecorationTypes.PLAYER_OFF_LIMITS))
                return Pair.of(decorationType, this.calculateRotation(level, yRot));
        }
        return original;
    }
}