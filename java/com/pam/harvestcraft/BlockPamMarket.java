package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class BlockPamMarket extends BlockContainer  {

	private IIcon top;
	 private IIcon middle;
	 private IIcon bottom;
	 
	public BlockPamMarket(Material par2Material) {
		super(par2Material);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(harvestcraft.tabHarvestCraft);
	}
	
	public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityMarket();
    }
	
	public boolean onBlockActivated(World world, int x, int y, int z,
            EntityPlayer player, int side, float xCoord, float yCoord,
            float zCoord)
    {
        final TileEntity tile = world.getTileEntity(x, y, z);

        if (tile == null || player.isSneaking())
        {
            return false;
        }
        System.out.println("Trying to open");
        player.openGui(harvestcraft.instance, 4, world, x, y, z);

        return true;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        	this.middle = par1IconRegister.registerIcon("harvestcraft:marketside");
        	this.top = par1IconRegister.registerIcon("harvestcraft:markettop");
        	this.bottom = par1IconRegister.registerIcon("harvestcraft:marketbottom");
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

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		// TODO Auto-generated method stub
		return new TileEntityMarket();
	}


}
