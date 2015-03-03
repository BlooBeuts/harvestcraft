package com.pam.harvestcraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry
{
	
	public static Block PamTemperateSaplings[];
	public static Block PamWarmSaplings[];
	public static Block PamLogSaplings[];
	
  public static Block pamcuttingBoard;
  public static Block pamPot;
  public static Block pamBeehive;
  public static Block pamApiary;
  public static Block pamPresser;
  public static Block pamSink;
  public static Block pamSalt;
  public static Block pamMarket;
  public static Block pamOven;
  public static Block pamOvenon;
  public static Block pamberryGarden;
  public static Block pamdesertGarden;
  public static Block pamgrassGarden;
  public static Block pamgourdGarden;
  public static Block pamgroundGarden;
  public static Block pamherbGarden;
  public static Block pamleafyGarden;
  public static Block pammushroomGarden;
  public static Block pamstalkGarden;
  public static Block pamtextileGarden;
  public static Block pamtropicalGarden;
  public static Block pamwaterGarden;
  
  public static Block pamApple;
	public static Block pamappleSapling;
	public static Block pamAlmond;
	public static Block pamalmondSapling;
	public static Block pamApricot;
	public static Block pamapricotSapling;
	public static Block pamAvocado;
	public static Block pamavocadoSapling;
	public static Block pamBanana;
	public static Block pambananaSapling;
	public static Block pamCashew;
	public static Block pamcashewSapling;
	public static Block pamCherry;
	public static Block pamcherrySapling;
	public static Block pamChestnut;
	public static Block pamchestnutSapling;
	public static Block pamCinnamon;
	public static Block pamcinnamonSapling;
	public static Block pamCoconut;
	public static Block pamcoconutSapling;
	public static Block pamDate;
	public static Block pamdateSapling;
	public static Block pamDragonfruit;
	public static Block pamdragonfruitSapling;
	public static Block pamDurian;
	public static Block pamdurianSapling;
	public static Block pamFig;
	public static Block pamfigSapling;
	public static Block pamGrapefruit;
	public static Block pamgrapefruitSapling;
	public static Block pamLemon;
	public static Block pamlemonSapling;
	public static Block pamLime;
	public static Block pamlimeSapling;
	public static Block pamMaple;
	public static Block pammapleSapling;
	public static Block pamMango;
	public static Block pammangoSapling;
	public static Block pamNutmeg;
	public static Block pamnutmegSapling;
	public static Block pamOlive;
	public static Block pamoliveSapling;
	public static Block pamOrange;
	public static Block pamorangeSapling;
	public static Block pamPapaya;
	public static Block pampapayaSapling;
	public static Block pamPaperbark;
	public static Block pampaperbarkSapling;
	public static Block pamPeach;
	public static Block pampeachSapling;
	public static Block pamPear;
	public static Block pampearSapling;
	public static Block pamPecan;
	public static Block pampecanSapling;
	public static Block pamPeppercorn;
	public static Block pampeppercornSapling;
	public static Block pamPersimmon;
	public static Block pampersimmonSapling;
	public static Block pamPistachio;
	public static Block pampistachioSapling;
	public static Block pamPlum;
	public static Block pamplumSapling;
	public static Block pamPomegranate;
	public static Block pampomegranateSapling;
	public static Block pamStarfruit;
	public static Block pamstarfruitSapling;
	public static Block pamVanillabean;
	public static Block pamvanillabeanSapling;
	public static Block pamWalnut;
	public static Block pamwalnutSapling;
  
	public static Block pamblackberryCrop;
	public static Block pamblueberryCrop;
	public static Block pamcandleberryCrop;
	public static Block pamraspberryCrop;
	public static Block pamstrawberryCrop;
	public static Block pamcactusfruitCrop;
	public static Block pamasparagusCrop;
	public static Block pambarleyCrop;
	public static Block pamoatsCrop;
	public static Block pamryeCrop;
	public static Block pamcornCrop;
	public static Block pambambooshootCrop;
	public static Block pamcantaloupeCrop;
	public static Block pamcucumberCrop;
	public static Block pamwintersquashCrop;
	public static Block pamzucchiniCrop;
	public static Block pambeetCrop;
	public static Block pamonionCrop;
	public static Block pamparsnipCrop;
	public static Block pampeanutCrop;
	public static Block pamradishCrop;
	public static Block pamrutabagaCrop;
	public static Block pamsweetpotatoCrop;
	public static Block pamturnipCrop;
	public static Block pamrhubarbCrop;
	public static Block pamceleryCrop;
	public static Block pamgarlicCrop;
	public static Block pamgingerCrop;
	public static Block pamspiceleafCrop;
	public static Block pamtealeafCrop;
	public static Block pamcoffeebeanCrop;
	public static Block pammustardseedsCrop;
	public static Block pambroccoliCrop;
	public static Block pamcauliflowerCrop;
	public static Block pamleekCrop;
	public static Block pamlettuceCrop;
	public static Block pamscallionCrop;
	public static Block pamartichokeCrop;
	public static Block pambrusselsproutCrop;
	public static Block pamcabbageCrop;
	public static Block pamspinachCrop;
	public static Block pamwhitemushroomCrop;
	public static Block pambeanCrop;
	public static Block pamsoybeanCrop;
	public static Block pambellpepperCrop;
	public static Block pamchilipepperCrop;
	public static Block pameggplantCrop;
	public static Block pamokraCrop;
	public static Block pampeasCrop;
	public static Block pamtomatoCrop;
	public static Block pamcottonCrop;
	public static Block pampineappleCrop;
	public static Block pamgrapeCrop;
	public static Block pamkiwiCrop;
	public static Block pamcranberryCrop;
	public static Block pamriceCrop;
	public static Block pamseaweedCrop;
	
	public static Block pamcandleDeco1;
	public static Block pamcandleDeco2;
	public static Block pamcandleDeco3;
	public static Block pamcandleDeco4;
	public static Block pamcandleDeco5;
	public static Block pamcandleDeco6;
	public static Block pamcandleDeco7;
	public static Block pamcandleDeco8;
	public static Block pamcandleDeco9;
	public static Block pamcandleDeco10;
	public static Block pamcandleDeco11;
	public static Block pamcandleDeco12;
	public static Block pamcandleDeco13;
	public static Block pamcandleDeco14;
	public static Block pamcandleDeco15;
	public static Block pamcandleDeco16;
	
	public static Block pamcarrotCake;
	public static Block pamcheeseCake;
	public static Block pamcherrycheeseCake;
	public static Block pampineappleupsidedownCake;
	public static Block pamchocolatesprinkleCake;
	public static Block pamredvelvetCake;
	public static Block pamlamingtonCake;
	public static Block pampavlovaCake;
	public static Block pamholidayCake;
  
  public static int saltRarity;
  public static boolean enablesaltGeneration;
  
  public static int beehiveRarity;
  public static boolean enablebeehiveGeneration;
  
  public static boolean marketsellSeeds;
  public static boolean marketselltemperateSaplings;
  public static boolean marketselltropicalSaplings;
  public static boolean marketsellconiferousSaplings;
  public static boolean marketsellPig;
  public static boolean marketsellSheep;
  public static boolean marketsellCow;
  public static boolean marketsellChicken;
  public static boolean marketsellHorse;
  public static boolean marketsellBonemeal;
  public static int marketblockrecipeItem;
  public static int marketseedPrice;
  public static int marketsaplingPrice;
  public static int marketpigPrice;
  public static int marketsheepPrice;
  public static int marketcowPrice;
  public static int marketchickenPrice;
  public static int markethorsePrice;
  public static int marketbonemealPrice;
  public static int marketcurrencySeeds;
  public static int marketcurrencytemperateSaplings;
  public static int marketcurrencytropicalSaplings;
  public static int marketcurrencyconiferousSaplings;
  public static int marketcurrencyPig;
  public static int marketcurrencySheep;
  public static int marketcurrencyCow;
  public static int marketcurrencyChicken;
  public static int marketcurrencyHorse;
  public static int marketcurrencyBonemeal;
  
  public static int gardenRarity;
  public static int gardendropAmount;
  public static boolean enablegardenSpread;
  public static int gardenspreadRate;
  public static boolean enableberrygardenGeneration;
  public static boolean enabledesertgardenGeneration;
  public static boolean enablegrassgardenGeneration;
  public static boolean enablegourdgardenGeneration;
  public static boolean enablegroundgardenGeneration;
  public static boolean enableherbgardenGeneration;
  public static boolean enableleafygardenGeneration;
  public static boolean enablemushroomgardenGeneration;
  public static boolean enablestalkgardenGeneration;
  public static boolean enabletextilegardenGeneration;
  public static boolean enabletropicalgardenGeneration;
  public static boolean enablewatergardenGeneration;
  
  public static int temperatefruittreeRarity;
  public static int tropicalfruittreeRarity;
  public static int coniferousfruittreeRarity;
  public static boolean appletreeGeneration;
	public static boolean almondtreeGeneration;
	public static boolean apricottreeGeneration;
	public static boolean avocadotreeGeneration;
	public static boolean bananatreeGeneration;
	public static boolean cashewtreeGeneration;
	public static boolean cherrytreeGeneration;
	public static boolean chestnuttreeGeneration;
	public static boolean cinnamontreeGeneration;
	public static boolean coconuttreeGeneration;
	public static boolean datetreeGeneration;
	public static boolean dragonfruittreeGeneration;
	public static boolean duriantreeGeneration;
	public static boolean figtreeGeneration;
	public static boolean grapefruittreeGeneration;
	public static boolean lemontreeGeneration;
	public static boolean limetreeGeneration;
	public static boolean mapletreeGeneration;
	public static boolean mangotreeGeneration;
	public static boolean nutmegtreeGeneration;
	public static boolean olivetreeGeneration;
	public static boolean orangetreeGeneration;
	public static boolean papayatreeGeneration;
	public static boolean paperbarktreeGeneration;
	public static boolean peachtreeGeneration;
	public static boolean peartreeGeneration;
	public static boolean pecantreeGeneration;
	public static boolean peppercorntreeGeneration;
	public static boolean persimmontreeGeneration;
	public static boolean pistachiotreeGeneration;
	public static boolean plumtreeGeneration;
	public static boolean pomegranatetreeGeneration;
	public static boolean starfruittreeGeneration;
	public static boolean vanillabeantreeGeneration;
	public static boolean walnuttreeGeneration;
	
	public static boolean cropsdropSeeds;
	public static boolean rightclickmatureshowfruitHearts;
	public static boolean rightclickmatureshowcropHearts;
	public static boolean rightclickharvestCrop;
	public static boolean rightclickharvestFruit;
	public static boolean gardensdropSeeds;
	
	public static int candlerecipeAmount;
	public static float candlelightLevel;
	
	public static boolean enabletwilightforestfruittreeGen;
	public static boolean enabletwilightforestgardenGen;
	public static boolean enableAroma1997sdimensionalworldfruittreeGen;
	public static boolean enableAroma1997sdimensionalworldgardenGen;
  
  public static void initBlocks(FMLPreInitializationEvent event, Configuration config)
  {
	  saltRarity = config.get("salt", "saltRarity", 30).getInt();
	  
	  enablesaltGeneration = config.get("salt", "enablesaltGeneration", true).getBoolean(true);
	  beehiveRarity = config.get("beekeeping", "beehiveRarity", 5).getInt();
	  enablebeehiveGeneration = config.get("beekeeping", "enablebeehiveGeneration", true).getBoolean(true);
	  marketsellSeeds = config.get("market sales", "marketsellSeeds", true).getBoolean(true);
	  marketselltemperateSaplings = config.get("market sales", "marketselltemperateSaplings", true).getBoolean(true);
	  marketselltropicalSaplings = config.get("market sales", "marketselltropicalSaplings", true).getBoolean(true);
	  marketsellconiferousSaplings = config.get("market sales", "marketsellconiferousSaplings", true).getBoolean(true);
	  marketsellPig = config.get("market sales", "marketsellPig", true).getBoolean(true);
	  marketsellSheep = config.get("market sales", "marketsellSheep", true).getBoolean(true);
	  marketsellCow = config.get("market sales", "marketsellCow", true).getBoolean(true);
	  marketsellChicken = config.get("market sales", "marketsellChicken", true).getBoolean(true);
	  marketsellHorse = config.get("market sales", "marketsellHorse", true).getBoolean(true);
	  marketsellBonemeal = config.get("market sales", "marketsellBonemeal", true).getBoolean(true);
	  marketblockrecipeItem = config.get("miscellaneous recipes", "marketblockrecipeItem", 0).getInt();
	  marketseedPrice = config.get("market prices","marketseedPrice", 1).getInt();
	  marketsaplingPrice = config.get("market prices","marketsaplingPrice", 3).getInt();
	  marketpigPrice = config.get("market prices","marketpigPrice", 6).getInt();
	  marketsheepPrice = config.get("market prices","marketsheepPrice", 6).getInt();
	  marketcowPrice = config.get("market prices","marketcowPrice", 9).getInt();
	  marketchickenPrice = config.get("market prices","marketchickenPrice", 3).getInt();
	  markethorsePrice = config.get("market prices","markethorsePrice", 12).getInt();
	  marketbonemealPrice = config.get("market prices","marketbonemealPrice", 3).getInt();
	  marketcurrencySeeds = config.get("market currency","marketcurrencySeeds", 0).getInt();
	  marketcurrencytemperateSaplings = config.get("market currency","marketcurrencytemperateSaplings", 0).getInt();
	  marketcurrencytropicalSaplings = config.get("market currency","marketcurrencytropicalSaplings", 0).getInt();
	  marketcurrencyconiferousSaplings = config.get("market currency","marketcurrencyconiferousSaplings", 0).getInt();
	  marketcurrencyPig = config.get("market currency","marketcurrencyPig", 0).getInt();
	  marketcurrencySheep = config.get("market currency","marketcurrencySheep", 0).getInt();
	  marketcurrencyCow = config.get("market currency","marketcurrencyCow", 0).getInt();
	  marketcurrencyChicken = config.get("market currency","marketcurrencyChicken", 0).getInt();
	  marketcurrencyHorse = config.get("market currency","marketcurrencyHorse", 0).getInt();
	  marketcurrencyBonemeal = config.get("market currency","marketcurrencyBonemeal", 0).getInt();
	  gardenRarity = config.get("gardens", "gardenRarity", 2).getInt();
	  gardendropAmount = config.get("gardens", "gardendropAmount", 3).getInt();
	  enablegardenSpread = config.get("gardens", "enablegardenSpread", true).getBoolean(true);
	  gardenspreadRate = config.get("gardens", "gardenspreadRate", 100).getInt();
	  enableberrygardenGeneration = config.get("gardens", "enableberrygardenGeneration", true).getBoolean(true);
	  enabledesertgardenGeneration = config.get("gardens", "enabledesertgardenGeneration", true).getBoolean(true);
	  enablegrassgardenGeneration = config.get("gardens", "enablegrassgardenGeneration", true).getBoolean(true);
	  enablegourdgardenGeneration = config.get("gardens", "enablegourdgardenGeneration", true).getBoolean(true);
	  enablegroundgardenGeneration = config.get("gardens", "enablegroundgardenGeneration", true).getBoolean(true);
	  enableherbgardenGeneration = config.get("gardens", "enableherbgardenGeneration", true).getBoolean(true);
	  enableleafygardenGeneration = config.get("gardens", "enableleafygardenGeneration", true).getBoolean(true);
	  enablemushroomgardenGeneration = config.get("gardens", "enablemushroomgardenGeneration", true).getBoolean(true);
	  enablestalkgardenGeneration = config.get("gardens", "enablestalkgardenGeneration", true).getBoolean(true);
	  enabletextilegardenGeneration = config.get("gardens", "enabletextilegardenGeneration", true).getBoolean(true);
	  enabletropicalgardenGeneration = config.get("gardens", "enabletropicalgardenGeneration", true).getBoolean(true);
	  enablewatergardenGeneration = config.get("gardens", "enablewatergardenGeneration", true).getBoolean(true);
	  temperatefruittreeRarity = config.get("fruit trees","temperatefruittreeRarity", 15).getInt();
	  tropicalfruittreeRarity = config.get("fruit trees","tropicalfruittreeRarity", 10).getInt();
	  coniferousfruittreeRarity = config.get("fruit trees","coniferousfruittreeRarity", 15).getInt();
	  appletreeGeneration = config.get("fruit trees", "appletreeGeneration", true).getBoolean(true);
		almondtreeGeneration = config.get("fruit trees", "almondtreeGeneration", true).getBoolean(true);
		apricottreeGeneration = config.get("fruit trees", "apricottreeGeneration", true).getBoolean(true);
		avocadotreeGeneration = config.get("fruit trees", "avocadotreeGeneration", true).getBoolean(true);
		bananatreeGeneration = config.get("fruit trees", "bananatreeGeneration", true).getBoolean(true);
		cashewtreeGeneration = config.get("fruit trees", "cashewtreeGeneration", true).getBoolean(true);
		cherrytreeGeneration = config.get("fruit trees", "cherrytreeGeneration", true).getBoolean(true);
		chestnuttreeGeneration = config.get("fruit trees", "chestnuttreeGeneration", true).getBoolean(true);
		cinnamontreeGeneration = config.get("fruit trees", "cinnamontreeGeneration", true).getBoolean(true);
		coconuttreeGeneration = config.get("fruit trees", "coconuttreeGeneration", true).getBoolean(true);
		datetreeGeneration = config.get("fruit trees", "datetreeGeneration", true).getBoolean(true);
		dragonfruittreeGeneration = config.get("fruit trees", "dragonfruittreeGeneration", true).getBoolean(true);
		duriantreeGeneration = config.get("fruit trees", "duriantreeGeneration", true).getBoolean(true);
		figtreeGeneration = config.get("fruit trees", "figtreeGeneration", true).getBoolean(true);
		grapefruittreeGeneration = config.get("fruit trees", "grapefruittreeGeneration", true).getBoolean(true);
		lemontreeGeneration = config.get("fruit trees", "lemontreeGeneration", true).getBoolean(true);
		limetreeGeneration = config.get("fruit trees", "limetreeGeneration", true).getBoolean(true);
		mapletreeGeneration = config.get("fruit trees", "mapletreeGeneration", true).getBoolean(true);
		mangotreeGeneration = config.get("fruit trees", "mangotreeGeneration", true).getBoolean(true);
		nutmegtreeGeneration = config.get("fruit trees", "nutmegtreeGeneration", true).getBoolean(true);
		olivetreeGeneration = config.get("fruit trees", "olivetreeGeneration", true).getBoolean(true);
		orangetreeGeneration = config.get("fruit trees", "orangetreeGeneration", true).getBoolean(true);
		papayatreeGeneration = config.get("fruit trees", "papayatreeGeneration", true).getBoolean(true);
		paperbarktreeGeneration = config.get("fruit trees", "paperbarktreeGeneration", true).getBoolean(true);
		peachtreeGeneration = config.get("fruit trees", "peachtreeGeneration", true).getBoolean(true);
		peartreeGeneration = config.get("fruit trees", "peartreeGeneration", true).getBoolean(true);
		pecantreeGeneration = config.get("fruit trees", "pecantreeGeneration", true).getBoolean(true);
		peppercorntreeGeneration = config.get("fruit trees", "peppercorntreeGeneration", true).getBoolean(true);
		persimmontreeGeneration = config.get("fruit trees", "persimmontreeGeneration", true).getBoolean(true);
		pistachiotreeGeneration = config.get("fruit trees", "pistachiotreeGeneration", true).getBoolean(true);
		plumtreeGeneration = config.get("fruit trees", "plumtreeGeneration", true).getBoolean(true);
		pomegranatetreeGeneration = config.get("fruit trees", "pomegranatetreeGeneration", true).getBoolean(true);
		starfruittreeGeneration = config.get("fruit trees", "starfruittreeGeneration", true).getBoolean(true);
		vanillabeantreeGeneration = config.get("fruit trees", "vanillabeantreeGeneration", true).getBoolean(true);
		walnuttreeGeneration = config.get("fruit trees", "walnuttreeGeneration", true).getBoolean(true);
		cropsdropSeeds = config.get("crops", "cropsdropSeeds", false).getBoolean(false);
		rightclickmatureshowfruitHearts = config.get("fruit trees", "rightclickmatureshowfruitHearts", false).getBoolean(false);
		rightclickmatureshowcropHearts = config.get("crops", "rightclickmatureshowcropHearts", false).getBoolean(false);
		rightclickharvestCrop = config.get("crops", "rightclickharvestCrop", true).getBoolean(true);
		rightclickharvestFruit = config.get("fruit trees", "rightclickharvestFruit", true).getBoolean(true);
		gardensdropSeeds = config.get("gardens", "gardensdropSeeds", false).getBoolean(false);
		
		candlerecipeAmount = config.get("candles","candlerecipeAmount", 4).getInt();
		candlelightLevel = (float) config.get("candles","candlelightLevel", 0.9375F).getDouble(0.9375F);
		
		enabletwilightforestfruittreeGen = config.get("dimensions", "enabletwilightforestfruittreeGen", false).getBoolean(false);
		enabletwilightforestgardenGen = config.get("dimensions", "enabletwilightforestgardenGen", false).getBoolean(false);
		enableAroma1997sdimensionalworldfruittreeGen = config.get("dimensions", "enableAroma1997sdimensionalworldfruittreeGen", false).getBoolean(false);
		enableAroma1997sdimensionalworldgardenGen = config.get("dimensions", "enableAroma1997sdimensionalworldgardenGen", false).getBoolean(false);
  }

  public static void registerBlocks()
  {
	  pamcuttingBoard = new BlockPamCuttingBoard().setHardness(1.0F).setBlockName("cuttingboard");
	  GameRegistry.registerBlock(pamcuttingBoard, "cuttingboard");
	  
	  pamPot = new BlockPamPot().setHardness(1.0F).setBlockName("pot");
	  GameRegistry.registerBlock(pamPot, "pot");	  
	  
	  pamBeehive = new BlockPamBeehive(Material.plants).setHardness(1.0F).setBlockName("beehive");
	  GameRegistry.registerBlock(pamBeehive, "beehive");
	  
	  pamApiary = new BlockPamApiary().setHardness(1.0F).setBlockName("apiary");
	  GameRegistry.registerBlock(pamApiary, "apiary");
	  
	  pamPresser = new BlockPamPresser().setHardness(1.0F).setBlockName("presser");
	  GameRegistry.registerBlock(pamPresser, "presser");
	  
	  pamSink = new BlockPamSink().setHardness(1.0F).setBlockName("sink");
	  GameRegistry.registerBlock(pamSink, ItemPamSink.class, "sink");
	  
	  pamSalt = new BlockPamSalt().setHardness(1.5F).setResistance(10F).setBlockTextureName("harvestcraft:salt").setBlockName("salt").setCreativeTab(harvestcraft.tabHarvestCraft);
	  GameRegistry.registerBlock(pamSalt, "salt");
	  
	  pamMarket = new BlockPamMarket(Material.wood).setHardness(1.0F).setResistance(1F).setBlockName("market");
	  GameRegistry.registerBlock(pamMarket, "market");
	  
	  pamOven = new BlockPamOven(false).setHardness(1.5F).setResistance(10F).setBlockName("oven").setCreativeTab(harvestcraft.tabHarvestCraft);
	  GameRegistry.registerBlock(pamOven, "oven");
	  pamOvenon = new BlockPamOven(true).setHardness(1.5F).setResistance(10F).setBlockName("ovenon");
	  GameRegistry.registerBlock(pamOvenon, "ovenon");

	  pamberryGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:berrygarden0").setBlockName("berrygarden");
	  GameRegistry.registerBlock(pamberryGarden, "berrygarden");
	  
	  pamdesertGarden = new BlockPamDesertGarden(0).setBlockTextureName("harvestcraft:desertgarden0").setBlockName("desertgarden");
	  GameRegistry.registerBlock(pamdesertGarden, "desertgarden");

	  pamgrassGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:grassgarden0").setBlockName("grassgarden");
	  GameRegistry.registerBlock(pamgrassGarden, "grassgarden");
	  
	  pamgourdGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:gourdgarden0").setBlockName("gourdgarden");
	  GameRegistry.registerBlock(pamgourdGarden, "gourdgarden");
	  
	  pamgroundGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:groundgarden0").setBlockName("groundgarden");
	  GameRegistry.registerBlock(pamgroundGarden, "groundgarden");
	  
	  pamherbGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:herbgarden0").setBlockName("herbgarden");
	  GameRegistry.registerBlock(pamherbGarden, "herbgarden");
	  
	  pamleafyGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:leafygarden0").setBlockName("leafygarden");
	  GameRegistry.registerBlock(pamleafyGarden, "leafygarden");
	  
	  pammushroomGarden = new BlockPamMushroomGarden(0).setBlockTextureName("harvestcraft:mushroomgarden0").setBlockName("mushroomgarden");
	  GameRegistry.registerBlock(pammushroomGarden, "mushroomgarden");

	  pamstalkGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:stalkgarden0").setBlockName("stalkgarden");
	  GameRegistry.registerBlock(pamstalkGarden, "stalkgarden");
	  
	  pamtextileGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:textilegarden0").setBlockName("textilegarden");
	  GameRegistry.registerBlock(pamtextileGarden, "textilegarden");
	  
	  pamtropicalGarden = new BlockPamNormalGarden(0).setBlockTextureName("harvestcraft:tropicalgarden0").setBlockName("tropicalgarden");
	  GameRegistry.registerBlock(pamtropicalGarden, "tropicalgarden");
	  
	  pamwaterGarden = new BlockPamWaterGarden(0).setBlockTextureName("harvestcraft:watergarden0").setBlockName("watergarden");
	  GameRegistry.registerBlock(pamwaterGarden, "watergarden");
	  
	  pamApple = new BlockPamFruit("apple").setBlockName("pamApple");
	  GameRegistry.registerBlock(pamApple, "pamApple");
	  pamappleSapling = new BlockPamSapling().setBlockName("pamappleSapling");
	  GameRegistry.registerBlock(pamappleSapling, "pamappleSapling");
		  
	  pamAlmond = new BlockPamFruit("almond").setBlockName("pamAlmond");
	  GameRegistry.registerBlock(pamAlmond, "pamAlmond");
	  pamalmondSapling = new BlockPamSapling().setBlockName("pamalmondSapling");
	  GameRegistry.registerBlock(pamalmondSapling, "pamalmondSapling");
	  
	  pamApricot = new BlockPamFruit("apricot").setBlockName("pamApricot");
	  GameRegistry.registerBlock(pamApricot, "pamApricot");
	  pamapricotSapling = new BlockPamSapling().setBlockName("pamapricotSapling");
	  GameRegistry.registerBlock(pamapricotSapling, "pamapricotSapling");
	  
	  pamAvocado = new BlockPamFruit("avocado").setBlockName("pamAvocado");
	  GameRegistry.registerBlock(pamAvocado, "pamAvocado");
	  pamavocadoSapling = new BlockPamSapling().setBlockName("pamavocadoSapling");
	  GameRegistry.registerBlock(pamavocadoSapling, "pamavocadoSapling");
	  
	  pamBanana = new BlockPamFruit("banana").setBlockName("pamBanana");
	  GameRegistry.registerBlock(pamBanana, "pamBanana");
	  pambananaSapling = new BlockPamSapling().setBlockName("pambananaSapling");
	  GameRegistry.registerBlock(pambananaSapling, "pambananaSapling");
	  
	  pamCashew = new BlockPamFruit("cashew").setBlockName("pamCashew");
	  GameRegistry.registerBlock(pamCashew, "pamCashew");
	  pamcashewSapling = new BlockPamSapling().setBlockName("pamcashewSapling");
	  GameRegistry.registerBlock(pamcashewSapling, "pamcashewSapling");
	  
	  pamCherry = new BlockPamFruit("cherry").setBlockName("pamCherry");
	  GameRegistry.registerBlock(pamCherry, "pamCherry");
	  pamcherrySapling = new BlockPamSapling().setBlockName("pamcherrySapling");
	  GameRegistry.registerBlock(pamcherrySapling, "pamcherrySapling");
	  
	  pamChestnut = new BlockPamFruit("chestnut").setBlockName("pamChestnut");
	  GameRegistry.registerBlock(pamChestnut, "pamChestnut");
	  pamchestnutSapling = new BlockPamSapling().setBlockName("pamchestnutSapling");
	  GameRegistry.registerBlock(pamchestnutSapling, "pamchestnutSapling");
	  
	  pamCinnamon = new BlockPamFruit("cinnamon").setBlockName("pamCinnamon");
	  GameRegistry.registerBlock(pamCinnamon, "pamCinnamon");
	  pamcinnamonSapling = new BlockPamSapling().setBlockName("pamcinnamonSapling");
	  GameRegistry.registerBlock(pamcinnamonSapling, "pamcinnamonSapling");
	  
	  pamCoconut = new BlockPamFruit("coconut").setBlockName("pamCoconut");
	  GameRegistry.registerBlock(pamCoconut, "pamCoconut");
	  pamcoconutSapling = new BlockPamSapling().setBlockName("pamcoconutSapling");
	  GameRegistry.registerBlock(pamcoconutSapling, "pamcoconutSapling");
	  
	  pamDate = new BlockPamFruit("date").setBlockName("pamDate");
	  GameRegistry.registerBlock(pamDate, "pamDate");
	  pamdateSapling = new BlockPamSapling().setBlockName("pamdateSapling");
	  GameRegistry.registerBlock(pamdateSapling, "pamdateSapling");
	  
	  pamDragonfruit = new BlockPamFruit("dragonfruit").setBlockName("pamDragonfruit");
	  GameRegistry.registerBlock(pamDragonfruit, "pamDragonfruit");
	  pamdragonfruitSapling = new BlockPamSapling().setBlockName("pamdragonfruitSapling");
	  GameRegistry.registerBlock(pamdragonfruitSapling, "pamdragonfruitSapling");
	  
	  pamDurian = new BlockPamFruit("durian").setBlockName("pamDurian");
	  GameRegistry.registerBlock(pamDurian, "pamDurian");
	  pamdurianSapling = new BlockPamSapling().setBlockName("pamdurianSapling");
	  GameRegistry.registerBlock(pamdurianSapling, "pamdurianSapling");
	  
	  pamFig = new BlockPamFruit("fig").setBlockName("pamFig");
	  GameRegistry.registerBlock(pamFig, "pamFig");
	  pamfigSapling = new BlockPamSapling().setBlockName("pamfigSapling");
	  GameRegistry.registerBlock(pamfigSapling, "pamfigSapling");
	  
	  pamGrapefruit = new BlockPamFruit("grapefruit").setBlockName("pamGrapefruit");
	  GameRegistry.registerBlock(pamGrapefruit, "pamGrapefruit");
	  pamgrapefruitSapling = new BlockPamSapling().setBlockName("pamgrapefruitSapling");
	  GameRegistry.registerBlock(pamgrapefruitSapling, "pamgrapefruitSapling");
	  
	  pamLemon = new BlockPamFruit("lemon").setBlockName("pamLemon");
	  GameRegistry.registerBlock(pamLemon, "pamLemon");
	  pamlemonSapling = new BlockPamSapling().setBlockName("pamlemonSapling");
	  GameRegistry.registerBlock(pamlemonSapling, "pamlemonSapling");
	  
	  pamLime = new BlockPamFruit("lime").setBlockName("pamLime");
	  GameRegistry.registerBlock(pamLime, "pamLime");
	  pamlimeSapling = new BlockPamSapling().setBlockName("pamlimeSapling");
	  GameRegistry.registerBlock(pamlimeSapling, "pamlimeSapling");
	  
	  pamMaple = new BlockPamFruit("maple").setBlockName("pamMaple");
	  GameRegistry.registerBlock(pamMaple, "pamMaple");
	  pammapleSapling = new BlockPamSapling().setBlockName("pammapleSapling");
	  GameRegistry.registerBlock(pammapleSapling, "pammapleSapling");
	  
	  pamMango = new BlockPamFruit("mango").setBlockName("pamMango");
	  GameRegistry.registerBlock(pamMango, "pamMango");
	  pammangoSapling = new BlockPamSapling().setBlockName("pammangoSapling");
	  GameRegistry.registerBlock(pammangoSapling, "pammangoSapling");
	  
	  pamNutmeg = new BlockPamFruit("nutmeg").setBlockName("pamNutmeg");
	  GameRegistry.registerBlock(pamNutmeg, "pamNutmeg");
	  pamnutmegSapling = new BlockPamSapling().setBlockName("pamnutmegSapling");
	  GameRegistry.registerBlock(pamnutmegSapling, "pamnutmegSapling");
	  
	  pamOlive = new BlockPamFruit("olive").setBlockName("pamOlive");
	  GameRegistry.registerBlock(pamOlive, "pamOlive");
	  pamoliveSapling = new BlockPamSapling().setBlockName("pamoliveSapling");
	  GameRegistry.registerBlock(pamoliveSapling, "pamoliveSapling");
	  
	  pamOrange = new BlockPamFruit("orange").setBlockName("pamOrange");
	  GameRegistry.registerBlock(pamOrange, "pamOrange");
	  pamorangeSapling = new BlockPamSapling().setBlockName("pamorangeSapling");
	  GameRegistry.registerBlock(pamorangeSapling, "pamorangeSapling");
	  
	  pamPapaya = new BlockPamFruit("papaya").setBlockName("pamPapaya");
	  GameRegistry.registerBlock(pamPapaya, "pamPapaya");
	  pampapayaSapling = new BlockPamSapling().setBlockName("pampapayaSapling");
	  GameRegistry.registerBlock(pampapayaSapling, "pampapayaSapling");
	  
	  pamPaperbark = new BlockPamFruit("paperbark").setBlockName("pamPaperbark");
	  GameRegistry.registerBlock(pamPaperbark, "pamPaperbark");
	  pampaperbarkSapling = new BlockPamSapling().setBlockName("pampaperbarkSapling");
	  GameRegistry.registerBlock(pampaperbarkSapling, "pampaperbarkSapling");
	  
	  pamPeach = new BlockPamFruit("peach").setBlockName("pamPeach");
	  GameRegistry.registerBlock(pamPeach, "pamPeach");
	  pampeachSapling = new BlockPamSapling().setBlockName("pampeachSapling");
	  GameRegistry.registerBlock(pampeachSapling, "pampeachSapling");
	  
	  pamPear = new BlockPamFruit("pear").setBlockName("pamPear");
	  GameRegistry.registerBlock(pamPear, "pamPear");
	  pampearSapling = new BlockPamSapling().setBlockName("pampearSapling");
	  GameRegistry.registerBlock(pampearSapling, "pampearSapling");
	  
	  pamPecan = new BlockPamFruit("pecan").setBlockName("pamPecan");
	  GameRegistry.registerBlock(pamPecan, "pamPecan");
	  pampecanSapling = new BlockPamSapling().setBlockName("pampecanSapling");
	  GameRegistry.registerBlock(pampecanSapling, "pampecanSapling");
	  
	  pamPeppercorn = new BlockPamFruit("peppercorn").setBlockName("pamPeppercorn");
	  GameRegistry.registerBlock(pamPeppercorn, "pamPeppercorn");
	  pampeppercornSapling = new BlockPamSapling().setBlockName("pampeppercornSapling");
	  GameRegistry.registerBlock(pampeppercornSapling, "pampeppercornSapling");
	  
	  pamPersimmon = new BlockPamFruit("persimmon").setBlockName("pamPersimmon");
	  GameRegistry.registerBlock(pamPersimmon, "pamPersimmon");
	  pampersimmonSapling = new BlockPamSapling().setBlockName("pampersimmonSapling");
	  GameRegistry.registerBlock(pampersimmonSapling, "pampersimmonSapling");
	  
	  pamPistachio = new BlockPamFruit("pistachio").setBlockName("pamPistachio");
	  GameRegistry.registerBlock(pamPistachio, "pamPistachio");
	  pampistachioSapling = new BlockPamSapling().setBlockName("pampistachioSapling");
	  GameRegistry.registerBlock(pampistachioSapling, "pampistachioSapling");
	  
	  pamPlum = new BlockPamFruit("plum").setBlockName("pamPlum");
	  GameRegistry.registerBlock(pamPlum, "pamPlum");
	  pamplumSapling = new BlockPamSapling().setBlockName("pamplumSapling");
	  GameRegistry.registerBlock(pamplumSapling, "pamplumSapling");
	  
	  pamPomegranate = new BlockPamFruit("pomegranate").setBlockName("pamPomegranate");
	  GameRegistry.registerBlock(pamPomegranate, "pamPomegranate");
	  pampomegranateSapling = new BlockPamSapling().setBlockName("pampomegranateSapling");
	  GameRegistry.registerBlock(pampomegranateSapling, "pampomegranateSapling");
	  
	  pamStarfruit = new BlockPamFruit("starfruit").setBlockName("pamStarfruit");
	  GameRegistry.registerBlock(pamStarfruit, "pamStarfruit");
	  pamstarfruitSapling = new BlockPamSapling().setBlockName("pamstarfruitSapling");
	  GameRegistry.registerBlock(pamstarfruitSapling, "pamstarfruitSapling");
	  
	  pamVanillabean = new BlockPamFruit("vanillabean").setBlockName("pamVanillabean");
	  GameRegistry.registerBlock(pamVanillabean, "pamVanillabean");
	  pamvanillabeanSapling = new BlockPamSapling().setBlockName("pamvanillabeanSapling");
	  GameRegistry.registerBlock(pamvanillabeanSapling, "pamvanillabeanSapling");
	  
	  pamWalnut = new BlockPamFruit("walnut").setBlockName("pamWalnut");
	  GameRegistry.registerBlock(pamWalnut, "pamWalnut");
	  pamwalnutSapling = new BlockPamSapling().setBlockName("pamwalnutSapling");
	  GameRegistry.registerBlock(pamwalnutSapling, "pamwalnutSapling");
	  
	  pamblackberryCrop = new BlockPamCrop().setBlockTextureName("blackberry").setBlockName("pamblackberryCrop");
	  GameRegistry.registerBlock(pamblackberryCrop, "pamblackberryCrop");
		pamblueberryCrop = new BlockPamCrop().setBlockTextureName("blueberry").setBlockName("pamblueberryCrop");
		GameRegistry.registerBlock(pamblueberryCrop, "pamblueberryCrop");
		pamcandleberryCrop = new BlockPamCrop().setBlockTextureName("candleberry").setBlockName("pamcandleberryCrop");
		GameRegistry.registerBlock(pamcandleberryCrop, "pamcandleberryCrop");
		pamraspberryCrop = new BlockPamCrop().setBlockTextureName("raspberry").setBlockName("pamraspberryCrop");
		GameRegistry.registerBlock(pamraspberryCrop, "pamraspberryCrop");
		pamstrawberryCrop = new BlockPamCrop().setBlockTextureName("strawberry").setBlockName("pamstrawberryCrop");
		GameRegistry.registerBlock(pamstrawberryCrop, "pamstrawberryCrop");
		pamcactusfruitCrop = new BlockPamCrop().setBlockTextureName("cactusfruit").setBlockName("pamcactusfruitCrop");
		GameRegistry.registerBlock(pamcactusfruitCrop, "pamcactusfruitCrop");
		pamasparagusCrop = new BlockPamCrop().setBlockTextureName("asparagus").setBlockName("pamasparagusCrop");
		GameRegistry.registerBlock(pamasparagusCrop, "pamasparagusCrop");
		pambarleyCrop = new BlockPamCrop().setBlockTextureName("barley").setBlockName("pambarleyCrop");
		GameRegistry.registerBlock(pambarleyCrop, "pambarleyCrop");
		pamoatsCrop = new BlockPamCrop().setBlockTextureName("oats").setBlockName("pamoatsCrop");
		GameRegistry.registerBlock(pamoatsCrop, "pamoatsCrop");
		pamryeCrop = new BlockPamCrop().setBlockTextureName("rye").setBlockName("pamryeCrop");
		GameRegistry.registerBlock(pamryeCrop, "pamryeCrop");
		pamcornCrop = new BlockPamCrop().setBlockTextureName("corn").setBlockName("pamcornCrop");
		GameRegistry.registerBlock(pamcornCrop, "pamcornCrop");
		pambambooshootCrop = new BlockPamCrop().setBlockTextureName("bambooshoot").setBlockName("pambambooshootCrop");
		GameRegistry.registerBlock(pambambooshootCrop, "pambambooshootCrop");
		pamcantaloupeCrop = new BlockPamCrop().setBlockTextureName("cantaloupe").setBlockName("pamcantaloupeCrop");
		GameRegistry.registerBlock(pamcantaloupeCrop, "pamcantaloupeCrop");
		pamcucumberCrop = new BlockPamCrop().setBlockTextureName("cucumber").setBlockName("pamcucumberCrop");
		GameRegistry.registerBlock(pamcucumberCrop, "pamcucumberCrop");
		pamwintersquashCrop = new BlockPamCrop().setBlockTextureName("wintersquash").setBlockName("pamwintersquashCrop");
		GameRegistry.registerBlock(pamwintersquashCrop, "pamwintersquashCrop");
		pamzucchiniCrop = new BlockPamCrop().setBlockTextureName("zucchini").setBlockName("pamzucchiniCrop");
		GameRegistry.registerBlock(pamzucchiniCrop, "pamzucchiniCrop");
		pambeetCrop = new BlockPamCrop().setBlockTextureName("beet").setBlockName("pambeetCrop");
		GameRegistry.registerBlock(pambeetCrop, "pambeetCrop");
		pamonionCrop = new BlockPamCrop().setBlockTextureName("onion").setBlockName("pamonionCrop");
		GameRegistry.registerBlock(pamonionCrop, "pamonionCrop");
		pamparsnipCrop = new BlockPamCrop().setBlockTextureName("parsnip").setBlockName("pamparsnipCrop");
		GameRegistry.registerBlock(pamparsnipCrop, "pamparsnipCrop");
		pampeanutCrop = new BlockPamCrop().setBlockTextureName("peanut").setBlockName("pampeanutCrop");
		GameRegistry.registerBlock(pampeanutCrop, "pampeanutCrop");
		pamradishCrop = new BlockPamCrop().setBlockTextureName("radish").setBlockName("pamradishCrop");
		GameRegistry.registerBlock(pamradishCrop, "pamradishCrop");
		pamrutabagaCrop = new BlockPamCrop().setBlockTextureName("rutabaga").setBlockName("pamrutabagaCrop");
		GameRegistry.registerBlock(pamrutabagaCrop, "pamrutabagaCrop");
		pamsweetpotatoCrop = new BlockPamCrop().setBlockTextureName("sweetpotato").setBlockName("pamsweetpotatoCrop");
		GameRegistry.registerBlock(pamsweetpotatoCrop, "pamsweetpotatoCrop");
		pamturnipCrop = new BlockPamCrop().setBlockTextureName("turnip").setBlockName("pamturnipCrop");
		GameRegistry.registerBlock(pamturnipCrop, "pamturnipCrop");
		pamrhubarbCrop = new BlockPamCrop().setBlockTextureName("rhubarb").setBlockName("pamrhubarbCrop");
		GameRegistry.registerBlock(pamrhubarbCrop, "pamrhubarbCrop");
		pamceleryCrop = new BlockPamCrop().setBlockTextureName("celery").setBlockName("pamceleryCrop");
		GameRegistry.registerBlock(pamceleryCrop, "pamceleryCrop");
		pamgarlicCrop = new BlockPamCrop().setBlockTextureName("garlic").setBlockName("pamgarlicCrop");
		GameRegistry.registerBlock(pamgarlicCrop, "pamgarlicCrop");
		pamgingerCrop = new BlockPamCrop().setBlockTextureName("ginger").setBlockName("pamgingerCrop");
		GameRegistry.registerBlock(pamgingerCrop, "pamgingerCrop");
		pamspiceleafCrop = new BlockPamCrop().setBlockTextureName("spiceleaf").setBlockName("pamspiceleafCrop");
		GameRegistry.registerBlock(pamspiceleafCrop, "pamspiceleafCrop");
		pamtealeafCrop = new BlockPamCrop().setBlockTextureName("tealeaf").setBlockName("pamtealeafCrop");
		GameRegistry.registerBlock(pamtealeafCrop, "pamtealeafCrop");
		pamcoffeebeanCrop = new BlockPamCrop().setBlockTextureName("coffeebean").setBlockName("pamcoffeebeanCrop");
		GameRegistry.registerBlock(pamcoffeebeanCrop, "pamcoffeebeanCrop");
		pammustardseedsCrop = new BlockPamCrop().setBlockTextureName("mustardseeds").setBlockName("pammustardseedsCrop");
		GameRegistry.registerBlock(pammustardseedsCrop, "pammustardseedsCrop");
		pambroccoliCrop = new BlockPamCrop().setBlockTextureName("broccoli").setBlockName("pambroccoliCrop");
		GameRegistry.registerBlock(pambroccoliCrop, "pambroccoliCrop");
		pamcauliflowerCrop = new BlockPamCrop().setBlockTextureName("cauliflower").setBlockName("pamcauliflowerCrop");
		GameRegistry.registerBlock(pamcauliflowerCrop, "pamcauliflowerCrop");
		pamleekCrop = new BlockPamCrop().setBlockTextureName("leek").setBlockName("pamleekCrop");
		GameRegistry.registerBlock(pamleekCrop, "pamleekCrop");
		pamlettuceCrop = new BlockPamCrop().setBlockTextureName("lettuce").setBlockName("pamlettuceCrop");
		GameRegistry.registerBlock(pamlettuceCrop, "pamlettuceCrop");
		pamscallionCrop = new BlockPamCrop().setBlockTextureName("scallion").setBlockName("pamscallionCrop");
		GameRegistry.registerBlock(pamscallionCrop, "pamscallionCrop");
		pamartichokeCrop = new BlockPamCrop().setBlockTextureName("artichoke").setBlockName("pamartichokeCrop");
		GameRegistry.registerBlock(pamartichokeCrop, "pamartichokeCrop");
		pambrusselsproutCrop = new BlockPamCrop().setBlockTextureName("brusselsprout").setBlockName("pambrusselsproutCrop");
		GameRegistry.registerBlock(pambrusselsproutCrop, "pambrusselsproutCrop");
		pamcabbageCrop = new BlockPamCrop().setBlockTextureName("cabbage").setBlockName("pamcabbageCrop");
		GameRegistry.registerBlock(pamcabbageCrop, "pamcabbageCrop");
		pamspinachCrop = new BlockPamCrop().setBlockTextureName("spinach").setBlockName("pamspinachCrop");
		GameRegistry.registerBlock(pamspinachCrop, "pamspinachCrop");
		pamwhitemushroomCrop = new BlockPamCrop().setBlockTextureName("whitemushroom").setBlockName("pamwhitemushroomCrop");
		GameRegistry.registerBlock(pamwhitemushroomCrop, "pamwhitemushroomCrop");
		pambeanCrop = new BlockPamCrop().setBlockTextureName("bean").setBlockName("pambeanCrop");
		GameRegistry.registerBlock(pambeanCrop, "pambeanCrop");
		pamsoybeanCrop = new BlockPamCrop().setBlockTextureName("soybean").setBlockName("pamsoybeanCrop");
		GameRegistry.registerBlock(pamsoybeanCrop, "pamsoybeanCrop");
		pambellpepperCrop = new BlockPamCrop().setBlockTextureName("bellpepper").setBlockName("pambellpepperCrop");
		GameRegistry.registerBlock(pambellpepperCrop, "pambellpepperCrop");
		pamchilipepperCrop = new BlockPamCrop().setBlockTextureName("chilipepper").setBlockName("pamchilipepperCrop");
		GameRegistry.registerBlock(pamchilipepperCrop, "pamchilipepperCrop");
		pameggplantCrop = new BlockPamCrop().setBlockTextureName("eggplant").setBlockName("pameggplantCrop");
		GameRegistry.registerBlock(pameggplantCrop, "pameggplantCrop");
		pamokraCrop = new BlockPamCrop().setBlockTextureName("okra").setBlockName("pamokraCrop");
		GameRegistry.registerBlock(pamokraCrop, "pamokraCrop");
		pampeasCrop = new BlockPamCrop().setBlockTextureName("peas").setBlockName("pampeasCrop");
		GameRegistry.registerBlock(pampeasCrop, "pampeasCrop");
		pamtomatoCrop = new BlockPamCrop().setBlockTextureName("tomato").setBlockName("pamtomatoCrop");
		GameRegistry.registerBlock(pamtomatoCrop, "pamtomatoCrop");
		pamcottonCrop = new BlockPamCrop().setBlockTextureName("cotton").setBlockName("pamcottonCrop");
		GameRegistry.registerBlock(pamcottonCrop, "pamcottonCrop");
		pampineappleCrop = new BlockPamCrop().setBlockTextureName("pineapple").setBlockName("pampineappleCrop");
		GameRegistry.registerBlock(pampineappleCrop, "pampineappleCrop");
		pamgrapeCrop = new BlockPamCrop().setBlockTextureName("grape").setBlockName("pamgrapeCrop");
		GameRegistry.registerBlock(pamgrapeCrop, "pamgrapeCrop");
		pamkiwiCrop = new BlockPamCrop().setBlockTextureName("kiwi").setBlockName("pamkiwiCrop");
		GameRegistry.registerBlock(pamkiwiCrop, "pamkiwiCrop");
		pamcranberryCrop = new BlockPamCrop().setBlockTextureName("cranberry").setBlockName("pamcranberryCrop");
		GameRegistry.registerBlock(pamcranberryCrop, "pamcranberryCrop");
		pamriceCrop = new BlockPamCrop().setBlockTextureName("rice").setBlockName("pamriceCrop");
		GameRegistry.registerBlock(pamriceCrop, "pamriceCrop");
		pamseaweedCrop = new BlockPamCrop().setBlockTextureName("seaweed").setBlockName("pamseaweedCrop");
		GameRegistry.registerBlock(pamseaweedCrop, "pamseaweedCrop");
		
		pamcandleDeco1 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_0").setBlockName("pamcandleDeco1");
		GameRegistry.registerBlock(pamcandleDeco1, "pamcandleDeco1");
		pamcandleDeco2 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_1").setBlockName("pamcandleDeco2");
		GameRegistry.registerBlock(pamcandleDeco2, "pamcandleDeco2");
		pamcandleDeco3 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_2").setBlockName("pamcandleDeco3");
		GameRegistry.registerBlock(pamcandleDeco3, "pamcandleDeco3");
		pamcandleDeco4 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_3").setBlockName("pamcandleDeco4");
		GameRegistry.registerBlock(pamcandleDeco4, "pamcandleDeco4");
		pamcandleDeco5 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_4").setBlockName("pamcandleDeco5");
		GameRegistry.registerBlock(pamcandleDeco5, "pamcandleDeco5");
		pamcandleDeco6 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_5").setBlockName("pamcandleDeco6");
		GameRegistry.registerBlock(pamcandleDeco6, "pamcandleDeco6");
		pamcandleDeco7 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_6").setBlockName("pamcandleDeco7");
		GameRegistry.registerBlock(pamcandleDeco7, "pamcandleDeco7");
		pamcandleDeco8 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_7").setBlockName("pamcandleDeco8");
		GameRegistry.registerBlock(pamcandleDeco8, "pamcandleDeco8");
		pamcandleDeco9 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_8").setBlockName("pamcandleDeco9");
		GameRegistry.registerBlock(pamcandleDeco9, "pamcandleDeco9");
		pamcandleDeco10 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_9").setBlockName("pamcandleDeco10");
		GameRegistry.registerBlock(pamcandleDeco10, "pamcandleDeco10");
		pamcandleDeco11 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_10").setBlockName("pamcandleDeco11");
		GameRegistry.registerBlock(pamcandleDeco11, "pamcandleDeco11");
		pamcandleDeco12 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_11").setBlockName("pamcandleDeco12");
		GameRegistry.registerBlock(pamcandleDeco12, "pamcandleDeco12");
		pamcandleDeco13 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_12").setBlockName("pamcandleDeco13");
		GameRegistry.registerBlock(pamcandleDeco13, "pamcandleDeco13");
		pamcandleDeco14 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_13").setBlockName("pamcandleDeco14");
		GameRegistry.registerBlock(pamcandleDeco14, "pamcandleDeco14");
		pamcandleDeco15 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_14").setBlockName("pamcandleDeco15");
		GameRegistry.registerBlock(pamcandleDeco15, "pamcandleDeco15");
		pamcandleDeco16 = new BlockPamCandleDeco().setLightLevel(candlelightLevel).setBlockTextureName("harvestcraft:candle_15").setBlockName("pamcandleDeco16");
		GameRegistry.registerBlock(pamcandleDeco16, "pamcandleDeco16");
		
		pamcarrotCake = new BlockPamCake(4).setHardness(0.5F).setBlockTextureName("harvestcraft:pamcarrotcake").setBlockName("pamcarrotCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pamcarrotCake, "pamcarrotCake");
		pamcheeseCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pamcheesecake").setBlockName("pamcheeseCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pamcheeseCake, "pamcheeseCake");
		pamcherrycheeseCake = new BlockPamCake(6).setHardness(0.5F).setBlockTextureName("harvestcraft:pamcherrycheesecake").setBlockName("pamcherrycheeseCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pamcherrycheeseCake, "pamcherrycheeseCake");
		pampineappleupsidedownCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pampineappleupsidedowncake").setBlockName("pampineappleupsidedownCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pampineappleupsidedownCake, "pampineappleupsidedownCake");
		pamchocolatesprinkleCake = new BlockPamCake(4).setHardness(0.5F).setBlockTextureName("harvestcraft:pamchocolatesprinklecake").setBlockName("pamchocolatesprinkleCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pamchocolatesprinkleCake, "pamchocolatesprinkleCake");
		pamredvelvetCake = new BlockPamCake(4).setHardness(0.5F).setBlockTextureName("harvestcraft:pamredvelvetcake").setBlockName("pamredvelvetCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pamredvelvetCake, "pamredvelvetCake");
		pamlamingtonCake = new BlockPamCake(3).setHardness(0.5F).setBlockTextureName("harvestcraft:pamlamingtoncake").setBlockName("pamlamingtonCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pamlamingtonCake, "pamlamingtonCake");
		pampavlovaCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pampavlovacake").setBlockName("pampavlovaCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pampavlovaCake, "pampavlovaCake");
		pamholidayCake = new BlockPamCake(5).setHardness(0.5F).setBlockTextureName("harvestcraft:pamholidaycake").setBlockName("pamholidayCake").setCreativeTab(harvestcraft.tabHarvestCraft3);
		GameRegistry.registerBlock(pamholidayCake, "pamholidayCake");
		
	  
	  
		PamTemperateSaplings = (new Block[] 
				{
                	pamappleSapling, pamavocadoSapling, pamcherrySapling, pamchestnutSapling, pamnutmegSapling, 
                	pampearSapling, pamplumSapling, pamwalnutSapling 
				});
		
		PamWarmSaplings = (new Block[] 
				{
				pamalmondSapling, pamapricotSapling, pambananaSapling, pamcashewSapling, pamcoconutSapling, 
				pamdateSapling, pamdragonfruitSapling, pamdurianSapling, pamfigSapling, pamgrapefruitSapling, 
				pamlemonSapling, pamlimeSapling, pammangoSapling, pamoliveSapling, pamorangeSapling,
				pampapayaSapling, pampeachSapling, pampecanSapling, pampeppercornSapling, pampersimmonSapling, 
				pampistachioSapling, pampomegranateSapling, pamstarfruitSapling, pamvanillabeanSapling
				});
		
		PamLogSaplings = (new Block[] 
				{
                	pamcinnamonSapling, pammapleSapling, pampaperbarkSapling
				});
		
  }
  
}