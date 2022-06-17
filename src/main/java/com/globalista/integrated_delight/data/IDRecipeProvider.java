package com.globalista.integrated_delight.data;

import com.globalista.integrated_delight.item.IDItems;
import com.nhoryzon.mc.farmersdelight.recipe.CookingPotRecipeSerializer;
import com.nhoryzon.mc.farmersdelight.registry.ItemsRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.*;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import org.betterx.betterend.registry.EndItems;
import potionstudios.byg.common.item.BYGItems;

import java.util.function.Consumer;

import static com.globalista.integrated_delight.item.IDItems.*;

public class IDRecipeProvider extends FabricRecipeProvider {
    public IDRecipeProvider(FabricDataGenerator dataGenerator) { super(dataGenerator); }

    public static Ingredient waterBottle = Ingredient.ofStacks(PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER));

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        pies(exporter);
        cookies(exporter);
        jelly(exporter);
    }

    public static CraftingRecipeJsonBuilder createPieRecipe(ItemConvertible output, Ingredient input){
        return ShapedRecipeJsonBuilder.create(output).input('W', Items.WHEAT).input('S', Items.SUGAR)
                .input('P', ItemsRegistry.PIE_CRUST.get()).input('F', input).pattern("WWW").pattern("FFF").pattern("SPS");
    }

    public static void offerPieRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input){
        createPieRecipe(output, Ingredient.ofItems(new ItemConvertible[]{input})).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static CraftingRecipeJsonBuilder createCookieRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(output).input('W', Items.WHEAT).input('B', input).pattern("WBW");
    }

    public static void offerCookieRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input){
        createCookieRecipe(output, Ingredient.ofItems(new ItemConvertible[]{input})).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static CraftingRecipeJsonBuilder createJellyRecipe(ItemConvertible output, Ingredient input){
        return ShapedRecipeJsonBuilder.create(output).input('G', EndItems.GELATINE).input('W', waterBottle).input('S', Items.SUGAR).input('B', input)
                .pattern("GWS").pattern("B  ");
    }

    public static void offerJellyRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input){
        createJellyRecipe(output, Ingredient.ofItems(new ItemConvertible[]{input})).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);

    }

    // Pie recipes
    public static void pies(Consumer<RecipeJsonProvider> exporter) {
        offerPieRecipe(exporter, BAOBAB_FRUIT_PIE, BYGItems.BAOBAB_FRUIT.get());
    }

    // Cookie recipes
    public static void cookies(Consumer<RecipeJsonProvider> exporter) {
        offerCookieRecipe(exporter, CRIMSON_BERRY_COOKIE, BYGItems.CRIMSON_BERRIES.get());
        offerCookieRecipe(exporter, HOLLY_BERRY_COOKIE, BYGItems.HOLLY_BERRY_LEAVES.get());
        offerCookieRecipe(exporter, BLUEBERRY_COOKIE, BYGItems.BLUE_BERRY.get());
        offerCookieRecipe(exporter, NIGHTSHADE_BERRY_COOKIE, BYGItems.NIGHTSHADE_BERRIES.get());
    }

    // Jelly recipes
    public static void jelly(Consumer<RecipeJsonProvider> exporter) {
        offerJellyRecipe(exporter, CRIMSON_BERRY_JELLY, BYGItems.CRIMSON_BERRIES.get());
        offerJellyRecipe(exporter, HOLLY_BERRY_JELLY, BYGItems.HOLLY_BERRY_LEAVES.get());
        offerJellyRecipe(exporter, BLUEBERRY_JELLY, BYGItems.BLUE_BERRY.get());
        offerJellyRecipe(exporter, NIGHTSHADE_BERRY_JELLY, BYGItems.NIGHTSHADE_BERRIES.get());
    }

}
