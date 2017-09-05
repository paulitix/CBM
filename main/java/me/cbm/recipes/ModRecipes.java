package me.cbm.recipes;

import me.cbm.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		//Cobblestone
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.COBBLESTONE});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,9), ModBlocks.cCobble_1);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cCobble_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_1,9), ModBlocks.cCobble_2);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cCobble_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_2,9), ModBlocks.cCobble_3);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cCobble_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_3,9), ModBlocks.cCobble_4);
		
		//Netherrack
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cNether_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.NETHERRACK});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHERRACK,9), ModBlocks.cNether_1);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cNether_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cNether_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_1,9), ModBlocks.cNether_2);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cNether_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cNether_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_2,9), ModBlocks.cNether_3);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cNether_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cNether_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_3,9), ModBlocks.cNether_4);
		
		//Sand
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cSand_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.SAND});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND,9), ModBlocks.cSand_1);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cSand_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cSand_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cSand_1,9), ModBlocks.cSand_2);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cSand_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cSand_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cSand_2,9), ModBlocks.cSand_3);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cSand_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cSand_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cSand_3,9), ModBlocks.cSand_4);
		
		//Dirt
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.DIRT});
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT,9), ModBlocks.cDirt_1);
				
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cDirt_1});
		//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cDirt_1,9), ModBlocks.cDirt_2);
				
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cDirt_2});
		//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cDirt_2,9), ModBlocks.cDirt_3);
				
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cDirt_3});
		//GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cDirt_3,9), ModBlocks.cDirt_4);
		
		
	}
	
	public static void setCondenseRecipe(Block out, Block in ){
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.COBBLESTONE});
	}
	
	public static void setExpandRecipe(Block out, Block in) {
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,9), ModBlocks.cCobble_1);
		
	}

}
