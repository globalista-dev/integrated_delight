package com.globalista.integrated_delight.data;

import com.globalista.integrated_delight.item.IDItems;
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
import potionstudios.byg.common.item.BYGItems;

import java.util.function.Consumer;

import static com.globalista.integrated_delight.ID.MOD_ID;
import static com.globalista.integrated_delight.item.IDItems.*;

public class IDRecipeProvider extends FabricRecipeProvider {
    public IDRecipeProvider(FabricDataGenerator dataGenerator) { super(dataGenerator); }

    public static ItemConvertible waterBottle = PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER).getItem();

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        pies(exporter);
        cookies(exporter);
    }

    // Only used for recipes not using CraftingRecipeJsonBuilder
    public static void callRecipes(){
        jellies();
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

    public static void offerJellyRecipe(String name, ItemConvertible input, ItemConvertible output){
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
    }

    // Cookie recipes
    public static void cookies(Consumer<RecipeJsonProvider> exporter) {
        offerCookieRecipe(exporter, CRIMSON_BERRY_COOKIE, BYGItems.CRIMSON_BERRIES.get());
        offerCookieRecipe(exporter, BLUEBERRY_COOKIE, BYGItems.BLUE_BERRY.get());
        offerCookieRecipe(exporter, NIGHTSHADE_BERRY_COOKIE, BYGItems.NIGHTSHADE_BERRIES.get());
    }

    public static void jellies() {
        offerJellyRecipe("glow_berry_jelly", Items.GLOW_BERRIES, GLOW_BERRY_JELLY);
        offerJellyRecipe("crimson_berry_jelly", BYGItems.CRIMSON_BERRIES.get(), CRIMSON_BERRY_JELLY);

    }

}
