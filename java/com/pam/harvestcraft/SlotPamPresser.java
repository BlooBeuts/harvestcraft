package com.pam.harvestcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPamPresser extends Slot {

	   private EntityPlayer thePlayer;


	   public SlotPamPresser(EntityPlayer par1EntityPlayer, IInventory par2IInventory, int par3, int par4, int par5) {
	      super(par2IInventory, par3, par4, par5);
	      this.setThePlayer(par1EntityPlayer);
	   }

	   public boolean isItemValid(ItemStack par1ItemStack) {
	      return true;
	   }

	   public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
	      super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
	   }

	public EntityPlayer getThePlayer() {
		return thePlayer;
	}

	public void setThePlayer(EntityPlayer thePlayer) {
		this.thePlayer = thePlayer;
	}
	}