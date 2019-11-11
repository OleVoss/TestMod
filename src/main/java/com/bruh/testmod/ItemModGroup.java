package com.bruh.testmod;

import com.bruh.testmod.lists.ModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemModGroup extends ItemGroup{

	public ItemModGroup() {
		super("Manin Stenr");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.test_item);
	}
	
}
