package com.pam.harvestcraft;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class BlockPamWaterGarden extends BlockFlower implements IPlantable
{
	public IIcon[] icons;

	protected BlockPamWaterGarden(int par2) 
	{
		super(par2);
        float var4 = 0.2F;
        this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
        this.setStepSound(Block.soundTypeGrass);
        this.setTickRandomly(true);
        this.setCreativeTab(harvestcraft.tabHarvestCraft2);
	}

    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == Blocks.water;
    }
    

    
    public int getRenderType()
    {
        return 23;
    }
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	if (BlockRegistry.gardensdropSeeds == true)
    	{
    		int i = p_149650_2_.nextInt(11);
            
            if (i == 0)
            {
            	return ItemRegistry.cranberryseedItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.riceseedItem;
            } 
            if (i == 2)
            {
            	return ItemRegistry.seaweedseedItem;
            }
            if (i == 3)
            {
            	return ItemRegistry.clamrawItem;
            }
            if (i == 4)
            {
            	return ItemRegistry.crabrawItem;
            }
            if (i == 5)
            {
            	return ItemRegistry.crayfishrawItem;
            }
            if (i == 6)
            {
            	return ItemRegistry.frograwItem;
            }
            if (i == 7)
            {
            	return ItemRegistry.scalloprawItem;
            }
            if (i == 8)
            {
            	return ItemRegistry.shrimprawItem;
            }
            if (i == 9)
            {
            	return ItemRegistry.turtlerawItem;
            }else
            	return ItemRegistry.snailrawItem;
    	}

    		int i = p_149650_2_.nextInt(11);
            
    		if (i == 0)
            {
            	return ItemRegistry.cranberryItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.riceItem;
            } 
            if (i == 2)
            {
            	return ItemRegistry.seaweedItem;
            }
            if (i == 3)
            {
            	return ItemRegistry.clamrawItem;
            }
            if (i == 4)
            {
            	return ItemRegistry.crabrawItem;
            }
            if (i == 5)
            {
            	return ItemRegistry.crayfishrawItem;
            }
            if (i == 6)
            {
            	return ItemRegistry.frograwItem;
            }
            if (i == 7)
            {
            	return ItemRegistry.scalloprawItem;
            }
            if (i == 8)
            {
            	return ItemRegistry.shrimprawItem;
            }
            if (i == 9)
            {
            	return ItemRegistry.turtlerawItem;
            }else
            	return ItemRegistry.snailrawItem;
        
    }
    
    public int quantityDropped(Random p_149745_1_)
    {
        return BlockRegistry.gardendropAmount;
    }
    
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
    	if (BlockRegistry.enablegardenSpread == true)
    	{
        if (p_149674_5_.nextInt(BlockRegistry.gardenspreadRate) == 0)
        {
            byte b0 = 4;
            int l = 5;
            int i1;
            int j1;
            int k1;
            
            int i = this.getDamageValue(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);

            for (i1 = p_149674_2_ - b0; i1 <= p_149674_2_ + b0; ++i1)
            {
                for (j1 = p_149674_4_ - b0; j1 <= p_149674_4_ + b0; ++j1)
                {
                    for (k1 = p_149674_3_ - 1; k1 <= p_149674_3_ + 1; ++k1)
                    {
                        if (p_149674_1_.getBlock(i1, k1, j1) == this)
                        {
                            --l;

                            if (l <= 0)
                            {
                                return;
                            }
                        }
                    }
                }
            }

            i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
            j1 = p_149674_3_ + p_149674_5_.nextInt(2) - p_149674_5_.nextInt(2);
            k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;

            for (int l1 = 0; l1 < 4; ++l1)
            {
                if (p_149674_1_.isAirBlock(i1, j1, k1) && this.canBlockStay(p_149674_1_, i1, j1, k1))
                {
                    p_149674_2_ = i1;
                    p_149674_3_ = j1;
                    p_149674_4_ = k1;
                }

                i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                j1 = p_149674_3_ + p_149674_5_.nextInt(2) - p_149674_5_.nextInt(2);
                k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
            }

            if (p_149674_1_.isAirBlock(i1, j1, k1) && this.canBlockStay(p_149674_1_, i1, j1, k1))
            {
                p_149674_1_.setBlock(i1, j1, k1, this, i, 2);
            }
        }
    	}
    }
    
    /* Right-click harvests crop item*/
	@Override
	public boolean onBlockActivated (World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		int meta = world.getBlockMetadata(par2, par3, par4);

        if (meta == 0)
        {
        	if (meta == 0)
        	{
        		this.dropBlockAsItem(world, par2, par3, par4, new ItemStack(this, 1, 0));
        		world.setBlockToAir(par2, par3, par4);
        	}
        }
		
		
		return false;
	}
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:watergarden0");
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
      return this.blockIcon;
    }

    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {

        return EnumPlantType.Water;
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z)
    {
        return this;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }
    

    @SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
          for(int i = 0; i < 1; i++)
          {
                 par3List.add(new ItemStack(par1, 1, i));
          }
    }


}
