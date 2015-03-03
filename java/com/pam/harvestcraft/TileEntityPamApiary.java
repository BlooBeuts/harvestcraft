package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityPamApiary extends TileEntity implements IInventory {

	   private ItemStack[] apiaryItemStacks = new ItemStack[19];
	   public int apiaryRunTime = 0;
	   public int currentBeeRunTime = 0;
	   public int apiaryProduceTime = 0;


	   public int getSizeInventory() {
	      return this.apiaryItemStacks.length;
	   }

	   public ItemStack getStackInSlot(int par1) {
	      return this.apiaryItemStacks[par1];
	   }

	   public ItemStack decrStackSize(int par1, int par2) {
	      if(this.apiaryItemStacks[par1] != null) {
	         ItemStack var3;
	         if(this.apiaryItemStacks[par1].stackSize <= par2) {
	            var3 = this.apiaryItemStacks[par1];
	            this.apiaryItemStacks[par1] = null;
	            return var3;
	         } else {
	            var3 = this.apiaryItemStacks[par1].splitStack(par2);
	            if(this.apiaryItemStacks[par1].stackSize == 0) {
	               this.apiaryItemStacks[par1] = null;
	            }

	            return var3;
	         }
	      } else {
	         return null;
	      }
	   }

	   public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
	      this.apiaryItemStacks[par1] = par2ItemStack;
	      if(par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
	         par2ItemStack.stackSize = this.getInventoryStackLimit();
	      }

	   }

	   public String getInvName() {
	      return "Apiary";
	   }

	   public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
	      super.readFromNBT(par1NBTTagCompound);
	      NBTTagList var2 = par1NBTTagCompound.getTagList("Items", 10);
	      this.apiaryItemStacks = new ItemStack[this.getSizeInventory()];

	      for(int var3 = 0; var3 < var2.tagCount(); ++var3) {
	         NBTTagCompound var4 = (NBTTagCompound)var2.getCompoundTagAt(var3);
	         byte var5 = var4.getByte("Slot");
	         if(var5 >= 0 && var5 < this.apiaryItemStacks.length) {
	            this.apiaryItemStacks[var5] = ItemStack.loadItemStackFromNBT(var4);
	         }
	      }

	      this.apiaryRunTime = par1NBTTagCompound.getShort("RunTime");
	      this.apiaryProduceTime = par1NBTTagCompound.getShort("ProduceTime");
	      this.currentBeeRunTime = this.getRunTime(this.apiaryItemStacks[1]);
	   }

	   public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
	      super.writeToNBT(par1NBTTagCompound);
	      par1NBTTagCompound.setShort("RunTime", (short)this.apiaryRunTime);
	      par1NBTTagCompound.setShort("ProduceTime", (short)this.apiaryProduceTime);
	      NBTTagList var2 = new NBTTagList();

	      for(int var3 = 0; var3 < this.apiaryItemStacks.length; ++var3) {
	         if(this.apiaryItemStacks[var3] != null) {
	            NBTTagCompound var4 = new NBTTagCompound();
	            var4.setByte("Slot", (byte)var3);
	            this.apiaryItemStacks[var3].writeToNBT(var4);
	            var2.appendTag(var4);
	         }
	      }

	      par1NBTTagCompound.setTag("Items", var2);
	   }

	   public int getInventoryStackLimit() {
	      return 64;
	   }

	   public int getSpeed() {
	      byte var1 = 2;
	      int var2 = 3500;
	      World var3World = super.worldObj;
	      int varX = super.xCoord;
	      int varY = super.yCoord;
	      int varZ = super.zCoord;

	      for(int var4 = -var1; var4 <= var1; ++var4) {
	         for(int var5 = -var1; var5 <= var1; ++var5) {
	            if(var4 * var4 + var5 * var5 <= var1 * var1 && (var4 != -(var1 - 1) || var5 != -(var1 - 1)) && (var4 != var1 - 1 || var5 != var1 - 1) && (var4 != var1 - 1 || var5 != -(var1 - 1)) && (var4 != -(var1 - 1) || var5 != var1 - 1)) {
	               //Block varBlockID = var3World.getBlock(varX + var4, varY, varZ + var5);
	               if(blockType instanceof BlockFlower) {
	                  var2 = (int)((double)var2 * 0.95D);
	               }

	               if(var3World.getBlock(varX + var4, varY, varZ + var5) == BlockRegistry.pamApiary) {
	                  var2 = (int)((double)var2 / 0.85D);
	               }
	            }
	         }
	      }

	      return var2;
	   }

	   public void updateEntity() {
	      boolean var1 = this.apiaryRunTime > 0;
	      boolean var2 = false;
	      if(this.apiaryRunTime > 0) {
	         --this.apiaryRunTime;
	      }

	      if(!super.worldObj.isRemote) {
	         if(this.apiaryRunTime == 0 && this.canRun()) {
	            this.currentBeeRunTime = this.apiaryRunTime = this.getRunTime(this.apiaryItemStacks[18]);
	            if(this.apiaryRunTime > 0) {
	               var2 = true;
	               if(this.apiaryItemStacks[18] != null) {
	                  if(this.apiaryItemStacks[18].getItem().getContainerItem() != null) {
	                     this.apiaryItemStacks[18] = new ItemStack(this.apiaryItemStacks[18].getItem().setFull3D());
	                  } else {
	                     this.apiaryItemStacks[18].stackSize -= 0;
	                  }

	                  if(this.apiaryItemStacks[18].stackSize == 0) {
	                     this.apiaryItemStacks[18] = null;
	                  }
	               }
	            }
	         }

	         if(this.canRun()) {
	            ++this.apiaryProduceTime;
	            if((double)this.apiaryProduceTime >= Math.floor((double)this.getSpeed())) {
	               this.apiaryProduceTime = 0;
	               this.run();
	               var2 = true;
	            }
	         } else {
	            this.apiaryProduceTime = 0;
	         }

	         if(var1 != this.apiaryRunTime > 0) {
	            var2 = true;
	         }
	      }

	      if(var2) {
	         this.onInventoryChanged();
	      }

	   }

	   public void onInventoryChanged() {}

	   private boolean canRun() 
	   {

	      //return this.apiaryItemStacks[18] == null?false:this.apiaryItemStacks[18].getItem().itemID == PamHarvestCraft.queenbeeItem.itemID;
		  //return this.apiaryItemStacks[18] == null?false:this.apiaryItemStacks[18].getItem().itemID == PamHarvestCraft.queenbeeItem.itemID && this.apiaryItemStacks[18].getItemDamage() != 0;
		  if (this.apiaryItemStacks[18] != null)
		  {
			  if (this.apiaryItemStacks[18].getItem() == ItemRegistry.queenbeeItem)
			  {
				  if (this.apiaryItemStacks[18].getItemDamage() != 18)
					  return true;
			  }
		  } else 
			  return false;
		return false;
	   }

	   public ItemStack getComb() {
	      Random var1Random = new Random();
	      int var2Chance = var1Random.nextInt(100);
	      if (this.apiaryItemStacks[18] != null)
		  {
			  if (this.apiaryItemStacks[18].getItem() == ItemRegistry.queenbeeItem)
			  {
				  if (this.apiaryItemStacks[18].getItemDamage() == 17)
					  return new ItemStack(ItemRegistry.grubItem);
			  }
			  if(var2Chance < 50) {
			         return new ItemStack(ItemRegistry.waxcombItem);
			      } else if(var2Chance >= 50 && var2Chance < 95) {
			         return new ItemStack(ItemRegistry.honeycombItem);
			      }
				return new ItemStack(ItemRegistry.grubItem);
		  }
		return null;  
			  
	      
	      
	   }

	   public void run() 
	   {
		  this.apiaryItemStacks[18].attemptDamageItem(1, null);
	      ItemStack var1ItemStack = this.getComb();
	      for(int var2 = 0; var2 < 18; ++var2) {
	         if(this.apiaryItemStacks[var2] == null) {
	            this.apiaryItemStacks[var2] = var1ItemStack.copy();
	            break;
	 
	         }
	      }
	    }
	    

	   int getRunTime(ItemStack par1ItemStack) {
	      return par1ItemStack == null?0:(par1ItemStack.getItem() == ItemRegistry.queenbeeItem?3200:0);
	   }

	   public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
	      return super.worldObj.getTileEntity(super.xCoord, super.yCoord, super.zCoord) != this?false:par1EntityPlayer.getDistanceSq((double)super.xCoord + 0.5D, (double)super.yCoord + 0.5D, (double)super.zCoord + 0.5D) <= 64.0D;
	   }

	   public void openChest() {}

	   public void closeChest() {}

	   public ItemStack getStackInSlotOnClosing(int par1) {
	      return null;
	   }

	   public boolean isInvNameLocalized() {
	      return false;
	   }

	   public boolean isStackValidForSlot(int i, ItemStack itemstack) {
	      return false;
	   }

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Packet getDescriptionPacket() {
	NBTTagCompound tag = new NBTTagCompound();
	this.writeToNBT(tag);
	return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	}
		
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
	readFromNBT(packet.func_148857_g());
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}
	}