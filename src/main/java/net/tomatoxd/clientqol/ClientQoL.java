package net.tomatoxd.clientqol;

import net.fabricmc.api.ModInitializer;

import net.tomatoxd.clientqol.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientQoL implements ModInitializer {
	public static final String MOD_ID = "clientqol";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}