package com.globalista.integrated_delight.register;

import com.ianm1647.expandeddelight.ExpandedDelight;
import com.ianm1647.expandeddelight.item.ItemList;
import com.ianm1647.expandeddelight.item.custom.JellyItem;
import com.ianm1647.expandeddelight.item.custom.JuiceItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.globalista.integrated_delight.ID.IDGROUP;
import static com.globalista.integrated_delight.ID.MOD_ID;
import static com.globalista.integrated_delight.util.IDFoodComponents.*;

public class IDRegister {

    // Custom item settings for Integrated Delight
    public static final FabricItemSettings FOOD = new FabricItemSettings().group(IDGROUP);

    public static FabricItemSettings JUICE(StatusEffect status){
        return new FabricItemSettings().food(foodComponentJuice(status)).group(IDGROUP).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16);
    }

    public static FabricItemSettings JAM(StatusEffect status) {
        return new FabricItemSettings().food(foodComponentJam(status)).group(IDGROUP).recipeRemainder(ItemList.GLASS_JAR).maxCount(16);
    }

    public static final FabricItemSettings PIE = new FabricItemSettings().food(foodComponentPie).group(IDGROUP);
    public static final FabricItemSettings JELLY = new FabricItemSettings().food(foodComponentJelly).group(IDGROUP);
    public static final FabricItemSettings COOKIE = new FabricItemSettings().food(foodComponentCookie).group(IDGROUP);
    public static final FabricItemSettings SLICE = new FabricItemSettings().food(foodComponentSlice).group(IDGROUP);

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static Item registerCookie(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_cookie"), new Item(COOKIE));
    }

    public static Item registerJelly(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_jelly"), new Item(JELLY));
    }

    public static Item registerPie(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_pie"), new Item(PIE));
    }

    public static Item registerSlice(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_pie_slice"), new Item(SLICE));
    }

    public static Item registerJuice(String name, StatusEffect status) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_juice"), new JuiceItem(JUICE(status)));
    }

    public static Item registerJam(String name, StatusEffect status) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_jam"), new JellyItem(JAM(status)));
    }

}

