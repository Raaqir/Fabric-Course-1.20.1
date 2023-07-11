package net.raaqir.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raaqir.mccourse.MCCourseMod;
import net.raaqir.mccourse.block.ModBlocks;

public class ModItems {
    public static final Item SHTAIN = registerItem("shtain",
            new Item(new FabricItemSettings()));
    public static final Item RAW_SHTAIN = registerItem("raw_shtain",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(SHTAIN);
        entries.add(RAW_SHTAIN);

        entries.add(ModBlocks.SHTAIN_BLOCK);
        entries.add(ModBlocks.RAW_SHTAIN_BLOCK);

    }

    public static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
