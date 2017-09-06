package me.cbm.init;


import java.util.ArrayList;
import java.util.List;

import me.cbm.CBM;
import me.cbm.Reference;
import me.cbm.blocks.BlockBase;
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
	
	//static String[] blockName_array = {"Nether"};	

	public static BlockOre cCobble_1;
	public static BlockOre cCobble_2;
	public static BlockOre cCobble_3;
	public static BlockOre cCobble_4;
	
	public static BlockOre cNether_1;
	public static BlockOre cNether_2;
	public static BlockOre cNether_3;
	public static BlockOre cNether_4;
	
	public static BlockOre cSand_1;
	public static BlockOre cSand_2;
	public static BlockOre cSand_3;
	public static BlockOre cSand_4;
	
	public static BlockOre cDirt_1;
	public static BlockOre cDirt_2;
	public static BlockOre cDirt_3;
	public static BlockOre cDirt_4;
	
	public static BlockOre cStone_1;
	public static BlockOre cStone_2;
	public static BlockOre cStone_3;
	public static BlockOre cStone_4;
	
	public static BlockOre cObsidian_1;
	public static BlockOre cObsidian_2;
	public static BlockOre cObsidian_3;
	public static BlockOre cObsidian_4;
	
	public static BlockOre cGravel_1;
	public static BlockOre cGravel_2;
	public static BlockOre cGravel_3;
	public static BlockOre cGravel_4;
	
	public static BlockOre cGlass_1;
	public static BlockOre cGlass_2;
	public static BlockOre cGlass_3;
	public static BlockOre cGlass_4;
	
	public static BlockOre cBone_1;
	public static BlockOre cBone_2;
	public static BlockOre cBone_3;
	public static BlockOre cBone_4;
	
	public static BlockOre cRotten_1;
	public static BlockOre cRotten_2;
	public static BlockOre cRotten_3;
	public static BlockOre cRotten_4;
	
	public static BlockOre cArrow_1;
	public static BlockOre cArrow_2;
	public static BlockOre cArrow_3;
	public static BlockOre cArrow_4;
	
	public static BlockOre cPearl_1;
	public static BlockOre cPearl_2;
	public static BlockOre cPearl_3;
	public static BlockOre cPearl_4;
	

	public static void init() {
				
		cCobble_1 = register(new BlockOre("cCobble_1"));
		cCobble_2 = register(new BlockOre("cCobble_2"));
		cCobble_3 = register(new BlockOre("cCobble_3"));
		cCobble_4 = register(new BlockOre("cCobble_4"));
		
		cNether_1 = register(new BlockOre("cNether_1"));
		cNether_2 = register(new BlockOre("cNether_2"));
		cNether_3 = register(new BlockOre("cNether_3"));
		cNether_4 = register(new BlockOre("cNether_4"));
		
		cSand_1 = register(new BlockOre("cSand_1"));
		cSand_2 = register(new BlockOre("cSand_2"));
		cSand_3 = register(new BlockOre("cSand_3"));
		cSand_4 = register(new BlockOre("cSand_4"));
		
		cDirt_1 = register(new BlockOre("cDirt_1"));
		cDirt_2 = register(new BlockOre("cDirt_2"));
		cDirt_3 = register(new BlockOre("cDirt_3"));
		cDirt_4 = register(new BlockOre("cDirt_4"));
		
		cStone_1 = register(new BlockOre("cStone_1"));
		cStone_2 = register(new BlockOre("cStone_2"));
		cStone_3 = register(new BlockOre("cStone_3"));
		cStone_4 = register(new BlockOre("cStone_4"));
		
		cObsidian_1 = register(new BlockOre("cObsidian_1"));
		cObsidian_2 = register(new BlockOre("cObsidian_2"));
		cObsidian_3 = register(new BlockOre("cObsidian_3"));
		cObsidian_4 = register(new BlockOre("cObsidian_4"));
		
		cGravel_1 = register(new BlockOre("cGravel_1"));
		cGravel_2 = register(new BlockOre("cGravel_2"));
		cGravel_3 = register(new BlockOre("cGravel_3"));
		cGravel_4 = register(new BlockOre("cGravel_4"));
		
		cGlass_1 = register(new BlockOre("cGlass_1"));
		cGlass_2 = register(new BlockOre("cGlass_2"));
		cGlass_3 = register(new BlockOre("cGlass_3"));
		cGlass_4 = register(new BlockOre("cGlass_4"));
		
		cBone_1 = register(new BlockOre("cBone_1"));
		cBone_2 = register(new BlockOre("cBone_2"));
		cBone_3 = register(new BlockOre("cBone_3"));
		cBone_4 = register(new BlockOre("cBone_4"));
		
		cRotten_1 = register(new BlockOre("cRotten_1"));
		cRotten_2 = register(new BlockOre("cRotten_2"));
		cRotten_3 = register(new BlockOre("cRotten_3"));
		cRotten_4 = register(new BlockOre("cRotten_4"));
		
		cArrow_1 = register(new BlockOre("cArrow_1"));
		cArrow_2 = register(new BlockOre("cArrow_2"));
		cArrow_3 = register(new BlockOre("cArrow_3"));
		cArrow_4 = register(new BlockOre("cArrow_4"));
		
		cPearl_1 = register(new BlockOre("cPearl_1"));
		cPearl_2 = register(new BlockOre("cPearl_2"));
		cPearl_3 = register(new BlockOre("cPearl_3"));
		cPearl_4 = register(new BlockOre("cPearl_4"));
		
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
