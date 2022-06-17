package com.globalista.integrated_delight.item;

import net.minecraft.item.Item;

import static com.globalista.integrated_delight.register.IDRegister.*;
import static net.minecraft.entity.effect.StatusEffects.*;

public class IDItems {

    public static void callItems() {
        System.out.println("Registering items");
    }

    // Cookies
    public static final Item SKY_BERRY_COOKIE = registerCookie("sky_berry");
    public static final Item SHADOW_BERRY_COOKIE = registerCookie("shadow_berry");
    public static final Item BLOSSOM_BERRY_COOKIE = registerCookie("blossom_berry");
    public static final Item CRIMSON_BERRY_COOKIE = registerCookie("crimson_berry");
    public static final Item NIGHTSHADE_BERRY_COOKIE = registerCookie("nightshade_berry");
    public static final Item BLUEBERRY_COOKIE = registerCookie("blueberry");
    public static final Item SOUL_BERRY_COOKIE = registerCookie("soul_berry");

    // Jams
    public static final Item SKY_BERRY_JAM = registerJam("sky_berry", LEVITATION);
    public static final Item SHADOW_BERRY_JAM = registerJam("shadow_berry", NIGHT_VISION);
    public static final Item BLOSSOM_BERRY_JAM = registerJam("blossom_berry", HASTE);
    public static final Item CRIMSON_BERRY_JAM = registerJam("crimson_berry", RESISTANCE);
    public static final Item NIGHTSHADE_BERRY_JAM = registerJam("nightshade_berry", NIGHT_VISION);
    public static final Item BLUEBERRY_JAM = registerJam("blueberry", SPEED);
    public static final Item SOUL_BERRY_JAM = registerJam("soul_berry", FIRE_RESISTANCE);
    public static final Item WITCHBERRY_JAM = registerJam("witchberry", WATER_BREATHING);

    // Jelly
    public static final Item SKY_BERRY_JELLY = registerJelly("sky_berry");
    public static final Item GLOW_BERRY_JELLY = registerJelly("glow_berry");
    public static final Item CRIMSON_BERRY_JELLY = registerJelly("crimson_berry");
    public static final Item NIGHTSHADE_BERRY_JELLY = registerJelly("nightshade_berry");
    public static final Item BLUEBERRY_JELLY = registerJelly("blueberry");
    public static final Item SOUL_BERRY_JELLY = registerJelly("soul_berry");
    public static final Item WITCHBERRY_JELLY = registerJelly("witchberry");

    // Juices
    public static final Item ORANGE_JUICE = registerJuice("orange", SLOW_FALLING);
    public static final Item BAOBAB_FRUIT_JUICE = registerJuice("baobab_fruit", JUMP_BOOST);
    public static final Item GREEN_APPLE_JUICE = registerJuice("green_apple", STRENGTH);
    public static final Item JOSHUA_FRUIT_JUICE = registerJuice("joshua_fruit", RESISTANCE);

    // Pies
    public static final Item ORANGE_PIE = registerPie("orange");
    public static final Item BAOBAB_FRUIT_PIE = registerPie("baobab_fruit");
    public static final Item BLACK_APPLE_PIE = registerPie("black_apple");

    // Pie slices
    public static final Item ORANGE_PIE_SLICE = registerSlice("orange");
    public static final Item PUMPKIN_PIE_SLICE = registerSlice("pumpkin");
    public static final Item BAOBAB_FRUIT_PIE_SLICE = registerSlice("baobab_fruit");
    public static final Item BLACK_APPLE_PIE_SLICE = registerSlice("black_apple");
    public static final Item GREEN_APPLE_PIE_SLICE = registerSlice("green_apple");
    public static final Item CRIMSON_BERRY_PIE_SLICE = registerSlice("crimson_berry");
    public static final Item NIGHTSHADE_BERRY_PIE_SLICE = registerSlice("nightshade_berry");
    public static final Item BLUEBERRY_PIE_SLICE = registerSlice("blueberry");
    public static final Item CAVE_PUMPKIN_PIE_SLICE = registerSlice("cave_pumpkin");

    // Fruit salad
    public static final Item RED_BERRY_SALAD = registerItem("red_berry_salad", new Item(FOOD)); // Sweet berries, witchberries, crimson berries, blossom berries, sugar and bowl
    public static final Item GLOWING_BERRY_SALAD = registerItem("glow_berry_salad", new Item(FOOD)); // Glow berries, shadow berry, nightshade berries, blueberries, skyberry, soul berry, sugar and bowl

    // Dishes
    public static final Item GARLIC_STEW = registerItem("garlic_stew", new Item(FOOD)); // Garlic, eggs, bread, salt, porkchop and bowl
    public static final Item CHICKEN_RICE = registerItem("chicken_rice", new Item(FOOD)); // Chicken, rice, garlic, salt, tomatoes and bowl
    public static final Item CREAMY_MUSHROOM_SOUP = registerItem("creamy_mushroom_soup", new Item(FOOD));
    public static final Item MUSHROOM_SOUP = registerItem("mushroom_soup", new Item(FOOD));






}
