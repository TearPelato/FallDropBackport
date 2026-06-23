package net.tearpelato.falldrop_backport.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.worldgen.placer.decorator.ShelfMushroomDecorator;

public class ModTreeDecoratorType {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR_TYPE =
            DeferredRegister.create(BuiltInRegistries.TREE_DECORATOR_TYPE, Constants.NAMESPACE);

    public static final DeferredHolder<TreeDecoratorType<?>, TreeDecoratorType<ShelfMushroomDecorator>> SHELF_MUSHROOM =
            TREE_DECORATOR_TYPE.register("shelf_mushroom_decorator", () -> new TreeDecoratorType<>(ShelfMushroomDecorator.CODEC));


    public static void init(IEventBus bus) {
        TREE_DECORATOR_TYPE.register(bus);
    }
}
