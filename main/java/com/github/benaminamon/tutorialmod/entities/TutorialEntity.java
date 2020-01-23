package com.github.benaminamon.tutorialmod.entities;

import init.TutorialEntities;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;

public class TutorialEntity extends CreatureEntity
{

	@SuppressWarnings("unchecked")
	public TutorialEntity(EntityType<? extends CreatureEntity> type, World worldId)
	{
		super((EntityType<? extends CreatureEntity>) TutorialEntities.TUTORIAL_ENTITY, worldId);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void registerGoals()
	{
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(0, new RandomWalkingGoal(this, 1.2d));
		this.goalSelector.addGoal(0, new LookRandomlyGoal(this));
	}
	
	@Override
	protected void registerAttributes()
	{
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.2d);
	}
}
