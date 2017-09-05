package me.cbm.recipes;

import me.cbm.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.condensedCobble_1), new Object[] {"CCC","CCC","CCC", 'C', Blocks.COBBLESTONE});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,9), ModBlocks.condensedCobble_1);
		
	}

}
