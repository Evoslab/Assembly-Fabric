package com.github.evoslab.assembly.registry;

import com.github.evoslab.assembly.Assembly;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AssemblyBlocks {

    public static final Block DRIPPING_AMETHYST = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem DRIPPING_AMETHYST_ITEM = new BlockItem(AssemblyBlocks.DRIPPING_AMETHYST, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block AMETHYST_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem AMETHYST_BRICKS_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block POLISHED_AMETHYST = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem POLISHED_AMETHYST_ITEM = new BlockItem(AssemblyBlocks.POLISHED_AMETHYST, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block AMETHYST_PILLAR = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem AMETHYST_PILLAR_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block CHISELED_DRIPSTONE = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem CHISELED_DRIPSTONE_ITEM = new BlockItem(AssemblyBlocks.CHISELED_DRIPSTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block POLISHED_DRIPSTONE = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem POLISHED_DRIPSTONE_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block DRIPSTONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem DRIPSTONE_BRICKS_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Block CRYING_OBSIDIAN_TILES = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem CRYING_OBSIDIAN_TILES_ITEM = new BlockItem(AssemblyBlocks.CRYING_OBSIDIAN_TILES, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void RegisterAssemblyBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "dripping_amethyst"), DRIPPING_AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "dripping_amethyst"), DRIPPING_AMETHYST_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "amethyst_bricks"), AMETHYST_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "amethyst_bricks"), AMETHYST_BRICKS_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_amethyst"), POLISHED_AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_amethyst"), POLISHED_AMETHYST_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "chiseled_dripstone"), CHISELED_DRIPSTONE);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "chiseled_dripstone"), CHISELED_DRIPSTONE_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "dripstone_bricks"), DRIPSTONE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "dripstone_bricks"), DRIPSTONE_BRICKS_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_dripstone"), POLISHED_DRIPSTONE);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_dripstone"), POLISHED_DRIPSTONE_ITEM);

        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "crying_obsidian_tiles"), CRYING_OBSIDIAN_TILES);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "crying_obsidian_tiles"), CRYING_OBSIDIAN_TILES_ITEM);

    }

}
