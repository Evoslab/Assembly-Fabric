package com.github.evoslab.assembly.registry;

import com.github.evoslab.assembly.Assembly;
import com.github.evoslab.assembly.blocks.AssemblyStairsBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AssemblyBlocks {

    //Amethyst Variants
    public static final Block DRIPPING_AMETHYST = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem DRIPPING_AMETHYST_ITEM = new BlockItem(AssemblyBlocks.DRIPPING_AMETHYST, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block AMETHYST_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem AMETHYST_BRICKS_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final PillarBlock AMETHYST_PILLAR = new PillarBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem AMETHYST_PILLAR_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Polished Amethyst
    public static final Block POLISHED_AMETHYST = new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem POLISHED_AMETHYST_ITEM = new BlockItem(AssemblyBlocks.POLISHED_AMETHYST, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final SlabBlock POLISHED_AMETHYST_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK));
    public static final BlockItem POLISHED_AMETHYST_SLAB_ITEM = new BlockItem(AssemblyBlocks.POLISHED_AMETHYST_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final AssemblyStairsBlock POLISHED_AMETHYST_STAIRS = new AssemblyStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem POLISHED_AMETHYST_STAIRS_ITEM = new BlockItem(AssemblyBlocks.POLISHED_AMETHYST_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Dripstone Variants
    public static final Block CHISELED_DRIPSTONE = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem CHISELED_DRIPSTONE_ITEM = new BlockItem(AssemblyBlocks.CHISELED_DRIPSTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Block DRIPSTONE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem DRIPSTONE_BRICKS_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Polished Dripstone
    public static final Block POLISHED_DRIPSTONE = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem POLISHED_DRIPSTONE_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final SlabBlock POLISHED_DRIPSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(POLISHED_DRIPSTONE));
    public static final BlockItem POLISHED_DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final AssemblyStairsBlock POLISHED_DRIPSTONE_STAIRS = new AssemblyStairsBlock(POLISHED_DRIPSTONE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_DRIPSTONE));
    public static final BlockItem POLISHED_DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Dripstone
    public static final SlabBlock DRIPSTONE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final AssemblyStairsBlock DRIPSTONE_STAIRS = new AssemblyStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Crying Obsidian Variants
    public static final Block CRYING_OBSIDIAN_TILES = new Block(FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK));
    public static final BlockItem CRYING_OBSIDIAN_TILES_ITEM = new BlockItem(AssemblyBlocks.CRYING_OBSIDIAN_TILES, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void RegisterAssemblyBlocks() {

        //Amethyst Variants
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "dripping_amethyst"), DRIPPING_AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "dripping_amethyst"), DRIPPING_AMETHYST_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "amethyst_bricks"), AMETHYST_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "amethyst_bricks"), AMETHYST_BRICKS_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR_ITEM);

        //Polished Amethyst
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_amethyst"), POLISHED_AMETHYST);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_amethyst"), POLISHED_AMETHYST_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_amethyst_slab"), POLISHED_AMETHYST_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_amethyst_slab"), POLISHED_AMETHYST_SLAB_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_amethyst_stairs"), POLISHED_AMETHYST_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_amethyst_stairs"), POLISHED_AMETHYST_STAIRS_ITEM);

        //Dripstone Variants
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "chiseled_dripstone"), CHISELED_DRIPSTONE);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "chiseled_dripstone"), CHISELED_DRIPSTONE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "dripstone_bricks"), DRIPSTONE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "dripstone_bricks"), DRIPSTONE_BRICKS_ITEM);

        //Polished Dripstone
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_dripstone"), POLISHED_DRIPSTONE);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_dripstone"), POLISHED_DRIPSTONE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_dripstone_slab"), POLISHED_DRIPSTONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_dripstone_slab"), POLISHED_DRIPSTONE_SLAB_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "polished_dripstone_stairs"), POLISHED_DRIPSTONE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "polished_dripstone_stairs"), POLISHED_DRIPSTONE_STAIRS_ITEM);

        //Dripstone
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "dripstone_slab"), DRIPSTONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "dripstone_slab"), DRIPSTONE_SLAB_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "dripstone_stairs"), DRIPSTONE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "dripstone_stairs"), DRIPSTONE_STAIRS_ITEM);

        //Crying Obsidian Variants
        Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, "crying_obsidian_tiles"), CRYING_OBSIDIAN_TILES);
        Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, "crying_obsidian_tiles"), CRYING_OBSIDIAN_TILES_ITEM);

    }

}
