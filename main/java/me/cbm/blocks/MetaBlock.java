package me.cbm.blocks;

import me.cbm.CBM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MetaBlock extends Block{

	protected MetaBlock(String name, Material material) {
		super(material);;
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(CBM.creativeTab);
		
	}
}
