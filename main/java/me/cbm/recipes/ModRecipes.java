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
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cCobble_1), new ItemStack(ModBlocks.cStone_1), 0);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cCobble_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_1,9), ModBlocks.cCobble_2);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cCobble_2), new ItemStack(ModBlocks.cStone_2), 0);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cCobble_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_2,9), ModBlocks.cCobble_3);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cCobble_3), new ItemStack(ModBlocks.cStone_3), 0);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cCobble_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cCobble_3,9), ModBlocks.cCobble_4);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cCobble_4), new ItemStack(ModBlocks.cStone_4), 0);
		
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
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cSand_1), new ItemStack(ModBlocks.cGlass_1), 0);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cSand_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cSand_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cSand_1,9), ModBlocks.cSand_2);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cSand_2), new ItemStack(ModBlocks.cGlass_2), 0);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cSand_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cSand_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cSand_2,9), ModBlocks.cSand_3);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cSand_3), new ItemStack(ModBlocks.cGlass_3), 0);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cSand_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cSand_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cSand_3,9), ModBlocks.cSand_4);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.cSand_4), new ItemStack(ModBlocks.cGlass_4), 0);
		
		//Dirt
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.DIRT});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT,9), ModBlocks.cDirt_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cDirt_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cDirt_1,9), ModBlocks.cDirt_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cDirt_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cDirt_2,9), ModBlocks.cDirt_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cDirt_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cDirt_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cDirt_3,9), ModBlocks.cDirt_4);
		
		//Dirt - Coarse
		//Dirt - Podzol
		
		//Glass
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGlass_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.GLASS});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GLASS,9), ModBlocks.cGlass_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGlass_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cGlass_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cGlass_1,9), ModBlocks.cGlass_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGlass_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cGlass_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cGlass_2,9), ModBlocks.cGlass_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGlass_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cGlass_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cGlass_3,9), ModBlocks.cGlass_4);
		
		//Stone
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cStone_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.STONE});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE,9), ModBlocks.cStone_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cStone_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cStone_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cStone_1,9), ModBlocks.cStone_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cStone_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cStone_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cStone_2,9), ModBlocks.cStone_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cStone_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cStone_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cStone_3,9), ModBlocks.cStone_4);
		
		
	}
	
	public static void setCondenseRecipe(Block out, Block in ){
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.COBBLESTONE});
	}
	
	public static void setExpandRecipe(Block out, Block in) {
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,9), ModBlocks.cCobble_1);
		
	}

}
