package com.pam.harvestcraft;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPamFruit extends Block
{
	public IIcon[] icons;
	
	private String fruit;
	
	Item treeDrop;
	
    public BlockPamFruit(String fruit)
    {
        super(Material.circuits);
        this.setTickRandomly(true);
        this.setCreativeTab(harvestcraft.tabHarvestCraft2);
        this.setStepSound(Block.soundTypeGrass);
        this.fruit = fruit;
        
    }
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
    	if (this == BlockRegistry.pamCinnamon)
    	{
            return AxisAlignedBB.getBoundingBox((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX, (double)p_149668_3_ + this.maxY, (double)p_149668_4_ + this.maxZ);

    	}
    	if (this == BlockRegistry.pamMaple)
    	{
            return AxisAlignedBB.getBoundingBox((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX, (double)p_149668_3_ + this.maxY, (double)p_149668_4_ + this.maxZ);

    	}
    	if (this == BlockRegistry.pamPaperbark)
    	{
            return AxisAlignedBB.getBoundingBox((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX, (double)p_149668_3_ + this.maxY, (double)p_149668_4_ + this.maxZ);

    	}
        return null;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.icons = new IIcon[3];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = par1IconRegister.registerIcon("harvestcraft:"+fruit+"_" + i);
        }
    }
    
    /* Right-click harvests crop item*/
	@Override
	public boolean onBlockActivated (World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
	{
		if (BlockRegistry.rightclickmatureshowfruitHearts == true)
		{
		int meta = world.getBlockMetadata(par2, par3, par4);

        if (meta == 2)
        {
        	float f = (float)par2 + 0.5F;
            float f1 = (float)par3 + 0.0F + 6.0F / 16.0F;
            float f2 = (float)par4 + 0.5F;
            float f3 = 0.52F;
            float f4 = 0.6F - 0.3F;
        	world.spawnParticle("heart", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
        }
		}
		if (BlockRegistry.rightclickharvestFruit == true)
		{
		int meta = world.getBlockMetadata(par2, par3, par4);

        if (meta == 2)
        {
        	if (meta == 2)
        	{
        		this.dropBlockAsItem(world, par2, par3, par4, meta, 0);
        		world.setBlock(par2, par3, par4, this, 0, 2);
        	}
        }
		}
		
		return false;
	}

    
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public IIcon getIcon(int par1, int par2)
    {
        return this.icons[par2 % this.icons.length];
    }
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

            int var6 = par1World.getBlockMetadata(par2, par3, par4);

            if (var6 < 2)
            {
                if (par5Random.nextInt(30) == 0)
                {
                    ++var6;
                    par1World.setBlock(par2, par3, par4, this, var6, 2);
                }
            }
    }
    
    /**
     * Apply bonemeal to the crops.
     */
    public void fertilize(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);

        if (l > 2)
        {
            l = 2;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

    }
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	if (this == BlockRegistry.pamApple)
        {
        	return Items.apple;
        }
        if (this == BlockRegistry.pamAlmond)
        {
        	return ItemRegistry.almondItem;
        }
        if (this == BlockRegistry.pamApricot)
        {
        	return ItemRegistry.apricotItem;
        }
        if (this == BlockRegistry.pamAvocado)
        {
        	return ItemRegistry.avocadoItem;
        }
        if (this == BlockRegistry.pamBanana)
        {
        	return ItemRegistry.bananaItem;
        }
        if (this == BlockRegistry.pamCashew)
        {
        	return ItemRegistry.cashewItem;
        }
        if (this == BlockRegistry.pamCherry)
        {
        	return ItemRegistry.cherryItem;
        }
        if (this == BlockRegistry.pamChestnut)
        {
        	return ItemRegistry.chestnutItem;
        }
        if (this == BlockRegistry.pamCinnamon)
        {
        	return ItemRegistry.cinnamonItem;
        }
        if (this == BlockRegistry.pamCoconut)
        {
        	return ItemRegistry.coconutItem;
        }
        if (this == BlockRegistry.pamDate)
        {
        	return ItemRegistry.dateItem;
        }
        if (this == BlockRegistry.pamDragonfruit)
        {
        	return ItemRegistry.dragonfruitItem;
        }
        if (this == BlockRegistry.pamDurian)
        {
        	return ItemRegistry.durianItem;
        }
        if (this == BlockRegistry.pamFig)
        {
        	return ItemRegistry.figItem;
        }
        if (this == BlockRegistry.pamGrapefruit)
        {
        	return ItemRegistry.grapefruitItem;
        }
        if (this == BlockRegistry.pamLemon)
        {
        	return ItemRegistry.lemonItem;
        }
        if (this == BlockRegistry.pamLime)
        {
        	return ItemRegistry.limeItem;
        }
        if (this == BlockRegistry.pamMaple)
        {
        	return ItemRegistry.maplesyrupItem;
        }
        if (this == BlockRegistry.pamMango)
        {
        	return ItemRegistry.mangoItem;
        }
        if (this == BlockRegistry.pamNutmeg)
        {
        	return ItemRegistry.nutmegItem;
        }
        if (this == BlockRegistry.pamOlive)
        {
        	return ItemRegistry.oliveItem;
        }
        if (this == BlockRegistry.pamOrange)
        {
        	return ItemRegistry.orangeItem;
        }
        if (this == BlockRegistry.pamPapaya)
        {
        	return ItemRegistry.papayaItem;
        }
        if (this == BlockRegistry.pamPaperbark)
        {
        	return Items.paper;
        }
        if (this == BlockRegistry.pamPeach)
        {
        	return ItemRegistry.peachItem;
        }
        if (this == BlockRegistry.pamPear)
        {
        	return ItemRegistry.pearItem;
        }
        if (this == BlockRegistry.pamPecan)
        {
        	return ItemRegistry.pecanItem;
        }
        if (this == BlockRegistry.pamPeppercorn)
        {
        	return ItemRegistry.peppercornItem;
        }
        if (this == BlockRegistry.pamPersimmon)
        {
        	return ItemRegistry.persimmonItem;
        }
        if (this == BlockRegistry.pamPistachio)
        {
        	return ItemRegistry.pistachioItem;
        }
        if (this == BlockRegistry.pamPlum)
        {
        	return ItemRegistry.plumItem;
        }
        if (this == BlockRegistry.pamPomegranate)
        {
        	return ItemRegistry.pomegranateItem;
        }
        if (this == BlockRegistry.pamStarfruit)
        {
        	return ItemRegistry.starfruitItem;
        }
        if (this == BlockRegistry.pamVanillabean)
        {
        	return ItemRegistry.vanillabeanItem;
        }
        if (this == BlockRegistry.pamWalnut)
        {
        	return ItemRegistry.walnutItem;
        }
		return Items.wheat;
    }
    
    

    public int quantityDropped(Random random)
    {
        return 1;
    }


    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
    	Block l = world.getBlock(i, j + 1, k);

        
        return l == Blocks.leaves;
    }

    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        if (!this.canBlockStay(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_))
        {
            p_149695_1_.func_147480_a(p_149695_2_, p_149695_3_, p_149695_4_, false);
        }
    }

    public boolean canBlockStay(World world, int i, int j, int k)
    {
    	if (this == BlockRegistry.pamCinnamon)
    	{
    		return true;
    	} else
    		if (this == BlockRegistry.pamPaperbark)
        	{
        		return true;
        	} else
		if (this == BlockRegistry.pamMaple)
    	{
    		return true;
    	} else
        return canPlaceBlockAt(world, i, j, k);
    }
    
    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
    	if (this == BlockRegistry.pamCinnamon)
    	{
    		return true;
    	} else
    		if (this == BlockRegistry.pamPaperbark)
        	{
        		return true;
        	} else
        		if (this == BlockRegistry.pamMaple)
            	{
            		return true;
            	} else
    		return false;
    }

    public boolean isOpaqueCube()
    {
    	if (this == BlockRegistry.pamCinnamon)
    	{
    		return true;
    	} else
    		if (this == BlockRegistry.pamPaperbark)
        	{
        		return true;
        	} else
        		if (this == BlockRegistry.pamMaple)
            	{
            		return true;
            	} else
    		return false;
    }

    public boolean renderAsNormalBlock()
    {
    	if (this == BlockRegistry.pamCinnamon)
    	{
    		return true;
    	} else
    		if (this == BlockRegistry.pamPaperbark)
        	{
        		return true;
        	} else
        		if (this == BlockRegistry.pamMaple)
            	{
            		return true;
            	} else
    		return false;
    }

    public int getRenderType()
    {
    	if (this == BlockRegistry.pamCinnamon)
    	{
    		return 0;
    	}
    	else 
    		if (this == BlockRegistry.pamPaperbark)
        	{
        		return 0;
        	} else
        		if (this == BlockRegistry.pamMaple)
            	{
            		return 0;
            	} else
        return 1;
    }

    public float getBlockHardness(World par1World, int par2, int par3, int par4) 
    {
    	int meta = par1World.getBlockMetadata(par2, par3, par4);
    	if(meta == 2) return 0.0F;
    	else return 5.0F;
    	}


    public void onBlockDestroyedByPlayer(World world, int par2, int par3, int par4, int par5)
    {
    	if (par5 == 2)
    	{
    		world.setBlock(par2, par3, par4, this, 0, 2);
    	}
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