package com.github.evoslab.assembly.registry;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.minecraft.util.Identifier;

import static com.github.evoslab.assembly.Assembly.MOD_ID;
import static net.devtech.arrp.json.loot.JLootTable.*;

public class AssemblyJson {

    public static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create("assembly:loottable");

    public static void RegisterAssemblyJson(){
/*
        RESOURCE_PACK.addLootTable(myId("assembly:blocks/dripstone_slab"),
                loot("minecraft:block")
                        .pool(pool()
                                .rolls(1)
                                .entry(entry()
                                        .type("minecraft:item")
                                        .name("assembly:dripstone_slab"))
                                .condition(condition("minecraft:survives_explosion")))
        );

        RRPCallback.EVENT.register(a -> a.add(RESOURCE_PACK));
 */

    }

    public static Identifier myId(String path) {
        return new Identifier(MOD_ID, path);
    }

}
