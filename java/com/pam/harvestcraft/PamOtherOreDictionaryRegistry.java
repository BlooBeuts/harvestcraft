package com.pam.harvestcraft;

import net.minecraftforge.oredict.OreDictionary;

public class PamOtherOreDictionaryRegistry 
{
	public static void getRegistry()
	{
		OreDictionary.registerOre("toolPot", ItemRegistry.potItem);
		OreDictionary.registerOre("toolSkillet", ItemRegistry.skilletItem);
		OreDictionary.registerOre("toolSaucepan", ItemRegistry.saucepanItem);
		OreDictionary.registerOre("toolBakeware", ItemRegistry.bakewareItem);
		OreDictionary.registerOre("toolCuttingboard", ItemRegistry.cuttingboardItem);
		OreDictionary.registerOre("toolMortarandpestle", ItemRegistry.mortarandpestleItem);
		OreDictionary.registerOre("toolMixingbowl", ItemRegistry.mixingbowlItem);
		OreDictionary.registerOre("toolJuicer", ItemRegistry.juicerItem);
		
		OreDictionary.registerOre("cropCotton", ItemRegistry.cottonItem);
		OreDictionary.registerOre("seedCotton", ItemRegistry.cottonseedItem);
		OreDictionary.registerOre("materialCloth", ItemRegistry.wovencottonItem);
		
		OreDictionary.registerOre("cropCandle", ItemRegistry.candleberryItem);
		OreDictionary.registerOre("seedCandleberry", ItemRegistry.candleberryseedItem);
		OreDictionary.registerOre("materialPressedwax", ItemRegistry.waxItem);
		OreDictionary.registerOre("materialHardenedleather", ItemRegistry.hardenedleatherItem);
		
		OreDictionary.registerOre("dustSalt", ItemRegistry.saltItem);
		OreDictionary.registerOre("itemSalt", ItemRegistry.saltItem);
		
		OreDictionary.registerOre("beeQueen", ItemRegistry.queenbeeItem);
		OreDictionary.registerOre("materialWaxcomb", ItemRegistry.waxcombItem);
		OreDictionary.registerOre("materialHoneycomb", ItemRegistry.honeycombItem);
		OreDictionary.registerOre("foodHoneydrop", ItemRegistry.honeyItem);
		OreDictionary.registerOre("dropHoney", ItemRegistry.honeyItem);
		OreDictionary.registerOre("materialPressedwax", ItemRegistry.beeswaxItem);
		OreDictionary.registerOre("grubBee", ItemRegistry.grubItem);
		
		
	}
}
