package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPamPot extends Block {

	private IIcon top;
	private IIcon middle;
	private IIcon bottom;
	 
	public BlockPamPot() {
		super(Material.iron);
        this.setStepSound(Block.soundTypeMetal);
        this.setTickRandomly(true);
        this.setBlockBoundsForItemRender();
        this.setCreativeTab(harvestcraft.tabHarvestCraft);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemRegistry.potItem;
    }
	

	
	public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.4F, 0.75F);
    }

	
	public int quantityDropped(Random random)
    {
        return 1;
    }
	 
	 public boolean isOpaqueCube()
	    {
	        return false;
	    }

	    /**
	     * The type of render function that is called for this block
	     */
	    public int getRenderType()
	    {
	        return 0;
	    }

	    /**
	     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	     */
	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	
	/**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        	par5EntityPlayer.openGui(harvestcraft.instance, 3, par1World, par2, par3, par4);
	        return true;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        	this.middle = par1IconRegister.registerIcon("harvestcraft:potsidebottom");
        	this.top = par1IconRegister.registerIcon("harvestcraft:pottop");
        	this.bottom = par1IconRegister.registerIcon("harvestcraft:potsidebottom");
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
    
    @SideOnly(Side.CLIENT)


    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        byte b0 = 0;
        float f = 0.0625F;
        return AxisAlignedBB.getBoundingBox((double)par2 + this.minX, (double)par3 + this.minY, (double)par4 + this.minZ, (double)par2 + this.maxX, (double)((float)par3 + (float)b0 * f), (double)par4 + this.maxZ);
    }


    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == Blocks.furnace || p_149854_1_ == Blocks.lit_furnace;
    }
    
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && this.canBlockStay(par1World, par2, par3, par4);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        this.func_111046_k(par1World, par2, par3, par4);
    }

    private boolean func_111046_k(World par1World, int par2, int par3, int par4)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockToAir(par2, par3, par4);
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return par1World.getBlock(par2, par3 - 1, par4) == Blocks.furnace || par1World.getBlock(par2, par3 - 1, par4) == Blocks.lit_furnace;
    }
    
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!this.canBlockStay(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_))
        {
            p_149695_1_.func_147480_a(p_149695_2_, p_149695_3_, p_149695_4_, false);
            this.dropBlockAsItem(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_), 0);
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return par5 == 1 ? true : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

}

