package com.github.evoslab.assembly.registry;

import com.github.evoslab.cookiecore.blocks.main.CookieCoreStairsBlock;
import com.github.evoslab.cookiecore.datagen.MainGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.evoslab.assembly.Assembly.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class AssemblyBlocks {

    private static final MainGenerator generator = new MainGenerator(MOD_ID);

    //Dripstone
    public static SlabBlock DRIPSTONE_SLAB = new SlabBlock(Properties.DRIPSTONE);
    public static BlockItem DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static CookieCoreStairsBlock DRIPSTONE_STAIRS = new CookieCoreStairsBlock(DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(DRIPSTONE_BLOCK));
    public static BlockItem DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Dripstone Variants
    public static Block CHISELED_DRIPSTONE;
    public static Block DRIPSTONE_BRICKS;

    //Polished Dripstone
    public static Block POLISHED_DRIPSTONE;
    public static SlabBlock POLISHED_DRIPSTONE_SLAB = new SlabBlock(Properties.DRIPSTONE);
    public static BlockItem POLISHED_DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static CookieCoreStairsBlock POLISHED_DRIPSTONE_STAIRS = new CookieCoreStairsBlock(DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK));
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
    public static CookieCoreStairsBlock AMETHYST_BRICK_STAIRS;
    public static BlockItem AMETHYST_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Crying Obsidian Variant
    public static Block CRYING_OBSIDIAN_TILES;

    public static Block DIRT_BRICKS;
    public static SlabBlock DIRT_BRICK_SLAB = new SlabBlock(Properties.DIRT_BRICKS);
    public static BlockItem DIRT_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.DIRT_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static CookieCoreStairsBlock DIRT_BRICK_STAIRS = new CookieCoreStairsBlock(DIRT.getDefaultState(), AbstractBlock.Settings.copy(DIRT).strength(2.0F, 6.0F));
    public static BlockItem DIRT_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DIRT_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static Block MOSSY_DIRT_BRICKS;
    public static SlabBlock MOSSY_DIRT_BRICK_SLAB = new SlabBlock(Properties.DIRT_BRICKS);
    public static BlockItem MOSSY_DIRT_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static CookieCoreStairsBlock MOSSY_DIRT_BRICK_STAIRS = new CookieCoreStairsBlock(DIRT.getDefaultState(), AbstractBlock.Settings.copy(DIRT).strength(2.0F, 6.0F));
    public static BlockItem MOSSY_DIRT_BRICK_STAIRS_ITEM = new BlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static Block CHISELED_DIRT;
    public static Block DIRT_TILES;

    //Basalt Variants
    public static Block CHISELED_BASALT;
    public static Block BASALT_TILES;
    public static Block POLISHED_DIRT;

    public static void init() {

        //Dripstone
        DRIPSTONE_SLAB = generator.block.registerSlabBlock(new SlabBlock(Properties.DRIPSTONE), "dripstone_slab","");
        DRIPSTONE_STAIRS = generator.block.registerSlabBlock(new CookieCoreStairsBlock(DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK)), "dripstone_stairs","");

        //Amethyst Variants
        DRIPPING_AMETHYST = generator.block.registerAllSidedBlock(new Block(Properties.AMETHYST), "dripping_amethyst","");
        CHISELED_AMETHYST = generator.block.registerAllSidedBlock(new Block(Properties.AMETHYST), "chiseled_amethyst","");
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR_ITEM);

        //Amethyst Bricks
        AMETHYST_BRICKS = generator.block.registerAllSidedBlock(new Block(Properties.AMETHYST), "amethyst_bricks","");
        AMETHYST_BRICK_SLAB = generator.block.registerSlabBlock(new SlabBlock(Properties.AMETHYST), "amethyst_brick_slab","");
        AMETHYST_BRICK_STAIRS = generator.block.registerSlabBlock(new CookieCoreStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.copy(AMETHYST_BRICKS)), "amethyst_brick_stairs","");

        //Dripstone Variants
        CHISELED_DRIPSTONE = generator.block.registerAllSidedBlock(new Block(Properties.DRIPSTONE), "chiseled_dripstone","");
        DRIPSTONE_BRICKS = generator.block.registerAllSidedBlock(new Block(Properties.DRIPSTONE), "dripstone_bricks","");

        //Polished Dripstone
        POLISHED_DRIPSTONE = generator.block.registerAllSidedBlock(new Block(Properties.DRIPSTONE), "polished_dripstone","");
        POLISHED_DRIPSTONE_SLAB = generator.block.registerSlabBlock(new SlabBlock(Properties.DRIPSTONE), "polished_dripstone_slab","");
        POLISHED_DRIPSTONE_STAIRS = generator.block.registerSlabBlock(new CookieCoreStairsBlock(POLISHED_DRIPSTONE.getDefaultState(), FabricBlockSettings.copy(POLISHED_DRIPSTONE)), "polished_dripstone_stairs","");

        //Crying Obsidian Variants
        CRYING_OBSIDIAN_TILES = generator.block.registerAllSidedBlock(new Block(Properties.CRYING_OBSIDIANS), "crying_obsidian_tiles","");

        //Dirt Bricks
        DIRT_BRICKS = generator.block.registerAllSidedBlock(new Block(Properties.DIRT_BRICKS), "dirt_bricks","");
        DIRT_BRICK_SLAB = generator.block.registerSlabBlock(new SlabBlock(Properties.DIRT_BRICKS), "dirt_brick_slab","");
        DIRT_BRICK_STAIRS = generator.block.registerSlabBlock(new CookieCoreStairsBlock(DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIRT_BRICKS)), "dirt_brick_stairs","");
        MOSSY_DIRT_BRICKS = generator.block.registerAllSidedBlock(new Block(Properties.DIRT_BRICKS), "mossy_dirt_bricks","");
        MOSSY_DIRT_BRICK_SLAB = generator.block.registerSlabBlock(new SlabBlock(Properties.DIRT_BRICKS), "mossy_dirt_brick_slab","");
        DIRT_BRICK_STAIRS = generator.block.registerSlabBlock(new CookieCoreStairsBlock(MOSSY_DIRT_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_DIRT_BRICKS)), "mossy_dirt_brick_stairs","");
        CHISELED_DIRT = generator.block.registerAllSidedBlock(new Block(Properties.DIRT_BRICKS), "chiseled_dirt","");
        DIRT_TILES = generator.block.registerAllSidedBlock(new Block(Properties.DIRT_BRICKS), "dirt_tiles","");
        POLISHED_DIRT = generator.block.registerAllSidedBlock(new Block(Properties.DIRT_BRICKS), "polished_dirt","");

        //Basalt Variants
        CHISELED_BASALT = generator.block.registerAllSidedBlock(new Block(Properties.BASALT), "chiseled_basalt","");
        BASALT_TILES = generator.block.registerAllSidedBlock(new Block(Properties.BASALT), "basalt_tiles","");

    }

    static class Properties {
        public static final FabricBlockSettings DIRT_BRICKS = FabricBlockSettings
                .copyOf(DIRT)
                .breakByHand(true)
                .breakByTool(FabricToolTags.SHOVELS)
                .strength(2.0F, 6.0F);

        public static final FabricBlockSettings AMETHYST = FabricBlockSettings
                .of(Material.AMETHYST, MapColor.PURPLE)
                .strength(1.5F)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .requiresTool();

        public static final FabricBlockSettings DRIPSTONE = FabricBlockSettings
                .copyOf(DRIPSTONE_BLOCK)
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK);

        public static final FabricBlockSettings BASALT = FabricBlockSettings
                .copyOf(POLISHED_BASALT)
                .sounds(BlockSoundGroup.BASALT);

        public static final FabricBlockSettings CRYING_OBSIDIANS = FabricBlockSettings
                .copyOf(CRYING_OBSIDIAN);

    }

}
