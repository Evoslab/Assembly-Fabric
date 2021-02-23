package com.github.evoslab.assembly.json;

import net.devtech.arrp.json.blockstate.JState;
import net.devtech.arrp.json.loot.JLootTable;
import net.devtech.arrp.json.models.JModel;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;

import java.util.function.Function;

public class BlockGeneratorPreset {

    protected Function<Identifier, JState> blockStateGetter;
    protected Function<Identifier, JModel> modelGetter;
    protected Function<Identifier, JLootTable> lootTableGetter;
    protected Function<Identifier, Block> blockGetter;

    @Contract(value = "_ -> new")
    public BlockGeneratorPreset blockState(Function<Identifier, JState> getter) {
        return this.modify().blockState(getter);
    }

    @Contract(value = "_ -> new")
    public BlockGeneratorPreset model(Function<Identifier, JModel> getter) {
        return this.modify().model(getter);
    }

    @Contract(value = "_ -> new")
    public BlockGeneratorPreset lootTable(Function<Identifier, JLootTable> getter) {
        return this.modify().lootTable(getter);
    }

    @Contract(value = "_ -> new")
    public BlockGeneratorPreset block(Function<Identifier, Block> getter) {
        return this.modify().block(getter);
    }

    @Contract(value = "_ -> new")
    public BlockGeneratorPreset block(Block block) {
        return this.modify().block(block);
    }

    @Contract(value = "_ -> new")
    public BlockGeneratorPreset block(AbstractBlock.Settings settings) {
        return this.modify().block(settings);
    }

    @Contract(value = "-> new")
    public Modified modify() { return new Modified(this); }

    public static class Modified extends BlockGeneratorPreset {
        protected Modified(BlockGeneratorPreset preset) {
            this.blockStateGetter = preset.blockStateGetter;
            this.modelGetter = preset.modelGetter;
            this.lootTableGetter = preset.lootTableGetter;
            this.blockGetter = preset.blockGetter;
        }

        @Contract(value = "_ -> this", mutates = "this")
        public BlockGeneratorPreset blockState(Function<Identifier, JState> getter) {
            this.blockStateGetter = getter;
            return this;
        }

        @Contract(value = "_ -> this", mutates = "this")
        public BlockGeneratorPreset model(Function<Identifier, JModel> getter) {
            this.modelGetter = getter;
            return this;
        }

        @Contract(value = "_ -> this", mutates = "this")
        public BlockGeneratorPreset lootTable(Function<Identifier, JLootTable> getter) {
            this.lootTableGetter = getter;
            return this;
        }

        @Contract(value = "_ -> this", mutates = "this")
        public BlockGeneratorPreset block(Function<Identifier, Block> getter) {
            this.blockGetter = getter;
            return this;
        }

        @Contract(value = "_ -> this", mutates = "this")
        public BlockGeneratorPreset block(Block block) {
            this.blockGetter = ignored -> block;
            return this;
        }

        @Contract(value = "_ -> this", mutates = "this")
        public BlockGeneratorPreset block(AbstractBlock.Settings settings) {
            return this.block(new Block(settings));
        }
    }
}
