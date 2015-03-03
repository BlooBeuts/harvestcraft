package com.pam.harvestcraft;

import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
  public void registerRenderInformation(FMLPreInitializationEvent event)
  {
    TileEntityHandler.registerTileEntityRenderers();
    MinecraftForge.EVENT_BUS.register(new EventHandler());

  }
  
  public World getClientWorld() {
  	return FMLClientHandler.instance().getClient().theWorld;
	}
}