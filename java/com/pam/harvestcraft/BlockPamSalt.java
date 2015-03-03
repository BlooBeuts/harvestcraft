package com.pam.harvestcraft;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockPamSalt extends BlockOre
{
	@Override
	public int quantityDropped(Random p_149745_1_)
    {
        return this == BlockRegistry.pamSalt ? 1 + p_149745_1_.nextInt(3) : 1;
    }
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemRegistry.saltItem;
    }
	
	private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == BlockRegistry.pamSalt)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }

            return j1;
        }
        return 0;
    }

}