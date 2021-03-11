package com.github.evoslab.assembly;

import com.github.evoslab.assembly.registry.AssemblyBlocks;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Assembly implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "assembly";
    public static final String MOD_NAME = "Assembly";

    @Override
    public void onInitialize() {

        new AssemblyBlocks();
        AssemblyBlocks.init();
        log(Level.INFO, "Initializing");
        //TODO: Initializer
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}