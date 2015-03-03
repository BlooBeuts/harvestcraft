package com.pam.harvestcraft;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import powercrystals.minefactoryreloaded.api.FactoryRegistry;
import powercrystals.minefactoryreloaded.api.HarvestType;

public class PamMFRCompatibility 
{
	public static Block PamCrops[];
	public static Item PamCropItems[];
	public static Item PamCropSeeds[];
	public static Block PamTemperateSaplings[];
	public static Block PamWarmSaplings[];
	public static Block PamLogSaplings[];
	public static Block PamTemperateFruits[];
	public static Block PamWarmFruits[];
	public static Block PamLogFruits[];
	public static Item PamTemperateFruitItems[];
	public static Item PamWarmFruitItems[];
	public static Item PamLogFruitItems[];
	
	public static void getRegistry()
	{
		PamCrops = (new Block[] 
				{
				BlockRegistry.pamblackberryCrop, BlockRegistry.pamblueberryCrop, BlockRegistry.pamcandleberryCrop, 
				BlockRegistry.pamraspberryCrop, BlockRegistry.pamstrawberryCrop, BlockRegistry.pamcactusfruitCrop, 
				BlockRegistry.pamasparagusCrop, BlockRegistry.pambarleyCrop, BlockRegistry.pamoatsCrop, 
				BlockRegistry.pamryeCrop, BlockRegistry.pamcornCrop, BlockRegistry.pambambooshootCrop, 
				BlockRegistry.pamcantaloupeCrop, BlockRegistry.pamcucumberCrop, BlockRegistry.pamwintersquashCrop, 
				BlockRegistry.pamzucchiniCrop, BlockRegistry.pambeetCrop, BlockRegistry.pamonionCrop, 
				BlockRegistry.pamparsnipCrop, BlockRegistry.pampeanutCrop, BlockRegistry.pamradishCrop, 
				BlockRegistry.pamrutabagaCrop, BlockRegistry.pamsweetpotatoCrop, BlockRegistry.pamturnipCrop, 
				BlockRegistry.pamrhubarbCrop, BlockRegistry.pamceleryCrop, BlockRegistry.pamgarlicCrop, 
				BlockRegistry.pamgingerCrop, BlockRegistry.pamspiceleafCrop, BlockRegistry.pamtealeafCrop, 
				BlockRegistry.pamcoffeebeanCrop, BlockRegistry.pammustardseedsCrop, BlockRegistry.pambroccoliCrop, 
				BlockRegistry.pamcauliflowerCrop, BlockRegistry.pamleekCrop, BlockRegistry.pamlettuceCrop, 
				BlockRegistry.pamscallionCrop, BlockRegistry.pamartichokeCrop, BlockRegistry.pambrusselsproutCrop, 
				BlockRegistry.pamcabbageCrop, BlockRegistry.pamwhitemushroomCrop, BlockRegistry.pambeanCrop, 
				BlockRegistry.pamsoybeanCrop, BlockRegistry.pambellpepperCrop, BlockRegistry.pamchilipepperCrop, 
				BlockRegistry.pameggplantCrop, BlockRegistry.pamokraCrop, BlockRegistry.pampeasCrop, 
				BlockRegistry.pamtomatoCrop, BlockRegistry.pamcottonCrop, BlockRegistry.pampineappleCrop, 
				BlockRegistry.pamgrapeCrop, BlockRegistry.pamkiwiCrop, BlockRegistry.pamcranberryCrop, 
				BlockRegistry.pamriceCrop, BlockRegistry.pamseaweedCrop, BlockRegistry.pamspinachCrop
				});
		
		PamCropItems = (new Item[] 
				{
				ItemRegistry.blackberryItem, ItemRegistry.blueberryItem, ItemRegistry.candleberryItem, 
				ItemRegistry.raspberryItem, ItemRegistry.strawberryItem, ItemRegistry.cactusfruitItem, 
				ItemRegistry.asparagusItem, ItemRegistry.barleyItem, ItemRegistry.oatsItem, 
				ItemRegistry.ryeItem, ItemRegistry.cornItem, ItemRegistry.bambooshootItem, 
				ItemRegistry.cantaloupeItem, ItemRegistry.cucumberItem, ItemRegistry.wintersquashItem, 
				ItemRegistry.zucchiniItem, ItemRegistry.beetItem, ItemRegistry.onionItem, 
				ItemRegistry.parsnipItem, ItemRegistry.peanutItem, ItemRegistry.radishItem, 
				ItemRegistry.rutabagaItem, ItemRegistry.sweetpotatoItem, ItemRegistry.turnipItem, 
				ItemRegistry.rhubarbItem, ItemRegistry.celeryItem, ItemRegistry.garlicItem, 
				ItemRegistry.gingerItem, ItemRegistry.spiceleafItem, ItemRegistry.tealeafItem, 
				ItemRegistry.coffeebeanItem, ItemRegistry.mustardseedsItem, ItemRegistry.broccoliItem, 
				ItemRegistry.cauliflowerItem, ItemRegistry.leekItem, ItemRegistry.lettuceItem, 
				ItemRegistry.scallionItem, ItemRegistry.artichokeItem, ItemRegistry.brusselsproutItem, 
				ItemRegistry.cabbageItem, ItemRegistry.whitemushroomItem, ItemRegistry.beanItem, 
				ItemRegistry.soybeanItem, ItemRegistry.bellpepperItem, ItemRegistry.chilipepperItem, 
				ItemRegistry.eggplantItem, ItemRegistry.okraItem, ItemRegistry.peasItem, 
				ItemRegistry.tomatoItem, ItemRegistry.cottonItem, ItemRegistry.pineappleItem, 
				ItemRegistry.grapeItem, ItemRegistry.kiwiItem, ItemRegistry.cranberryItem, 
				ItemRegistry.riceItem, ItemRegistry.seaweedItem, ItemRegistry.spinachItem
				});

		PamCropSeeds = (new Item[] 
				{
				ItemRegistry.blackberryseedItem, ItemRegistry.blueberryseedItem, ItemRegistry.candleberryseedItem, 
				ItemRegistry.raspberryseedItem, ItemRegistry.strawberryseedItem, ItemRegistry.cactusfruitseedItem, 
				ItemRegistry.asparagusseedItem, ItemRegistry.barleyseedItem, ItemRegistry.oatsseedItem, 
				ItemRegistry.ryeseedItem, ItemRegistry.cornseedItem, ItemRegistry.bambooshootseedItem, 
				ItemRegistry.cantaloupeseedItem, ItemRegistry.cucumberseedItem, ItemRegistry.wintersquashseedItem, 
				ItemRegistry.zucchiniseedItem, ItemRegistry.beetseedItem, ItemRegistry.onionseedItem, 
				ItemRegistry.parsnipseedItem, ItemRegistry.peanutseedItem, ItemRegistry.radishseedItem, 
				ItemRegistry.rutabagaseedItem, ItemRegistry.sweetpotatoseedItem, ItemRegistry.turnipseedItem, 
				ItemRegistry.rhubarbseedItem, ItemRegistry.celeryseedItem, ItemRegistry.garlicseedItem, 
				ItemRegistry.gingerseedItem, ItemRegistry.spiceleafseedItem, ItemRegistry.teaseedItem, 
				ItemRegistry.coffeeseedItem, ItemRegistry.mustardseedItem, ItemRegistry.broccoliseedItem, 
				ItemRegistry.cauliflowerseedItem, ItemRegistry.leekseedItem, ItemRegistry.lettuceseedItem, 
				ItemRegistry.scallionseedItem, ItemRegistry.artichokeseedItem, ItemRegistry.brusselsproutseedItem, 
				ItemRegistry.cabbageseedItem, ItemRegistry.whitemushroomseedItem, ItemRegistry.beanseedItem, 
				ItemRegistry.soybeanseedItem, ItemRegistry.bellpepperseedItem, ItemRegistry.chilipepperseedItem, 
				ItemRegistry.eggplantseedItem, ItemRegistry.okraseedItem, ItemRegistry.peasseedItem, 
				ItemRegistry.tomatoseedItem, ItemRegistry.cottonseedItem, ItemRegistry.pineappleseedItem, 
				ItemRegistry.grapeseedItem, ItemRegistry.kiwiseedItem, ItemRegistry.cranberryseedItem, 
				ItemRegistry.riceseedItem, ItemRegistry.seaweedItem, ItemRegistry.spinachseedItem
				});
		
		PamTemperateSaplings = (new Block[] 
				{
                	BlockRegistry.pamappleSapling, BlockRegistry.pamavocadoSapling, BlockRegistry.pamcherrySapling, 
                	BlockRegistry.pamchestnutSapling, BlockRegistry.pamnutmegSapling, BlockRegistry.pampearSapling, 
                	BlockRegistry.pamplumSapling, BlockRegistry.pamwalnutSapling 
				});
		
		PamWarmSaplings = (new Block[] 
				{
				BlockRegistry.pamalmondSapling, BlockRegistry.pamapricotSapling, BlockRegistry.pambananaSapling, 
				BlockRegistry.pamcashewSapling, BlockRegistry.pamcoconutSapling, BlockRegistry.pamdateSapling, 
				BlockRegistry.pamdragonfruitSapling, BlockRegistry.pamdurianSapling, BlockRegistry.pamfigSapling, 
				BlockRegistry.pamgrapefruitSapling, BlockRegistry.pamlemonSapling, BlockRegistry.pamlimeSapling, 
				BlockRegistry.pammangoSapling, BlockRegistry.pamoliveSapling, BlockRegistry.pamorangeSapling,
				BlockRegistry.pampapayaSapling, BlockRegistry.pampeachSapling, BlockRegistry.pampecanSapling, 
				BlockRegistry.pampeppercornSapling, BlockRegistry.pampersimmonSapling, BlockRegistry.pampistachioSapling, 
				BlockRegistry.pampomegranateSapling, BlockRegistry.pamstarfruitSapling, BlockRegistry.pamvanillabeanSapling
				});
		
		PamLogSaplings = (new Block[] 
				{
                	BlockRegistry.pamcinnamonSapling, BlockRegistry.pammapleSapling, BlockRegistry.pampaperbarkSapling
				});
		
		PamTemperateFruits = (new Block[] 
				{
                	BlockRegistry.pamApple, BlockRegistry.pamAvocado, BlockRegistry.pamCherry, 
                	BlockRegistry.pamChestnut, BlockRegistry.pamNutmeg, BlockRegistry.pamPear, 
                	BlockRegistry.pamPlum, BlockRegistry.pamWalnut 
				});
		
		PamWarmFruits = (new Block[] 
				{
				BlockRegistry.pamAlmond, BlockRegistry.pamApricot, BlockRegistry.pamBanana, 
				BlockRegistry.pamCashew, BlockRegistry.pamCoconut, BlockRegistry.pamDate, 
				BlockRegistry.pamDragonfruit, BlockRegistry.pamDurian, BlockRegistry.pamFig, 
				BlockRegistry.pamGrapefruit, BlockRegistry.pamLemon, BlockRegistry.pamLime, 
				BlockRegistry.pamMango, BlockRegistry.pamOlive, BlockRegistry.pamOrange,
				BlockRegistry.pamPapaya, BlockRegistry.pamPeach, BlockRegistry.pamPecan, 
				BlockRegistry.pamPeppercorn, BlockRegistry.pamPersimmon, BlockRegistry.pamPistachio, 
				BlockRegistry.pamPomegranate, BlockRegistry.pamStarfruit, BlockRegistry.pamVanillabean
				});
		
		PamLogFruits = (new Block[] 
				{
                	BlockRegistry.pamCinnamon, BlockRegistry.pamMaple, BlockRegistry.pamPaperbark
				});
		
		PamTemperateFruitItems = (new Item[] 
				{
                	Items.apple, ItemRegistry.avocadoItem, ItemRegistry.cherryItem, 
                	ItemRegistry.chestnutItem, ItemRegistry.nutmegItem, ItemRegistry.pearItem, 
                	ItemRegistry.plumItem, ItemRegistry.walnutItem 
				});
		
		PamWarmFruitItems = (new Item[] 
				{
				ItemRegistry.almondItem, ItemRegistry.apricotItem, ItemRegistry.bananaItem, 
				ItemRegistry.cashewItem, ItemRegistry.coconutItem, ItemRegistry.dateItem, 
				ItemRegistry.dragonfruitItem, ItemRegistry.durianItem, ItemRegistry.figItem, 
				ItemRegistry.grapefruitItem, ItemRegistry.lemonItem, ItemRegistry.limeItem, 
				ItemRegistry.mangoItem, ItemRegistry.oliveItem, ItemRegistry.orangeItem,
				ItemRegistry.papayaItem, ItemRegistry.peachItem, ItemRegistry.pecanItem, 
				ItemRegistry.peppercornItem, ItemRegistry.persimmonItem, ItemRegistry.pistachioItem, 
				ItemRegistry.pomegranateItem, ItemRegistry.starfruitItem, ItemRegistry.vanillabeanItem
				});
		
		PamLogFruitItems = (new Item[] 
				{
                	ItemRegistry.cinnamonItem, ItemRegistry.maplesyrupItem, Items.paper
				});
		
		for(int i = 0; i < 57; ++i)
		{
			FactoryRegistry.sendMessage("registerPlantable",new PlantableMFRCrop(PamCropItems[i], PamCrops[i]));
			FactoryRegistry.sendMessage("registerPlantable",new PlantableMFRCrop(PamCropSeeds[i], PamCrops[i]));
			FactoryRegistry.sendMessage("registerHarvestable",new HarvestableMFRCrop(PamCrops[i], HarvestType.Normal));
			FactoryRegistry.sendMessage("registerFertilizable",new FertilizableMFRCrop(PamCrops[i]));
		}
		
		for(int i = 0; i < 8; ++i)
		{
			FactoryRegistry.sendMessage("registerFertilizable", new FertilizableMFRSapling(PamTemperateSaplings[i]));
			FactoryRegistry.sendMessage("registerPickableFruit", new PickableMFRFruit(PamTemperateFruits[i], PamTemperateFruitItems[i], 0));
			FactoryRegistry.sendMessage("registerFertilizable",new FertilizableMFRFruit(PamTemperateFruits[i]));
		}
		
		for(int i = 0; i < 24; ++i)
		{
			FactoryRegistry.sendMessage("registerFertilizable", new FertilizableMFRSapling(PamWarmSaplings[i]));
			FactoryRegistry.sendMessage("registerPickableFruit", new PickableMFRFruit(PamWarmFruits[i], PamWarmFruitItems[i], 0));
			FactoryRegistry.sendMessage("registerFertilizable",new FertilizableMFRFruit(PamWarmFruits[i]));
		}
		
		for(int i = 0; i < 3; ++i)
		{
			FactoryRegistry.sendMessage("registerFertilizable", new FertilizableMFRSapling(PamLogSaplings[i]));
			FactoryRegistry.sendMessage("registerPickableFruit", new PickableMFRFruit(PamLogFruits[i], PamLogFruitItems[i], 0));
			FactoryRegistry.sendMessage("registerFertilizable",new FertilizableMFRFruit(PamLogFruits[i]));
		}
			
	}
	
	
}

