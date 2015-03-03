package com.pam.harvestcraft;
import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class MarketItems 

{
	private static ArrayList<MarketData> items = new ArrayList<MarketData>();
	
	public static void registerItems(MarketData data)
	 {
	  items.add(data);
	 }
	
	public static MarketData getData(int i)
	{
		return items.get(i);
	}
	
	public static int getSize()
	{
		return items.size();
	}
	
	public static void registerItems()
	{
		if (BlockRegistry.marketsellSeeds)
		{
			if (BlockRegistry.marketcurrencySeeds == 0)
			{
				for(int i = 0; i < 57; ++i)
				{
					registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.emerald), BlockRegistry.marketseedPrice));
				}
			}
			if (BlockRegistry.marketcurrencySeeds == 1)
			{
				for(int i = 0; i < 57; ++i)
				{
					registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.diamond), BlockRegistry.marketseedPrice));
				}
			}
			if (BlockRegistry.marketcurrencySeeds == 2)
			{
				for(int i = 0; i < 57; ++i)
				{
					registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.gold_ingot), BlockRegistry.marketseedPrice));
				}
			}
			if (BlockRegistry.marketcurrencySeeds == 3)
			{
				for(int i = 0; i < 57; ++i)
				{
					registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.gold_nugget), BlockRegistry.marketseedPrice));
				}
			}
			if (BlockRegistry.marketcurrencySeeds == 4)
			{
				for(int i = 0; i < 57; ++i)
				{
					registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.iron_ingot), BlockRegistry.marketseedPrice));
				}
			}
			if (BlockRegistry.marketcurrencySeeds == 5)
			{
				for(int i = 0; i < 57; ++i)
				{
					registerItems(new MarketData(new ItemStack(ItemRegistry.PamSeeds[i]), new ItemStack(Items.wheat_seeds), BlockRegistry.marketseedPrice));
				}
			}
		}
		
		if (BlockRegistry.marketselltemperateSaplings)
		{
			if (BlockRegistry.marketcurrencytemperateSaplings == 0)
			{
				for(int i = 0; i < 8; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
				}
			}
			if (BlockRegistry.marketcurrencytemperateSaplings == 1)
			{
				for(int i = 0; i < 8; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
				}
			}
			if (BlockRegistry.marketcurrencytemperateSaplings == 2)
			{
				for(int i = 0; i < 8; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
				}
			}
			if (BlockRegistry.marketcurrencytemperateSaplings == 3)
			{
				for(int i = 0; i < 8; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
				}
			}
			if (BlockRegistry.marketcurrencytemperateSaplings == 4)
			{
				for(int i = 0; i < 8; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
				}
			}
			if (BlockRegistry.marketcurrencytemperateSaplings == 5)
			{
				for(int i = 0; i < 8; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Blocks.sapling, 1, 0), BlockRegistry.marketsaplingPrice));
				}
			}
			if (BlockRegistry.marketcurrencytemperateSaplings == 6)
			{
				for(int i = 0; i < 8; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamTemperateSaplings[i], 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
				}
			}
		}
		
		if (BlockRegistry.marketselltropicalSaplings)
		{
			if (BlockRegistry.marketcurrencytropicalSaplings == 0)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencytropicalSaplings == 1)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencytropicalSaplings == 2)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencytropicalSaplings == 3)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencytropicalSaplings == 4)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencytropicalSaplings == 5)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Blocks.sapling, 1, 3), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencytropicalSaplings == 6)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.apple), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencytropicalSaplings == 7)
			{
				for(int i = 0; i < 24; ++i)
				{
					registerItems(new MarketData(new ItemStack(BlockRegistry.PamWarmSaplings[i], 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
				}
				registerItems(new MarketData(new ItemStack(BlockRegistry.pamcinnamonSapling, 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
				registerItems(new MarketData(new ItemStack(BlockRegistry.pampaperbarkSapling, 1), new ItemStack(Items.dye, 1, 3), BlockRegistry.marketsaplingPrice));
			}
			
		}
		
		if (BlockRegistry.marketsellconiferousSaplings)
		{
			if (BlockRegistry.marketcurrencyconiferousSaplings == 0)
			{
				registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.emerald), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencyconiferousSaplings == 1)
			{
				registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.diamond), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencyconiferousSaplings == 2)
			{
				registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.gold_ingot), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencyconiferousSaplings == 3)
			{
				registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.gold_nugget), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencyconiferousSaplings == 4)
			{
				registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Items.iron_ingot), BlockRegistry.marketsaplingPrice));
			}
			if (BlockRegistry.marketcurrencyconiferousSaplings == 5)
			{
				registerItems(new MarketData(new ItemStack(BlockRegistry.pammapleSapling, 1), new ItemStack(Blocks.sapling, 1, 1), BlockRegistry.marketsaplingPrice));
			}
		}

		
		if (BlockRegistry.marketsellPig)
		{
			if (BlockRegistry.marketcurrencyPig == 0)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.emerald), BlockRegistry.marketpigPrice));//pig
			}
			if (BlockRegistry.marketcurrencyPig == 1)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.diamond), BlockRegistry.marketpigPrice));//pig
			}
			if (BlockRegistry.marketcurrencyPig == 2)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.gold_ingot), BlockRegistry.marketpigPrice));//pig
			}
			if (BlockRegistry.marketcurrencyPig == 3)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.gold_nugget), BlockRegistry.marketpigPrice));//pig
			}
			if (BlockRegistry.marketcurrencyPig == 4)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.iron_ingot), BlockRegistry.marketpigPrice));//pig
			}
			if (BlockRegistry.marketcurrencyPig == 5)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.egg), BlockRegistry.marketpigPrice));//pig
			}
		}
		if (BlockRegistry.marketsellSheep)
		{
			if (BlockRegistry.marketcurrencySheep == 0)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.emerald), BlockRegistry.marketsheepPrice));//sheep
			}
			if (BlockRegistry.marketcurrencySheep == 1)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.diamond), BlockRegistry.marketsheepPrice));//sheep
			}
			if (BlockRegistry.marketcurrencySheep == 2)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.gold_ingot), BlockRegistry.marketsheepPrice));//sheep
			}
			if (BlockRegistry.marketcurrencySheep == 3)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.gold_nugget), BlockRegistry.marketsheepPrice));//sheep
			}
			if (BlockRegistry.marketcurrencySheep == 4)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.iron_ingot), BlockRegistry.marketsheepPrice));//sheep
			}
			if (BlockRegistry.marketcurrencySheep == 5)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.egg), BlockRegistry.marketsheepPrice));//sheep
			}
		}
		if (BlockRegistry.marketsellCow)
		{
			if (BlockRegistry.marketcurrencyCow == 0)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.emerald), BlockRegistry.marketcowPrice));//cow
			}
			if (BlockRegistry.marketcurrencyCow == 1)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.diamond), BlockRegistry.marketcowPrice));//cow
			}
			if (BlockRegistry.marketcurrencyCow == 2)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.gold_ingot), BlockRegistry.marketcowPrice));//cow
			}
			if (BlockRegistry.marketcurrencyCow == 3)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.gold_nugget), BlockRegistry.marketcowPrice));//cow
			}
			if (BlockRegistry.marketcurrencyCow == 4)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.iron_ingot), BlockRegistry.marketcowPrice));//cow
			}
			if (BlockRegistry.marketcurrencyCow == 5)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.egg), BlockRegistry.marketcowPrice));//cow
			}
		}
		if (BlockRegistry.marketsellChicken)
		{
			if (BlockRegistry.marketcurrencyChicken == 0)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.emerald), BlockRegistry.marketchickenPrice));//chicken
			}
			if (BlockRegistry.marketcurrencyChicken == 1)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.diamond), BlockRegistry.marketchickenPrice));//chicken
			}
			if (BlockRegistry.marketcurrencyChicken == 2)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.gold_ingot), BlockRegistry.marketchickenPrice));//chicken
			}
			if (BlockRegistry.marketcurrencyChicken == 3)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.gold_nugget), BlockRegistry.marketchickenPrice));//chicken
			}
			if (BlockRegistry.marketcurrencyChicken == 4)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.iron_ingot), BlockRegistry.marketchickenPrice));//chicken
			}
			if (BlockRegistry.marketcurrencyChicken == 5)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.egg), BlockRegistry.marketchickenPrice));//chicken
			}		
		}
		if (BlockRegistry.marketsellHorse)
		{
			if (BlockRegistry.marketcurrencyHorse == 0)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.emerald), BlockRegistry.markethorsePrice));//horse
			}
			if (BlockRegistry.marketcurrencyHorse == 1)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.diamond), BlockRegistry.markethorsePrice));//horse
			}
			if (BlockRegistry.marketcurrencyHorse == 2)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.gold_ingot), BlockRegistry.markethorsePrice));//horse
			}
			if (BlockRegistry.marketcurrencyHorse == 3)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.gold_nugget), BlockRegistry.markethorsePrice));//horse
			}
			if (BlockRegistry.marketcurrencyHorse == 4)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.iron_ingot), BlockRegistry.markethorsePrice));//horse
			}
			if (BlockRegistry.marketcurrencyHorse == 5)
			{
				registerItems(new MarketData(new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.egg), BlockRegistry.markethorsePrice));//horse
			}
		}
		
		if (BlockRegistry.marketsellBonemeal)
		{
			if (BlockRegistry.marketcurrencyBonemeal == 0)
			{
				registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.emerald), BlockRegistry.marketbonemealPrice));
			}
			if (BlockRegistry.marketcurrencyBonemeal == 1)
			{
				registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.diamond), BlockRegistry.marketbonemealPrice));
			}
			if (BlockRegistry.marketcurrencyBonemeal == 2)
			{
				registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.gold_ingot), BlockRegistry.marketbonemealPrice));
			}
			if (BlockRegistry.marketcurrencyBonemeal == 3)
			{
				registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.gold_nugget), BlockRegistry.marketbonemealPrice));
			}
			if (BlockRegistry.marketcurrencyBonemeal == 4)
			{
				registerItems(new MarketData(new ItemStack(Items.dye, 1, 15), new ItemStack(Items.iron_ingot), BlockRegistry.marketbonemealPrice));
			}
		}
	}
}
