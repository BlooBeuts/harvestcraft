package com.pam.harvestcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerPamApiary extends Container {

	   private TileEntityPamApiary apiary;
	   private int lastProduceTime = 0;
	   private int lastRunTime = 0;
	   private int lastBeeRunTime = 0;


	   public ContainerPamApiary(InventoryPlayer par1InventoryPlayer, TileEntityPamApiary par2TileEntityPamApiary) {
	      this.apiary = par2TileEntityPamApiary;
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 0, 62, 17));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 1, 62, 35));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 2, 62, 53));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 3, 80, 17));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 4, 80, 35));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 5, 80, 53));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 6, 98, 17));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 7, 98, 35));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 8, 98, 53));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 9, 116, 17));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 10, 116, 35));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 11, 116, 53));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 12, 134, 17));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 13, 134, 35));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 14, 134, 53));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 15, 152, 17));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 16, 152, 35));
	      this.addSlotToContainer(new SlotPamResult(par1InventoryPlayer.player, par2TileEntityPamApiary, 17, 152, 53));
	      this.addSlotToContainer(new SlotPamApiary(par1InventoryPlayer.player, par2TileEntityPamApiary, 18, 26, 35));

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
	         if(this.lastProduceTime != this.apiary.apiaryProduceTime) {
	            var2.sendProgressBarUpdate(this, 18, this.apiary.apiaryProduceTime);
	         }

	         if(this.lastRunTime != this.apiary.apiaryRunTime) {
	            var2.sendProgressBarUpdate(this, 18, this.apiary.apiaryRunTime);
	         }

	         if(this.lastBeeRunTime != this.apiary.currentBeeRunTime) {
	            var2.sendProgressBarUpdate(this, 18, this.apiary.currentBeeRunTime);
	         }
	      }

	      this.lastProduceTime = this.apiary.apiaryProduceTime;
	      this.lastRunTime = this.apiary.apiaryRunTime;
	      this.lastBeeRunTime = this.apiary.currentBeeRunTime;
	   }

	   public void updateProgressBar(int par1, int par2) {
	      if(par1 == 18) {
	         this.apiary.apiaryRunTime = par2;
	         this.apiary.currentBeeRunTime = par2;
	         this.apiary.apiaryProduceTime = par2;
	      }

	   }

	   public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
	      return this.apiary.isUseableByPlayer(par1EntityPlayer);
	   }

	   public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int slotNumber) {
	      return null;
	   }
	}