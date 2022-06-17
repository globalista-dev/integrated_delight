package com.globalista.integrated_delight.data;

import com.nhoryzon.mc.farmersdelight.registry.ItemsRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import org.betterx.bclib.recipes.GridRecipe;
import org.betterx.betterend.config.Configs;
import org.betterx.betterend.registry.EndItems;
import org.betterx.betternether.registry.NetherItems;
import potionstudios.byg.common.item.BYGItems;

import java.util.function.Consumer;

import static com.globalista.integrated_delight.ID.MOD_ID;
import static com.globalista.integrated_delight.item.IDItems.*;

public class IDRecipeProvider extends FabricRecipeProvider {
    public IDRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    public static String itemFrom(ItemConvertible from) {
        return "pie_from_" + getItemPath(from);
    }

    // Only used for recipes not using CraftingRecipeJsonBuilder
    public static void callRecipes() {
        jellies();
    }

    public static CraftingRecipeJsonBuilder createPieRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(output)
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('P', ItemsRegistry.PIE_CRUST.get())
                .input('F', input)
                .pattern("WWW")
                .pattern("FFF")
                .pattern("SPS");
    }

    public static void offerPieRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createPieRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static CraftingRecipeJsonBuilder createPie2Recipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(output)
                .input('S', input)
                .pattern("SS")
                .pattern("SS");
    }

    public static void offerPie2Recipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createPie2Recipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter, itemFrom(input));
    }

    public static CraftingRecipeJsonBuilder createCookieRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(output)
                .input('W', Items.WHEAT)
                .input('B', input)
                .pattern("WBW");
    }

    public static void offerCookieRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createCookieRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerJellyRecipe(String name, ItemConvertible input, ItemConvertible output) {
        GridRecipe.make(MOD_ID, name, output)
                .checkConfig(Configs.RECIPE_CONFIG)
                .setList("JWSB")
                .addMaterial('J', EndItems.GELATINE)
                .addMaterial('W', PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER))
                .addMaterial('S', Items.SUGAR)
                .addMaterial('B', input)
                .build();
    }

    // Pie recipes
    public static void pies(Consumer<RecipeJsonProvider> exporter) {
        offerPieRecipe(exporter, BAOBAB_FRUIT_PIE, BYGItems.BAOBAB_FRUIT.get());
        offerPieRecipe(exporter, BLACK_APPLE_PIE, NetherItems.BLACK_APPLE);
    }

    // Pie slice recipes
    public static void pies2(Consumer<RecipeJsonProvider> exporter) {
        offerPie2Recipe(exporter, ORANGE_PIE, ORANGE_PIE_SLICE);
        offerPie2Recipe(exporter, Items.PUMPKIN_PIE, PUMPKIN_PIE_SLICE);
        offerPie2Recipe(exporter, BAOBAB_FRUIT_PIE, BAOBAB_FRUIT_PIE_SLICE);
        offerPie2Recipe(exporter, BLACK_APPLE_PIE, BLACK_APPLE_PIE_SLICE);
        offerPie2Recipe(exporter, BYGItems.GREEN_APPLE_PIE.get(), GREEN_APPLE_PIE_SLICE);
        offerPie2Recipe(exporter, BYGItems.CRIMSON_BERRY_PIE.get(), CRIMSON_BERRY_PIE_SLICE);
        offerPie2Recipe(exporter, BYGItems.NIGHTSHADE_BERRY_PIE.get(), NIGHTSHADE_BERRY_PIE_SLICE);
        offerPie2Recipe(exporter, BYGItems.BLUEBERRY_PIE.get(), BLUEBERRY_PIE_SLICE);
        offerPie2Recipe(exporter, EndItems.CAVE_PUMPKIN_PIE, CAVE_PUMPKIN_PIE_SLICE);
    }

    // Cookie recipes
    public static void cookies(Consumer<RecipeJsonProvider> exporter) {
        offerCookieRecipe(exporter, CRIMSON_BERRY_COOKIE, BYGItems.CRIMSON_BERRIES.get());
        offerCookieRecipe(exporter, BLUEBERRY_COOKIE, BYGItems.BLUE_BERRY.get());
        offerCookieRecipe(exporter, NIGHTSHADE_BERRY_COOKIE, BYGItems.NIGHTSHADE_BERRIES.get());
    }

    // Jelly recipes
    public static void jellies() {
        offerJellyRecipe("glow_berry_jelly", Items.GLOW_BERRIES, GLOW_BERRY_JELLY);
        offerJellyRecipe("crimson_berry_jelly", BYGItems.CRIMSON_BERRIES.get(), CRIMSON_BERRY_JELLY);
        offerJellyRecipe("nightshade_berry_jelly", BYGItems.NIGHTSHADE_BERRIES.get(), NIGHTSHADE_BERRY_JELLY);
        offerJellyRecipe("blueberry_jelly", BYGItems.BLUE_BERRY.get(), BLUEBERRY_JELLY);

    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        pies(exporter);
        cookies(exporter);
        pies2(exporter);
    }

}
