package com.bruh.testmod.items;

import net.minecraft.item.Item;

public class TestStaff extends Item{

	public TestStaff(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	public boolean onItemUse() {
		
		return canRepair;
		
	}

}
