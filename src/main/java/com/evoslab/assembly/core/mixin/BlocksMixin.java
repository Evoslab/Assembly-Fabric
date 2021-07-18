package com.evoslab.assembly.core.mixin;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Blocks.class)
public class BlocksMixin {
    @Inject(method = "register", at = @At("HEAD"), cancellable = true)
    private static void register(String id, Block block, CallbackInfoReturnable<Block> cir) {
        if (id.equals("dripstone_block")) {
            cir.setReturnValue(Registry.register(Registry.BLOCK, id, new PillarBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool().strength(1.5F, 1.0F))));
        }
    }
}