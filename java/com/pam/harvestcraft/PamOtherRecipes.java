package com.pam.harvestcraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class PamOtherRecipes 
{
	  
	public static ItemStack book;

	@SuppressWarnings("unchecked")
	public static void getRecipes()
	{
		//Apiary
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamApiary, 1, 0), new Object[]
		                {
		       	 		"#O#", "#O#", "#O#", '#', "plankWood", 'O', Items.item_frame
		                }));
		//Presser
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamPresser, 1, 0), new Object[]
		                {
		       	 		"#O#", "# #", "#O#", '#', "ingotIron", 'O', Blocks.piston
		                }));
		//Presser
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamPresser, 1, 0), new Object[]
				                {
				       	 		"#O#", "# #", "#O#", '#', "ingotBronze", 'O', Blocks.piston
				                }));
				//Presser
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamPresser, 1, 0), new Object[]
				                {
				       	 		"#O#", "# #", "#O#", '#', "ingotSteel", 'O', Blocks.piston
				                }));
		//Sinks - Iron
		//Water Barrel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 0), new Object[]
		                {
		                    "#O#", "#O#", "#O#", '#', "ingotIron", 'O', Blocks.log
		                }));
		//Stone Basin
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 1), new Object[]
		                {
		       	 		"#O#", "#O#", "#O#", '#', "ingotIron", 'O', Blocks.stone
		                }));
		//Clay Jug
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 2), new Object[]
		                {
		       	 		"#O#", "#O#", "#O#", '#', "ingotIron", 'O', Blocks.clay
		                }));
		//Brick Well
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 3), new Object[]
		                {
		       	 		"#O#", "#O#", "#O#", '#', "ingotIron", 'O', Blocks.brick_block
		                }));
		//Sinks - Copper
				//Water Barrel
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 0), new Object[]
				                {
				                    "#O#", "#O#", "#O#", '#', "ingotCopper", 'O', Blocks.log
				                }));
				//Stone Basin
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 1), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotCopper", 'O', Blocks.stone
				                }));
				//Clay Jug
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 2), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotCopper", 'O', Blocks.clay
				                }));
				//Brick Well
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 3), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotCopper", 'O', Blocks.brick_block
				                }));
				//Sinks - Tin
				//Water Barrel
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 0), new Object[]
				                {
				                    "#O#", "#O#", "#O#", '#', "ingotTin", 'O', Blocks.log
				                }));
				//Stone Basin
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 1), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotTin", 'O', Blocks.stone
				                }));
				//Clay Jug
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 2), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotTin", 'O', Blocks.clay
				                }));
				//Brick Well
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 3), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotTin", 'O', Blocks.brick_block
				                }));
				//Sinks - Bronze
				//Water Barrel
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 0), new Object[]
				                {
				                    "#O#", "#O#", "#O#", '#', "ingotBronze", 'O', Blocks.log
				                }));
				//Stone Basin
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 1), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotBronze", 'O', Blocks.stone
				                }));
				//Clay Jug
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 2), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotBronze", 'O', Blocks.clay
				                }));
				//Brick Well
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 3), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotBronze", 'O', Blocks.brick_block
				                }));
				//Sinks - Steel
				//Water Barrel
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 0), new Object[]
				                {
				                    "#O#", "#O#", "#O#", '#', "ingotSteel", 'O', Blocks.log
				                }));
				//Stone Basin
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 1), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotSteel", 'O', Blocks.stone
				                }));
				//Clay Jug
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 2), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotSteel", 'O', Blocks.clay
				                }));
				//Brick Well
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamSink, 1, 3), new Object[]
				                {
				       	 		"#O#", "#O#", "#O#", '#', "ingotSteel", 'O', Blocks.brick_block
				                }));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, new Object[]{
	 	 		"X@@", " @@", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, new Object[]{
	 	 		"@  ", " @ ", "  X", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, new Object[]{
	 	 		"@  ", "X  ", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.bakewareItem, true, new Object[]{
	 	 		"@@@", "@ @", "@@@", Character.valueOf('@'), "ingotBrick"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, new Object[]{
	 	 		"@  ", " X ", "  O", Character.valueOf('@'), "ingotIron", Character.valueOf('X'), "stickWood", Character.valueOf('O'), "plankWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.mortarandpestleItem, true, new Object[]{
	 	 		"X@X", " X ", Character.valueOf('@'), "stickWood", Character.valueOf('X'), "stone"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.mixingbowlItem, true, new Object[]{
	 	 		"X@X", " X ", Character.valueOf('@'), "stickWood", Character.valueOf('X'), "plankWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.juicerItem, true, new Object[]{
	 	 		" @ ", " X ", Character.valueOf('@'), "stone", Character.valueOf('X'), Blocks.stone_pressure_plate}));
		
		//Copper Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, new Object[]{
	 	 		"X@@", " @@", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, new Object[]{
	 	 		"@  ", " @ ", "  X", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, new Object[]{
	 	 		"@  ", "X  ", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, new Object[]{
	 	 		"@  ", " X ", "  O", Character.valueOf('@'), "ingotCopper", Character.valueOf('X'), "stickWood", Character.valueOf('O'), "plankWood"}));
		//Steel Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.potItem, true, new Object[]{
	 	 		"X@@", " @@", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.skilletItem, true, new Object[]{
	 	 		"@  ", " @ ", "  X", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.saucepanItem, true, new Object[]{
	 	 		"@  ", "X  ", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.cuttingboardItem, true, new Object[]{
	 	 		"@  ", " X ", "  O", Character.valueOf('@'), "ingotSteel", Character.valueOf('X'), "stickWood", Character.valueOf('O'), "plankWood"}));
		//Nether Brick Bakeware
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ItemRegistry.bakewareItem, true, new Object[]{
	 	 		"@@@", "@ @", "@@@", Character.valueOf('@'), "ingotBrickNether"}));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.royaljellyItem, new ItemStack(ItemRegistry.queenbeeItem, 1, 18)));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.queenbeeItem, ItemRegistry.grubItem, ItemRegistry.royaljellyItem));

		
		//Hardened Leather Armor Recipes
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.hardenedleatherhelmItem, 1), new Object[]
		                {
		                    "XXX", "X X", 'X', ItemRegistry.hardenedleatherItem
		                }));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.hardenedleatherchestItem, 1), new Object[]
		                {
		                    "X X", "XXX", "XXX", 'X', ItemRegistry.hardenedleatherItem
		                }));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.hardenedleatherleggingsItem, 1), new Object[]
		                {
		                    "XXX", "X X", "X X", 'X', ItemRegistry.hardenedleatherItem
		                }));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.hardenedleatherbootsItem, 1), new Object[]
		                {
		                    "X X", "X X", 'X', ItemRegistry.hardenedleatherItem
		                }));
		
		//Cotton Seed & Switch Recipes
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.cottonseedItem, ItemRegistry.cottonItem));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cottonItem, 2), "cropCotton", "cropCotton"));
				
				//Woven Cloth Recipes
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Items.string, 2), "cropCotton", "cropCotton", "cropCotton"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 1), Items.string, Items.string));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.wovencottonItem, 3), "materialCloth", "materialCloth", "materialCloth"));
				//Woven Cloth into Wool Recipe
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Blocks.wool, 1, 0), "materialCloth", "materialCloth"));
				
				//Cotton Armor Recipes
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_helmet, 1), new Object[]
		                {
		                    "XXX", "X X", 'X', ItemRegistry.wovencottonItem
		                }));
		        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_chestplate, 1), new Object[]
		                {
		                    "X X", "XXX", "XXX", 'X', ItemRegistry.wovencottonItem
		                }));
		        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_leggings, 1), new Object[]
		                {
		                    "XXX", "X X", "X X", 'X', ItemRegistry.wovencottonItem
		                }));
		        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather_boots, 1), new Object[]
		                {
		                    "X X", "X X", 'X', ItemRegistry.wovencottonItem
		                }));
		        
		        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.candleberryseedItem, ItemRegistry.candleberryItem));
		        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.cottonItem, 2), "cropCandleberry", "cropCandleberry"));
		        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.waxItem, "toolPot", ItemRegistry.candleberryItem, ItemRegistry.candleberryItem, ItemRegistry.candleberryItem, ItemRegistry.candleberryItem));
		        
		        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.waxItem, "materialPressedwax"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.hardenedleatherItem, Items.leather, "materialPressedwax"));
		
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco1, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco2, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeOrange"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco3, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeMagenta"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco4, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeLightBlue"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco5, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeYellow"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco6, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeLime"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco7, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyePink"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco8, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeGray"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco9, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "LightGray"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco10, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeCyan"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco11, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyePurple"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco12, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeBlue"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco13, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeBrown"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco14, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeGreen"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco15, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeRed"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco16, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "dyeBlack"));
				
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco2, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerOrange"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco3, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerMagenta"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco4, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerLightblue"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco5, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerYellow"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco6, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerLime"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco7, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerPink"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco8, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerDarkgrey"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco9, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerLightgrey"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco10, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerCyan"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco11, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerPurple"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco12, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerBlue"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco13, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerBrown"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco14, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerGreen"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco15, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerRed"));
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(BlockRegistry.pamcandleDeco16, BlockRegistry.candlerecipeAmount), "materialPressedwax", Items.string, "flowerBlack"));
	
				//Market Recipe
				if (BlockRegistry.marketblockrecipeItem == 0)
				{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), new Object[]
		                {
		                    "XOX", "OEO", "XOX",'X', "plankWood", 'O', Blocks.wool, 'E', Items.emerald
		                }));
				}
				if (BlockRegistry.marketblockrecipeItem == 1)
				{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), new Object[]
		                {
		                    "XOX", "OEO", "XOX",'X', "plankWood", 'O', Blocks.wool, 'E', Items.diamond
		                }));
				}
				if (BlockRegistry.marketblockrecipeItem == 2)
				{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), new Object[]
		                {
		                    "XOX", "OEO", "XOX",'X', "plankWood", 'O', Blocks.wool, 'E', Items.gold_ingot
		                }));
				}
				if (BlockRegistry.marketblockrecipeItem == 3)
				{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), new Object[]
		                {
		                    "XOX", "OEO", "XOX",'X', "plankWood", 'O', Blocks.wool, 'E', Items.gold_nugget
		                }));
				}
				if (BlockRegistry.marketblockrecipeItem == 4)
				{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), new Object[]
		                {
		                    "XOX", "OEO", "XOX",'X', "plankWood", 'O', Blocks.wool, 'E', Items.iron_ingot
		                }));
				}
				if (BlockRegistry.marketblockrecipeItem == 5)
				{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamMarket, 1), new Object[]
		                {
		                    "XOX", "OEO", "XOX",'X', "plankWood", 'O', Blocks.wool, 'E', Items.apple
		                }));
				}
				
				//Oven Recipe
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockRegistry.pamOven, 1), new Object[]
		                {
		                    "XOX", "XEX", "XXX",'X', "ingotIron", 'O', Blocks.iron_bars, 'E', Blocks.furnace
		                }));
				
				//Random Recipes
				CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(Items.slime_ball, 1), "foodJellyfishraw"));

	}
	
}
