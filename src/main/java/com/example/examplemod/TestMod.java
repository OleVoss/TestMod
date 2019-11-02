package com.example.examplemod;

import com.example.examplemod.lists.items.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TestMod.MOD_ID)
public class TestMod
{
   public static final String MOD_ID = "testmod";
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
            		ModItems.test_item = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("test_item"))
            		);
            
        }
        
        private static ResourceLocation location(String name) {
        	return new ResourceLocation(TestMod.MOD_ID, name);
        }
    }
}
