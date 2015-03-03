package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import cpw.mods.fml.common.IWorldGenerator;

public class PamTreeGenerator 
implements IWorldGenerator
{

	@Override
	 public void generate(Random random, int chunkX, int chunkZ, World world,
				IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	      switch(world.provider.dimensionId) {
	      case 0:
	         this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
	      case 6:
	    	  if(BlockRegistry.enableAroma1997sdimensionalworldfruittreeGen)
		         {
	    		  this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
		         }
	      case 7:
	    	  if(BlockRegistry.enabletwilightforestfruittreeGen)
		         {
	    		  this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
		         }
	      default:
	      }
	   }

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
		if(BiomeDictionary.isBiomeOfType(biome, Type.FOREST) && ! BiomeDictionary.isBiomeOfType(biome, Type.COLD)
				&& ! BiomeDictionary.isBiomeOfType(biome, Type.SPOOKY)
				&& ! BiomeDictionary.isBiomeOfType(biome, Type.MOUNTAIN))
    	{
			
			//Temperate Fruit Trees
				for (int k = 0; k < BlockRegistry.temperatefruittreeRarity; k++)
					{
						int l = rand.nextInt(128);
						int i1 = chunkX + rand.nextInt(16);
						int j1 = chunkZ + rand.nextInt(16);
						if ((world.getBlock(i1, l - 1, j1) == Blocks.grass || world.getBlock(i1, l - 1, j1) == Blocks.dirt))
							{
								switch (rand.nextInt(6))
									{
									case 0:
										if (BlockRegistry.appletreeGeneration)
											{
												(new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamApple)).generate(world, rand, i1, l, j1);
											}
								case 1:
								if (BlockRegistry.avocadotreeGeneration)
								{
								(new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamAvocado)).generate(world, rand, i1, l, j1);
								}
								case 2:
								if (BlockRegistry.cherrytreeGeneration)
								{
								(new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamCherry)).generate(world, rand, i1, l, j1);
								}
								case 3:
								if (BlockRegistry.chestnuttreeGeneration)
								{
								(new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamChestnut)).generate(world, rand, i1, l, j1);
								}
								case 4:
								if (BlockRegistry.nutmegtreeGeneration)
								{
								(new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamNutmeg)).generate(world, rand, i1, l, j1);
								}
								case 5:
								if (BlockRegistry.peartreeGeneration)
								{
								(new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamPear)).generate(world, rand, i1, l, j1);
								}
								case 6:
								if (BlockRegistry.walnuttreeGeneration)
								{
								(new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamWalnut)).generate(world, rand, i1, l, j1);
								}
								}
					}
					
			}
			

		}
		
		//Coconut Only Tree Generation
		if(BiomeDictionary.isBiomeOfType(biome, Type.OCEAN))
    	{
		if (BlockRegistry.coconuttreeGeneration)
		{
			for (int k = 0; k < BlockRegistry.tropicalfruittreeRarity; k++)
				{
						int l = rand.nextInt(128);
						int i1 = chunkX + rand.nextInt(16);
						int j1 = chunkZ + rand.nextInt(16);
						if ((world.getBlock(i1, l - 1, j1) == Blocks.grass || world.getBlock(i1, l - 1, j1) == Blocks.dirt))
							{
								(new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamCoconut)).generate(world, rand, i1, l, j1);
							}
				}
		}
    	}
		
		//Tropical Fruit Trees
		if(BiomeDictionary.isBiomeOfType(biome, Type.WET) 
				&& ! BiomeDictionary.isBiomeOfType(biome, Type.PLAINS) && ! BiomeDictionary.isBiomeOfType(biome, Type.DRY)
				|| BiomeDictionary.isBiomeOfType(biome, Type.HOT)
				&& ! BiomeDictionary.isBiomeOfType(biome, Type.PLAINS) && ! BiomeDictionary.isBiomeOfType(biome, Type.DRY))
    	{
			
				for (int k = 0; k < BlockRegistry.tropicalfruittreeRarity; k++)
					{
							int l = rand.nextInt(128);
							int i1 = chunkX + rand.nextInt(16);
							int j1 = chunkZ + rand.nextInt(16);
							if ((world.getBlock(i1, l - 1, j1) == Blocks.grass || world.getBlock(i1, l - 1, j1) == Blocks.dirt))
								{
								switch (rand.nextInt(24))
								{
								case 0:
									if (BlockRegistry.bananatreeGeneration)
										{
											(new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamBanana)).generate(world, rand, i1, l, j1);
										}
								case 1:
									if (BlockRegistry.cinnamontreeGeneration)
										{
											(new WorldGenPamFruitLogTree(true, 5, 3, 3, BlockRegistry.pamCinnamon)).generate(world, rand, i1, l, j1);
										}
								case 2:
									if (BlockRegistry.coconuttreeGeneration)
										{
									(new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamCoconut)).generate(world, rand, i1, l, j1);
										}
								case 3:
									if (BlockRegistry.datetreeGeneration)
										{
									(new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamDate)).generate(world, rand, i1, l, j1);
										}
								case 4:
									if (BlockRegistry.dragonfruittreeGeneration)
										{
									(new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamDragonfruit)).generate(world, rand, i1, l, j1);
										}
								case 5:
									if (BlockRegistry.papayatreeGeneration)
										{
									(new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamPapaya)).generate(world, rand, i1, l, j1);
										}
								case 6:
									if (BlockRegistry.almondtreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamAlmond)).generate(world, rand, i1, l, j1);
										}
								case 7:
									if (BlockRegistry.apricottreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamApricot)).generate(world, rand, i1, l, j1);
										}
								case 8:
									if (BlockRegistry.cashewtreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamCashew)).generate(world, rand, i1, l, j1);
										}
								case 9:
									if (BlockRegistry.duriantreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamDurian)).generate(world, rand, i1, l, j1);
										}
								case 10:
									if (BlockRegistry.figtreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamFig)).generate(world, rand, i1, l, j1);
										}
								case 11:
									if (BlockRegistry.grapefruittreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamGrapefruit)).generate(world, rand, i1, l, j1);
										}
								case 12:
									if (BlockRegistry.lemontreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamLemon)).generate(world, rand, i1, l, j1);
										}
								case 13:
									if (BlockRegistry.limetreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamLime)).generate(world, rand, i1, l, j1);
										}
								case 14:
									if (BlockRegistry.mangotreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamMango)).generate(world, rand, i1, l, j1);
										}
								case 15:
									if (BlockRegistry.orangetreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamOrange)).generate(world, rand, i1, l, j1);
										}
								case 16:
									if (BlockRegistry.paperbarktreeGeneration)
										{
									(new WorldGenPamFruitLogTree(true, 5, 3, 3, BlockRegistry.pamPaperbark)).generate(world, rand, i1, l, j1);
										}
								case 17:
									if (BlockRegistry.peachtreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPeach)).generate(world, rand, i1, l, j1);
										}
								case 18:
									if (BlockRegistry.pecantreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPecan)).generate(world, rand, i1, l, j1);
										}
								case 19:
									if (BlockRegistry.peppercorntreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPeppercorn)).generate(world, rand, i1, l, j1);
										}
								case 20:
									if (BlockRegistry.persimmontreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPersimmon)).generate(world, rand, i1, l, j1);
										}
								case 21:
									if (BlockRegistry.pistachiotreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPistachio)).generate(world, rand, i1, l, j1);
										}
								case 22:
									if (BlockRegistry.pomegranatetreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPomegranate)).generate(world, rand, i1, l, j1);
										}
								case 23:
									if (BlockRegistry.starfruittreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamStarfruit)).generate(world, rand, i1, l, j1);
										}
								case 24:
									if (BlockRegistry.vanillabeantreeGeneration)
										{
									(new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamVanillabean)).generate(world, rand, i1, l, j1);
										}
								}
					}
			}

			
    	
		
		if(BiomeDictionary.isBiomeOfType(biome, Type.CONIFEROUS))
    	{
			if (BlockRegistry.mapletreeGeneration)
			{
				for (int k = 0; k < BlockRegistry.coniferousfruittreeRarity; k++)
					{
							int l = rand.nextInt(128);
							int i1 = chunkX + rand.nextInt(16);
							int j1 = chunkZ + rand.nextInt(16);
							if ((world.getBlock(i1, l - 1, j1) == Blocks.grass || world.getBlock(i1, l - 1, j1) == Blocks.dirt))
								{
									(new WorldGenPamFruitLogTree(true, 5, 1, 1, BlockRegistry.pamMaple)).generate(world, rand, i1, l, j1);
								}
					}
			}
    	}
		
	
    	
		
    }
}
}

