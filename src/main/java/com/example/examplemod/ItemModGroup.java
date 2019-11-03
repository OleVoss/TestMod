package com.example.examplemod;

import com.example.examplemod.lists.ModItems;

import net.minecraft.item.Item;
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
