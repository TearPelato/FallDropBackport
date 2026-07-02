package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.Constants;
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
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {

                stairBuilder(ModBlocks.WHITE_WOOL_STAIRS, Ingredient.of(Blocks.WHITE_WOOL))
                        .unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, Ingredient.of(Blocks.LIGHT_GRAY_WOOL))
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_WOOL), has(Blocks.LIGHT_GRAY_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.GRAY_WOOL_STAIRS, Ingredient.of(Blocks.GRAY_WOOL))
                        .unlockedBy(getHasName(Blocks.GRAY_WOOL), has(Blocks.GRAY_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.BLACK_WOOL_STAIRS, Ingredient.of(Blocks.BLACK_WOOL))
                        .unlockedBy(getHasName(Blocks.BLACK_WOOL), has(Blocks.BLACK_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.BROWN_WOOL_STAIRS, Ingredient.of(Blocks.BROWN_WOOL))
                        .unlockedBy(getHasName(Blocks.BROWN_WOOL), has(Blocks.BROWN_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.RED_WOOL_STAIRS, Ingredient.of(Blocks.RED_WOOL))
                        .unlockedBy(getHasName(Blocks.RED_WOOL), has(Blocks.RED_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.ORANGE_WOOL_STAIRS, Ingredient.of(Blocks.ORANGE_WOOL))
                        .unlockedBy(getHasName(Blocks.ORANGE_WOOL), has(Blocks.ORANGE_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.YELLOW_WOOL_STAIRS, Ingredient.of(Blocks.YELLOW_WOOL))
                        .unlockedBy(getHasName(Blocks.YELLOW_WOOL), has(Blocks.YELLOW_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.LIME_WOOL_STAIRS, Ingredient.of(Blocks.LIME_WOOL))
                        .unlockedBy(getHasName(Blocks.LIME_WOOL), has(Blocks.LIME_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.GREEN_WOOL_STAIRS, Ingredient.of(Blocks.GREEN_WOOL))
                        .unlockedBy(getHasName(Blocks.GREEN_WOOL), has(Blocks.GREEN_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.CYAN_WOOL_STAIRS, Ingredient.of(Blocks.CYAN_WOOL))
                        .unlockedBy(getHasName(Blocks.CYAN_WOOL), has(Blocks.CYAN_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, Ingredient.of(Blocks.LIGHT_BLUE_WOOL))
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_WOOL), has(Blocks.LIGHT_BLUE_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.BLUE_WOOL_STAIRS, Ingredient.of(Blocks.BLUE_WOOL))
                        .unlockedBy(getHasName(Blocks.BLUE_WOOL), has(Blocks.BLUE_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.PURPLE_WOOL_STAIRS, Ingredient.of(Blocks.PURPLE_WOOL))
                        .unlockedBy(getHasName(Blocks.PURPLE_WOOL), has(Blocks.PURPLE_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.MAGENTA_WOOL_STAIRS, Ingredient.of(Blocks.MAGENTA_WOOL))
                        .unlockedBy(getHasName(Blocks.MAGENTA_WOOL), has(Blocks.MAGENTA_WOOL))
                        .save(output);

                stairBuilder(ModBlocks.PINK_WOOL_STAIRS, Ingredient.of(Blocks.PINK_WOOL))
                        .unlockedBy(getHasName(Blocks.PINK_WOOL), has(Blocks.PINK_WOOL))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB, Blocks.RED_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB, Blocks.LIME_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_SLAB, Blocks.PINK_WOOL);



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
                hangingSign(ModBlocks.POPLAR_HANGING_SIGN, ModBlocks.STRIPPED_POPLAR_LOG);
                woodenBoat(ModItems.POPLAR_BOAT, ModBlocks.POPLAR_PLANKS);
                chestBoat(ModItems.POPLAR_CHEST_BOAT, ModItems.POPLAR_BOAT);
                shelf(ModBlocks.POPLAR_SHELF, ModBlocks.STRIPPED_POPLAR_LOG);
                woodFromLogs(ModBlocks.STRIPPED_POPLAR_WOOD, ModBlocks.STRIPPED_POPLAR_LOG);


            }
        };
    }


    @Override
    public String getName() {
        return Constants.MOD_ID + "Recipes";
    }
}
