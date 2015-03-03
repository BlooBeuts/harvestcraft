package com.pam.harvestcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPamResult extends Slot
{
	private EntityPlayer thePlayer;

  public SlotPamResult(EntityPlayer par1EntityPlayer, IInventory par2IInventory, int par3, int par4, int par5)
  {
    super(par2IInventory, par3, par4, par5);
    this.thePlayer = par1EntityPlayer;
  }

  /**
   * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
   */
  public boolean isItemValid(ItemStack par1ItemStack)
  {
      return false;
  }

  public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
  {
      super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
  }

}