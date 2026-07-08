package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {

        stairBuilder(ModBlocks.WHITE_WOOL_STAIRS.get(), Ingredient.of(Blocks.WHITE_WOOL))
                .unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                .save(output);

        stairBuilder(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), Ingredient.of(Blocks.LIGHT_GRAY_WOOL))
                .unlockedBy(getHasName(Blocks.LIGHT_GRAY_WOOL), has(Blocks.LIGHT_GRAY_WOOL))
                .save(output);

        stairBuilder(ModBlocks.GRAY_WOOL_STAIRS.get(), Ingredient.of(Blocks.GRAY_WOOL))
                .unlockedBy(getHasName(Blocks.GRAY_WOOL), has(Blocks.GRAY_WOOL))
                .save(output);

        stairBuilder(ModBlocks.BLACK_WOOL_STAIRS.get(), Ingredient.of(Blocks.BLACK_WOOL))
                .unlockedBy(getHasName(Blocks.BLACK_WOOL), has(Blocks.BLACK_WOOL))
                .save(output);

        stairBuilder(ModBlocks.BROWN_WOOL_STAIRS.get(), Ingredient.of(Blocks.BROWN_WOOL))
                .unlockedBy(getHasName(Blocks.BROWN_WOOL), has(Blocks.BROWN_WOOL))
                .save(output);

        stairBuilder(ModBlocks.RED_WOOL_STAIRS.get(), Ingredient.of(Blocks.RED_WOOL))
                .unlockedBy(getHasName(Blocks.RED_WOOL), has(Blocks.RED_WOOL))
                .save(output);

        stairBuilder(ModBlocks.ORANGE_WOOL_STAIRS.get(), Ingredient.of(Blocks.ORANGE_WOOL))
                .unlockedBy(getHasName(Blocks.ORANGE_WOOL), has(Blocks.ORANGE_WOOL))
                .save(output);

        stairBuilder(ModBlocks.YELLOW_WOOL_STAIRS.get(), Ingredient.of(Blocks.YELLOW_WOOL))
                .unlockedBy(getHasName(Blocks.YELLOW_WOOL), has(Blocks.YELLOW_WOOL))
                .save(output);

        stairBuilder(ModBlocks.LIME_WOOL_STAIRS.get(), Ingredient.of(Blocks.LIME_WOOL))
                .unlockedBy(getHasName(Blocks.LIME_WOOL), has(Blocks.LIME_WOOL))
                .save(output);

        stairBuilder(ModBlocks.GREEN_WOOL_STAIRS.get(), Ingredient.of(Blocks.GREEN_WOOL))
                .unlockedBy(getHasName(Blocks.GREEN_WOOL), has(Blocks.GREEN_WOOL))
                .save(output);

        stairBuilder(ModBlocks.CYAN_WOOL_STAIRS.get(), Ingredient.of(Blocks.CYAN_WOOL))
                .unlockedBy(getHasName(Blocks.CYAN_WOOL), has(Blocks.CYAN_WOOL))
                .save(output);

        stairBuilder(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), Ingredient.of(Blocks.LIGHT_BLUE_WOOL))
                .unlockedBy(getHasName(Blocks.LIGHT_BLUE_WOOL), has(Blocks.LIGHT_BLUE_WOOL))
                .save(output);

        stairBuilder(ModBlocks.BLUE_WOOL_STAIRS.get(), Ingredient.of(Blocks.BLUE_WOOL))
                .unlockedBy(getHasName(Blocks.BLUE_WOOL), has(Blocks.BLUE_WOOL))
                .save(output);

        stairBuilder(ModBlocks.PURPLE_WOOL_STAIRS.get(), Ingredient.of(Blocks.PURPLE_WOOL))
                .unlockedBy(getHasName(Blocks.PURPLE_WOOL), has(Blocks.PURPLE_WOOL))
                .save(output);

        stairBuilder(ModBlocks.MAGENTA_WOOL_STAIRS.get(), Ingredient.of(Blocks.MAGENTA_WOOL))
                .unlockedBy(getHasName(Blocks.MAGENTA_WOOL), has(Blocks.MAGENTA_WOOL))
                .save(output);

        stairBuilder(ModBlocks.PINK_WOOL_STAIRS.get(), Ingredient.of(Blocks.PINK_WOOL))
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
        doorBuilder(ModBlocks.POPLAR_DOOR.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                .save(output);
        trapdoorBuilder(ModBlocks.POPLAR_TRAPDOOR.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                .save(output);
        stairBuilder(ModBlocks.POPLAR_STAIRS.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS,ModBlocks.POPLAR_SLAB.get(), ModBlocks.POPLAR_PLANKS.get());
        fenceBuilder(ModBlocks.POPLAR_FENCE.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                .save(output);
        fenceGateBuilder(ModBlocks.POPLAR_FENCE_GATE.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                .save(output);
        pressurePlate(ModBlocks.POPLAR_PRESSURE_PLATE.get(), ModBlocks.POPLAR_PLANKS.get());
        buttonBuilder(ModBlocks.POPLAR_BUTTON.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                .save(output);
        signBuilder(ModBlocks.POPLAR_SIGN.get(), Ingredient.of(ModBlocks.POPLAR_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.POPLAR_PLANKS), has(ModBlocks.POPLAR_PLANKS))
                .save(output);
        hangingSign(ModBlocks.POPLAR_HANGING_SIGN.get(),ModBlocks.STRIPPED_POPLAR_LOG);
        woodenBoat(ModItems.POPLAR_BOAT.get(), ModBlocks.POPLAR_PLANKS.get());
        chestBoat(ModItems.POPLAR_CHEST_BOAT.get(), ModItems.POPLAR_BOAT.get());
        shelf(ModBlocks.POPLAR_SHELF.get(), ModBlocks.STRIPPED_POPLAR_LOG.get());
        woodFromLogs(ModBlocks.STRIPPED_POPLAR_WOOD, ModBlocks.STRIPPED_POPLAR_LOG);

        cushionRecipe(ModBlocks.WHITE_WOOL_SLAB.asItem(), ModItems.WHITE_CUSHION.get());
        cushionRecipe(ModBlocks.LIGHT_GRAY_WOOL_SLAB.asItem(), ModItems.LIGHT_GRAY_CUSHION.get());
        cushionRecipe(ModBlocks.GRAY_WOOL_SLAB.asItem(), ModItems.GRAY_CUSHION.get());
        cushionRecipe(ModBlocks.BLACK_WOOL_SLAB.asItem(), ModItems.BLACK_CUSHION.get());
        cushionRecipe(ModBlocks.BROWN_WOOL_SLAB.asItem(), ModItems.BROWN_CUSHION.get());
        cushionRecipe(ModBlocks.RED_WOOL_SLAB.asItem(), ModItems.RED_CUSHION.get());
        cushionRecipe(ModBlocks.ORANGE_WOOL_SLAB.asItem(), ModItems.ORANGE_CUSHION.get());
        cushionRecipe(ModBlocks.YELLOW_WOOL_SLAB.asItem(), ModItems.YELLOW_CUSHION.get());
        cushionRecipe(ModBlocks.LIME_WOOL_SLAB.asItem(), ModItems.LIME_CUSHION.get());
        cushionRecipe(ModBlocks.GREEN_WOOL_SLAB.asItem(), ModItems.GREEN_CUSHION.get());
        cushionRecipe(ModBlocks.CYAN_WOOL_SLAB.asItem(), ModItems.CYAN_CUSHION.get());
        cushionRecipe(ModBlocks.LIGHT_BLUE_WOOL_SLAB.asItem(), ModItems.LIGHT_BLUE_CUSHION.get());
        cushionRecipe(ModBlocks.BLUE_WOOL_SLAB.asItem(), ModItems.BLUE_CUSHION.get());
        cushionRecipe(ModBlocks.PURPLE_WOOL_SLAB.asItem(), ModItems.PURPLE_CUSHION.get());
        cushionRecipe(ModBlocks.MAGENTA_WOOL_SLAB.asItem(), ModItems.MAGENTA_CUSHION.get());
        cushionRecipe(ModBlocks.PINK_WOOL_SLAB.asItem(), ModItems.PINK_CUSHION.get());
        shaped(RecipeCategory.MISC,ModBlocks.STRAW_BED.get(),4)
                .pattern("###")
                .define('#', Blocks.HAY_BLOCK)
                .unlockedBy(getHasName(Blocks.HAY_BLOCK), this.has(Blocks.HAY_BLOCK))

                .save(this.output);

    }

    protected void cushionRecipe(final Item woolSlab, final Item result) {
        this.shaped(RecipeCategory.DECORATIONS, result, 1).define('#', woolSlab).group("cushion").unlockedBy(getHasName(woolSlab), this.has(woolSlab)).pattern("###").save(this.output);
    }


    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "";
        }
    }
}
