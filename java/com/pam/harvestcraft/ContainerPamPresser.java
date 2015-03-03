package com.pam.harvestcraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerPamPresser extends Container {

	   private TileEntityPamPresser combPresser;
	   private int lastCookTime = 0;
	   private int lastBurnTime = 0;
	   private int lastCombPresserBurnTime = 0;


	   public ContainerPamPresser(InventoryPlayer par1InventoryPlayer, TileEntityPamPresser par2TileEntityCombPresser) {
	      this.combPresser = par2TileEntityCombPresser;
	      this.addSlotToContainer(new SlotPamPresser(par1InventoryPlayer.player, par2TileEntityCombPresser, 0, 80, 23));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityCombPresser, 1, 62, 54));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityCombPresser, 2, 98, 54));

	      int var3;
	      for(var3 = 0; var3 < 3; ++var3) {
	         for(int var4 = 0; var4 < 9; ++var4) {
	            this.addSlotToContainer(new Slot(par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
	         }
	      }

	      for(var3 = 0; var3 < 9; ++var3) {
	         this.addSlotToContainer(new Slot(par1InventoryPlayer, var3, 8 + var3 * 18, 142));
	      }

	   }

	   public void detectAndSendChanges() {
	      super.detectAndSendChanges();

	      for(int var1 = 0; var1 < super.crafters.size(); ++var1) {
	         ICrafting var2 = (ICrafting)super.crafters.get(var1);
	         if(this.lastCookTime != this.combPresser.combPresserCookTime) {
	            var2.sendProgressBarUpdate(this, 0, this.combPresser.combPresserCookTime);
	         }

	         if(this.lastBurnTime != this.combPresser.combPresserBurnTime) {
	            var2.sendProgressBarUpdate(this, 1, this.combPresser.combPresserBurnTime);
	         }

	         if(this.lastCombPresserBurnTime != this.combPresser.currentCombPresserBurnTime) {
	            var2.sendProgressBarUpdate(this, 2, this.combPresser.currentCombPresserBurnTime);
	         }
	      }

	      this.lastCookTime = this.combPresser.combPresserCookTime;
	      this.lastBurnTime = this.combPresser.combPresserBurnTime;
	      this.lastCombPresserBurnTime = this.combPresser.currentCombPresserBurnTime;
	   }

	   @SideOnly(Side.CLIENT)
	   public void updateProgressBar(int par1, int par2) {
	      if(par1 == 0) {
	         this.combPresser.combPresserCookTime = par2;
	      }

	      if(par1 == 1) {
	         this.combPresser.combPresserBurnTime = par2;
	      }

	      if(par1 == 2) {
	         this.combPresser.currentCombPresserBurnTime = par2;
	      }

	   }

	   public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
	      return this.combPresser.isUseableByPlayer(par1EntityPlayer);
	   }

	   public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
	      return null;
	   }
	}

