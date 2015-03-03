package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
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
import net.minecraftforge.common.IShearable;

public class BlockPamNormalGarden extends BlockFlower implements IPlantable
{
	public IIcon[] icons;

	protected BlockPamNormalGarden(int par2) 
	{
		super(par2);
        float var4 = 0.2F;
        this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
        this.setStepSound(Block.soundTypeGrass);
        this.setTickRandomly(true);
        this.setCreativeTab(harvestcraft.tabHarvestCraft2);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		if (BlockRegistry.gardensdropSeeds == true)
    	{
			if (this == BlockRegistry.pamberryGarden)
			{
				int i = p_149650_2_.nextInt(5);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.blackberryseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.blueberryseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.candleberryseedItem;
	            }
	            if (i == 3)
	            {
	                return ItemRegistry.raspberryseedItem;
	            } else
	            	return ItemRegistry.strawberryseedItem;
			}
			if (this == BlockRegistry.pamgrassGarden)
			{
				int i = p_149650_2_.nextInt(6);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.asparagusseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.barleyseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.oatsseedItem;
	            }
	            if (i == 3)
	            {
	                return ItemRegistry.ryeseedItem;
	            } 
	            if (i == 4)
	            {
	                return ItemRegistry.cornseedItem;
	            } else
	            	return ItemRegistry.bambooshootseedItem;
			}
			if (this == BlockRegistry.pamgourdGarden)
			{
				int i = p_149650_2_.nextInt(5);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.cantaloupeseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.cucumberseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.wintersquashseedItem;
	            }
	            if (i == 3)
	            {
	                return ItemRegistry.zucchiniseedItem;
	            } else
	            	return Items.pumpkin_seeds;
			}
			if (this == BlockRegistry.pamgroundGarden)
			{
				int i = p_149650_2_.nextInt(11);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.beetseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.onionseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.parsnipseedItem;
	            }
	            if (i == 3)
	            {
	                return ItemRegistry.peanutseedItem;
	            } 
	            if (i == 4)
	            {
	                return ItemRegistry.radishseedItem;
	            } 
	            if (i == 5)
	            {
	                return ItemRegistry.rutabagaseedItem;
	            } 
	            if (i == 6)
	            {
	                return ItemRegistry.sweetpotatoseedItem;
	            } 
	            if (i == 7)
	            {
	                return ItemRegistry.turnipseedItem;
	            } 
	            if (i == 8)
	            {
	                return ItemRegistry.rhubarbseedItem;
	            } 
			}
			if (this == BlockRegistry.pamherbGarden)
			{
				int i = p_149650_2_.nextInt(8);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.celeryseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.garlicseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.gingerseedItem;
	            }
	            if (i == 3)
	            {
	                return ItemRegistry.spiceleafseedItem;
	            } 
	            if (i == 4)
	            {
	                return ItemRegistry.teaseedItem;
	            } 
	            if (i == 5)
	            {
	                return ItemRegistry.coffeeseedItem;
	            } else
	            	return ItemRegistry.mustardseedItem;
			}
			if (this == BlockRegistry.pamleafyGarden)
			{
				int i = p_149650_2_.nextInt(9);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.broccoliseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.cauliflowerseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.leekseedItem;
	            }
	            if (i == 3)
	            {
	                return ItemRegistry.lettuceseedItem;
	            } 
	            if (i == 4)
	            {
	                return ItemRegistry.scallionseedItem;
	            } 
	            if (i == 5)
	            {
	                return ItemRegistry.artichokeseedItem;
	            } 
	            if (i == 6)
	            {
	                return ItemRegistry.brusselsproutseedItem;
	            }
	            if (i == 7)
	            {
	                return ItemRegistry.cabbageseedItem;
	            }else
	            	return ItemRegistry.spinachseedItem;
			}
			if (this == BlockRegistry.pamstalkGarden)
			{
				int i = p_149650_2_.nextInt(8);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.beanseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.soybeanseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.bellpepperseedItem;
	            }
	            if (i == 3)
	            {
	                return ItemRegistry.chilipepperseedItem;
	            } 
	            if (i == 4)
	            {
	                return ItemRegistry.eggplantseedItem;
	            } 
	            if (i == 5)
	            {
	                return ItemRegistry.okraseedItem;
	            } 
	            if (i == 6)
	            {
	                return ItemRegistry.peasseedItem;
	            } else
	            	return ItemRegistry.tomatoseedItem;
			}
			if (this == BlockRegistry.pamtextileGarden)
			{
				int i = p_149650_2_.nextInt(1);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.cottonseedItem;
	            } else
	            	return ItemRegistry.cottonseedItem;
			}
			if (this == BlockRegistry.pamtropicalGarden)
			{
				int i = p_149650_2_.nextInt(4);
	            
	            if (i == 0)
	            {
	            	return ItemRegistry.pineappleseedItem;
	            }
	            if (i == 1)
	            {
	            	return ItemRegistry.grapeseedItem;
	            }
	            if (i == 2)
	            {
	                return ItemRegistry.kiwiseedItem;
	            } else
	            	return Items.melon_seeds;
			}
    	}
		if (this == BlockRegistry.pamberryGarden)
		{
			int i = p_149650_2_.nextInt(5);
            
            if (i == 0)
            {
            	return ItemRegistry.blackberryItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.blueberryItem;
            }
            if (i == 2)
            {
                return ItemRegistry.candleberryItem;
            }
            if (i == 3)
            {
                return ItemRegistry.raspberryItem;
            } else
            	return ItemRegistry.strawberryItem;
		}
		if (this == BlockRegistry.pamgrassGarden)
		{
			int i = p_149650_2_.nextInt(6);
            
            if (i == 0)
            {
            	return ItemRegistry.asparagusItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.barleyItem;
            }
            if (i == 2)
            {
                return ItemRegistry.oatsItem;
            }
            if (i == 3)
            {
                return ItemRegistry.ryeItem;
            } 
            if (i == 4)
            {
                return ItemRegistry.cornItem;
            } else
            	return ItemRegistry.bambooshootItem;
		}
		if (this == BlockRegistry.pamgourdGarden)
		{
			int i = p_149650_2_.nextInt(5);
            
            if (i == 0)
            {
            	return ItemRegistry.cantaloupeItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.cucumberItem;
            }
            if (i == 2)
            {
                return ItemRegistry.wintersquashItem;
            }
            if (i == 3)
            {
                return ItemRegistry.zucchiniItem;
            } else
            	return Item.getItemFromBlock(Blocks.pumpkin);
		}
		if (this == BlockRegistry.pamgroundGarden)
		{
			int i = p_149650_2_.nextInt(11);
            
            if (i == 0)
            {
            	return ItemRegistry.beetItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.onionItem;
            }
            if (i == 2)
            {
                return ItemRegistry.parsnipItem;
            }
            if (i == 3)
            {
                return ItemRegistry.peanutItem;
            } 
            if (i == 4)
            {
                return ItemRegistry.radishItem;
            } 
            if (i == 5)
            {
                return ItemRegistry.rutabagaItem;
            } 
            if (i == 6)
            {
                return ItemRegistry.sweetpotatoItem;
            } 
            if (i == 7)
            {
                return ItemRegistry.turnipItem;
            } 
            if (i == 8)
            {
                return ItemRegistry.rhubarbItem;
            } 
            if (i == 9)
            {
                return Items.potato;
            } else
            	return Items.carrot;
		}
		if (this == BlockRegistry.pamherbGarden)
		{
			int i = p_149650_2_.nextInt(8);
            
            if (i == 0)
            {
            	return ItemRegistry.celeryItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.garlicItem;
            }
            if (i == 2)
            {
                return ItemRegistry.gingerItem;
            }
            if (i == 3)
            {
                return ItemRegistry.spiceleafItem;
            } 
            if (i == 4)
            {
                return ItemRegistry.ediblerootItem;
            } 
            if (i == 5)
            {
                return ItemRegistry.tealeafItem;
            } 
            if (i == 6)
            {
                return ItemRegistry.coffeebeanItem;
            } else
            	return ItemRegistry.mustardseedsItem;
		}
		if (this == BlockRegistry.pamleafyGarden)
		{
			int i = p_149650_2_.nextInt(9);
            
            if (i == 0)
            {
            	return ItemRegistry.broccoliItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.cauliflowerItem;
            }
            if (i == 2)
            {
                return ItemRegistry.leekItem;
            }
            if (i == 3)
            {
                return ItemRegistry.lettuceItem;
            } 
            if (i == 4)
            {
                return ItemRegistry.scallionItem;
            } 
            if (i == 5)
            {
                return ItemRegistry.artichokeItem;
            } 
            if (i == 6)
            {
                return ItemRegistry.brusselsproutItem;
            }
            if (i == 7)
            {
                return ItemRegistry.cabbageItem;
            }else
            	return ItemRegistry.spinachItem;
		}
		if (this == BlockRegistry.pamstalkGarden)
		{
			int i = p_149650_2_.nextInt(8);
            
            if (i == 0)
            {
            	return ItemRegistry.beanItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.soybeanItem;
            }
            if (i == 2)
            {
                return ItemRegistry.bellpepperItem;
            }
            if (i == 3)
            {
                return ItemRegistry.chilipepperItem;
            } 
            if (i == 4)
            {
                return ItemRegistry.eggplantItem;
            } 
            if (i == 5)
            {
                return ItemRegistry.okraItem;
            } 
            if (i == 6)
            {
                return ItemRegistry.peasItem;
            } else
            	return ItemRegistry.tomatoItem;
		}
		if (this == BlockRegistry.pamtextileGarden)
		{
			int i = p_149650_2_.nextInt(1);
            
            if (i == 0)
            {
            	return ItemRegistry.cottonItem;
            } else
            	return ItemRegistry.cottonItem;
		}
		if (this == BlockRegistry.pamtropicalGarden)
		{
			int i = p_149650_2_.nextInt(4);
            
            if (i == 0)
            {
            	return ItemRegistry.pineappleItem;
            }
            if (i == 1)
            {
            	return ItemRegistry.grapeItem;
            }
            if (i == 2)
            {
                return ItemRegistry.kiwiItem;
            } else
            	return Items.melon;
		}
		else

        return ItemRegistry.whitemushroomItem;
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
    	if (this == BlockRegistry.pamberryGarden)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:berrygarden0");
    	}
    	if (this == BlockRegistry.pamgrassGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:grassgarden0");
        }
    	if (this == BlockRegistry.pamgourdGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:gourdgarden0");
        }
    	if (this == BlockRegistry.pamgroundGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:groundgarden0");
        }
    	if (this == BlockRegistry.pamherbGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:herbgarden0");
        }
    	if (this == BlockRegistry.pamleafyGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:leafygarden0");
        }
    	if (this == BlockRegistry.pamstalkGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:stalkgarden0");
        }
    	if (this == BlockRegistry.pamtextileGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:textilegarden0");
        }
    	if (this == BlockRegistry.pamtropicalGarden)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:tropicalgarden0");
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
      return this.blockIcon;
    }

    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {

        return EnumPlantType.Plains;
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
