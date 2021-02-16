package com.github.evoslab.assembly.world;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BuddingAmethystBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.*;

public class AssemblyGeodeFeature extends Feature<GeodeFeatureConfig> {
    private static final Direction[] DIRECTIONS = Direction.values();

    public AssemblyGeodeFeature(Codec<GeodeFeatureConfig> codec) {
        super(codec);
    }

    public boolean generate(StructureWorldAccess world, ChunkGenerator chunkGenerator, Random random, BlockPos pos, GeodeFeatureConfig config) {

        int minGenOffset = config.minGenOffset;
        int maxGenOffset = config.maxGenOffset;

        // Return if there is water here, to not generate in oceans.
        if (world.getFluidState(pos.add(0, maxGenOffset / 3, 0)).isStill()) {
            return false;
        } else {
            // A list of positions to generate the geode around
            List<Pair<BlockPos, Integer>> generationPoints = Lists.newLinkedList();

            // Generate distribution points
            int distributionPoints = config.minDistributionPoints + random.nextInt(config.maxDistributionPoints - config.minDistributionPoints);

            DoublePerlinNoiseSampler noiseSampler = DoublePerlinNoiseSampler.create(new ChunkRandom(world.getSeed()), -4, 1.0D);

            List<BlockPos> crackPoints = Lists.newLinkedList();
            double d = (double) distributionPoints / (double)config.maxOuterWallDistance;
            GeodeLayerThicknessConfig layerThicknessConfig = config.layerThicknessConfig;
            GeodeLayerConfig layerConfig = config.layerConfig;
            GeodeCrackConfig crackConfig = config.crackConfig;

            // Create threshold values for each layer. When the distance is less than this value, the specified layer will be generated
            double fillingThreshold = 1.0D / Math.sqrt(layerThicknessConfig.filling);
            double innerLayerThreshold = 1.0D / Math.sqrt(layerThicknessConfig.innerLayer + d);
            double middleLayerThreshold = 1.0D / Math.sqrt(layerThicknessConfig.middleLayer + d);
            double outerLayerThreshold = 1.0D / Math.sqrt(layerThicknessConfig.outerLayer + d);

            // Create the threshold for the crack.
            double crackThreshold = 1.0D / Math.sqrt(crackConfig.baseCrackSize + random.nextDouble() / 2.0D + (distributionPoints > 3 ? d : 0.0D));

            // Generate the crack if the random check succeeds.
            boolean generateCrack = (double)random.nextFloat() < crackConfig.generateCrackChance;

            // Generate the points around which the geode will generate
            for(int points = 0; points < distributionPoints; ++points) {
                int xOffset = config.minOuterWallDistance + random.nextInt(config.maxOuterWallDistance - config.minOuterWallDistance);
                int yOffset = config.minOuterWallDistance + random.nextInt(config.maxOuterWallDistance - config.minOuterWallDistance);
                int zOffset = config.minOuterWallDistance + random.nextInt(config.maxOuterWallDistance - config.minOuterWallDistance);
                generationPoints.add(Pair.of(pos.add(xOffset, yOffset, zOffset), config.minPointOffset + random.nextInt(config.maxPointOffset - config.minPointOffset)));
            }

            // Generate the crack points.
            // The crack can generate in 4 different ways, providing randomness but also providing control over how players will see the geode.
            if (generateCrack) {
                int crackType = random.nextInt(4);

                int crackDistance = distributionPoints * 2 + 1;
                if (crackType == 0) {
                    crackPoints.add(pos.add(crackDistance, 7, 0));
                    crackPoints.add(pos.add(crackDistance, 5, 0));
                    crackPoints.add(pos.add(crackDistance, 1, 0));
                } else if (crackType == 1) {
                    crackPoints.add(pos.add(0, 7, crackDistance));
                    crackPoints.add(pos.add(0, 5, crackDistance));
                    crackPoints.add(pos.add(0, 1, crackDistance));
                } else if (crackType == 2) {
                    crackPoints.add(pos.add(crackDistance, 7, crackDistance));
                    crackPoints.add(pos.add(crackDistance, 5, crackDistance));
                    crackPoints.add(pos.add(crackDistance, 1, crackDistance));
                } else {
                    crackPoints.add(pos.add(0, 7, 0));
                    crackPoints.add(pos.add(0, 5, 0));
                    crackPoints.add(pos.add(0, 1, 0));
                }
            }

            // A list of points to generate crystal buds around
            List<BlockPos> crystalPlacements = Lists.newArrayList();

            // Iterate the area to check each position for generation. By default, this checks a 32x32x32 region.
            Iterator<BlockPos> positions = BlockPos.iterate(pos.add(minGenOffset, minGenOffset, minGenOffset), pos.add(maxGenOffset, maxGenOffset, maxGenOffset)).iterator();

            while(true) {
                while(true) {
                    double generationDistance;
                    double crackDistance;
                    BlockPos currentPos;
                    do {
                        // If we're out of positions, place the amethyst buds and return.
                        if (!positions.hasNext()) {
                            List<BlockState> innerBlocks = layerConfig.innerBlocks;
                            Iterator<BlockPos> placementIterator = crystalPlacements.iterator();

                            while(true) {
                                while(placementIterator.hasNext()) {
                                    BlockPos placementPos = placementIterator.next();

                                    // Choose a random placement state (amethyst bud states) to place
                                    BlockState placementState = innerBlocks.get(random.nextInt(innerBlocks.size()));

                                    for (Direction direction : DIRECTIONS) {
                                        // Check and set facing
                                        if (placementState.contains(Properties.FACING)) {
                                            placementState = placementState.with(Properties.FACING, direction);
                                        }

                                        BlockPos offsettedPlacementPos = placementPos.offset(direction);
                                        BlockState offsetState = world.getBlockState(offsettedPlacementPos);

                                        // Check and set waterlogged
                                        if (placementState.contains(Properties.WATERLOGGED)) {
                                            placementState = placementState.with(Properties.WATERLOGGED, offsetState.getFluidState().isStill());
                                        }

                                        // Check if it can be placed, then place it
                                        if (BuddingAmethystBlock.canGrowIn(offsetState)) {
                                            world.setBlockState(offsettedPlacementPos, placementState, 2);
                                            break;
                                        }

                                    }
                                }

                                return true;
                            }
                        }

                        // Move to the next pos
                        currentPos = positions.next();

                        // Get the noise value at this position, scaled by the noise multiplier
                        double noiseVal = noiseSampler.sample(currentPos.getX(), currentPos.getY(), currentPos.getZ()) * config.noiseMultiplier;

                        // Reset the values
                        generationDistance = 0.0D;
                        crackDistance = 0.0D;

                        // Generate the threshold based on the distance between the current point to the generation points.
                        // This allows the generator to create offsetted spheres, making it look less artifical.
                        Pair<BlockPos, Integer> generationPoint;
                        for(Iterator<Pair<BlockPos, Integer>> generationIterator = generationPoints.iterator(); generationIterator.hasNext(); generationDistance += MathHelper.fastInverseSqrt(currentPos.getSquaredDistance(generationPoint.getFirst()) + (double) generationPoint.getSecond()) + noiseVal) {
                            generationPoint = generationIterator.next();
                        }

                        BlockPos crackPos;
                        for(Iterator<BlockPos> crackIterator = crackPoints.iterator(); crackIterator.hasNext(); crackDistance += MathHelper.fastInverseSqrt(currentPos.getSquaredDistance(crackPos) + (double) crackConfig.crackPointOffset) + noiseVal) {
                            crackPos = crackIterator.next();
                        }
                    } while(generationDistance < outerLayerThreshold);

                    // Generate air for cracks, if we're close to the crack threshold and far enough away from the center (filling threshold)
                    if (generateCrack && crackDistance >= crackThreshold && generationDistance < fillingThreshold) {
                        if (world.getFluidState(currentPos).isEmpty()) {
                            world.setBlockState(currentPos, Blocks.AIR.getDefaultState(), 2);
                        }
                        // Generate the filling, air by default, if the value is greater than the filling threshold.
                    } else if (generationDistance >= fillingThreshold) {
                        world.setBlockState(currentPos, layerConfig.fillingProvider.getBlockState(random, currentPos), 2);
                    } else if (generationDistance >= innerLayerThreshold) {
                        // Generate inner layer, or use alternate inner layer (growth block) if the chance check succeeds.

                        boolean useAlternateInnerLayer = (double)random.nextFloat() < config.useAlternateLayer0Chance;
                        if (useAlternateInnerLayer) {
                            world.setBlockState(currentPos, layerConfig.alternateInnerLayerProvider.getBlockState(random, currentPos), 2);
                        } else {
                            world.setBlockState(currentPos, layerConfig.innerLayerProvider.getBlockState(random, currentPos), 2);
                        }

                        // If we used the alternate inner layer or if we don't need to use the inner layer for placement, and if the placement check succeeds, add it to the placement list.
                        if ((!config.placementsRequireLayer0Alternate || useAlternateInnerLayer) && (double)random.nextFloat() < config.usePotentialPlacementsChance) {
                            crystalPlacements.add(currentPos.toImmutable());
                        }
                        // Generate the middle layer
                    } else if (generationDistance >= middleLayerThreshold) {
                        world.setBlockState(currentPos, layerConfig.middleLayerProvider.getBlockState(random, currentPos), 2);
                        // Generate the outer layer
                    } else if (generationDistance >= outerLayerThreshold) {
                        world.setBlockState(currentPos, layerConfig.outerLayerProvider.getBlockState(random, currentPos), 2);
                    }
                }
            }
        }
    }
}