package init;

import com.github.benaminamon.tutorialmod.TutorialMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum TutorialArmorMaterials implements IArmorMaterial
{
	tutorial("tutorial", 400, new int[] {8, 10, 9, 7}, 25, TutorialItems.tutorial_item, "entity.ender_dragon.growl", 0.0f);
	
	private static final int[] max_damage_array = new int[] {13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private int[] damageReductionAmounts;
	private Item repairItem;
	private float toughness;
	
	private TutorialArmorMaterials(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness)
	{
		this.name = name;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.equipSound = equipSound;
		this.toughness = toughness;
	}

	@Override
	public int getDurability(EquipmentSlotType slot)
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot)
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getEnchantability()
	{
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent()
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public String getName()
	{
		return TutorialMod.MODID + ":" + this.name;
	}

	@Override
	public float getToughness()
	{
		return this.toughness;
	}
	
}
