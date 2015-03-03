package com.pam.harvestcraft;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPamCakeFood extends ItemFood
{

	public Block cake;
	
	public ItemPamCakeFood(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_, Block cake) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.cake = cake;
		// TODO Auto-generated constructor stub
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
        {
        	
            
                par3World.setBlock(par4, par5 + 1, par6, this.cake);
                --par1ItemStack.stackSize;
                return true;

        }
        else
        {
            return false;
        }
    }

}
