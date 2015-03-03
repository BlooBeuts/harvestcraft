package com.pam.harvestcraft;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

public class GuiPamApiary extends GuiContainer {
	private static final net.minecraft.util.ResourceLocation resourceLocation = new net.minecraft.util.ResourceLocation("harvestcraft", "textures/gui/apiary.png");
	
    public GuiPamApiary (InventoryPlayer inventoryPlayer,
                    TileEntityPamApiary tileentitypamapiary) {
            super(new ContainerPamApiary(inventoryPlayer, tileentitypamapiary));
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
            //draw text and stuff here
            //the parameters for drawString are: string, x, y, color
    	fontRendererObj.drawString("Apiary", 8, 8, 4210752);
            //draws "Inventory" or your regional equivalent
    	fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 4, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        // new "bind tex"
        this.mc.getTextureManager().bindTexture(resourceLocation);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }

}
