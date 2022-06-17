package com.globalista.integrated_delight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static com.globalista.integrated_delight.item.IDItems.*;

public class IDModelProvider extends FabricModelProvider {
    public IDModelProvider(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Cookies
        itemModelGenerator.register(SKY_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(SHADOW_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(BLOSSOM_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(HOLLY_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(CRIMSON_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(NIGHTSHADE_BERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(BLUEBERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(SOUL_BERRY_COOKIE, Models.GENERATED);

        // Jams
        itemModelGenerator.register(SKY_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(SHADOW_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(BLOSSOM_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(HOLLY_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(CRIMSON_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(NIGHTSHADE_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(BLUEBERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(SOUL_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(WITCHBERRY_JAM, Models.GENERATED);

        // Jellies
        itemModelGenerator.register(SKY_BERRY_JELLY , Models.GENERATED);
        itemModelGenerator.register(GLOW_BERRY_JELLY, Models.GENERATED);
        itemModelGenerator.register(HOLLY_BERRY_JELLY, Models.GENERATED);
        itemModelGenerator.register(CRIMSON_BERRY_JELLY, Models.GENERATED);
        itemModelGenerator.register(NIGHTSHADE_BERRY_JELLY, Models.GENERATED);
        itemModelGenerator.register(BLUEBERRY_JELLY, Models.GENERATED);
        itemModelGenerator.register(SOUL_BERRY_JELLY, Models.GENERATED);
        itemModelGenerator.register(WITCHBERRY_JELLY, Models.GENERATED);

        // Juices
        itemModelGenerator.register(ORANGE_JUICE, Models.GENERATED);
        itemModelGenerator.register(BAOBAB_FRUIT_JUICE, Models.GENERATED);
        itemModelGenerator.register(GREEN_APPLE_JUICE, Models.GENERATED);
        itemModelGenerator.register(JOSHUA_FRUIT_JUICE, Models.GENERATED);

        //Pies
        itemModelGenerator.register(ORANGE_PIE, Models.GENERATED);
        itemModelGenerator.register(BAOBAB_FRUIT_PIE, Models.GENERATED);

        // Fruit salads
        itemModelGenerator.register(RED_BERRY_SALAD, Models.GENERATED);
        itemModelGenerator.register(GLOWING_BERRY_SALAD, Models.GENERATED);

        // Dishes
        itemModelGenerator.register(GARLIC_STEW, Models.GENERATED);
        itemModelGenerator.register(CHICKEN_RICE, Models.GENERATED);

    }

}