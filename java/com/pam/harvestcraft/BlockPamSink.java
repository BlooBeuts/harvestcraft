package com.pam.harvestcraft;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;


public class BlockPamSink extends Block
{
	
	 private IIcon[] top;
	 private IIcon[] middle;
	 private IIcon[] bottom;
	 
    protected BlockPamSink()
    {
        super(Material.wood);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(harvestcraft.tabHarvestCraft);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.top = new IIcon[4];
        this.middle = new IIcon[4];
        this.bottom = new IIcon[4];
        for (int i = 0; i < this.middle.length; ++i)
        {
        	this.middle[i] = par1IconRegister.registerIcon("harvestcraft:sinkside_"+ i);
     
        }
        
        for (int i = 0; i < this.top.length; ++i)
        {
        	this.top[i] = par1IconRegister.registerIcon("harvestcraft:sinktop_"+ i);
     
        }
        
        for (int i = 0; i < this.bottom.length; ++i)
        {
        	this.bottom[i] = par1IconRegister.registerIcon("harvestcraft:sinkbottom_"+ i);
     
        }
}
   
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public IIcon getIcon(int par1, int par2)
    {
     switch(par1) {

     case 0:
       return this.bottom[par2];
     case 1:
       return this.top[par2];
     default:
       return this.middle[par2];
     }
    }
    
    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            ItemStack itemstack = par5EntityPlayer.inventory.getCurrentItem();

            if (itemstack == null)
            {
                return true;
            }
            else
            {

            	if (itemstack.getItem() == Items.bucket)
                {
                        ItemStack itemstack1 = new ItemStack(Items.water_bucket, 1, 0);

                        if (!par5EntityPlayer.inventory.addItemStackToInventory(itemstack1))
                        {
                            par1World.spawnEntityInWorld(new EntityItem(par1World, (double)par2 + 0.5D, (double)par3 + 1.5D, (double)par4 + 0.5D, itemstack1));
                        }
                        else if (par5EntityPlayer instanceof EntityPlayerMP)
                        {
                            ((EntityPlayerMP)par5EntityPlayer).sendContainerToPlayer(par5EntityPlayer.inventoryContainer);
                        }

                        --itemstack.stackSize;

                        if (itemstack.stackSize <= 0)
                        {
                            par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);
                        }

                    }
                }
                
                {
                    if (itemstack.getItem() == Items.glass_bottle)
                    {
                            ItemStack itemstack1 = new ItemStack(Items.potionitem, 1, 0);

                            if (!par5EntityPlayer.inventory.addItemStackToInventory(itemstack1))
                            {
                                par1World.spawnEntityInWorld(new EntityItem(par1World, (double)par2 + 0.5D, (double)par3 + 1.5D, (double)par4 + 0.5D, itemstack1));
                            }
                            else if (par5EntityPlayer instanceof EntityPlayerMP)
                            {
                                ((EntityPlayerMP)par5EntityPlayer).sendContainerToPlayer(par5EntityPlayer.inventoryContainer);
                            }

                            --itemstack.stackSize;

                            if (itemstack.stackSize <= 0)
                            {
                                par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);
                            }

                        }
                    
                    else if (itemstack.getItem() instanceof ItemArmor && ((ItemArmor)itemstack.getItem()).getArmorMaterial() == ItemArmor.ArmorMaterial.CLOTH)
                    {
                        ItemArmor itemarmor = (ItemArmor)itemstack.getItem();
                        itemarmor.removeColor(itemstack);
                        return true;
                    }

                    return true;
                }
            }
        }
    


    
    public int damageDropped(int i)
    {
        return i;
    }

    public int quantityDropped(Random random)
    {
        return 1;
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
          for(int i = 0; i < 4; i++)
          {
                 par3List.add(new ItemStack(par1, 1, i));
          }
    }

}