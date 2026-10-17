package net.tearpelato.falldrop_backport.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.tearpelato.falldrop_backport.client.item.ExplorerMapItemModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ItemModelResolver.class)
public class ItemModelResolverMixin {

    @WrapOperation(method = "appendItemLayers", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;"))
    @SuppressWarnings("unchecked")
    private <T> T useExplorerMapModel(ItemStack stack, DataComponentType<? extends T> component, Operation<T> original) {
        if (stack.is(Items.FILLED_MAP) && component == DataComponents.ITEM_MODEL && !stack.has(DataComponents.CUSTOM_MODEL_DATA)) return (T) ExplorerMapItemModel.TYPE;
        else return original.call(stack, component);
    }
}