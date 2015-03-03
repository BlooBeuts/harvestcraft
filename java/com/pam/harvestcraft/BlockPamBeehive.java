package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

public class BlockPamBeehive extends Block {

	private IIcon top;
	 private IIcon middle;
	 private IIcon bottom;
	 
	public BlockPamBeehive(Material par2Material) {
		super(par2Material);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(harvestcraft.tabHarvestCraft);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemRegistry.queenbeeItem;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        	this.middle = par1IconRegister.registerIcon("harvestcraft:beehiveside");
        	this.top = par1IconRegister.registerIcon("harvestcraft:beehivetop");
        	this.bottom = par1IconRegister.registerIcon("harvestcraft:beehivebottom");
}
   
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public IIcon getIcon(int par1, int par2)
    {
     switch(par1) {

     case 0:
       return this.bottom;
     case 1:
       return this.top;
     default:
       return this.middle;
     }
    }


}
