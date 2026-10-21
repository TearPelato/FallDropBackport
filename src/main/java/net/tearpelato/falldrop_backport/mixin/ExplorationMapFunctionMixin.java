package net.tearpelato.falldrop_backport.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ExplorationMapFunction.class)
public abstract class ExplorationMapFunctionMixin {

    @Shadow
    @Final
    private TagKey<Structure> destination;
    @Shadow @Final private Holder<MapDecorationType> mapDecoration;
    @Shadow @Final private byte zoom;
    @Shadow @Final
    private int searchRadius;
    @Shadow @Final private boolean skipKnownStructures;

    @Inject(method = "run", at = @At("HEAD"), cancellable = true)
    private void run(ItemStack itemStack, LootContext context, CallbackInfoReturnable<ItemStack> cir) {
        if (itemStack.isEmpty()) {
            cir.setReturnValue(itemStack);
            return;
        }

        Vec3 origin = context.getOptionalParameter(LootContextParams.ORIGIN);
        if (origin == null) {
            cir.setReturnValue(itemStack);
            return;
        }

        ServerLevel level = context.getLevel();
        BlockPos lootPos = BlockPos.containing(origin);

        if (this.skipKnownStructures) {
            this.wb$claimStructureAt(level, lootPos);
        }

        BlockPos found = level.findNearestMapStructure(this.destination, lootPos, this.searchRadius, this.skipKnownStructures);
        if (found == null) {
            cir.setReturnValue(itemStack);
            return;
        }

        ItemStack created = MapItem.create(level, found.getX(), found.getZ(), this.zoom, true, true);

        ItemStack target = itemStack.is(Items.MAP) ? created : itemStack;
        if (target != created) {
            target.set(DataComponents.MAP_ID, created.get(DataComponents.MAP_ID));
        }

        MapItem.renderBiomePreviewMap(level, target);
        MapItemSavedData.addTargetDecoration(target, found, "+", this.mapDecoration);
        cir.setReturnValue(target);
    }

    @Unique
    private void wb$claimStructureAt(ServerLevel level, BlockPos pos) {
        StructureManager manager = level.structureManager();
        StructureStart start = manager.getStructureWithPieceAt(pos, this.destination);
        if (start != null && start.canBeReferenced()) {
            manager.addReference(start);
        }
    }
}