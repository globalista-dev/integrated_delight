package com.globalista.integrated_delight;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GID implements ModInitializer {

	public static final String MOD_ID = "integrated_delight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Globa's Integrated Delight");
	}
}
