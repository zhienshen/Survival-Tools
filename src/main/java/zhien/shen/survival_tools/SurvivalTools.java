package zhien.shen.survival_tools;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import zhien.shen.survival_tools.item.ModItemGroups;
import zhien.shen.survival_tools.item.ModItems;

public class SurvivalTools implements ModInitializer {
	public static final String MOD_ID = "Survival Tools";

	public static final String NAMESPACE = "survival-tools";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!This mod was made by zhien.shen.");

		//加载物品
		ModItems.registerModItems();
		//加载物品栏
		ModItemGroups.registerModItemGroups();
	}
}