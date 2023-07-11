package net.raaqir.mccourse.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raaqir.mccourse.MCCourseMod;

public class ModBlocks {



    ///               ------BLOCKS------

    public static final  Block SHTAIN_BLOCK = registerBlock("shtain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final  Block RAW_SHTAIN_BLOCK = registerBlock("raw_shtain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));



    ///               ------ORES------

    public static final  Block SHTAIN_ORE = registerBlock("shtain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final  Block NETHER_SHTAIN_ORE = registerBlock("raw_shtain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));
    public static final  Block END_STONE_SHTAIN_ORE = registerBlock("shtain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final  Block DEEPSLATE_SHTAIN_ORE = registerBlock("raw_shtain_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MCCourseMod.LOGGER.info("Registering ModBlocks for " + MCCourseMod.MOD_ID);
    }
}
