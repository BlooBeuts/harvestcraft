package com.pam.harvestcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	  {
		 final TileEntity tileEntity = world.getTileEntity(x, y, z);
		 switch(ID) {
         case 0:
	            return new ContainerPamApiary(player.inventory,
	                    (TileEntityPamApiary) tileEntity);
         case 1:
	           return new ContainerPamPresser(player.inventory,
	                    (TileEntityPamPresser) tileEntity);
         case 2:
	            return new ContainerPamCuttingBoard(player.inventory, world, x, y, z);
         case 3:
	            return new ContainerPamPot(player.inventory, world, x, y, z);
         case 4:
	           return new ContainerMarket(player.inventory,
	                    (TileEntityMarket) tileEntity);
         case 5:
	           return new ContainerOven(player.inventory,
	                    (TileEntityOven) tileEntity);
		 }
		 return null;
	  }

	@Override
	  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		  final TileEntity tileEntity = world.getTileEntity(x, y, z);
		  switch(ID) {
	         case 0:
		            return new GuiPamApiary(player.inventory,
		                    (TileEntityPamApiary) tileEntity);
	         case 1:
		            return new GuiPamPresser(player.inventory,
		                    (TileEntityPamPresser) tileEntity);
	         case 2:
		            return new GuiPamCuttingBoard(player.inventory, world, x, y, z);
	         case 3:
		            return new GuiPamPot(player.inventory, world, x, y, z);
	         case 4:
		            return new GuiMarket(player.inventory,
		                    (TileEntityMarket) tileEntity);
	         case 5:
		            return new GuiOven(player.inventory,
		                    (TileEntityOven) tileEntity);
			 }
			 return null;
	  }

}
