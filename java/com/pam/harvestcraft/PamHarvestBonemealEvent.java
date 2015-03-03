package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.BonemealEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PamHarvestBonemealEvent
{
	public static Block PamSaplings[];
	public static Block PamGardens[];
	
	@SubscribeEvent
	public void onUseBonemeal(BonemealEvent event)
	{
		World world = event.world;

		int x = event.x;
		int y = event.y;
		int z = event.z;

		Block block = event.block;
		int meta = event.world.getBlockMetadata(x, y, z);
		
		Random rand = new Random();
		if (!event.world.isRemote && !event.isCanceled() && event.getResult() != Result.ALLOW)
        {
			
        
				if (event.world.getBlock(x, y, z) instanceof BlockPamFruit && !event.world.isRemote)
		        {
		            	((BlockPamFruit)event.block).fertilize(event.world, event.x, event.y, event.z);
		            	event.setResult(Result.ALLOW);
		        }
				
				if (event.world.getBlock(x, y, z) instanceof BlockPamSapling && !event.world.isRemote) 
				{
						((BlockPamSapling)event.block).markOrGrowMarked(event.world, event.x, event.y, event.z, event.world.rand);
						event.setResult(Result.ALLOW);
				}
				
				
		}
        }
		
	
	}
		
	

