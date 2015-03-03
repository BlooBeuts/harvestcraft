package com.pam.harvestcraft;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockPamPresser extends BlockContainer {

	private IIcon top;
	private IIcon front;
	 private IIcon middle;
	 private IIcon bottom;
	 
	public BlockPamPresser() {
		super(Material.wood);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(harvestcraft.tabHarvestCraft);
	}

	   public  TileEntity createNewTileEntity(World world) {
		      return new TileEntityPamPresser();
		   }
	   
	   public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Item.getItemFromBlock(BlockRegistry.pamPresser);
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

		        player.openGui(harvestcraft.instance, 1, world, x, y, z);

		        return true;
		    }
		   public static void updateBlockState(boolean par0, World par1World, int par2, int par3, int par4) {
			      int var5 = par1World.getBlockMetadata(par2, par3, par4);
			      TileEntity var6TileEntity = par1World.getTileEntity(par2, par3, par4);
			      if(var6TileEntity != null) {
			         if(par0) {
			            par1World.setBlock(par2, par3, par4, BlockRegistry.pamPresser);
			         } else {
			            par1World.setBlock(par2, par3, par4, BlockRegistry.pamPresser);
			         }

			         par1World.setBlockMetadataWithNotify(par2, par3, par4, var5, 2);
			         var6TileEntity.validate();
			         par1World.setTileEntity(par2, par3, par4, var6TileEntity);
			      }
			   }
	   
	   @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister par1IconRegister)
	    {
	        	this.middle = par1IconRegister.registerIcon("harvestcraft:presserside");
	        	this.front = par1IconRegister.registerIcon("harvestcraft:presserfront");
	        	this.top = par1IconRegister.registerIcon("harvestcraft:pressertop");
	        	this.bottom = par1IconRegister.registerIcon("harvestcraft:sinkbottom_0");

	}
	   
	    @SideOnly(Side.CLIENT)

	    /**
	     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	     */
	    public IIcon getIcon(int par1, int par2)
	    {
	    	return par1 == 1 ? this.top : (par1 == 0 ? this.bottom : (par1 != par2 ? this.middle : this.front));
	    }

		@Override
		public TileEntity createNewTileEntity(World var1, int var2) {
			// TODO Auto-generated method stub
			return new TileEntityPamPresser();
		}
	    

}
