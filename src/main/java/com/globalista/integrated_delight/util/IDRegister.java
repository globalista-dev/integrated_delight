package com.globalista.integrated_delight.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.globalista.integrated_delight.ID.IDGROUP;
import static com.globalista.integrated_delight.ID.MOD_ID;
import static com.globalista.integrated_delight.util.IDFoodComponents.*;

public class IDRegister {

    // Custom item settings for Integrated Delight
    public static final FabricItemSettings FOOD = new FabricItemSettings().group(IDGROUP);
    public static final FabricItemSettings JUICE = new FabricItemSettings().food(foodComponentJuice).group(IDGROUP);
    public static final FabricItemSettings JAM = new FabricItemSettings().food(foodComponentJam).group(IDGROUP);
    public static final FabricItemSettings PIE = new FabricItemSettings().food(foodComponentPie).group(IDGROUP);
    public static final FabricItemSettings JELLY = new FabricItemSettings().food(foodComponentJelly).group(IDGROUP);
    public static final FabricItemSettings COOKIE = new FabricItemSettings().food(foodComponentCookie).group(IDGROUP);

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static Item registerCookie(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_cookie"), new Item(COOKIE));
    }

    public static Item registerJam(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_jam"), new Item(JAM));
    }

    public static Item registerJelly(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_jelly"), new Item(JELLY));
    }

    public static Item registerJuice(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_juice"), new Item(JUICE));
    }

    public static Item registerPie(String name) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name + "_pie"), new Item(PIE));
    }

}

