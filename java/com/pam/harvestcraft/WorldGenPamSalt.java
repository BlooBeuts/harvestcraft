package com.pam.harvestcraft;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenPamSalt implements IWorldGenerator 
{
		@Override
	    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
		{
	        switch (world.provider.dimensionId) {
	            case 0: GenerateOverworld(random, chunkX * 16, chunkZ * 16, world); break;
	        }
	    }
		
		private void GenerateOverworld(Random random, int x, int z, World world) 
		{
			this.addOreSpawn(BlockRegistry.pamSalt, world, random, x, z, 4, 6, BlockRegistry.saltRarity, 0, 128);
	    }
		
		 public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
		    {
		        WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.stone);
		        for(int i = 0; i < chancesToSpawn; i++)
		        {
		            int posX = blockXPos + random.nextInt(16);
		            int posY = minY + random.nextInt(maxY - minY);
		            int posZ = blockZPos + random.nextInt(16);
		            minable.generate(world, random, posX, posY, posZ);
		        }
		    }


}


