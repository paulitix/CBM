package me.cbm.creativetabs;

import me.cbm.Reference;
import me.cbm.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabCBMBlocks extends CreativeTabs {

	public TabCBMBlocks() {
		super(Reference.MODID);
	}
	
	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(ModBlocks.cCobble_1);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
