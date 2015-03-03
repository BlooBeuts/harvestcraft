package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class PamBeeGenerator implements IWorldGenerator {

	   public void generate(Random random, int chunkX, int chunkZ, World world,
				IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	      switch(world.provider.dimensionId) {
	      case -1:
	         this.generateNether(world, random, chunkX * 16, chunkZ * 16);
	      case 0:
	         this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
	      default:
	      }
	   }

	   public void generateSurface(World world, Random rand, int i, int j) 
	   {
	      
	      for (int k = 0; k < BlockRegistry.beehiveRarity; k++)
			{
					int l = rand.nextInt(128);
					int i1 = i + rand.nextInt(16);
					int j1 = j + rand.nextInt(16);
					if ((world.getBlock(i1, l - 1, j1) == Blocks.leaves || world.getBlock(i1, l - 1, j1) == Blocks.log))
						{
						world.setBlock(i1, l - 1, j1, BlockRegistry.pamBeehive);
						}
			}

	   }

	   public void generateNether(World world, Random rand, int i, int j) {}

	}

