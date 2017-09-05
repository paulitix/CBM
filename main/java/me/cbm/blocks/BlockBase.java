package me.cbm.blocks;

import me.cbm.CBM;
import me.cbm.creativetabs.TabCBMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block{
	
	protected String name;
	
	public BlockBase(Material material, String name) {
		super(material);
		
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(CBM.creativeTab);
		
	}
	
	public void registerItemModel(ItemBlock itemBlock) {
		CBM.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	

}
