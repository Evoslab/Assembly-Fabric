package com.github.evoslab.assembly.json;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class RegistrableResults<T> extends AbstractMap<Identifier, T> {
    protected final Map<Identifier, T> underlying;
    protected final Registry<T> registry;

    protected RegistrableResults(Map<Identifier, T> underlying, Registry<T> registry) {
        this.underlying = underlying;
        this.registry = registry;
    }

    public void register() {
        underlying.forEach((id, t) -> Registry.register(registry, id, t));
    }

    @NotNull
    @Override
    public Set<Entry<Identifier, T>> entrySet() {
        return underlying.entrySet();
    }
}
