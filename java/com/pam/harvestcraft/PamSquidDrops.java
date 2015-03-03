package com.pam.harvestcraft;

import net.minecraft.entity.passive.EntitySquid;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PamSquidDrops 
{
	public static double rand;
	@SubscribeEvent
      public void onEntityDrop(LivingDropsEvent event) 
	{
		

              if (event.source.getDamageType().equals("player")) 
              {
            	  rand = Math.random();
                    if (event.entityLiving instanceof EntitySquid) 
                    {
                    	if (rand < 0.50d){
                            event.entityLiving.dropItem(ItemRegistry.calamarirawItem, 1);
                    	}
                    	if (rand < 0.25d){
                            event.entityLiving.dropItem(ItemRegistry.calamarirawItem, 1);
                    	}

              }
 }
	}
	
	
}