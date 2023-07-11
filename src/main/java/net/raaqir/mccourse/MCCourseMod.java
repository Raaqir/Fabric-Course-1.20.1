package net.raaqir.mccourse;

import net.fabricmc.api.ModInitializer;

import net.raaqir.mccourse.block.ModBlocks;
import net.raaqir.mccourse.item.ModItemGroup;
import net.raaqir.mccourse.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// this is a comment bitch
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}