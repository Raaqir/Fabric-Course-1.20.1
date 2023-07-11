package net.raaqir.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raaqir.mccourse.MCCourseMod;
import net.raaqir.mccourse.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup SHTAIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "shtain_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.shtain_group"))
                    .icon(() -> new ItemStack(ModItems.SHTAIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHTAIN);
                        entries.add(ModItems.RAW_SHTAIN);

                        entries.add(ModBlocks.SHTAIN_BLOCK);
                        entries.add(ModBlocks.RAW_SHTAIN_BLOCK);
                        entries.add(ModBlocks.NETHER_SHTAIN_ORE);
                        entries.add(ModBlocks.SHTAIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SHTAIN_ORE);
                        entries.add(ModBlocks.END_STONE_SHTAIN_ORE);

                    }).build());




    public static void registerItemGroups() {

    }

}
