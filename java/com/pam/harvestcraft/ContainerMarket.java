package com.pam.harvestcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerMarket extends Container
{
	public ContainerMarket(IInventory par1IInventory, IInventory par2IInventory)
	{
		par2IInventory.openInventory();

		this.addSlotToContainer(new Slot(par2IInventory, 0, 8 + 0 * 18 + 105, 38));

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; ++j)
			{
				this.addSlotToContainer(new Slot(par1IInventory, j + i * 9 + 9, j * 18 + 8, i * 18 + 95));
			}
		}

		for (int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(par1IInventory, i, i * 18 + 8, 153));
		}
	}

	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return true;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(par2);

		if (slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (par2 == 0)
			{
				if (!this.mergeItemStack(itemstack1, 1, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(itemstack1, 0, 1, false))
			{
				return null;
			}

			if (itemstack1.stackSize == 0)
			{
				slot.putStack((ItemStack) null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}

	/**
	 * Callback for when the crafting gui is closed.
	 */
	public void onContainerClosed(EntityPlayer par1EntityPlayer)
	{
		super.onContainerClosed(par1EntityPlayer);
	}

}
