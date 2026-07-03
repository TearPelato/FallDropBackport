package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries,output) {
            @Override
            public void buildRecipes() {
                stairBuilder(ModBlocks.WHITE_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.white()))
                        .unlockedBy(getHasName(Blocks.WOOL.white()), has(Blocks.WOOL.white()))
                        .save(output);

                stairBuilder(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.lightGray()))
                        .unlockedBy(getHasName(Blocks.WOOL.lightGray()), has(Blocks.WOOL.lightGray()))
                        .save(output);

                stairBuilder(ModBlocks.GRAY_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.gray()))
                        .unlockedBy(getHasName(Blocks.WOOL.gray()), has(Blocks.WOOL.gray()))
                        .save(output);

                stairBuilder(ModBlocks.BLACK_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.black()))
                        .unlockedBy(getHasName(Blocks.WOOL.black()), has(Blocks.WOOL.black()))
                        .save(output);

                stairBuilder(ModBlocks.BROWN_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.brown()))
                        .unlockedBy(getHasName(Blocks.WOOL.brown()), has(Blocks.WOOL.brown()))
                        .save(output);

                stairBuilder(ModBlocks.RED_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.red()))
                        .unlockedBy(getHasName(Blocks.WOOL.red()), has(Blocks.WOOL.red()))
                        .save(output);

                stairBuilder(ModBlocks.ORANGE_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.orange()))
                        .unlockedBy(getHasName(Blocks.WOOL.orange()), has(Blocks.WOOL.orange()))
                        .save(output);

                stairBuilder(ModBlocks.YELLOW_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.yellow()))
                        .unlockedBy(getHasName(Blocks.WOOL.yellow()), has(Blocks.WOOL.yellow()))
                        .save(output);

                stairBuilder(ModBlocks.LIME_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.lime()))
                        .unlockedBy(getHasName(Blocks.WOOL.lime()), has(Blocks.WOOL.lime()))
                        .save(output);

                stairBuilder(ModBlocks.GREEN_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.green()))
                        .unlockedBy(getHasName(Blocks.WOOL.green()), has(Blocks.WOOL.green()))
                        .save(output);

                stairBuilder(ModBlocks.CYAN_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.cyan()))
                        .unlockedBy(getHasName(Blocks.WOOL.cyan()), has(Blocks.WOOL.cyan()))
                        .save(output);

                stairBuilder(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.lightBlue()))
                        .unlockedBy(getHasName(Blocks.WOOL.lightBlue()), has(Blocks.WOOL.lightBlue()))
                        .save(output);

                stairBuilder(ModBlocks.BLUE_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.blue()))
                        .unlockedBy(getHasName(Blocks.WOOL.blue()), has(Blocks.WOOL.blue()))
                        .save(output);

                stairBuilder(ModBlocks.PURPLE_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.purple()))
                        .unlockedBy(getHasName(Blocks.WOOL.purple()), has(Blocks.WOOL.purple()))
                        .save(output);

                stairBuilder(ModBlocks.MAGENTA_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.magenta()))
                        .unlockedBy(getHasName(Blocks.WOOL.magenta()), has(Blocks.WOOL.magenta()))
                        .save(output);

                stairBuilder(ModBlocks.PINK_WOOL_STAIRS, Ingredient.of(Blocks.WOOL.pink()))
                        .unlockedBy(getHasName(Blocks.WOOL.pink()), has(Blocks.WOOL.pink()))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB, Blocks.WOOL.white());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.WOOL.lightGray());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB, Blocks.WOOL.gray());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB, Blocks.WOOL.black());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB, Blocks.WOOL.brown());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB, Blocks.WOOL.red());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB, Blocks.WOOL.orange());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB, Blocks.WOOL.yellow());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB, Blocks.WOOL.lime());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB, Blocks.WOOL.green());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB, Blocks.WOOL.cyan());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.WOOL.lightBlue());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB, Blocks.WOOL.blue());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB, Blocks.WOOL.purple());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB, Blocks.WOOL.magenta());
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_SLAB, Blocks.WOOL.pink());



                woodFromLogs(ModBlocks.POPLAR_WOOD, ModBlocks.POPLAR_LOG);
                planksFromLogs(ModBlocks.POPLAR_PLANKS, ModTags.Items.POPLAR_LOGS, 4);
                doorBuilder(ModBlocks.POPLAR_DOOR, Ingredient.of(ModBlocks.POPLAR_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                        .save(output);
                trapdoorBuilder(ModBlocks.POPLAR_TRAPDOOR, Ingredient.of(ModBlocks.POPLAR_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                        .save(output);
                stairBuilder(ModBlocks.POPLAR_STAIRS, Ingredient.of(ModBlocks.POPLAR_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                        .save(output);
                slab(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POPLAR_SLAB, ModBlocks.POPLAR_PLANKS);
                fenceBuilder(ModBlocks.POPLAR_FENCE, Ingredient.of(ModBlocks.POPLAR_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                        .save(output);
                fenceGateBuilder(ModBlocks.POPLAR_FENCE_GATE, Ingredient.of(ModBlocks.POPLAR_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                        .save(output);
                pressurePlate(ModBlocks.POPLAR_PRESSURE_PLATE, ModBlocks.POPLAR_PLANKS);
                buttonBuilder(ModBlocks.POPLAR_BUTTON, Ingredient.of(ModBlocks.POPLAR_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                        .save(output);
                signBuilder(ModBlocks.POPLAR_SIGN, Ingredient.of(ModBlocks.POPLAR_PLANKS))
                        .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                        .save(output);
                hangingSignBuilder(ModBlocks.POPLAR_HANGING_SIGN, Ingredient.of(ModBlocks.STRIPPED_POPLAR_LOG)).unlockedBy(getHasName(ModBlocks.STRIPPED_POPLAR_LOG), has(ModBlocks.STRIPPED_POPLAR_LOG)).save(output);
                woodenBoat(ModItems.POPLAR_BOAT, ModBlocks.POPLAR_PLANKS);
                chestBoat(ModItems.POPLAR_CHEST_BOAT, ModItems.POPLAR_BOAT);
                shelf(ModBlocks.POPLAR_SHELF, ModBlocks.STRIPPED_POPLAR_LOG);
                woodFromLogs(ModBlocks.STRIPPED_POPLAR_WOOD, ModBlocks.STRIPPED_POPLAR_LOG);


            }
        };
    }


    @Override
    public String getName() {
        return "FallDropBackport Recipes";
    }
}