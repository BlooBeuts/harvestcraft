package com.pam.harvestcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.WeightedRandomFishable;
import net.minecraftforge.common.FishingHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = harvestcraft.modid, name = "Pam's HarvestCraft", version = harvestcraft.version)

public class harvestcraft
{
	public static final String modid = "harvestcraft";
	public static final String version = "1.7.10g";
	
	@Mod.Instance("harvestcraft")
	public static harvestcraft instance;

	@SidedProxy(clientSide="com.pam.harvestcraft.ClientProxy", serverSide="com.pam.harvestcraft.CommonProxy")
	public static CommonProxy proxy;
	
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("harvestcraft");

	
	
    public static CreativeTabs tabHarvestCraft = new CreativeTabs("tabHarvestCraft") 
	{

		@Override
		public Item getTabIconItem() {
			return ItemRegistry.cuttingboardItem;
		}
	};
	
	public static CreativeTabs tabHarvestCraft2 = new CreativeTabs("tabHarvestCraft2") 
	{

		@Override
		public Item getTabIconItem() {
			return ItemRegistry.lettuceItem;
		}
	};
	
	public static CreativeTabs tabHarvestCraft3 = new CreativeTabs("tabHarvestCraft3") 
	{

		@Override
		public Item getTabIconItem() {
			return ItemRegistry.pbandjItem;
		}
	};
    
	@EventHandler
	 public void onPreInit(FMLPreInitializationEvent event)
	 {
		Config.instance.load(event);
		//Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    //config.load();
	    //BlockRegistry.initBlocks(event, config);
	    //ItemRegistry.initItems(event, config);
	    //if (config.hasChanged()) 
	   // {
	   //     config.save();
	    //}
	    NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

	    BlockRegistry.registerBlocks();
	    ItemRegistry.registerItems();
	    PamThaumcraftAspectsList.getRegistry();
	    
	    
	    PamFoodRecipes.getRecipes();
		PamOtherRecipes.getRecipes();
		PamFoodFishingCraftRecipes.getRecipes();
		PamFoodOreDictionaryRegistry.getRegistry();
		PamOtherOreDictionaryRegistry.getRegistry();
		PamCropSeedDropRegistry.getSeedDrops();
		PamMFRCompatibility.getRegistry();
		
		MarketItems.registerItems();
		PacketHandler.init();
		
		FishRegistry.registerItems();
	    
	    GameRegistry.registerTileEntity(TileEntityPamApiary.class,"PamApiary");
	    GameRegistry.registerTileEntity(TileEntityPamPresser.class,"PamPresser");
	    GameRegistry.registerTileEntity(TileEntityMarket.class,"PamMarket");
	    GameRegistry.registerTileEntity(TileEntityOven.class,"PamOven");
	    
	    proxy.registerHandlers(event);

	    if (ItemRegistry.sheepdropMutton)
		{
		MinecraftForge.EVENT_BUS.register(new PamSheepDrops());
		}
		if (ItemRegistry.squiddropCalamari)
		{
		MinecraftForge.EVENT_BUS.register(new PamSquidDrops());
		}
		
		MinecraftForge.EVENT_BUS.register(new PamHarvestBonemealEvent());
		
		MinecraftForge.EVENT_BUS.register(new PamTooltipEventHandler());

	 }
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		FMLInterModComms.sendMessage("cfm", "register", "com.pam.harvestcraft.CrayfishCompatibility.registerRecipes");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		TileEntityHandler.registerTileEntities();
		
		if (BlockRegistry.enablesaltGeneration)
        {
		 GameRegistry.registerWorldGenerator(new WorldGenPamSalt(), 1);
        }
		
		if (BlockRegistry.enablebeehiveGeneration)
		{
			GameRegistry.registerWorldGenerator(new PamBeeGenerator(), 0);
		}
		
		GameRegistry.registerWorldGenerator(new PamGardenGenerator(), 0);
		GameRegistry.registerWorldGenerator(new PamTreeGenerator(), 0);
		
	}
}