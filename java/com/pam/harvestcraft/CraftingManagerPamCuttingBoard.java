package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingManagerPamCuttingBoard
{
/** The static instance of this class */
private static final CraftingManagerPamCuttingBoard instance = new CraftingManagerPamCuttingBoard();

/** A list of all the recipes added */
@SuppressWarnings("rawtypes")
private List recipes = new ArrayList();

/**
         * Returns the static instance of this class
         */
public static final CraftingManagerPamCuttingBoard getInstance()
{
         return instance;
}

@SuppressWarnings({ "rawtypes", "unchecked" })
private CraftingManagerPamCuttingBoard()
{
         recipes = new ArrayList();
        
                //Your recipes go here
         this.recipes.add(new ShapelessOreRecipe(ItemRegistry.potatosaladItem, Items.baked_potato, "foodMayo"));
         this.recipes.add(new ShapelessOreRecipe(ItemRegistry.eggsaladItem,  "foodBoiledegg", "foodMayo"));
         this.recipes.add(new ShapelessOreRecipe(ItemRegistry.fruitsaladItem, "listAllfruit", "listAllfruit"));
         this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", Items.carrot));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropOnion"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropRadish"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropCucumber"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropBellpepper"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropSpiceleaf"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropZucchini"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropAsparagus"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropBroccoli"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropPeas"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropTomato"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropSunflower"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropWalnut"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropCauliflower"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.springsaladItem,  "cropLettuce", "cropRhubarb"));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.porklettucewrapItem,  "cropLettuce", "listAllporkcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.fishlettucewrapItem,  "cropLettuce", "listAllfishcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.bltItem,  "cropLettuce", "cropTomato", "listAllporkcooked", "foodToast"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.nachoesItem,  "foodTortilla", "foodCheese"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.pbandjItem,  "foodPeanutbutter", "foodGrapejelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.cucumbersaladItem,  "cropCucumber", "foodSpringsalad"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.vegetarianlettucewrapItem,  "cropCucumber", "cropLettuce", "cropTomato"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.grilledskewersItem,  "cropBellpepper", "cropOnion", Items.carrot, Items.stick));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.supremepizzaItem,  "foodPizza", "cropBellpepper", "cropOnion", "cropSpiceleaf"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.guacamoleItem, "cropAvocado", "cropChilipepper", "cropTomato", "cropOnion", "cropSpiceleaf"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.avocadoburritoItem,  "cropAvocado", "foodTortilla", "foodCheese", Items.cooked_chicken));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.avocadoburritoItem,  "cropAvocado", "foodTortilla", "foodCheese", Items.cooked_porkchop));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.footlongItem,  Items.bread, "listAllmeatcooked", "cropLettuce", "cropTomato", "foodMayo"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.mixedsaladItem, "listAllveggie", "listAllveggie", "foodSaladdressing"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.sushiItem, "listAllfishraw", "cropSeaweed", "cropRice"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.applejellysandwichItem,  "foodPeanutbutter", "foodApplejelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.blackberryjellysandwichItem,  "foodPeanutbutter", "foodBlackberryjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.blueberryjellysandwichItem,  "foodPeanutbutter", "foodBlueberryjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.cherryjellysandwichItem,  "foodPeanutbutter", "foodCherryjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.cranberryjellysandwichItem,  "foodPeanutbutter", "foodCranberryjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.kiwijellysandwichItem,  "foodPeanutbutter", "foodKiwijelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.lemonjellysandwichItem,  "foodPeanutbutter", "foodLemonjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.limejellysandwichItem,  "foodPeanutbutter", "foodLimejelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.mangojellysandwichItem,  "foodPeanutbutter", "foodMangojelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.orangejellysandwichItem,  "foodPeanutbutter", "foodOrangejelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.papayajellysandwichItem,  "foodPeanutbutter", "foodPapayajelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.peachjellysandwichItem,  "foodPeanutbutter", "foodPeachjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.pomegranatejellysandwichItem,  "foodPeanutbutter", "foodPomegranatejelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.raspberryjellysandwichItem,  "foodPeanutbutter", "foodRaspberryjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.starfruitjellysandwichItem,  "foodPeanutbutter", "foodStarfruitjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.strawberryjellysandwichItem,  "foodPeanutbutter", "foodStrawberryjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.watermelonjellysandwichItem,  "foodPeanutbutter", "foodWatermelonjelly", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.ediblerootItem,  "cropSpiceleaf"));

                Collections.sort(this.recipes, new RecipeSorterPamCuttingBoard(this));
}

