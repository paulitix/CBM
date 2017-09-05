package me.cbm;


import me.cbm.creativetabs.TabCBMBlocks;
import me.cbm.init.ModBlocks;
import me.cbm.init.ModItems;
import me.cbm.proxy.CommonProxy;
import me.cbm.recipes.ModRecipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)


public class CBM {
	
	public static final TabCBMBlocks creativeTab = new TabCBMBlocks();
	
	@Mod.Instance(Reference.MODID)
	public static CBM instance;
	
	@SidedProxy(serverSide=Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
				
		ModRecipes.init();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}

}
