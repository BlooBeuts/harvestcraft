package com.pam.harvestcraft;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockPamApiary extends BlockContainer {

	private IIcon top;
	 private IIcon middle;
	 private IIcon bottom;
	 
	    private final Random field_149933_a = new Random();
	    private static boolean field_149934_M;
	 
	public BlockPamApiary() 
	{
		super(Material.wood);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(harvestcraft.tabHarvestCraft);
		
	}
	
	public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityPamApiary();
    }
	   
	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        if (!field_149934_M)
        {
            TileEntityPamApiary tileentitypamapiary = (TileEntityPamApiary)p_149749_1_.getTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);

            if (tileentitypamapiary != null)
            {
                for (int i1 = 0; i1 < tileentitypamapiary.getSizeInventory(); ++i1)
                {
                    ItemStack itemstack = tileentitypamapiary.getStackInSlot(i1);

                    if (itemstack != null)
                    {
                        float f = this.field_149933_a.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.field_149933_a.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.field_149933_a.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int j1 = this.field_149933_a.nextInt(21) + 10;

                            if (j1 > itemstack.stackSize)
                            {
                                j1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j1;
                            EntityItem entityitem = new EntityItem(p_149749_1_, (double)((float)p_149749_2_ + f), (double)((float)p_149749_3_ + f1), (double)((float)p_149749_4_ + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.field_149933_a.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.field_149933_a.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.field_149933_a.nextGaussian() * f3);
                            p_149749_1_.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                p_149749_1_.func_147453_f(p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_);
            }
        }

        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
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

	        player.openGui(harvestcraft.instance, 0, world, x, y, z);

	        return true;
	    }
	   
	   @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister par1IconRegister)
	    {
	        	this.middle = par1IconRegister.registerIcon("harvestcraft:apiaryside");
	        	this.top = par1IconRegister.registerIcon("harvestcraft:apiarytop");
	        	this.bottom = par1IconRegister.registerIcon("harvestcraft:sinkbottom_0");
	    }
	   
	    @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int par1, int par2)
	    {
	     switch(par1) 
	     {
	     case 0:
	       return this.bottom;
	     case 1:
	       return this.top;
	     default:
	       return this.middle;
	     }
	    }

		@Override
		public TileEntity createNewTileEntity(World var1, int var2) {
			// TODO Auto-generated method stub
			return new TileEntityPamApiary();
		}

}
