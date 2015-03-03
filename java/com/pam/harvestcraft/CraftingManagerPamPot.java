package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingManagerPamPot
{
/** The static instance of this class */
private static final CraftingManagerPamPot instance = new CraftingManagerPamPot();

/** A list of all the recipes added */
@SuppressWarnings("rawtypes")
private List recipes = new ArrayList();

/**
         * Returns the static instance of this class
         */
public static final CraftingManagerPamPot getInstance()
{
         return instance;
}

@SuppressWarnings({ "rawtypes", "unchecked" })
private CraftingManagerPamPot()
{
         recipes = new ArrayList();
         if (ItemRegistry.enablesaltfromwaterbucketrecipe)
 		{
        	 this.recipes.add(new ShapelessOreRecipe(ItemRegistry.saltItem, "listAllwater"));
 		}
 		
 		
         this.recipes.add(new ShapelessOreRecipe(Items.sugar, "foodHoneydrop"));
         this.recipes.add(new ShapelessOreRecipe(Items.sugar, "dropHoney"));
         
         this.recipes.add(new ShapelessOreRecipe(ItemRegistry.waxItem, ItemRegistry.candleberryItem, ItemRegistry.candleberryItem, ItemRegistry.candleberryItem, ItemRegistry.candleberryItem));
 		
         this.recipes.add(new ShapelessOreRecipe(ItemRegistry.cheeseItem, "listAllmilk", "foodSalt"));
         this.recipes.add(new ShapelessOreRecipe(ItemRegistry.icecreamItem, "listAllmilk", "foodSalt", Items.snowball));
 		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.applesauceItem, Items.apple));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.pumpkinsoupItem, Blocks.pumpkin, "listAllReplaceheavycream", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.carrotsoupItem, Items.carrot, "listAllReplaceheavycream", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.potatosoupItem, Items.potato, "foodSalt", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.chickennoodlesoupItem, "listAllchickenraw", Items.carrot, "foodPasta", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.hotdogItem, "listAllporkraw", Items.bread));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.potroastItem, "listAllbeefraw", Items.potato, Items.carrot, "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.boiledeggItem, "listAllegg"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.spidereyesoupItem, Items.spider_eye, "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, Items.potato, Items.carrot, "listAllmushroom", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, Items.potato, Items.carrot, "listAllmushroom", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.vegetablesoupItem, Items.potato, Items.carrot, "listAllmushroom", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), Items.bone));
		this.recipes.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), "listAllmeatraw"));
		this.recipes.add(new ShapelessOreRecipe(new ItemStack(ItemRegistry.stockItem, 3, 0), "listAllveggie"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.tomatosoupItem, "cropTomato", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.onionsoupItem, "cropOnion", "foodStock", "foodGrilledcheese"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.vinegarItem, "foodGrapejuice"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.picklesItem, "cropCucumber", "foodSalt", "foodVinegar"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.cucumbersoupItem, "cropCucumber", "foodStock", "listAllReplaceheavycream"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.marinatedcucumbersItem, "cropCucumber", "cropOnion", Items.sugar, "foodVinegar"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.ricesoupItem, "cropRice", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.bakedbeansItem, "cropBean", "listAllporkcooked", Items.sugar));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, "cropBean", "cropRice", "cropOnion", "listAllporkcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, "cropBean", "cropRice", "cropBellpepper", "listAllporkcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.beansandriceItem, "cropBean", "cropRice", "cropChilipepper", "listAllporkcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.chiliItem, "cropBean", "cropOnion", "listAllbeefcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.chiliItem, "cropBean", "cropBellpepper", "listAllbeefcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.chiliItem, "cropBean", "cropChilipepper", "listAllbeefcooked"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.pickledbeetsItem, "cropBeet", "foodVinegar", "foodSalt"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.beetsoupItem, "cropBeet", "cropOnion", "foodBlackpepper", "listAllmilk"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.broccolimacItem, "cropBroccoli", "foodPasta", "foodCheese"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.creamedbroccolisoupItem, "cropBroccoli", Items.carrot, "foodFlour", "foodBlackpepper", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.steamedpeasItem, "cropPeas", "listAllwater", "foodSalt"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.splitpeasoupItem, "cropPeas", "listAllporkcooked", "foodBlackpepper", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.turnipsoupItem, "cropTurnip", Blocks.pumpkin, "foodButter", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.celerysoupItem, "cropCelery", "cropOnion", Items.carrot, "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.asparagussoupItem, "cropAsparagus", "cropOnion", "foodButter", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.creamofavocadosoupItem, "cropAvocado", "listAllReplaceheavycream", "cropLime", "cropSpiceleaf", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.chickencurryItem, "cropCoconut", "foodPlainyogurt", "listAllchickenraw", "cropSpiceleaf", "cropChilipepper", "cropRice", "foodGroundcinnamon", "cropGarlic"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.marshmellowsItem, Items.sugar, "listAllwater", "listAllegg"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.donutItem, "foodDough", "foodOliveoil"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.cactussoupItem, Blocks.cactus, "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.seedsoupItem, "listAllseed", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.friedchickenItem, "listAllchickenraw", "foodFlour", "cropSpiceleaf", "foodBlackpepper", "foodOliveoil"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.meatystewItem, "listAllmeatraw", "foodFlour", "foodStock"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.gardensoupItem, "foodStock", "listAllveggie", "listAllveggie"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.cherrysodaItem, "foodBubblywater", Items.sugar, "foodCherryjuice"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.colasodaItem, "foodBubblywater", Items.sugar, "cropSpiceleaf"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.gingersodaItem, "foodBubblywater", Items.sugar, "cropGinger"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.grapesodaItem, "foodBubblywater", Items.sugar, "foodGrapejuice"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.lemonlimesodaItem, "foodBubblywater", Items.sugar, "cropLemon", "foodLimejuice"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.orangesodaItem, "foodBubblywater", Items.sugar, "foodOrangejuice"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.rootbeersodaItem, "foodBubblywater", Items.sugar, "cropEdibleroot"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.strawberrysodaItem, "foodBubblywater", Items.sugar, "foodStrawberryjuice"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.oldworldveggiesoupItem, "foodStock", "cropOnion", "cropPeas", "cropBarley"));
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.lambbarleysoupItem, "foodStock", "listAllmuttonraw", "cropOnion", Items.carrot, "cropBarley"));		
		this.recipes.add(new ShapelessOreRecipe(ItemRegistry.leekbaconsoupItem, "cropLeek", "listAllporkcooked", Items.potato, "listAllReplaceheavycream"));


                Collections.sort(this.recipes, new RecipeSorterPamPot(this));
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