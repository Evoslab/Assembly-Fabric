package com.github.evoslab.assembly.json;

import com.google.common.collect.ImmutableList;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.devtech.arrp.json.blockstate.JState;
import net.devtech.arrp.json.loot.JLootTable;
import net.devtech.arrp.json.models.JModel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static net.devtech.arrp.json.blockstate.JState.variant;
import static net.devtech.arrp.json.models.JModel.*;

public class BlockGenerator extends Generator<Block, BlockGenerator> {

    private Function<Identifier, JState> blockStateGetter;
    private Function<Identifier, JModel> modelGetter;
    private Function<Identifier, JLootTable> lootTableGetter;
    private Function<Identifier, Block> blockGetter;
    private List<Identifier> ids;

    public BlockGenerator(String modid, RuntimeResourcePack resourcePack) {
        super(modid, resourcePack);
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator setIds(List<Identifier> ids) {
        this.ids = ImmutableList.copyOf(ids);
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator setIds(Identifier... ids) {
        this.ids = ImmutableList.copyOf(ids);
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator setIds(String... paths) {
        //noinspection UnstableApiUsage
        this.ids = Arrays.stream(paths)
                .map(s -> new Identifier(namespace, s))
                .collect(ImmutableList.toImmutableList());
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator blockState(Function<Identifier, JState> getter) {
        this.blockStateGetter = getter;
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator model(Function<Identifier, JModel> getter) {
        this.modelGetter = getter;
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator lootTable(Function<Identifier, JLootTable> getter) {
        this.lootTableGetter = getter;
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator block(Function<Identifier, Block> getter) {
        this.blockGetter = getter;
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator block(Block block) {
        this.blockGetter = ignored -> block;
        return this;
    }

    @Contract(value = "_ -> this", mutates = "this")
    public BlockGenerator block(AbstractBlock.Settings settings) {
        return this.block(new Block(settings));
    }

    public BlockGenerator applyPreset(Function preset) {
        this.modelGetter = preset;
        return this;
    }

    @Override
    public RegistrableResults<Block> build() {
        return null;
    }


    /**
     * Registers a block that is mostly uninteresting, like a true decoration block
     * hanging there in the backyard.
     */
    public <T extends Block> T registerBlandBlock(T block, String path) {
        Identifier id = new Identifier(namespace, path);
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        resourcePack.addBlockState(
                JState.state()
                        .add(variant()
                                .put("", JState.model(prefixPathAsString(id, "block")))
                        ),
                id
        );

        resourcePack.addModel(
                JModel.model("minecraft:block/cube_all")
                        .textures(textures()
                                .var("all", prefixPathAsString(id, "block"))
                        ),
                prefixPath(id, "block")
        );

        resourcePack.addModel(
                JModel.model(prefixPathAsString(id, "block")),
                prefixPath(id, "item")
        );

        return block;
    }

    public <T extends SlabBlock> T registerBlandSlabBlock(T slabBlock, String path) {
        Identifier id = new Identifier(namespace, path);
        Registry.register(Registry.BLOCK, id, slabBlock);
        Registry.register(Registry.ITEM, id, new BlockItem(slabBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        return slabBlock;
    }

    public <T extends SlabBlock> T registerBlandSlabBlock2(T slabBlock, String path) {
        Identifier id = new Identifier(namespace, path);
        Identifier idSlab = new Identifier(namespace, path + "_slab");
        Registry.register(Registry.BLOCK, id, slabBlock);
        Registry.register(Registry.ITEM, id, new BlockItem(slabBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

        resourcePack.addBlockState(
                JState.state()
                        .add(variant()
                                .put("type=bottom", JState.model(prefixPathAsStringSlab(id, "block")))
                                .put("type=double", JState.model(prefixPathAsStringS(id, "block")))
                                .put("type=top", JState.model(prefixPathAsStringSlab(id, "block")))
                        ),
                idSlab
        );

        resourcePack.addModel(
                JModel.model("minecraft:block/slab")
                        .textures(textures()
                                .var("bottom", prefixPathAsStringS(id, "block"))
                                .var("top", prefixPathAsStringS(id, "block"))
                                .var("side", prefixPathAsStringS(id, "block"))
                        ),
                prefixPathSlab(id, "block")
        );

        resourcePack.addModel(
                JModel.model("minecraft:block/slab_top")
                        .textures(textures()
                                .var("bottom", prefixPathAsStringS(id, "block"))
                                .var("top", prefixPathAsStringS(id, "block"))
                                .var("side", prefixPathAsStringS(id, "block"))
                        ),
                prefixPathSlabTop(id, "block")
        );

        resourcePack.addModel(
                JModel.model(prefixPathAsStringSlab(id, "block")),
                prefixPathSlab(id, "item")
        );

        return slabBlock;
    }

}