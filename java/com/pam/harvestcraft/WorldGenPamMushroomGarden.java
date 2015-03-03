package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPamMushroomGarden extends WorldGenerator
{
	public WorldGenPamMushroomGarden(Block p_i45452_1_, int i)
    {
        this.plantBlockId = p_i45452_1_;
        this.flowerType = i;
    }

    public boolean generate(World world, Random random, int i, int j, int k)
    {
        for (int l = 0; l < 8; l++)
        {
            int i1 = (i + random.nextInt(8)) - random.nextInt(8);
            int j1 = (j + random.nextInt(4)) - random.nextInt(4);
            int k1 = (k + random.nextInt(8)) - random.nextInt(8);

            if (world.isAirBlock(i1, j1, k1) && this.plantBlockId.canPlaceBlockAt(world, i1, j1, k1))
            {
            	world.setBlock(i1, j1, k1, Blocks.log, 4, 2);
            	world.setBlock(i1 + 1, j1, k1, Blocks.log, 4, 2);
            	world.setBlock(i1 - 1, j1, k1, Blocks.log, 4, 2);
                world.setBlock(i1, j1 + 1, k1, this.plantBlockId, flowerType, 2);
            }
        }

        return true;
    }

    private Block plantBlockId;
    private int flowerType; 
}