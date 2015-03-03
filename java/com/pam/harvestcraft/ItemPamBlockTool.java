package com.pam.harvestcraft;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;



public class ItemPamBlockTool extends Item
{

	/** The ID of the block the reed will spawn when used from inventory bar. */
	public final Block spawnID;

 public ItemPamBlockTool(Block par2Block) 
 {
  super();
  this.setMaxStackSize(1);
  this.spawnID = par2Block;
 }

  
 public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
 {
     return false;
 }
 
 public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
 {

    if (!world.setBlock(x, y, z, spawnID, metadata, 3))
    {
        return false;
    }

    if (world.getBlock(x, y, z) == spawnID)
    {
        spawnID.onBlockPlacedBy(world, x, y, z, player, stack);
        spawnID.onPostBlockPlaced(world, x, y, z, metadata);
    }

    return true;
 }
 
 public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
 {
     Block block = par3World.getBlock(par4, par5, par6);

     if (block == Blocks.snow_layer && (par3World.getBlockMetadata(par4, par5, par6) & 7) < 1)
     {
         par7 = 1;
     }
     else if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush && !block.isReplaceable(par3World, par4, par5, par6))
     {
         if (par7 == 0)
         {
             --par5;
         }

         if (par7 == 1)
         {
             ++par5;
         }

         if (par7 == 2)
         {
             --par6;
         }

         if (par7 == 3)
         {
             ++par6;
         }

         if (par7 == 4)
         {
             --par4;
         }

         if (par7 == 5)
         {
             ++par4;
         }
     }

     if (par1ItemStack.stackSize == 0)
     {
         return false;
     }
     else if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
     {
         return false;
     }
     else if (par5 == 255 && this.spawnID.getMaterial().isSolid())
     {
         return false;
     }
     else if (par3World.canPlaceEntityOnSide(this.spawnID, par4, par5, par6, false, par7, par2EntityPlayer, par1ItemStack))
     {
         int i1 = this.getMetadata(par1ItemStack.getItemDamage());
         int j1 = this.spawnID.onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, i1);

         if (placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, j1))
         {
             par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), this.spawnID.stepSound.func_150496_b(), (this.spawnID.stepSound.getVolume() + 1.0F) / 2.0F, this.spawnID.stepSound.getPitch() * 0.8F);
             --par1ItemStack.stackSize;
         }

         return true;
     }
     else
     {
         return false;
     }
 }

 
 

  
  
}