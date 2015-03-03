package com.pam.harvestcraft;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemPamPotionFood extends ItemFood
{

	public ItemPamPotionFood(int par2, float par3, boolean par4) 
	{
		super(par2, par3, par4);
		this.setCreativeTab(harvestcraft.tabHarvestCraft);
		
	}
	
	 /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }


}

