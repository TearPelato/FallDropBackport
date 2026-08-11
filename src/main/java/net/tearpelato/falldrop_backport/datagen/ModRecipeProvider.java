package net.tearpelato.falldrop_backport.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModItems;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    private static final List<Item> DYE_ITEMS = List.of(
            Items.DYE.white(), Items.DYE.lightGray(), Items.DYE.gray(), Items.DYE.black(),
            Items.DYE.brown(), Items.DYE.red(), Items.DYE.orange(), Items.DYE.yellow(),
            Items.DYE.lime(), Items.DYE.green(), Items.DYE.cyan(), Items.DYE.lightBlue(),
            Items.DYE.blue(), Items.DYE.purple(), Items.DYE.magenta(), Items.DYE.pink()
    );

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

        stairBuilder(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.white()))
                .unlockedBy(getHasName(Blocks.CONCRETE.white()), has(Blocks.CONCRETE.white()))
                .save(output);

        stairBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightGray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightGray()), has(Blocks.CONCRETE.lightGray()))
                .save(output);

        stairBuilder(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.gray()))
                .unlockedBy(getHasName(Blocks.CONCRETE.gray()), has(Blocks.CONCRETE.gray()))
                .save(output);

        stairBuilder(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.black()))
                .unlockedBy(getHasName(Blocks.CONCRETE.black()), has(Blocks.CONCRETE.black()))
                .save(output);

        stairBuilder(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.brown()))
                .unlockedBy(getHasName(Blocks.CONCRETE.brown()), has(Blocks.CONCRETE.brown()))
                .save(output);

        stairBuilder(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.red()))
                .unlockedBy(getHasName(Blocks.CONCRETE.red()), has(Blocks.CONCRETE.red()))
                .save(output);

        stairBuilder(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.orange()))
                .unlockedBy(getHasName(Blocks.CONCRETE.orange()), has(Blocks.CONCRETE.orange()))
                .save(output);

        stairBuilder(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.yellow()))
                .unlockedBy(getHasName(Blocks.CONCRETE.yellow()), has(Blocks.CONCRETE.yellow()))
                .save(output);

        stairBuilder(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lime()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lime()), has(Blocks.CONCRETE.lime()))
                .save(output);

        stairBuilder(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.green()))
                .unlockedBy(getHasName(Blocks.CONCRETE.green()), has(Blocks.CONCRETE.green()))
                .save(output);

        stairBuilder(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.cyan()))
                .unlockedBy(getHasName(Blocks.CONCRETE.cyan()), has(Blocks.CONCRETE.cyan()))
                .save(output);

        stairBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightBlue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.lightBlue()), has(Blocks.CONCRETE.lightBlue()))
                .save(output);

        stairBuilder(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.blue()))
                .unlockedBy(getHasName(Blocks.CONCRETE.blue()), has(Blocks.CONCRETE.blue()))
                .save(output);

        stairBuilder(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.purple()))
                .unlockedBy(getHasName(Blocks.CONCRETE.purple()), has(Blocks.CONCRETE.purple()))
                .save(output);

        stairBuilder(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.magenta()))
                .unlockedBy(getHasName(Blocks.CONCRETE.magenta()), has(Blocks.CONCRETE.magenta()))
                .save(output);

        stairBuilder(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.pink()))
                .unlockedBy(getHasName(Blocks.CONCRETE.pink()), has(Blocks.CONCRETE.pink()))
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

        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.CONCRETE.white());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.CONCRETE.lightGray());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.CONCRETE.gray());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.CONCRETE.black());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.CONCRETE.brown());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.CONCRETE.red());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.CONCRETE.orange());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.CONCRETE.yellow());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.CONCRETE.lime());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.CONCRETE.green());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CONCRETE.cyan());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.CONCRETE.lightBlue());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.CONCRETE.blue());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.CONCRETE.purple());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.CONCRETE.magenta());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.CONCRETE.pink());

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


        cushionRecipe(ModBlocks.WHITE_WOOL_SLAB.asItem(), ModItems.CUSHION.white());
        cushionRecipe(ModBlocks.LIGHT_GRAY_WOOL_SLAB.asItem(), ModItems.CUSHION.lightGray());
        cushionRecipe(ModBlocks.GRAY_WOOL_SLAB.asItem(), ModItems.CUSHION.gray());
        cushionRecipe(ModBlocks.BLACK_WOOL_SLAB.asItem(), ModItems.CUSHION.black());
        cushionRecipe(ModBlocks.BROWN_WOOL_SLAB.asItem(), ModItems.CUSHION.brown());
        cushionRecipe(ModBlocks.RED_WOOL_SLAB.asItem(), ModItems.CUSHION.red());
        cushionRecipe(ModBlocks.ORANGE_WOOL_SLAB.asItem(), ModItems.CUSHION.orange());
        cushionRecipe(ModBlocks.YELLOW_WOOL_SLAB.asItem(), ModItems.CUSHION.yellow());
        cushionRecipe(ModBlocks.LIME_WOOL_SLAB.asItem(), ModItems.CUSHION.lime());
        cushionRecipe(ModBlocks.GREEN_WOOL_SLAB.asItem(), ModItems.CUSHION.green());
        cushionRecipe(ModBlocks.CYAN_WOOL_SLAB.asItem(), ModItems.CUSHION.cyan());
        cushionRecipe(ModBlocks.LIGHT_BLUE_WOOL_SLAB.asItem(), ModItems.CUSHION.lightBlue());
        cushionRecipe(ModBlocks.BLUE_WOOL_SLAB.asItem(), ModItems.CUSHION.blue());
        cushionRecipe(ModBlocks.PURPLE_WOOL_SLAB.asItem(), ModItems.CUSHION.purple());
        cushionRecipe(ModBlocks.MAGENTA_WOOL_SLAB.asItem(), ModItems.CUSHION.magenta());
        cushionRecipe(ModBlocks.PINK_WOOL_SLAB.asItem(), ModItems.CUSHION.pink());
        shaped(RecipeCategory.MISC,ModBlocks.STRAW_BED,4)
                .pattern("###")
                .define('#', Blocks.HAY_BLOCK)
                .unlockedBy(getHasName(Blocks.HAY_BLOCK), has(Blocks.HAY_BLOCK))
                .save(output);

        colorItemWithDye(DYE_ITEMS, List.of(
                ModBlocks.WHITE_WOOL_STAIRS.asItem(), ModBlocks.LIGHT_GRAY_WOOL_STAIRS.asItem(), ModBlocks.GRAY_WOOL_STAIRS.asItem(), ModBlocks.BLACK_WOOL_STAIRS.asItem(),
                ModBlocks.BROWN_WOOL_STAIRS.asItem(), ModBlocks.RED_WOOL_STAIRS.asItem(), ModBlocks.ORANGE_WOOL_STAIRS.asItem(), ModBlocks.YELLOW_WOOL_STAIRS.asItem(),
                ModBlocks.LIME_WOOL_STAIRS.asItem(), ModBlocks.GREEN_WOOL_STAIRS.asItem(), ModBlocks.CYAN_WOOL_STAIRS.asItem(), ModBlocks.LIGHT_BLUE_WOOL_STAIRS.asItem(),
                ModBlocks.BLUE_WOOL_STAIRS.asItem(), ModBlocks.PURPLE_WOOL_STAIRS.asItem(), ModBlocks.MAGENTA_WOOL_STAIRS.asItem(), ModBlocks.PINK_WOOL_STAIRS.asItem()
        ), "wool_stairs_dye", RecipeCategory.BUILDING_BLOCKS);

        colorItemWithDye(DYE_ITEMS, List.of(
                ModBlocks.WHITE_WOOL_SLAB.asItem(), ModBlocks.LIGHT_GRAY_WOOL_SLAB.asItem(), ModBlocks.GRAY_WOOL_SLAB.asItem(), ModBlocks.BLACK_WOOL_SLAB.asItem(),
                ModBlocks.BROWN_WOOL_SLAB.asItem(), ModBlocks.RED_WOOL_SLAB.asItem(), ModBlocks.ORANGE_WOOL_SLAB.asItem(), ModBlocks.YELLOW_WOOL_SLAB.asItem(),
                ModBlocks.LIME_WOOL_SLAB.asItem(), ModBlocks.GREEN_WOOL_SLAB.asItem(), ModBlocks.CYAN_WOOL_SLAB.asItem(), ModBlocks.LIGHT_BLUE_WOOL_SLAB.asItem(),
                ModBlocks.BLUE_WOOL_SLAB.asItem(), ModBlocks.PURPLE_WOOL_SLAB.asItem(), ModBlocks.MAGENTA_WOOL_SLAB.asItem(), ModBlocks.PINK_WOOL_SLAB.asItem()
        ), "wool_slab_dye", RecipeCategory.BUILDING_BLOCKS);

        colorItemWithDye(DYE_ITEMS, List.of(
                ModItems.CUSHION.white().asItem(), ModItems.CUSHION.lightGray().asItem(), ModItems.CUSHION.gray().asItem(), ModItems.CUSHION.black().asItem(),
                ModItems.CUSHION.brown().asItem(), ModItems.CUSHION.red().asItem(), ModItems.CUSHION.orange().asItem(), ModItems.CUSHION.yellow().asItem(),
                ModItems.CUSHION.lime().asItem(), ModItems.CUSHION.green().asItem(), ModItems.CUSHION.cyan().asItem(), ModItems.CUSHION.lightBlue().asItem(),
                ModItems.CUSHION.blue().asItem(), ModItems.CUSHION.purple().asItem(), ModItems.CUSHION.magenta().asItem(), ModItems.CUSHION.pink().asItem()
        ), "cushion_dye", RecipeCategory.DECORATIONS);



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
            return "FallDrop Backport Recipes";
        }
    }

}