package com.pam.harvestcraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemEditableBook;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;

public class ItemPamBook extends ItemEditableBook
{
   public ItemPamBook() 
   {
	   super();
	   this.setMaxStackSize(1);
   }


   private NBTTagList putTableOfContents(NBTTagList bookTagList)
   {
	   NBTTagCompound tag = new NBTTagCompound();
	   NBTTagList bookPages = new NBTTagList();
       bookPages.appendTag(new NBTTagString("Page 1"));
      
      return bookTagList;
   }
   
   public void onUpdate(ItemStack itemStack, World world, Entity entity, int unknownInt, boolean unknownBool)
   {
      NBTTagList bookTagList = new NBTTagList();
      NBTTagCompound tag = new NBTTagCompound();
      bookTagList = putTableOfContents(bookTagList);
      
      itemStack.setTagInfo("pages", bookTagList);
      itemStack.setTagInfo("author", new NBTTagString("Pam"));
      itemStack.setTagInfo("title", new NBTTagString("HarvestCraft Cookbook"));
      itemStack = PamOtherRecipes.book;
   }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
   {
       par3EntityPlayer.displayGUIBook(par1ItemStack);
       return par1ItemStack;
   }
   
}
