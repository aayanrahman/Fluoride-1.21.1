package net.realjs.fluoride;

import net.fabricmc.api.ModInitializer;

import net.realjs.fluoride.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fluoride implements ModInitializer {
	public static final String MOD_ID = "fluoride";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}