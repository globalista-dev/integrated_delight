package com.globalista.integrated_delight.item;

import net.minecraft.item.FoodComponent;

public class IDFoodComponents {

    // Stew builder
    private static FoodComponent.Builder createStew(int hunger) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(0.6F);
    }

    // Components
    public static FoodComponent GARLIC_SOUP = createStew(6).build();
    public static FoodComponent CHICKEN_RICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).build();

}
