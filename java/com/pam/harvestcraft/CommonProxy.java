package com.pam.harvestcraft;

import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
  public void registerHandlers(FMLPreInitializationEvent event)
  {
    MinecraftForge.EVENT_BUS.register(new EventHandler());
    //harvestcraft.channel.register(new PacketHandler());
  }

  public void registerRenderInformation(FMLPreInitializationEvent event)
  {
	  
  }
  
  public World getClientWorld() {
      return null;
   }
  
}