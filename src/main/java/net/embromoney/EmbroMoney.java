package net.embromoney;

import net.embromoney.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.embromoney.item.ModItems;
import net.embromoney.item.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.registry.FuelRegistry;




public class EmbroMoney implements ModInitializer {
	public static final String MOD_ID = "embromoney";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}