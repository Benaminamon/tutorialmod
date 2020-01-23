package com.github.benaminamon.tutorialmod.world.gen;

import com.github.benaminamon.tutorialmod.config.OregenConfig;

import init.TutorialBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
	public static void setupOreGeneration()
	{
		if(OregenConfig.generate_overworld.get())
		{
			for(Biome biome : ForgeRegistries.BIOMES)
			{
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, TutorialBlocks.tutorial_ore.getDefaultState(), OregenConfig.tutorial_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
				biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, TutorialBlocks.tutorial_ore_nether.getDefaultState(), OregenConfig.tutorial_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
				//biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType., TutorialBlocks.tutorial_ore_end.getDefaultState(), OregenConfig.tutorial_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
				
			}
		}
	}
}
