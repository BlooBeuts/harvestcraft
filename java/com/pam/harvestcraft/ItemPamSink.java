package com.pam.harvestcraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemPamSink extends ItemBlock
{
    public ItemPamSink(Block i)
    {
        super(i);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    public int getMetadata(int par1)
    {
        return par1;
    }
    
    @SideOnly(Side.CLIENT)

    public IIcon getIconFromDamage(int par1)
    {
        return BlockRegistry.pamSink.getIcon(2, par1);
    }
    
    @Override
    public String getUnlocalizedName(ItemStack var1)
    {
        int var2 = var1.getItemDamage();
        switch (var2)
        {
            case 0:
                return "sink_0";
            case 1:
                return "sink_1";
            case 2:
                return "sink_2";
            case 3:
                return "sink_3";
            default:
                return null;
        }
    }
}
