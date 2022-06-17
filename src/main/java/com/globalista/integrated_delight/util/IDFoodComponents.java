package com.globalista.integrated_delight.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class IDFoodComponents {

    // Stew builder
    private static FoodComponent.Builder createStew(int hunger) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(0.6F);
    }

    // Juice builder -> check Expanded Delight saturation and hunger values
    private static final FoodComponent.Builder createJuice = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 0), 1f);

    // Jam builder -> check Expanded Delight saturation and hunger values (marked as jelly, change to jam)
    private static final FoodComponent.Builder createJam = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F);

    // Jelly builder -> check Better End saturation and hunger values
    private static final FoodComponent.Builder createJelly= new FoodComponent.Builder().hunger(5).saturationModifier(0.6F);

    // Pie builder -> Vanilla pumpkin pie values are the default for pies
    private static final FoodComponent.Builder createPie= new FoodComponent.Builder().hunger(8).saturationModifier(0.3F);

    // Cookie builder -> Vanilla cookie values are the default for cookies
    private static final FoodComponent.Builder createCookie = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).snack();

    // Components
    public static FoodComponent foodComponentJuice = createJuice.build();
    public static FoodComponent foodComponentJam = createJam.build();
    public static FoodComponent foodComponentJelly = createJelly.build();
    public static FoodComponent foodComponentPie = createPie.build();
    public static FoodComponent foodComponentCookie = createCookie.build();

    // Individual components (are they needed?)
    public static FoodComponent GARLIC_STEW = createStew(6).build();
    public static FoodComponent CHICKEN_RICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).build();

}
