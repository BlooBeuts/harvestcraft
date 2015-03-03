package com.pam.harvestcraft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class OvenRecipes
{
    private static final OvenRecipes smeltingBase = new OvenRecipes();
    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private static final String __OBFID = "CL_00000085";

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static OvenRecipes smelting()
    {
        return smeltingBase;
    }

    private OvenRecipes()
    {
        this.func_151396_a(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.1F);
        this.func_151396_a(Items.beef, new ItemStack(Items.cooked_beef), 0.1F);
        this.func_151396_a(Items.chicken, new ItemStack(Items.cooked_chicken), 0.1F);
        this.func_151393_a(Blocks.cactus, new ItemStack(Items.dye, 1, 2), 0.1F);
        this.func_151396_a(Items.potato, new ItemStack(Items.baked_potato), 0.1F);
        this.func_151396_a(ItemRegistry.doughItem, new ItemStack(Items.bread, 1, 0), 0.1F);
		this.func_151396_a(Items.bread, new ItemStack(ItemRegistry.toastItem, 1, 0), 0.1F);
		this.func_151396_a(Items.pumpkin_seeds, new ItemStack(ItemRegistry.roastedpumpkinseedsItem, 1, 0), 0.1F);
		this.func_151393_a(Blocks.brown_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
		this.func_151393_a(Blocks.red_mushroom, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
		
		this.func_151396_a(ItemRegistry.muttonrawItem, new ItemStack(ItemRegistry.muttoncookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.calamarirawItem, new ItemStack(ItemRegistry.calamaricookedItem, 1, 0), 0.1F);
	  
		this.func_151396_a(ItemRegistry.asparagusItem, new ItemStack(ItemRegistry.grilledasparagusItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.riceItem, new ItemStack(ItemRegistry.ricecakeItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.tealeafItem, new ItemStack(ItemRegistry.teaItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.cornItem, new ItemStack(ItemRegistry.popcornItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.sweetpotatoItem, new ItemStack(ItemRegistry.bakedsweetpotatoItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.coffeebeanItem, new ItemStack(ItemRegistry.coffeeItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.eggplantItem, new ItemStack(ItemRegistry.grilledeggplantItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.grapeItem, new ItemStack(ItemRegistry.raisinsItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.whitemushroomItem, new ItemStack(ItemRegistry.grilledmushroomItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.coconutItem, new ItemStack(ItemRegistry.toastedcoconutItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.vanillabeanItem, new ItemStack(ItemRegistry.vanillaItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.chestnutItem, new ItemStack(ItemRegistry.roastedchestnutItem, 1, 0), 0.1F);
        ItemFishFood.FishType[] afishtype = ItemFishFood.FishType.values();
        int i = afishtype.length;

        for (int j = 0; j < i; ++j)
        {
            ItemFishFood.FishType fishtype = afishtype[j];

            if (fishtype.func_150973_i())
            {
                this.func_151394_a(new ItemStack(Items.fish, 1, fishtype.func_150976_a()), new ItemStack(Items.cooked_fished, 1, fishtype.func_150976_a()), 0.35F);
            }
        }
        
        this.func_151396_a(ItemRegistry.anchovyrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.bassrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.carprawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.catfishrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.charrrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.eelrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.grouperrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.herringrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.mudfishrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.perchrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.snapperrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.tilapiarawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.troutrawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.tunarawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	this.func_151396_a(ItemRegistry.walleyerawItem, new ItemStack(Items.cooked_fished, 1, 0), 0.1F);
    	
    	this.func_151396_a(ItemRegistry.clamrawItem, new ItemStack(ItemRegistry.clamcookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.crabrawItem, new ItemStack(ItemRegistry.crabcookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.crayfishrawItem, new ItemStack(ItemRegistry.crayfishcookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.frograwItem, new ItemStack(ItemRegistry.frogcookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.octopusrawItem, new ItemStack(ItemRegistry.octopuscookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.scalloprawItem, new ItemStack(ItemRegistry.scallopcookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.shrimprawItem, new ItemStack(ItemRegistry.shrimpcookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.snailrawItem, new ItemStack(ItemRegistry.snailcookedItem, 1, 0), 0.1F);
		this.func_151396_a(ItemRegistry.turtlerawItem, new ItemStack(ItemRegistry.turtlecookedItem, 1, 0), 0.1F);
    }

    public void func_151393_a(Block p_151393_1_, ItemStack p_151393_2_, float p_151393_3_)
    {
        this.func_151396_a(Item.getItemFromBlock(p_151393_1_), p_151393_2_, p_151393_3_);
    }

    public void func_151396_a(Item p_151396_1_, ItemStack p_151396_2_, float p_151396_3_)
    {
        this.func_151394_a(new ItemStack(p_151396_1_, 1, 32767), p_151396_2_, p_151396_3_);
    }

    public void func_151394_a(ItemStack p_151394_1_, ItemStack p_151394_2_, float p_151394_3_)
    {
        this.smeltingList.put(p_151394_1_, p_151394_2_);
        this.experienceList.put(p_151394_2_, Float.valueOf(p_151394_3_));
    }

    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack p_151395_1_)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151395_1_, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
    {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float func_151398_b(ItemStack p_151398_1_)
    {
        float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151398_1_, (ItemStack)entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}