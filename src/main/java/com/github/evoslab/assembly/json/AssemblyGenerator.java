package com.github.evoslab.assembly.json;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;

import java.util.Random;

public final class AssemblyGenerator {

    private final String modid;
    private final RuntimeResourcePack resourcePack;
    public final BlockGenerator block;
    public final ItemGenerator item;

    public AssemblyGenerator(String modid) {
        this(modid, RuntimeResourcePack.create(modid + ":assembly_generator_" + generateRandomId()));
    }

    public AssemblyGenerator(String modid, RuntimeResourcePack resourcePack) {
        this.modid = modid;
        this.resourcePack = resourcePack;
        RRPCallback.EVENT.register(a -> a.add(resourcePack));
        block = new BlockGenerator(modid, resourcePack);
        item = new ItemGenerator(modid, resourcePack);
    }

    private static String generateRandomId() {
        return String.format("%08x", new Random().nextInt());
    }

    public RuntimeResourcePack getResourcePack() {
        return resourcePack;
    }
}