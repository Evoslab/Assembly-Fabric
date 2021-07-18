package com.evoslab.assembly.core.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AssemblyBlocks {
    //Dripstone
    public static SlabBlock DRIPSTONE_SLAB = new SlabBlock(Properties.DRIPSTONE);
    public static BlockItem DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static StairsBlock DRIPSTONE_STAIRS = new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(DRIPSTONE_BLOCK));
    public static BlockItem DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Dripstone Variants
    public static Block CHISELED_DRIPSTONE;
    public static Block DRIPSTONE_BRICKS;

    //Polished Dripstone
    public static Block POLISHED_DRIPSTONE;
    public static SlabBlock POLISHED_DRIPSTONE_SLAB = new SlabBlock(Properties.DRIPSTONE);
    public static BlockItem POLISHED_DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static StairsBlock POLISHED_DRIPSTONE_STAIRS = new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK));
    public static BlockItem POLISHED_DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Amethyst Variants
    public static Block DRIPPING_AMETHYST;
    public static Block CHISELED_AMETHYST;
    public static PillarBlock AMETHYST_PILLAR = new PillarBlock(Properties.AMETHYST);
    public static BlockItem AMETHYST_PILLAR_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Amethyst Bricks
    public static Block AMETHYST_BRICKS;
    public static SlabBlock AMETHYST_BRICK_SLAB;
    public static BlockItem AMETHYST_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static StairsBlock AMETHYST_BRICK_STAIRS;
    public static BlockItem AMETHYST_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Crying Obsidian Variant
    public static Block CRYING_OBSIDIAN_TILES;

    public static Block DIRT_BRICKS;
    public static SlabBlock DIRT_BRICK_SLAB = new SlabBlock(Properties.DIRT_BRICKS);
    public static BlockItem DIRT_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.DIRT_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static StairsBlock DIRT_BRICK_STAIRS = new StairsBlock(Blocks.DIRT.getDefaultState(), AbstractBlock.Settings.copy(DIRT).strength(2.0F, 6.0F));
    public static BlockItem DIRT_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DIRT_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static Block MOSSY_DIRT_BRICKS;
    public static SlabBlock MOSSY_DIRT_BRICK_SLAB = new SlabBlock(Properties.DIRT_BRICKS);
    public static BlockItem MOSSY_DIRT_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static StairsBlock MOSSY_DIRT_BRICK_STAIRS = new StairsBlock(Blocks.DIRT.getDefaultState(), AbstractBlock.Settings.copy(DIRT).strength(2.0F, 6.0F));
    public static BlockItem MOSSY_DIRT_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static Block CHISELED_DIRT;
    public static Block DIRT_TILES;

    //Basalt Variants
    public static Block CHISELED_BASALT;
    public static Block BASALT_TILES;
    public static Block POLISHED_DIRT;

    public static void init() {

        //Dripstone
        DRIPSTONE_SLAB = register(new SlabBlock(Properties.DRIPSTONE), "dripstone_slab","");
        DRIPSTONE_STAIRS = register(new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK)), "dripstone_stairs","Dripstone Stairs");

        //Amethyst Variants
        DRIPPING_AMETHYST = register(new Block(Properties.AMETHYST), "dripping_amethyst","");
        CHISELED_AMETHYST = register(new Block(Properties.AMETHYST), "chiseled_amethyst","");
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR_ITEM);

        //Amethyst Bricks
        AMETHYST_BRICKS = register(new Block(Properties.AMETHYST), "amethyst_bricks","");
        AMETHYST_BRICK_SLAB = register(new SlabBlock(Properties.AMETHYST), "amethyst_brick_slab","");
        AMETHYST_BRICK_STAIRS = register(new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)), "amethyst_brick_stairs","");

        //Dripstone Variants
        CHISELED_DRIPSTONE = register(new Block(Properties.DRIPSTONE), "chiseled_dripstone","");
        DRIPSTONE_BRICKS = register(new Block(Properties.DRIPSTONE), "dripstone_bricks","");

        //Polished Dripstone
        POLISHED_DRIPSTONE = register(new Block(Properties.DRIPSTONE), "polished_dripstone","");
        POLISHED_DRIPSTONE_SLAB = register(new SlabBlock(Properties.AMETHYST), "polished_dripstone_slab","");
        POLISHED_DRIPSTONE_STAIRS = register(new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)), "polished_dripstone_stairs","");

        //Crying Obsidian Variants
        CRYING_OBSIDIAN_TILES = register("crying_obsidian_tiles", new Block(FabricBlockSettings.copyOf(CRYING_OBSIDIAN)));

        //Dirt Bricks
        DIRT_BRICKS = register(new Block(Properties.DIRT_BRICKS), "dirt_bricks","");
        DIRT_BRICK_SLAB = register(new SlabBlock(Properties.AMETHYST), "dirt_brick_slab","");
        DIRT_BRICK_STAIRS = register(new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)), "dirt_brick_stairs","");
        MOSSY_DIRT_BRICKS = register(new Block(Properties.DIRT_BRICKS), "mossy_dirt_bricks","");
        MOSSY_DIRT_BRICK_SLAB = register(new SlabBlock(Properties.AMETHYST), "mossy_dirt_brick_slab","");
        DIRT_BRICK_STAIRS = register(new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)), "mossy_dirt_brick_stairs","");Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "mossy_dirt_brick_slab"), MOSSY_DIRT_BRICK_SLAB);
        CHISELED_DIRT = register(new Block(Properties.DIRT_BRICKS), "chiseled_dirt","");
        DIRT_TILES = register(new Block(Properties.DIRT_BRICKS), "dirt_tiles","");
        POLISHED_DIRT = register(new Block(Properties.DIRT_BRICKS), "polished_dirt","");

        //Basalt Variants
        CHISELED_BASALT = register(new Block(Properties.BASALT), "chiseled_basalt","");
        BASALT_TILES = register(new Block(Properties.BASALT), "basalt_tiles","");
    }

    public static class Properties {
        public static final FabricBlockSettings DIRT_BRICKS = FabricBlockSettings
                .copyOf(Blocks.DIRT)
                .breakByHand(true)
                .breakByTool(FabricToolTags.SHOVELS)
                .strength(2.0F, 6.0F);

        public static final FabricBlockSettings AMETHYST = FabricBlockSettings
                .of(Material.AMETHYST, MapColor.PURPLE)
                .strength(1.5F)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .requiresTool();

        public static final FabricBlockSettings DRIPSTONE = FabricBlockSettings
                .copyOf(Blocks.DRIPSTONE_BLOCK)
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK);

        public static final FabricBlockSettings BASALT = FabricBlockSettings
                .copyOf(Blocks.POLISHED_BASALT)
                .sounds(BlockSoundGroup.BASALT);
    }
}