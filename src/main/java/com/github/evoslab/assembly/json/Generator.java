package com.github.evoslab.assembly.json;

import net.devtech.arrp.api.RuntimeResourcePack;
import net.minecraft.util.Identifier;

public abstract class Generator<T, This extends Generator<T, This>> {

    public final String namespace;
    protected final RuntimeResourcePack resourcePack;

    public Generator(String namespace, RuntimeResourcePack resourcePack) {
        this.namespace = namespace;
        this.resourcePack = resourcePack;
    }

    public abstract RegistrableResults<T> build();

    @SuppressWarnings("unchecked")
    public This buildAndOutput(RegistrableResults<T> to) {
        to.putAll(this.build());
        return (This)this;
    }

    protected static Identifier prefixPath(Identifier id, String prefix) {
        return new Identifier(id.getNamespace(), prefix + "/" + id.getPath());
    }

    protected static Identifier prefixPathSlab(Identifier id, String prefix) {
        return new Identifier(id.getNamespace(), prefix + "/" + id.getPath() + "_slab");
    }

    protected static Identifier prefixPathSlabTop(Identifier id, String prefix) {
        return new Identifier(id.getNamespace(), prefix + "/" + id.getPath() + "_slab_top");
    }

    protected static Identifier prefixPathLeaf(Identifier id, String prefix) {
        return new Identifier(id.getNamespace(), prefix + "/" + id.getPath() + "_leaf");
    }

    protected static String prefixPathAsString(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath();
    }

    protected static String prefixPathAsStringSide(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath() + "_side";
    }

    protected static String prefixPathAsStringBack(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath() + "_back";
    }

    protected static String prefixPathAsStringTop(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath() + "_top";
    }

    protected static String prefixPathAsStringBottom(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath() + "_bottom";
    }

    protected static String prefixPathAsStringSlab(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath() + "_slab";
    }

    protected static String prefixPathAsStringSlabTop(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath() + "_slab_top";
    }

    protected static String prefixPathAsStringS(Identifier id, String prefix) {
        return id.getNamespace() + ":" + prefix + "/" + id.getPath() + "s";
    }

}
