package net.tearpelato.falldrop_backport.init;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.tearpelato.falldrop_backport.Constants;
import net.tearpelato.falldrop_backport.worldgen.placer.decorator.ShelfMushroomDecorator;

public class ModTreeDecoratorType {

    public static final TreeDecoratorType<ShelfMushroomDecorator> SHELF_MUSHROOM =
            register("shelf_mushroom_decorator", ShelfMushroomDecorator.CODEC);


    private static <P extends TreeDecorator> TreeDecoratorType<P> register(String name, MapCodec<P> codec) {
        return Registry.register(
                BuiltInRegistries.TREE_DECORATOR_TYPE,
                Constants.vanilla(name),
                new TreeDecoratorType<>(codec)
        );
    }


    public static void registerCreativeModeTabs() {
        Constants.LOGGER.info("Registering Tree Decorators for " + Constants.MOD_ID);
    }
}
