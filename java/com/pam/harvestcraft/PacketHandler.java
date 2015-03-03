package com.pam.harvestcraft;


import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler
{
  public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("harvestcraft");
  
  public static void init()
  {
    INSTANCE.registerMessage(MessageMarketBrowse.class, MessageMarketBrowse.class, 0, Side.SERVER);
    INSTANCE.registerMessage(MessageMarketBuy.class, MessageMarketBuy.class, 1, Side.SERVER);
    INSTANCE.registerMessage(MessageMarketClosed.class, MessageMarketClosed.class, 2, Side.SERVER);
  }
}
