package com.bruh.testmod.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ModToolMaterials implements IItemTier{
	TEST_SWORD(12f, 2f, 1000, 4, 25, ModItems.test_item),
	TEST_STUFF(1f, 1f, 500, 0, 0, ModItems.test_staff);
	;
	private float attackDamage, efficiency;
	private int durability, harvestlevel, enchantability;
	private Item repairMaterial;

	private ModToolMaterials(float attackDamage, float efficiency, int durability, int harvestlevel, int enchantability, Item repairMaterial) {
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestlevel = harvestlevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
		
		
	}
	@Override
	public int getMaxUses() {
		return this.durability;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestlevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}
	

}
