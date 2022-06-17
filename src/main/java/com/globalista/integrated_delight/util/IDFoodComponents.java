package com.globalista.integrated_delight.util;

import com.ianm1647.expandeddelight.ExpandedDelight;
import com.ianm1647.expandeddelight.item.ItemList;
import com.ianm1647.expandeddelight.item.custom.JellyItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class IDFoodComponents {

    // Stew builder
    private static FoodComponent.Builder createStew(int hunger) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(0.6F);
    }

    // Juice builder -> check Expanded Delight saturation and hunger values
    private static FoodComponent.Builder createJuice(StatusEffect status) {
        return(new FoodComponent.Builder().hunger(1)
                .saturationModifier(1.2F).alwaysEdible()
                .statusEffect(new StatusEffectInstance(status, 200, 0), 1.0F));
    }

    // Jam builder ->
    private static FoodComponent.Builder createJam(StatusEffect status) {
        return(new FoodComponent.Builder()).hunger(3).saturationModifier(0.6F).statusEffect(new StatusEffectInstance(status, 200, 0), 1.0F);
    }

    // Jam builder
    //private static final FoodComponent.Builder createJam = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F);

    // Jelly builder
    private static final FoodComponent.Builder createJelly= new FoodComponent.Builder().hunger(8).saturationModifier(0.7F);

    // Pie builder
    private static final FoodComponent.Builder createPie= new FoodComponent.Builder().hunger(8).saturationModifier(0.3F);

    // Pie slice builder
    private static final FoodComponent.Builder createSlice = new FoodComponent.Builder().hunger(3).saturationModifier(0.3F);

    // Cookie builder
    private static final FoodComponent.Builder createCookie = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).snack();

    // Components
    public static FoodComponent foodComponentJelly = createJelly.build();
    public static FoodComponent foodComponentPie = createPie.build();
    public static FoodComponent foodComponentCookie = createCookie.build();
    public static FoodComponent foodComponentSlice = createSlice.build();

    public static FoodComponent foodComponentJam(StatusEffect status){
        return createJam(status).build();
    }

    public static FoodComponent foodComponentJuice(StatusEffect status){
        return createJuice(status).build();
    }

    public static FoodComponent foodComponentStew(int hunger){
        return createStew(hunger).build();
    }

    // Individual components (are they needed?)
    public static FoodComponent GARLIC_STEW = createStew(6).build();
    public static FoodComponent CHICKEN_RICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.9f).build();

}
