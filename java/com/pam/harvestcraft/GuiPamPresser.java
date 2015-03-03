package com.pam.harvestcraft;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiPamPresser extends GuiContainer {

	   private TileEntityPamPresser combPresserInventory;
	   private static final net.minecraft.util.ResourceLocation resourceLocation = new net.minecraft.util.ResourceLocation("harvestcraft", "textures/gui/presser.png");

	   public GuiPamPresser(InventoryPlayer par1InventoryPlayer, TileEntityPamPresser par2TileEntityPamPresser) {
	      super(new ContainerPamPresser(par1InventoryPlayer, par2TileEntityPamPresser));
	      this.combPresserInventory = par2TileEntityPamPresser;
	   }

	   protected void drawGuiContainerForegroundLayer(int par1, int par2) {}

	   protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
	      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	      this.mc.getTextureManager().bindTexture(resourceLocation);
	      int var5 = (super.width - super.xSize) / 2;
	      int var6 = (super.height - super.ySize) / 2;
	      this.drawTexturedModalRect(var5, var6, 0, 0, super.xSize, super.ySize);
	      if(this.combPresserInventory.isBurning()) {
	         ;
	      }

	      int var7 = this.combPresserInventory.getCookProgressScaled(24);
	      this.drawTexturedModalRect(var5 + 76, var6 + 8, 176, 18, var7 + 1, 16);
	   }
	}