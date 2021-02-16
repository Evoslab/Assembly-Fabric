package com.github.evoslab.assembly.world.features;
/*
import com.github.evoslab.assembly.Assembly;
import com.github.evoslab.assembly.registry.AssemblyConfiguredFeatures;
import com.github.evoslab.assembly.world.AssemblyGeodeFeature;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;

public class AssemblyFeatures {

    public static Feature<GeodeFeatureConfig> DRIPPING_GEODE = new AssemblyGeodeFeature(GeodeFeatureConfig.CODEC);

    public static void registerFeatures() {
        register("dripping_geode", DRIPPING_GEODE);
        RegistryKey<ConfiguredFeature<?, ?>> drippingGeode = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Assembly.MOD_ID, "dripping_geode"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, drippingGeode.getValue(), AssemblyConfiguredFeatures.DRIPPING_GEODE);

        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, drippingGeode);
    }


    private static void register(String name, Feature<?> feature) {
        Registry.register(Registry.FEATURE, name, feature);
    }
}
 */