@SuppressWarnings({ "rawtypes", "unchecked" })
public ShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
{
         String s = "";
         int i = 0;
         int j = 0;
         int k = 0;

         if (par2ArrayOfObj[i] instanceof String[])
         {
                 String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

                 for (int l = 0; l < astring.length; ++l)
                 {
                         String s1 = astring[l];
                         ++k;
                         j = s1.length();
                         s = s + s1;
                 }
         }
         else
         {
                 while (par2ArrayOfObj[i] instanceof String)
                 {
                         String s2 = (String)par2ArrayOfObj[i++];
                         ++k;
                         j = s2.length();
                         s = s + s2;
                 }
         }

         HashMap hashmap;

         for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
         {
                 Character character = (Character)par2ArrayOfObj[i];
                 ItemStack itemstack1 = null;

                 if (par2ArrayOfObj[i + 1] instanceof Item)
                 {
                         itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
                 }
                 else if (par2ArrayOfObj[i + 1] instanceof Block)
                 {
                         itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
                 }
                 else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
                 {
                         itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
                 }

                 hashmap.put(character, itemstack1);
         }

         ItemStack[] aitemstack = new ItemStack[j * k];

         for (int i1 = 0; i1 < j * k; ++i1)
         {
                 char c0 = s.charAt(i1);

                 if (hashmap.containsKey(Character.valueOf(c0)))
                 {
                         aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
                 }
                 else
                 {
                         aitemstack[i1] = null;
                 }
         }

         ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack, par1ItemStack);
         this.recipes.add(shapedrecipes);
         return shapedrecipes;
}

@SuppressWarnings({ "rawtypes", "unchecked" })
public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
{
         ArrayList arraylist = new ArrayList();
         Object[] aobject = par2ArrayOfObj;
         int i = par2ArrayOfObj.length;

         for (int j = 0; j < i; ++j)
         {
                 Object object1 = aobject[j];

                 if (object1 instanceof ItemStack)
                 {
                         arraylist.add(((ItemStack)object1).copy());
                 }
                 else if (object1 instanceof Item)
                 {
                         arraylist.add(new ItemStack((Item)object1));
                 }
                 else
                 {
                         if (!(object1 instanceof Block))
                         {
                                 throw new RuntimeException("Invalid shapeless recipy!");
                         }

                         arraylist.add(new ItemStack((Block)object1));
                 }
         }

         this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
}

public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
{
    int i = 0;
    ItemStack itemstack = null;
    ItemStack itemstack1 = null;
    int j;

    for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
    {
        ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

        if (itemstack2 != null)
        {
            if (i == 0)
            {
                itemstack = itemstack2;
            }

            if (i == 1)
            {
                itemstack1 = itemstack2;
            }

            ++i;
        }
    }

    if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
    {
        Item item = itemstack.getItem();
        int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
        int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
        int l = j1 + k + item.getMaxDamage() * 5 / 100;
        int i1 = item.getMaxDamage() - l;

        if (i1 < 0)
        {
            i1 = 0;
        }

        return new ItemStack(itemstack.getItem(), 1, i1);
    }
    else
    {
        for (j = 0; j < this.recipes.size(); ++j)
        {
            IRecipe irecipe = (IRecipe)this.recipes.get(j);

            if (irecipe.matches(par1InventoryCrafting, par2World))
            {
                return irecipe.getCraftingResult(par1InventoryCrafting);
            }
        }

        return null;
    }
}

/**
         * returns the List<> of all recipes
         */
@SuppressWarnings("rawtypes")
public List getRecipeList()
{
         return this.recipes;
}
}