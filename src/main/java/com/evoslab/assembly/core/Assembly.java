package com.evoslab.assembly.core;

import com.evoslab.assembly.core.registry.AssemblyBlocks;
import com.google.common.reflect.Reflection;
import net.fabricmc.api.ModInitializer;
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

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}