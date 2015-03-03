package com.pam.harvestcraft;
 
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
 

import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomFishable;
import net.minecraftforge.common.FishingHooks;
 
public class FishRegistry
{
	
		public static void registerItems()
		{
			registerLoot(new ItemStack(ItemRegistry.seaweedItem, 1, 0), 10);
			registerNormal(new ItemStack(ItemRegistry.anchovyrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.bassrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.carprawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.catfishrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.charrrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.eelrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.grouperrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.herringrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.jellyfishrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.mudfishrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.octopusrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.perchrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.snapperrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.tilapiarawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.troutrawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.tunarawItem, 1, 0), 25);
			registerNormal(new ItemStack(ItemRegistry.walleyerawItem, 1, 0), 25);

		}
        /**
         * Registers a normal item to be caught. <br><br>
         * For the weight, I don't recommend you go over 60 or it'll be too common.
         *
         * @param item The item
         * @param weight The chance for it to be caught
         */
        public static void registerNormal(ItemStack item, int weight)
        {
                List list;
                try
                {
                        Field field = EntityFishHook.class.getDeclaredField("field_146036_f");
                        list = new ArrayList(getStaticFinalList(field));
                        list.add(new WeightedRandomFishable(item, weight));
                        setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146036_f"), list);
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }
 
        /**
         * Registers new loot to be caught. <br><br>
         * For the weight, I don't recommend you go over 10 or it'll be too common.
         *
         * @param loot The loot item
         * @param weight The chance for it to be caught
         */
        public static void registerLoot(ItemStack loot, int weight)
        {
                List list;
                try
                {
                        Field field = EntityFishHook.class.getDeclaredField("field_146039_d");
                        list = new ArrayList(getStaticFinalList(field));
                        list.add(new WeightedRandomFishable(loot, weight));
                        setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146039_d"), list);
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }
       
        /**
         * Registers a new rare item to be caught. <br><br>
         * For the weight, I don't recommend you go over 1 or it'll be too common.
         *
         * @param rare The rare item
         * @param weight The chance for it to be caught
         */
        public static void registerRare(ItemStack rare, int weight)
        {
                List list;
                try
                {
                        Field field = EntityFishHook.class.getDeclaredField("field_146041_e");
                        list = new ArrayList(getStaticFinalList(field));
                        list.add(new WeightedRandomFishable(rare, weight));
                        setStaticFinalList(EntityFishHook.class.getDeclaredField("field_146041_e"), list);
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
        }
       
        /**
         * Gets a static final list and ignores the final modifier
         */
        private static List getStaticFinalList(Field field) throws Exception
        {
                field.setAccessible(true);
                Field modifiers = Field.class.getDeclaredField("modifiers");
                modifiers.setAccessible(true);
                modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                return (List) field.get(field);
        }
 
        /**
         * Sets a static final list and ignores the final modifier
         */
        private static void setStaticFinalList(Field field, Object object) throws Exception
        {
                field.setAccessible(true);
                Field modifiers = Field.class.getDeclaredField("modifiers");
                modifiers.setAccessible(true);
                modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                field.set(null, object);
        }
}