package com.pam.harvestcraft;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

class ItemPamArmor extends ItemArmor 
{
	public ItemPamArmor(ArmorMaterial enumarmormaterial, int k)
		{
			super(enumarmormaterial, 0, k);
				maxStackSize = 1;
				this.setCreativeTab(harvestcraft.tabHarvestCraft);
		}

	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
            //slot will tell us helmet vs. boots
            //type will be either null or overlay (cloth armor)
            //can use stack.stackTagCompound.getString("matName") for material, etc.
            String layer = "1";
            if(slot == 2) {
                    layer="2";
            }
            return "harvestcraft:textures/armor/hardenedleather_"+layer+".png";
    }
	


}
