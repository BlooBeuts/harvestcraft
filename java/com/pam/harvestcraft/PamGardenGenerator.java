package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import cpw.mods.fml.common.IWorldGenerator;

public class PamGardenGenerator 
implements IWorldGenerator
{

	@Override
	 public void generate(Random random, int chunkX, int chunkZ, World world,
				IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	      switch(world.provider.dimensionId) {

	      case 0:
	         this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
	      case 6:
	    	  if(BlockRegistry.enableAroma1997sdimensionalworldgardenGen)
		         {
	    		  this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
		         }
	      case 7:
	    	  if(BlockRegistry.enabletwilightforestgardenGen)
		         {
	    		  this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
		         }
	      default:
	      }
	   }

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
		
		if (BlockRegistry.enableberrygardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.FOREST)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.HILLS)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.COLD)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.WET))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamberryGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enabledesertgardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.SANDY))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamdesertGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enablegrassgardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.PLAINS) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamgrassGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enablegourdgardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.PLAINS)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.FOREST))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamgourdGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enablegroundgardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.MOUNTAIN)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.HILLS)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.MESA)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.SAVANNA))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamgroundGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enableherbgardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.FOREST) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.WET))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamherbGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enableleafygardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.FOREST) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.WET))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamleafyGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enablemushroomgardenGeneration)
        {
			if(BiomeDictionary.isBiomeOfType(biome, Type.FOREST) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD)
					&& ! BiomeDictionary.isBiomeOfType(biome, Type.MOUNTAIN)
					|| BiomeDictionary.isBiomeOfType(biome, Type.WET))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamMushroomGarden(BlockRegistry.pammushroomGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enablestalkgardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.PLAINS) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.FOREST) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.WET))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamstalkGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enabletextilegardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.COLD)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.HILLS)
    			|| BiomeDictionary.isBiomeOfType(biome, Type.WET))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamtextileGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enabletropicalgardenGeneration)
        {
			if(BiomeDictionary.isBiomeOfType(biome, Type.WET) || BiomeDictionary.isBiomeOfType(biome, Type.HOT))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamtropicalGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
		
		if (BlockRegistry.enablewatergardenGeneration)
        {
    	if(BiomeDictionary.isBiomeOfType(biome, Type.OCEAN) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD)
    			||BiomeDictionary.isBiomeOfType(biome, Type.RIVER) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD))
    	{
    		for (int i = 0; i < BlockRegistry.gardenRarity; i++)
    		{
    			int flowerType = rand.nextInt(1);
    			int randPosX = chunkX + rand.nextInt(16) + 8;
    			int randPosY = rand.nextInt(128);
    			int randPosZ = chunkZ + rand.nextInt(16) + 8;
    			(new WorldGenPamGarden(BlockRegistry.pamwaterGarden, flowerType)).generate(world, rand, randPosX, randPosY, randPosZ);
    		}
    	}
        }
    	
    }
}
    


