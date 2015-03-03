package com.pam.harvestcraft;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class ItemPamBee extends Item
{

public ItemPamBee() 
	{
	  super();
	  this.maxStackSize = 1;
	  this.setMaxDamage(18);
	  this.isDamageable();
      this.setCreativeTab(harvestcraft.tabHarvestCraft);

	 }

    
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	{
             par3List.add(new ItemStack(par1, 1, 0));
             par3List.add(new ItemStack(par1, 1, 18));
}

	  
}