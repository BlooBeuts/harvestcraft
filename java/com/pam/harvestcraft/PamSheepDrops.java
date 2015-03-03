package com.pam.harvestcraft;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class PamSheepDrops 
{
	public static double rand;
	@SubscribeEvent
      public void onEntityDrop(LivingDropsEvent event) 
	{
		

              if (event.source.getDamageType().equals("player")) 
              {
            	  rand = Math.random();
                    if (event.entityLiving instanceof EntitySheep) 
                    {
                    	if (rand < 0.50d){
                            event.entityLiving.dropItem(ItemRegistry.muttonrawItem, 1);
                    	}
                    	if (rand < 0.25d){
                            event.entityLiving.dropItem(ItemRegistry.muttonrawItem, 1);
                    	}

              }
 }
	}
}
