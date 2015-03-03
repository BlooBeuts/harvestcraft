 package com.pam.harvestcraft;
     
    import java.util.ArrayList;
    import java.util.List;
     
    import javax.swing.text.Utilities;
     
    import cpw.mods.fml.common.eventhandler.SubscribeEvent;
    import cpw.mods.fml.relauncher.Side;
    import cpw.mods.fml.relauncher.SideOnly;
    import net.minecraft.item.ItemStack;
    import net.minecraft.util.StatCollector;
    import net.minecraftforge.event.entity.player.ItemTooltipEvent;
     

    public class PamTooltipEventHandler
    {
            @SubscribeEvent
            public void onItemTooltip(ItemTooltipEvent event)
            {
                    List<String> toolTipStringsToAdd = new ArrayList<String>();
                    if (event.itemStack != null)
                    {
                    	String tooltip = localize("tooltip.harvestcraft." + event.itemStack.getUnlocalizedName());
                    	if (tooltip != null)
                    	{
                    		if (tooltip.contains("\\n"))
                    		{
                    			String[] tooltips = tooltip.split("\\\\n");
                    			for (int i = 0, e = tooltips.length; i < e; ++i)
                    				toolTipStringsToAdd.add(tooltips[i]);
                    		}
                    		else
                    		{
                    			toolTipStringsToAdd.add(tooltip);
                    		}
                    	}
                    }
                    event.toolTip.addAll(toolTipStringsToAdd);
            }



             public static String localize(String s)
             {
                     if (!StatCollector.canTranslate(s))
                            return null;
                     return StatCollector.translateToLocal(s);
             }
    }
