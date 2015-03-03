package com.pam.harvestcraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPamTool  extends Item
{
	 public ItemPamTool() 
	 {
	  super();
	  this.setMaxStackSize(1);
	 }
	 
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
	 {
	     return false;
	 }
}
