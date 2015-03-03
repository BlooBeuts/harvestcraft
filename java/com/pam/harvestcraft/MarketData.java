package com.pam.harvestcraft;

import net.minecraft.item.ItemStack;

public class MarketData 
{
	ItemStack item;
	ItemStack currency;
	int price;
	
	public MarketData(ItemStack item, ItemStack currency, int price)
	{
		this.item = item;
		this.currency = currency;
		this.price = price;
	}
	
	public ItemStack getItem()
	{
		return item;
	}
	
	public ItemStack getCurrency()
	{
		return currency;
	}
	
	public int getPrice()
	{
		return price;
	}


}
