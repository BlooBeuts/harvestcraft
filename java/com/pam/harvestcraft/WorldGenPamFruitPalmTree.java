package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenPamFruitPalmTree extends WorldGenAbstractTree
{
    private final int minTreeHeight;
    private final int metaWood;
    private final int metaLeaves;
    private final Block fruitType;

    
    public WorldGenPamFruitPalmTree(boolean par1, int par2, int par3, int par4, Block par5)
    {
        super(par1);
        this.minTreeHeight = par2;
        this.metaWood = par3;
        this.metaLeaves = par4;
        this.fruitType = par5;
    }

    public boolean generate(World par1World, Random par2Random, int x, int y, int z)
    {
    	int treeHeight = par2Random.nextInt(2) + minTreeHeight;
        boolean flag = true;

        // One super long check to see if the tree can spawn here
        if (y >= 1 && y + treeHeight + 1 <= 256)
        {
            int i1;
            byte b0;
            int j1;
            Block k1;

            for (i1 = y; i1 <= y + 1 + treeHeight; ++i1)
            {
                b0 = 1;

                if (i1 == y)
                {
                    b0 = 0;
                }

                if (i1 >= y + 1 + treeHeight - 2)
                {
                    b0 = 2;
                }

                for (int l1 = x - b0; l1 <= x + b0 && flag; ++l1)
                {
                    for (j1 = x - b0; j1 <= x + b0 && flag; ++j1)
                    {
                        if (i1 >= 0 && i1 < 256)
                        {
                            k1 = par1World.getBlock(l1, i1, j1);

                            
                            if (!par1World.isAirBlock(l1, i1, j1) &&
                                !k1.isLeaves(par1World, l1, i1, j1) &&
                                 k1 != Blocks.grass &&
                                 k1 != Blocks.dirt &&
                                !k1.isWood(par1World, l1, i1, j1))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }

        Block j11 = par1World.getBlock(x, y - 1, z);

        if (j11 != Blocks.grass && j11 != Blocks.dirt || y >= 256 - treeHeight - 1)
        {
            return false;
        }

        // Here's where the tree starts generating
        par1World.setBlock(x, y - 1, z, Blocks.dirt); // If the block below the tree is a grass block, change it to a dirt block.

                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 2, z, Blocks.leaves, this.metaLeaves);//top block of leaves
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 1, z, Blocks.log, this.metaWood);//wood under that
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight, z, Blocks.log, this.metaWood);//wood under that
                    
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 1, z + 1, Blocks.leaves, this.metaLeaves);//straight arm of palm
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight, z + 1, fruitType, 0);
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 1, z + 2, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 1, z + 3, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight, z + 4, Blocks.leaves, this.metaLeaves);
                    
                    this.setBlockAndNotifyAdequately(par1World, x + 1, y + treeHeight + 1, z, Blocks.leaves, this.metaLeaves);//straight arm of palm
                    this.setBlockAndNotifyAdequately(par1World, x + 1, y + treeHeight, z, fruitType, 0);
                    this.setBlockAndNotifyAdequately(par1World, x + 2, y + treeHeight + 1, z, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x + 3, y + treeHeight + 1, z, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x + 4, y + treeHeight, z, Blocks.leaves, this.metaLeaves);
                    
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 1, z - 1, Blocks.leaves, this.metaLeaves);//straight arm of palm
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight, z - 1, fruitType, 0);
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 1, z - 2, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight + 1, z - 3, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x, y + treeHeight, z - 4, Blocks.leaves, this.metaLeaves);
                    
                    this.setBlockAndNotifyAdequately(par1World, x - 1, y + treeHeight + 1, z, Blocks.leaves, this.metaLeaves);//straight arm of palm
                    this.setBlockAndNotifyAdequately(par1World, x - 1, y + treeHeight, z, fruitType, 0);
                    this.setBlockAndNotifyAdequately(par1World, x - 2, y + treeHeight + 1, z, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x - 3, y + treeHeight + 1, z, Blocks.leaves, this.metaLeaves);
                    this.setBlockAndNotifyAdequately(par1World, x - 4, y + treeHeight, z, Blocks.leaves, this.metaLeaves);
                    
                    
                    this.setBlockAndNotifyAdequately(par1World, x - 1, y + treeHeight + 1, z - 1, Blocks.leaves, this.metaLeaves );//diagonal arm of palm
                    this.setBlockAndNotifyAdequately(par1World, x - 1, y + treeHeight + 1, z + 1, Blocks.leaves, this.metaLeaves );
                    this.setBlockAndNotifyAdequately(par1World, x + 1, y + treeHeight + 1, z - 1, Blocks.leaves, this.metaLeaves );
                    this.setBlockAndNotifyAdequately(par1World, x + 1, y + treeHeight + 1, z + 1, Blocks.leaves, this.metaLeaves );
                    
                    this.setBlockAndNotifyAdequately(par1World, x + 2, y + treeHeight + 1, z + 2, Blocks.leaves, this.metaLeaves );//diagonal arm of palm
                    this.setBlockAndNotifyAdequately(par1World, x + 2, y + treeHeight + 1, z - 2, Blocks.leaves, this.metaLeaves );
                    this.setBlockAndNotifyAdequately(par1World, x - 2, y + treeHeight + 1, z + 2, Blocks.leaves, this.metaLeaves );
                    this.setBlockAndNotifyAdequately(par1World, x - 2, y + treeHeight + 1, z - 2, Blocks.leaves, this.metaLeaves );
               
                    this.setBlockAndNotifyAdequately(par1World, x + 3, y + treeHeight, z + 3, Blocks.leaves, this.metaLeaves );//diagonal arm of palm
                    this.setBlockAndNotifyAdequately(par1World, x + 3, y + treeHeight, z - 3, Blocks.leaves, this.metaLeaves );
                    this.setBlockAndNotifyAdequately(par1World, x - 3, y + treeHeight, z + 3, Blocks.leaves, this.metaLeaves );
                    this.setBlockAndNotifyAdequately(par1World, x - 3, y + treeHeight, z - 3, Blocks.leaves, this.metaLeaves );

                    


        // This part generates the vertical line of logs that make up the tree.
        for (int l1 = 0; l1 < treeHeight; l1++)
        {
            Block block = par1World.getBlock(x, y + l1, z);

            if (block.isAir(par1World, x, y + l1, z) || block.isLeaves(par1World, x, y + l1, z) || block == fruitType)
            {
            	this.setBlockAndNotifyAdequately(par1World, x, y + l1, z, Blocks.log, this.metaWood );
            }
        }

        return true;
        }
		return true;
        
    }


}