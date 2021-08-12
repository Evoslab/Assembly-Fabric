package com.evoslab.assembly.core;

import com.evoslab.assembly.core.registry.AssemblyBlocks;
import com.google.common.collect.ImmutableList;
import com.google.common.reflect.Reflection;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Assembly implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "assembly";
    public static final String MOD_NAME = "Assembly";

    @Override
    @SuppressWarnings("UnstableApiUsage")
    public void onInitialize() {
        Reflection.initialize(
                AssemblyBlocks.class
        );

        log(Level.INFO, "Assemble Blocks!");
    }

    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, id(id), configuredFeature);
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}