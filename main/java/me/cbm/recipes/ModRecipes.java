package me.cbm.recipes;

import me.cbm.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
		
		//Gravel
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGravel_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.GRAVEL});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRAVEL,9), ModBlocks.cGravel_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGravel_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cGravel_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cGravel_1,9), ModBlocks.cGravel_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGravel_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cGravel_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cGravel_2,9), ModBlocks.cGravel_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cGravel_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cGravel_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cGravel_3,9), ModBlocks.cGravel_4);
		
		//Obsidian
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cObsidian_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.OBSIDIAN});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN,9), ModBlocks.cObsidian_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cObsidian_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cObsidian_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cObsidian_1,9), ModBlocks.cObsidian_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cObsidian_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cObsidian_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cObsidian_2,9), ModBlocks.cObsidian_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cObsidian_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cObsidian_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cObsidian_3,9), ModBlocks.cObsidian_4);
		
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
		
		//Bone - cBone_1
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cBone_1), new Object[] {"CCC","CCC","CCC", 'C', Items.BONE});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.BONE,9), ModBlocks.cBone_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cBone_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cBone_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cBone_1,9), ModBlocks.cBone_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cBone_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cBone_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cBone_2,9), ModBlocks.cBone_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cBone_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cBone_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cBone_3,9), ModBlocks.cBone_4);
		
		//Rotten Flesh - cRotten_1
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cRotten_1), new Object[] {"CCC","CCC","CCC", 'C', Items.ROTTEN_FLESH});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ROTTEN_FLESH,9), ModBlocks.cRotten_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cRotten_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cRotten_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cRotten_1,9), ModBlocks.cRotten_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cRotten_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cRotten_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cRotten_2,9), ModBlocks.cRotten_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cRotten_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cRotten_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cRotten_3,9), ModBlocks.cRotten_4);
		
		//Arrow - cArrow_1
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cArrow_1), new Object[] {"CCC","CCC","CCC", 'C', Items.ARROW});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ARROW,9), ModBlocks.cArrow_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cArrow_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cArrow_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cArrow_1,9), ModBlocks.cArrow_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cArrow_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cArrow_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cArrow_2,9), ModBlocks.cArrow_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cArrow_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cArrow_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cArrow_3,9), ModBlocks.cArrow_4);
		
		//Ender Pearl - cPearl_1
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cPearl_1), new Object[] {"CCC","CCC","CCC", 'C', Items.ENDER_PEARL});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_PEARL,9), ModBlocks.cPearl_1);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cPearl_2), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cPearl_1});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cPearl_1,9), ModBlocks.cPearl_2);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cPearl_3), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cPearl_2});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cPearl_2,9), ModBlocks.cPearl_3);
				
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cPearl_4), new Object[] {"CCC","CCC","CCC", 'C', ModBlocks.cPearl_3});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cPearl_3,9), ModBlocks.cPearl_4);	
		
	}
	
	public static void setCondenseRecipe(Block out, Block in ){
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.cCobble_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.COBBLESTONE});
	}
	
	public static void setExpandRecipe(Block out, Block in) {
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,9), ModBlocks.cCobble_1);
		
	}

}
