package com.github.evoslab.assembly;

import com.github.evoslab.assembly.json.AssemblyGenerator;
import com.github.evoslab.assembly.registry.AssemblyBlocks;
//import com.github.evoslab.assembly.world.features.AssemblyFeatures;
import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.devtech.arrp.json.lang.JLang;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.devtech.arrp.api.RuntimeResourcePack.id;

public class Assembly implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "assembly";
    public static final String MOD_NAME = "Assembly";

    @Override
    public void onInitialize() {

        new AssemblyBlocks();
        AssemblyBlocks.RegisterAssemblyBlocks();
        log(Level.INFO, "Initializing");
        //TODO: Initializer
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}