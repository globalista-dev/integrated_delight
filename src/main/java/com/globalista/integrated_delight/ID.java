package com.globalista.integrated_delight;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.globalista.integrated_delight.item.IDItem.GARLIC_STEW;

public class ID implements ModInitializer {

	public static final String MOD_ID = "integrated_delight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup IDGROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "idgroup"), () -> new ItemStack(GARLIC_STEW));

	@Override
	public void onInitialize() {
		LOGGER.info("Globa's Integrated Delight");
	}
}
