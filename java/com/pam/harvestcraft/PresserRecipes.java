package com.pam.harvestcraft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.pam.harvestcraft.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PresserRecipes
{
    private static final PresserRecipes smeltingBase = new PresserRecipes();
    /**
     * The list of smelting results.
     */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private static final String __OBFID = "CL_00000085";

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static PresserRecipes smelting()
    {
        return smeltingBase;
    }

    private PresserRecipes()
    {
        this.func_151396_a(ItemRegistry.waxcombItem, new ItemStack(ItemRegistry.beeswaxItem), 0.0F);
        this.func_151396_a(Items.reeds, new ItemStack(Items.sugar), 0.0F);
        this.func_151393_a(Blocks.log, new ItemStack(Items.paper), 0.0F);
        this.func_151396_a(ItemRegistry.honeycombItem, new ItemStack(ItemRegistry.honeyItem), 0.0F);
        
        this.func_151396_a(Items.apple, new ItemStack(ItemRegistry.applejuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.blackberryItem, new ItemStack(ItemRegistry.blackberryjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.blueberryItem, new ItemStack(ItemRegistry.blueberryjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.cactusfruitItem, new ItemStack(ItemRegistry.cactusfruitjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.cherryItem, new ItemStack(ItemRegistry.cherryjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.cranberryItem, new ItemStack(ItemRegistry.cranberryjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.grapeItem, new ItemStack(ItemRegistry.grapejuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.kiwiItem, new ItemStack(ItemRegistry.kiwijuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.limeItem, new ItemStack(ItemRegistry.limejuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.mangoItem, new ItemStack(ItemRegistry.mangojuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.oliveItem, new ItemStack(ItemRegistry.oliveoilItem), 0.0F);
		this.func_151396_a(ItemRegistry.sunflowerseedsItem, new ItemStack(ItemRegistry.oliveoilItem), 0.0F);
		this.func_151396_a(ItemRegistry.walnutItem, new ItemStack(ItemRegistry.oliveoilItem), 0.0F);
		this.func_151396_a(ItemRegistry.orangeItem, new ItemStack(ItemRegistry.orangejuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.papayaItem, new ItemStack(ItemRegistry.papayajuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.peachItem, new ItemStack(ItemRegistry.peachjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.pomegranateItem, new ItemStack(ItemRegistry.pomegranatejuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.starfruitItem, new ItemStack(ItemRegistry.starfruitjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.strawberryItem, new ItemStack(ItemRegistry.strawberryjuiceItem), 0.0F);
		this.func_151396_a(Items.reeds, new ItemStack(Items.sugar), 0.0F);
		this.func_151396_a(ItemRegistry.beetItem, new ItemStack(Items.sugar), 0.0F);
		this.func_151393_a(Blocks.log, new ItemStack(Items.paper), 0.0F);
		this.func_151396_a(ItemRegistry.freshwaterItem, new ItemStack(ItemRegistry.bubblywaterItem), 0.0F);
		this.func_151396_a(ItemRegistry.soybeanItem, new ItemStack(ItemRegistry.soymilkItem), 0.0F);
		this.func_151396_a(ItemRegistry.soymilkItem, new ItemStack(ItemRegistry.silkentofuItem), 0.0F);
		this.func_151396_a(ItemRegistry.silkentofuItem, new ItemStack(ItemRegistry.firmtofuItem), 0.0F);
		this.func_151396_a(ItemRegistry.plumItem, new ItemStack(ItemRegistry.plumjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.pearItem, new ItemStack(ItemRegistry.pearjuiceItem), 0.0F);
		
		this.func_151396_a(ItemRegistry.apricotItem, new ItemStack(ItemRegistry.apricotjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.figItem, new ItemStack(ItemRegistry.figjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.grapefruitItem, new ItemStack(ItemRegistry.grapefruitjuiceItem), 0.0F);
		this.func_151396_a(ItemRegistry.persimmonItem, new ItemStack(ItemRegistry.persimmonjuiceItem), 0.0F);
		
		this.func_151396_a(ItemRegistry.almondItem, new ItemStack(ItemRegistry.freshmilkItem), 0.0F);
        
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
