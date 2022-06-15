package com.globalista.integrated_delight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static com.globalista.integrated_delight.ID.IDGROUP;
import static com.globalista.integrated_delight.util.IDRegister.registerItem;

public class IDItem {

    //Place all food items here, and use FOOD as the item settings
    public static final FabricItemSettings FOOD = new FabricItemSettings().group(IDGROUP);

    public static final Item GARLIC_SOUP = registerItem("garlic_soup", new Item(FOOD));
    public static final Item CHICKEN_RICE = registerItem("chicken_rice", new Item(FOOD));

}
