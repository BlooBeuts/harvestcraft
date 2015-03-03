package com.pam.harvestcraft;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockPamSapling extends BlockFlower 
{
	
    protected BlockPamSapling()
    {
        super(0);
        float f = 0.4F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setTickRandomly(true);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(harvestcraft.tabHarvestCraft2);
    }

    public int damageDropped(int i)
    {
        return i;
    }

    public void markOrGrowMarked(World world, int x, int y, int z,	Random par1Random) {
		int l = world.getBlockMetadata(x, y, z);

		if ((l & 8) == 0) {
			world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
		} else {
			this.growTree(world, x, y, z, par1Random);
		}
	}
    
    public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
    {
        return par1World.getBlock(par2, par3, par4) == this && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
    }
    

    public void growTree(World world, int x, int y, int z, Random par1Random) {
		if (this == BlockRegistry.pamappleSapling)
			{
				if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
				int l = world.getBlockMetadata(x, y, z) & 7;
				Object object = null;
				int i1 = 0;
				int j1 = 0;

				object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamApple);

				world.setBlock(x, y, z, Blocks.air, 0, 4);

				if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
					world.setBlock(x, y, z, this, l, 4);
				}
			}
		if (this == BlockRegistry.pamavocadoSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamAvocado);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamcherrySapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamCherry);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamchestnutSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamChestnut);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamnutmegSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamNutmeg);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampearSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamPear);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamplumSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamPlum);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamwalnutSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 0, 0, BlockRegistry.pamWalnut);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		
		if (this == BlockRegistry.pambananaSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamBanana);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamcoconutSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamCoconut);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamdateSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamDate);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamdragonfruitSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamDragonfruit);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampapayaSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitPalmTree(true, 5, 3, 3, BlockRegistry.pamPapaya);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		
		if (this == BlockRegistry.pamalmondSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamAlmond);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamapricotSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamApricot);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamcashewSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamCashew);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamdurianSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamDurian);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamfigSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamFig);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamgrapefruitSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamGrapefruit);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamlemonSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamLemon);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamlimeSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamLime);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pammangoSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamMango);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamoliveSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamOlive);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamorangeSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamOrange);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampeachSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPeach);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampecanSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPecan);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampeppercornSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPeppercorn);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampersimmonSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPersimmon);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampistachioSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPistachio);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampomegranateSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamPomegranate);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamstarfruitSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamStarfruit);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamvanillabeanSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitTree(true, 5, 3, 3, BlockRegistry.pamVanillabean);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		
		if (this == BlockRegistry.pammapleSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitLogTree(true, 5, 1, 1, BlockRegistry.pamMaple);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pampaperbarkSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitLogTree(true, 5, 3, 3, BlockRegistry.pamPaperbark);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
		if (this == BlockRegistry.pamcinnamonSapling)
		{
			if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, par1Random, x, y, z)) return;
			int l = world.getBlockMetadata(x, y, z) & 7;
			Object object = null;
			int i1 = 0;
			int j1 = 0;

			object = new WorldGenPamFruitLogTree(true, 5, 3, 3, BlockRegistry.pamCinnamon);

			world.setBlock(x, y, z, Blocks.air, 0, 4);

			if (!((WorldGenerator) object).generate(world, par1Random, x + i1, y, z	+ j1)) {
				world.setBlock(x, y, z, this, l, 4);
			}
		}
	}
    
    @Override
	public void updateTick(World world, int x, int y, int z, Random par1Random) {
		if (!world.isRemote) {
			super.updateTick(world, x, y, z, par1Random);

			if (world.getBlockLightValue(x, y + 1, z) >= 9 && par1Random.nextInt(7) == 0) {
				this.markOrGrowMarked(world, x, y, z, par1Random);
			}
		}
	}
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
    	if (this == BlockRegistry.pamalmondSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:almondSapling");
    	}
    	if (this == BlockRegistry.pamappleSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:appleSapling");
    	}
    	if (this == BlockRegistry.pamapricotSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:apricotSapling");
    	}
    	if (this == BlockRegistry.pamavocadoSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:avocadoSapling");
        }
    	if (this == BlockRegistry.pambananaSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:bananaSapling");
        }
    	if (this == BlockRegistry.pamcashewSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:cashewSapling");
    	}
    	if (this == BlockRegistry.pamcherrySapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:cherrySapling");
        }
    	if (this == BlockRegistry.pamchestnutSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:chestnutSapling");
    	}
    	if (this == BlockRegistry.pamcinnamonSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:cinnamonSapling");
        }
    	if (this == BlockRegistry.pamcoconutSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:coconutSapling");
        }
    	if (this == BlockRegistry.pamdateSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:dateSapling");
    	}
    	if (this == BlockRegistry.pamdragonfruitSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:dragonfruitSapling");
        }
    	if (this == BlockRegistry.pamdurianSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:durianSapling");
    	}
    	if (this == BlockRegistry.pamfigSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:figSapling");
    	}
    	if (this == BlockRegistry.pamgrapefruitSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:grapefruitSapling");
    	}
    	if (this == BlockRegistry.pamlemonSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:lemonSapling");
        }
    	if (this == BlockRegistry.pamlimeSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:limeSapling");
        }
    	if (this == BlockRegistry.pammapleSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:mapleSapling");
    	}
    	if (this == BlockRegistry.pammangoSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:mangoSapling");
        }
    	if (this == BlockRegistry.pamnutmegSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:nutmegSapling");
        }
    	if (this == BlockRegistry.pamoliveSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:oliveSapling");
        }
    	if (this == BlockRegistry.pamorangeSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:orangeSapling");
        }
    	if (this == BlockRegistry.pampapayaSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:papayaSapling");
        }
    	if (this == BlockRegistry.pampaperbarkSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:paperbarkSapling");
        }
    	if (this == BlockRegistry.pampeachSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:peachSapling");
        }
    	if (this == BlockRegistry.pampeppercornSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:peppercornSapling");
        }
    	if (this == BlockRegistry.pampistachioSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:pistachioSapling");
    	}
    	if (this == BlockRegistry.pampearSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:pearSapling");
        }
    	if (this == BlockRegistry.pampecanSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:pecanSapling");
    	}
    	if (this == BlockRegistry.pampersimmonSapling)
    	{
    	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:persimmonSapling");
    	}
    	if (this == BlockRegistry.pamplumSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:plumSapling");
        }
    	if (this == BlockRegistry.pampomegranateSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:pomegranateSapling");
        }
    	if (this == BlockRegistry.pamstarfruitSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:starfruitSapling");
        }
    	if (this == BlockRegistry.pamvanillabeanSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:vanillabeanSapling");
        }
    	if (this == BlockRegistry.pamwalnutSapling)
    	{
        	this.blockIcon = par1IconRegister.registerIcon("harvestcraft:walnutSapling");
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
      return this.blockIcon;
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
          for(int i = 0; i < 1; i++)
          {
                 par3List.add(new ItemStack(par1, 1, i));
          }
    }


}