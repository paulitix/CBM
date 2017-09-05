package me.cbm.init;

import me.cbm.CBM;
import me.cbm.Reference;
import me.cbm.blocks.BlockBase;
import me.cbm.blocks.BlockCondensedCobble_4;
import me.cbm.blocks.BlockOre;
import me.cbm.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static BlockOre condensedCobble_1;
	public static BlockOre condensedCobble_2;
	public static BlockOre condensedCobble_3;
	public static BlockOre condensedCobble_4;

	public static void init() {
		
		//condensedCobble_1 = new BlockCondensedCobble_1("condensedCobble_1","condensedCobble_1");
		//condensedCobble_2 = new BlockCondensedCobble_2("condensedCobble_2","condensedCobble_2");
		//condensedCobble_3 = new BlockCondensedCobble_3("condensedCobble_3","condensedCobble_3");
		//condensedCobble_4 = new BlockCondensedCobble_4("condensedCobble_4","condensedCobble_4");
		
		condensedCobble_1 = register(new BlockOre("condensedCobble_1"));
		
		
		
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		
		if(block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
			
		}
		
		return block;
		
	}
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
		
	}

		

}
