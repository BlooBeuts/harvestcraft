package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import powercrystals.minefactoryreloaded.api.IFactoryFruit;
import powercrystals.minefactoryreloaded.api.ReplacementBlock;

public class PickableMFRFruit implements IFactoryFruit
{

	private Block _blockID;
	private Item _itemID;
	private int _meta;
	
	public PickableMFRFruit(Block block, Item item, int meta) {
		_blockID = block;
		_itemID = item;
		_meta = meta;
	}

	@Override
	public Block getPlant() {
		// TODO Auto-generated method stub
		return _blockID;
	}

	@Override
	public boolean breakBlock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReplacementBlock getReplacementBlock(World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return new ReplacementBlock(_blockID).setMeta(0);
	}
	
	@Override
	public boolean canBePicked(World world, int x, int y, int z)
	{
		int meta = world.getBlockMetadata(x, y, z);
        if (meta == 2)
        {
            return true;
        }
        return false;
	}
	
	@Override
	public void prePick(World world, int x, int y, int z)
	{
	}
	
	@Override
	public List<ItemStack> getDrops(World world, Random rand, int x, int y, int z)
	{
		ArrayList<ItemStack> result = new ArrayList<ItemStack>();
		result.add(new ItemStack(_itemID, 1, 0));
		return result;
	}
	
	@Override
	public void postPick(World world, int x, int y, int z)
	{
	}

	

}
