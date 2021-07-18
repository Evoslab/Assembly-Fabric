package com.evoslab.assembly.core.registry;

import com.evoslab.assembly.common.block.vanilla.PublicStairsBlock;
import com.evoslab.assembly.core.Assembly;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class AssemblyBlocks {
    /*
    //Dripstone
    public static SlabBlock DRIPSTONE_SLAB = new SlabBlock(Settings.DRIPSTONE);
    public static BlockItem DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static PublicStairsBlock() DRIPSTONE_STAIRS = new PublicStairsBlock()(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(DRIPSTONE_BLOCK));
    public static BlockItem DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Dripstone Variants
    public static Block CHISELED_DRIPSTONE;
    public static Block DRIPSTONE_BRICKS;

    //Polished Dripstone
    public static Block POLISHED_DRIPSTONE;
    public static SlabBlock POLISHED_DRIPSTONE_SLAB = new SlabBlock(Settings.DRIPSTONE);
    public static BlockItem POLISHED_DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static PublicStairsBlock() POLISHED_DRIPSTONE_STAIRS = new PublicStairsBlock()(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK));
    public static BlockItem POLISHED_DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Amethyst Variants
    public static Block DRIPPING_AMETHYST;
    public static Block CHISELED_AMETHYST;
    public static PillarBlock AMETHYST_PILLAR = new PillarBlock(Settings.AMETHYST);
    public static BlockItem AMETHYST_PILLAR_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Amethyst Bricks
    public static Block AMETHYST_BRICKS;
    public static SlabBlock AMETHYST_BRICK_SLAB;
    public static BlockItem AMETHYST_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static PublicStairsBlock() AMETHYST_BRICK_STAIRS;
    public static BlockItem AMETHYST_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Crying Obsidian Variant
    public static Block CRYING_OBSIDIAN_TILES;

    public static Block DIRT_BRICKS;
    public static SlabBlock DIRT_BRICK_SLAB = new SlabBlock(Settings.DIRT_BRICKS);
    public static BlockItem DIRT_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.DIRT_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static PublicStairsBlock() DIRT_BRICK_STAIRS = new PublicStairsBlock()(Blocks.DIRT.getDefaultState(), AbstractBlock.Settings.copy(DIRT).strength(2.0F, 6.0F));
    public static BlockItem DIRT_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DIRT_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static Block MOSSY_DIRT_BRICKS;
    public static SlabBlock MOSSY_DIRT_BRICK_SLAB = new SlabBlock(Settings.DIRT_BRICKS);
    public static BlockItem MOSSY_DIRT_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static PublicStairsBlock() MOSSY_DIRT_BRICK_STAIRS = new PublicStairsBlock()(Blocks.DIRT.getDefaultState(), AbstractBlock.Settings.copy(DIRT).strength(2.0F, 6.0F));
    public static BlockItem MOSSY_DIRT_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static Block CHISELED_DIRT;
    public static Block DIRT_TILES;

    //Basalt Variants
    public static Block CHISELED_BASALT;
    public static Block BASALT_TILES;
    public static Block POLISHED_DIRT;

     */

    //Dripstone
    public static Block DRIPSTONE_SLAB = register("dripstone_slab", new SlabBlock(Settings.DRIPSTONE));
    public static Block DRIPSTONE_STAIRS = register("dripstone_stairs", new PublicStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.DRIPSTONE_BLOCK)));

    //Amethyst Variants
    public static Block DRIPPING_AMETHYST = register("dripping_amethyst", new Block(Settings.AMETHYST));
    public static Block CHISELED_AMETHYST = register("chiseled_amethyst", new Block(Settings.AMETHYST));
    public static Block AMETHYST_PILLAR = register("amethyst_pillar", new PillarBlock(Settings.AMETHYST));

    //Amethyst Bricks
    public static Block AMETHYST_BRICKS = register("amethyst_bricks", new Block(Settings.AMETHYST));
    public static Block AMETHYST_BRICK_SLAB = register("amethyst_brick_slab", new SlabBlock(Settings.AMETHYST));
    public static Block AMETHYST_BRICK_STAIRS = register("amethyst_brick_stairs", new PublicStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)));

    //Dripstone Variants
    public static Block CHISELED_DRIPSTONE = register("chiseled_dripstone", new Block(Settings.DRIPSTONE));
    public static Block DRIPSTONE_BRICKS = register("dripstone_bricks", new Block(Settings.DRIPSTONE));

    //Polished Dripstone
    public static Block POLISHED_DRIPSTONE = register("polished_dripstone", new Block(Settings.DRIPSTONE));
    public static Block POLISHED_DRIPSTONE_SLAB = register("polished_dripstone_slab", new SlabBlock(Settings.AMETHYST));
    public static Block POLISHED_DRIPSTONE_STAIRS = register("polished_dripstone_stairs", new PublicStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)));

    //Crying Obsidian Variants
    public static Block CRYING_OBSIDIAN_TILES = register("crying_obsidian_tiles", new Block(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN)));

    //Dirt Bricks
    public static Block DIRT_BRICKS = register("dirt_bricks", new Block(Settings.DIRT_BRICKS));
    public static Block DIRT_BRICK_SLAB = register("dirt_brick_slab", new SlabBlock(Settings.DIRT_BRICKS));
    public static Block DIRT_BRICK_STAIRS = register("dirt_brick_stairs", new PublicStairsBlock(Blocks.DIRT.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)));
    public static Block MOSSY_DIRT_BRICKS = register("mossy_dirt_bricks", new Block(Settings.DIRT_BRICKS));
    public static Block MOSSY_DIRT_BRICK_SLAB = register("mossy_dirt_brick_slab", new SlabBlock(Settings.DIRT_BRICKS));
    public static Block MOSSY_DIRT_BRICK_STAIRS = register("mossy_dirt_brick_stairs", new PublicStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)));
    public static Block CHISELED_DIRT = register("chiseled_dirt", new Block(Settings.DIRT_BRICKS));
    public static Block DIRT_TILES = register("dirt_tiles", new Block(Settings.DIRT_BRICKS));
    public static Block POLISHED_DIRT = register("polished_dirt", new Block(Settings.DIRT_BRICKS));

    //Basalt Variants
    public static Block CHISELED_BASALT = register("chiseled_basalt", new Block(Settings.BASALT));
    public static Block BASALT_TILES = register("basalt_tiles", new Block(Settings.BASALT));

    public static class Settings {
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

    private static Block register(String id, Block block, boolean registerItem) {
        Block registered = Registry.register(Registry.BLOCK, new Identifier(Assembly.MOD_ID, id), block);
        if (registerItem) {
            Registry.register(Registry.ITEM, new Identifier(Assembly.MOD_ID, id), new BlockItem(registered, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        }
        return registered;
    }

    private static Block register(String id, Block block) {
        return register(id, block, false);
    }
}