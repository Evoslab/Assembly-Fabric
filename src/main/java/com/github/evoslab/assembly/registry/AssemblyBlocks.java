package com.github.evoslab.assembly.registry;

import com.github.evoslab.assembly.blocks.AssemblyStairsBlock;
import com.github.evoslab.assembly.json.AssemblyGenerator;
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

    public static Block DIRT_BRICKS;
    public static Block MOSSY_DIRT_BRICKS;
    public static Block CHISELED_DIRT;
    public static Block DIRT_TILES;

    private static final AssemblyGenerator generator = new AssemblyGenerator(MOD_ID);

    //Amethyst Variants
    public static Block DRIPPING_AMETHYST;
    public static Block CHISELED_AMETHYST;
    public static PillarBlock AMETHYST_PILLAR = new PillarBlock(Properties.AMETHYST);
    public static BlockItem AMETHYST_PILLAR_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Amethyst Bricks
    public static Block AMETHYST_BRICKS;
    public static SlabBlock AMETHYST_BRICK_SLAB = new SlabBlock(Properties.AMETHYST);
    public static BlockItem AMETHYST_BRICK_SLAB_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static AssemblyStairsBlock AMETHYST_BRICKS_STAIRS = new AssemblyStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(DRIPSTONE_BLOCK));
    public static BlockItem AMETHYST_BRICKS_STAIRS_ITEM = new BlockItem(AssemblyBlocks.AMETHYST_BRICKS_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Dripstone Variants
    public static Block CHISELED_DRIPSTONE;
    public static Block DRIPSTONE_BRICKS;

    //Polished Dripstone
    public static Block POLISHED_DRIPSTONE;
    public static SlabBlock POLISHED_DRIPSTONE_SLAB = new SlabBlock(Properties.DRIPSTONE);
    public static BlockItem POLISHED_DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    //public static AssemblyStairsBlock POLISHED_DRIPSTONE_STAIRS = new AssemblyStairsBlock(DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_DRIPSTONE));
    //public static BlockItem POLISHED_DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Dripstone
    public static SlabBlock DRIPSTONE_SLAB = new SlabBlock(Properties.DRIPSTONE);
    public static BlockItem DRIPSTONE_SLAB_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static AssemblyStairsBlock DRIPSTONE_STAIRS = new AssemblyStairsBlock(DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(DRIPSTONE_BLOCK));
    public static BlockItem DRIPSTONE_STAIRS_ITEM = new BlockItem(AssemblyBlocks.DRIPSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Crying Obsidian Variant
    public static Block CRYING_OBSIDIAN_TILES;

    //Basalt Variants
    public static Block CHISELED_BASALT;
    public static Block BASALT_TILES;

    public static void RegisterAssemblyBlocks() {

        //Amethyst Variants
        DRIPPING_AMETHYST = generator.block.registerBlandBlock(new Block(Properties.AMETHYST), "dripping_amethyst");
        CHISELED_AMETHYST = generator.block.registerBlandBlock(new Block(Properties.AMETHYST), "chiseled_amethyst");
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_pillar"), AMETHYST_PILLAR_ITEM);

        //Amethyst Bricks
        AMETHYST_BRICKS = generator.block.registerBlandBlock(new Block(Properties.AMETHYST), "amethyst_bricks");
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_brick_slab"), AMETHYST_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_brick_slab"), AMETHYST_BRICK_SLAB_ITEM);
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amethyst_brick_stairs"), AMETHYST_BRICKS_STAIRS);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_brick_stairs"), AMETHYST_BRICKS_STAIRS_ITEM);

        //Dripstone Variants
        CHISELED_DRIPSTONE = generator.block.registerBlandBlock(new Block(Properties.DRIPSTONE), "chiseled_dripstone");
        DRIPSTONE_BRICKS = generator.block.registerBlandBlock(new Block(Properties.DRIPSTONE), "dripstone_bricks");

        //Polished Dripstone
        POLISHED_DRIPSTONE = generator.block.registerBlandBlock(new Block(Properties.DRIPSTONE), "polished_dripstone");
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dripstone_slab"), POLISHED_DRIPSTONE_SLAB);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dripstone_slab"), POLISHED_DRIPSTONE_SLAB_ITEM);
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_dripstone_stairs"), POLISHED_DRIPSTONE_STAIRS);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_dripstone_stairs"), POLISHED_DRIPSTONE_STAIRS_ITEM);

        //Dripstone
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dripstone_slab"), DRIPSTONE_SLAB);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dripstone_slab"), DRIPSTONE_SLAB_ITEM);
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dripstone_stairs"), DRIPSTONE_STAIRS);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dripstone_stairs"), DRIPSTONE_STAIRS_ITEM);

        //Crying Obsidian Variants
        CRYING_OBSIDIAN_TILES = generator.block.registerBlandBlock(new Block(Properties.CRYING_OBSIDIANS), "crying_obsidian_tiles");

        //Dirt Bricks
        DIRT_BRICKS = generator.block.registerBlandBlock(new Block(Properties.DIRT_BRICKS), "dirt_bricks");
        MOSSY_DIRT_BRICKS = generator.block.registerBlandBlock(new Block(Properties.DIRT_BRICKS), "mossy_dirt_bricks");
        CHISELED_DIRT = generator.block.registerBlandBlock(new Block(Properties.DIRT_BRICKS), "chiseled_dirt");
        DIRT_TILES = generator.block.registerBlandBlock(new Block(Properties.DIRT_BRICKS), "dirt_tiles");

        //Basalt Variants
        CHISELED_BASALT = generator.block.registerBlandBlock(new Block(Properties.BASALT), "chiseled_basalt");
        BASALT_TILES = generator.block.registerBlandBlock(new Block(Properties.BASALT), "basalt_tiles");

    }

    public static class Properties {
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
                .copyOf(DRIPSTONE_BLOCK);

        public static final FabricBlockSettings BASALT = FabricBlockSettings
                .copyOf(POLISHED_BASALT);

        public static final FabricBlockSettings CRYING_OBSIDIANS = FabricBlockSettings
                .copyOf(CRYING_OBSIDIAN);

    }

}
