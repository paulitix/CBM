package me.cbm.init;

import me.cbm.Reference;
import me.cbm.items.ItemBase;
import me.cbm.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase x;

	public static void init() {
		
		//x = new ItemBase("x","x");
		x=register(new ItemBase("x"));
		
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
			
		}
		
		return item;
	}
	
	public static void register() {
		//registerItem(x);
	}
	
	public static void registerRenders() {
		//registerRender(x);
		
	}
	
	public static void registerItem(Item item) {
		//GameRegistry.register(item);
		//Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		
		//ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)),"inventory"));
		//Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
		
	}
	
	
	
}
