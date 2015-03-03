package com.pam.harvestcraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class PamFoodFishingCraftRecipes 
{
	@SuppressWarnings("unchecked")
	public static void getRecipes()
	{
		//FC.Salmon
		//FC.SalmonCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Salmon", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Salmon", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Salmon", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Salmon", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Salmon", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.SalmonCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.SalmonCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Catfish
		//FC.CatfishCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Catfish", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Catfish", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Catfish", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Catfish", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Catfish", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.CatfishCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.CatfishCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Bluegill
		//FC.BluegillCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Bluegill", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Bluegill", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Bluegill", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Bluegill", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Bluegill", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.BluegillCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.BluegillCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Suckerfish
		//FC.SuckerfishCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Suckerfish", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Suckerfish", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Suckerfish", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Suckerfish", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Suckerfish", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.SuckerfishCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.SuckerfishCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Carp
		//FC.CarpCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Carp", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Carp", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Carp", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Carp", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Carp", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.CarpCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.CarpCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Bass
		//FC.BassCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Bass", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Bass", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Bass", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Bass", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Bass", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.BassCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.BassCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Pike
		//FC.PikeCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Pike", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Pike", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Pike", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Pike", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Pike", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.PikeCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.PikeCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Peacock_Bass
		//FC.Peacock_BassCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Peacock_Bass", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Peacock_Bass", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Peacock_Bass", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Peacock_Bass", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Peacock_Bass", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.Peacock_BassCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.Peacock_BassCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Small_Piranha
		//FC.Small_PiranhaCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Small_Piranha", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Small_Piranha", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Small_Piranha", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Small_Piranha", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Small_Piranha", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.Small_PiranhaCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.Small_PiranhaCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Goldfish
		//FC.GoldfishCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Goldfish", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Goldfish", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Goldfish", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Goldfish", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Goldfish", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.GoldfishCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.GoldfishCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
		
		//FC.Tuna_StripRaw
		//FC.Tuna_StripCooked
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsandwichItem, "toolSkillet", "FC.Tuna_StripRaw", "foodMayo", Items.bread));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishsticksItem, "toolBakeware", "FC.Tuna_StripRaw", "foodFlour"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.stockItem, "toolPot", "FC.Tuna_StripRaw", "toolMixingbowl"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.fishdinnerItem, 1), "toolSkillet", "cropLemon", "foodFlour", "FC.Tuna_StripRaw", "foodMayo"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "toolCuttingboard", "FC.Tuna_StripRaw", "cropRice"));
		
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem, "toolCuttingboard", "cropLettuce", "FC.Tuna_StripCooked"));
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(ItemRegistry.fishtacoItem, "FC.Tuna_StripCooked", "cropLettuce", "foodCheese", "foodTortilla"));
		
	}
	
}

