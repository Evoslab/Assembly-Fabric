package com.github.evoslab.assembly.mixin;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Blocks.class)
public class BlocksMixin {

    private static Block register(String id, Block block) {
        if (id.equals("dripstone_block")) {
            return (Block)Registry.register(Registry.BLOCK, id, new PillarBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool().strength(1.5F, 1.0F)));
        }

        return (Block)Registry.register(Registry.BLOCK, id, block);
    }

}