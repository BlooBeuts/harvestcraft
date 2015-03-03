package com.pam.harvestcraft;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class Config
{
  public static final Config instance = new Config();
  public static final String CATEGORY_CROPS = "crops";
  public static final String CATEGORY_GARDENS = "gardens";
  public static final String CATEGORY_FRUIT_TREES = "fruit trees";
  public static final String CATEGORY_SALT = "salt";
  public static final String CATEGORY_BEE = "beekeeping";
  public static final String CATEGORY_MARKET_SALES = "market sales";
  public static final String CATEGORY_MARKET_PRICES = "market prices";
  public static final String CATEGORY_MARKET_CURRENCY = "market currency";
  public static final String CATEGORY_CANDLES = "candles";
  public static final String CATEGORY_DIMENSIONS = "dimensions";
  public static final String CATEGORY_SEEDS = "seeds";
  public static final String CATEGORY_MISC_RECIPES = "miscellaneous recipes";
  
 
  public void load(FMLPreInitializationEvent event)
  {
	  Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	  config.load();
	  BlockRegistry.initBlocks(event, config);
	  ItemRegistry.initItems(event, config);
	 // Notice there is nothing that gets the value of this property so the expression results in a Property object.
      Property someProperty = config.get("market currency", "ignore", "ignore");
      Property someProperty2 = config.get("market currency", "ignore2", "ignore");
      Property someProperty3 = config.get("market currency", "ignore3", "ignore");
      
      // Here we add a comment to our new property.
      someProperty.comment = "Assign market currency as follows 0:Emerald, 1:Diamond, 2:Gold Ingot, 3:Gold Nugget, 4:Iron Ingot";
      someProperty2.comment = "Assign market currency as follows 5:Wheat Seeds (seeds), 5:Oak Sapling (temperate fruit tree), 5:Jungle Sapling (tropical fruit tree), 5:Spruce Sapling (coniferous fruit tree), 5:Egg (animals)";
      someProperty3.comment = "Assign market currency as follows 6:Apple (temperate/tropical fruit tree), 7:Cocoa Beans (tropical fruit tree)";
      if (config.hasChanged()) 
	  {
		  config.save();
	  }
  }
  
}
