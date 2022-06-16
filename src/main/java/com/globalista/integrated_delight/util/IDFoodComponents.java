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
    private static FoodComponent.Builder createJuice = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 0), 1f);

    // Jam builder -> check Expanded Delight saturation and hunger values (marked as jelly, change to jam)
    private static FoodComponent.Builder createJam = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F);

    // Jelly builder -> check Better End saturation and hunger values
    private static FoodComponent.Builder createJelly= new FoodComponent.Builder().hunger(5).saturationModifier(0.6F);

    // Components
    public static FoodComponent foodComponentJuice = createJuice.build();
    public static FoodComponent GARLIC_STEW = createStew(6).build();
    public static FoodComponent CHICKEN_RICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).build();

}
