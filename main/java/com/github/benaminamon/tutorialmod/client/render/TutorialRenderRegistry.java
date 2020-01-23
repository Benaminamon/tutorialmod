package com.github.benaminamon.tutorialmod.client.render;

import com.github.benaminamon.tutorialmod.entities.TutorialEntity;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class TutorialRenderRegistry
{
	public static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(TutorialEntity.class, new TutorialEntityRender.RenderFactory());
	}
}
