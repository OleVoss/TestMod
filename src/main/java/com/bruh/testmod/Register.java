package com.bruh.testmod;

import com.bruh.testmod.lists.ItemList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class Register {
	
	@SubscribeEvent
	public static void registerItem(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemList.TEST_ITEM = new Item(new Item.Properties().group(ItemGroup.MISC))
				.setRegistryName(location("test_item")));
	}
	
	
	private static ResourceLocation location(String name) {
		return new ResourceLocation(ModMain.MOD_ID, name);
	}
	
}
