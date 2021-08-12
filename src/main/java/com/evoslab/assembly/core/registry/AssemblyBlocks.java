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
    // Dripstone //

    public static Block DRIPSTONE_SLAB = register("dripstone_slab", new SlabBlock(Settings.DRIPSTONE));
    public static Block DRIPSTONE_STAIRS = register("dripstone_stairs", new PublicStairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), Settings.DRIPSTONE));

    // Dripstone Variants //

    public static Block CHISELED_DRIPSTONE = register("chiseled_dripstone", new Block(Settings.DRIPSTONE));
    public static Block DRIPSTONE_BRICKS = register("dripstone_bricks", new Block(Settings.DRIPSTONE));

    // Polished Dripstone //

    public static Block POLISHED_DRIPSTONE = register("polished_dripstone", new Block(Settings.DRIPSTONE));
    public static Block POLISHED_DRIPSTONE_SLAB = register("polished_dripstone_slab", new SlabBlock(Settings.DRIPSTONE));
    public static Block POLISHED_DRIPSTONE_STAIRS = register("polished_dripstone_stairs", new PublicStairsBlock(POLISHED_DRIPSTONE.getDefaultState(), Settings.DRIPSTONE));

    // Amethyst Variants //

    public static Block DRIPPING_AMETHYST = register("dripping_amethyst", new Block(Settings.AMETHYST));
    public static Block CHISELED_AMETHYST = register("chiseled_amethyst", new Block(Settings.AMETHYST));
    public static Block AMETHYST_PILLAR = register("amethyst_pillar", new PillarBlock(Settings.AMETHYST));

    // Amethyst Bricks //

    public static Block AMETHYST_BRICKS = register("amethyst_bricks", new Block(Settings.AMETHYST));
    public static Block AMETHYST_BRICK_SLAB = register("amethyst_brick_slab", new SlabBlock(Settings.AMETHYST));
    public static Block AMETHYST_BRICK_STAIRS = register("amethyst_brick_stairs", new PublicStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), Settings.AMETHYST));

    // Crying Obsidian Variants //

    public static Block CRYING_OBSIDIAN_TILES = register("crying_obsidian_tiles", new Block(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN)));

    // Dirt Bricks //

    public static Block DIRT_BRICKS = register("dirt_bricks", new Block(Settings.DIRT_BRICKS));
    public static Block DIRT_BRICK_SLAB = register("dirt_brick_slab", new SlabBlock(Settings.DIRT_BRICKS));
    public static Block DIRT_BRICK_STAIRS = register("dirt_brick_stairs", new PublicStairsBlock(DIRT_BRICKS.getDefaultState(), Settings.DIRT_BRICKS));
    public static Block MOSSY_DIRT_BRICKS = register("mossy_dirt_bricks", new Block(Settings.DIRT_BRICKS));
    public static Block MOSSY_DIRT_BRICK_SLAB = register("mossy_dirt_brick_slab", new SlabBlock(Settings.DIRT_BRICKS));
    public static Block MOSSY_DIRT_BRICK_STAIRS = register("mossy_dirt_brick_stairs", new PublicStairsBlock(MOSSY_DIRT_BRICKS.getDefaultState(), Settings.DIRT_BRICKS));
    public static Block CHISELED_DIRT = register("chiseled_dirt", new Block(Settings.DIRT_BRICKS));
    public static Block DIRT_TILES = register("dirt_tiles", new Block(Settings.DIRT_BRICKS));
    public static Block POLISHED_DIRT = register("polished_dirt", new Block(Settings.DIRT_BRICKS));

    // Basalt Variants //

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

    public static <T extends Block> T register(String path, T block) {
        Registry.register(Registry.BLOCK, Assembly.id(path), block);
        Registry.register(Registry.ITEM, Assembly.id(path), new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        return block;
    }
}