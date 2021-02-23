package com.github.evoslab.assembly.json;

import net.devtech.arrp.api.RuntimeResourcePack;
import net.devtech.arrp.json.models.JModel;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.devtech.arrp.json.models.JModel.textures;

public class ItemGenerator extends Generator {
    public ItemGenerator(String modid, RuntimeResourcePack resourcePack) {
        super(modid, resourcePack);
    }

    @Override
    public RegistrableResults<Item> build() {
        return null;
    }

    public <T extends Item> T registerBlandItem(T item, String path) {
        Identifier id = new Identifier(namespace, path);

        Registry.register(Registry.ITEM, id, item);

        resourcePack.addModel(
                JModel.model("minecraft:item/generated")
                        .textures(textures()
                                .layer0(prefixPathAsString(id, "item"))
                        ),
                prefixPath(id, "item")
        );

        return item;
    }

    public Item registerBlankItem(String path) {
        return registerBlandItem(new Item(new Item.Settings()), path);
    }
}
