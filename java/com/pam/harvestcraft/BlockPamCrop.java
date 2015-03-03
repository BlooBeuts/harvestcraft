package com.pam.harvestcraft;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockPamCrop extends BlockCrops
{


	
	 @SideOnly(Side.CLIENT)
	    private IIcon[] field_149868_a;
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 7)
        {
            if (p_149691_2_ == 6)
            {
                p_149691_2_ = 5;
            }

            return this.field_149868_a[p_149691_2_ >> 1];
        }
        else
        {
            return this.field_149868_a[3];
        }
    }
	
	 /* Right-click harvests crop item*/
		@Override
		public boolean onBlockActivated (World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
		{
			if (BlockRegistry.rightclickmatureshowcropHearts == true)
			{
			int meta = world.getBlockMetadata(par2, par3, par4);

	        if (meta == 7)
	        {
	        	float f = (float)par2 + 0.5F;
	            float f1 = (float)par3 + 0.0F + 6.0F / 16.0F;
	            float f2 = (float)par4 + 0.5F;
	            float f3 = 0.52F;
	            float f4 = 0.6F - 0.3F;
	        	world.spawnParticle("heart", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
	        }
			}
			if (BlockRegistry.rightclickharvestCrop == true)
			{
			int meta = world.getBlockMetadata(par2, par3, par4);

	        if (meta == 7)
	        {
	        	if (meta == 7)
	        	{
	        		this.dropBlockAsItem(world, par2, par3, par4, meta, 0);
	        		world.setBlock(par2, par3, par4, this, 0, 2);
	        		
	        	}
	        }
			}
			
			return false;
		}
	
		public int quantityDropped(Random p_149745_1_)
	    {
			if (BlockRegistry.rightclickharvestCrop == true)
			{
				return 0;
			} else
		{
	        return 1;
		}
	    }
		
	@Override
	protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
		if (this == BlockRegistry.pamcactusfruitCrop)
        {
        	return p_149854_1_ == Blocks.sand;
        }
		if (this == BlockRegistry.pamwhitemushroomCrop)
        {
        	return p_149854_1_ == Blocks.log;
        }
		if (this == BlockRegistry.pamcranberryCrop)
        {
        	return p_149854_1_ == Blocks.water;
        }
		if (this == BlockRegistry.pamriceCrop)
        {
        	return p_149854_1_ == Blocks.water;
        }
		if (this == BlockRegistry.pamseaweedCrop)
        {
        	return p_149854_1_ == Blocks.water;
        } else
        return p_149854_1_ == Blocks.farmland;
    }


    protected Item func_149866_i()
    {
    	if (BlockRegistry.cropsdropSeeds == true)
    	{
    		//Berry Crops
            if (this == BlockRegistry.pamblackberryCrop)
            {
            	return ItemRegistry.blackberryseedItem;
            }
            if (this == BlockRegistry.pamblueberryCrop)
            {
            	return ItemRegistry.blueberryseedItem;
            }
            if (this == BlockRegistry.pamcandleberryCrop)
            {
            	return ItemRegistry.candleberryseedItem;
            }
            if (this == BlockRegistry.pamraspberryCrop)
            {
            	return ItemRegistry.raspberryseedItem;
            }
            if (this == BlockRegistry.pamstrawberryCrop)
            {
            	return ItemRegistry.strawberryseedItem;
            }
            //Desert Crops
            if (this == BlockRegistry.pamcactusfruitCrop)
            {
            	return ItemRegistry.cactusfruitseedItem;
            }
            //Grass Crops
            if (this == BlockRegistry.pamasparagusCrop)
            {
            	return ItemRegistry.asparagusseedItem;
            }
            if (this == BlockRegistry.pambarleyCrop)
            {
            	return ItemRegistry.barleyseedItem;
            }
            if (this == BlockRegistry.pamoatsCrop)
            {
            	return ItemRegistry.oatsseedItem;
            }
            if (this == BlockRegistry.pamryeCrop)
            {
            	return ItemRegistry.ryeseedItem;
            }
            if (this == BlockRegistry.pamcornCrop)
            {
            	return ItemRegistry.cornseedItem;
            }
            if (this == BlockRegistry.pambambooshootCrop)
            {
            	return ItemRegistry.bambooshootseedItem;
            }
            //Gourd Crops
            if (this == BlockRegistry.pamcantaloupeCrop)
            {
            	return ItemRegistry.cantaloupeseedItem;
            }
            if (this == BlockRegistry.pamcucumberCrop)
            {
            	return ItemRegistry.cucumberseedItem;
            }
            if (this == BlockRegistry.pamwintersquashCrop)
            {
            	return ItemRegistry.wintersquashseedItem;
            }
            if (this == BlockRegistry.pamzucchiniCrop)
            {
            	return ItemRegistry.zucchiniseedItem;
            }
            //Ground Crops
            if (this == BlockRegistry.pambeetCrop)
            {
            	return ItemRegistry.beetseedItem;
            }
            if (this == BlockRegistry.pamonionCrop)
            {
            	return ItemRegistry.onionseedItem;
            }
            if (this == BlockRegistry.pamparsnipCrop)
            {
            	return ItemRegistry.parsnipseedItem;
            }
            if (this == BlockRegistry.pampeanutCrop)
            {
            	return ItemRegistry.peanutseedItem;
            }
            if (this == BlockRegistry.pamradishCrop)
            {
            	return ItemRegistry.radishseedItem;
            }
            if (this == BlockRegistry.pamrutabagaCrop)
            {
            	return ItemRegistry.rutabagaseedItem;
            }
            if (this == BlockRegistry.pamsweetpotatoCrop)
            {
            	return ItemRegistry.sweetpotatoseedItem;
            }
            if (this == BlockRegistry.pamturnipCrop)
            {
            	return ItemRegistry.turnipseedItem;
            }
            if (this == BlockRegistry.pamrhubarbCrop)
            {
            	return ItemRegistry.rhubarbseedItem;
            }
            //Herb Garden
            if (this == BlockRegistry.pamceleryCrop)
            {
            	return ItemRegistry.celeryseedItem;
            }
            if (this == BlockRegistry.pamgarlicCrop)
            {
            	return ItemRegistry.garlicseedItem;
            }
            if (this == BlockRegistry.pamgingerCrop)
            {
            	return ItemRegistry.gingerseedItem;
            }
            if (this == BlockRegistry.pamspiceleafCrop)
            {
            	return ItemRegistry.spiceleafseedItem;
            }
            if (this == BlockRegistry.pamtealeafCrop)
            {
            	return ItemRegistry.teaseedItem;
            }
            if (this == BlockRegistry.pamcoffeebeanCrop)
            {
            	return ItemRegistry.coffeeseedItem;
            }
            if (this == BlockRegistry.pammustardseedsCrop)
            {
            	return ItemRegistry.mustardseedItem;
            }
            //Leafy Crops
            if (this == BlockRegistry.pambroccoliCrop)
            {
            	return ItemRegistry.broccoliseedItem;
            }
            if (this == BlockRegistry.pamcauliflowerCrop)
            {
            	return ItemRegistry.cauliflowerseedItem;
            }
            if (this == BlockRegistry.pamleekCrop)
            {
            	return ItemRegistry.leekseedItem;
            }
            if (this == BlockRegistry.pamlettuceCrop)
            {
            	return ItemRegistry.lettuceseedItem;
            }
            if (this == BlockRegistry.pamscallionCrop)
            {
            	return ItemRegistry.scallionseedItem;
            }
            if (this == BlockRegistry.pamartichokeCrop)
            {
            	return ItemRegistry.artichokeseedItem;
            }
            if (this == BlockRegistry.pambrusselsproutCrop)
            {
            	return ItemRegistry.brusselsproutseedItem;
            }
            if (this == BlockRegistry.pamcabbageCrop)
            {
            	return ItemRegistry.cabbageseedItem;
            }
            if (this == BlockRegistry.pamspinachCrop)
            {
            	return ItemRegistry.spinachseedItem;
            }
            //Mushroom Crops
            if (this == BlockRegistry.pamwhitemushroomCrop)
            {
            	return ItemRegistry.whitemushroomseedItem;
            }
            //Stalk Crops
            if (this == BlockRegistry.pambeanCrop)
            {
            	return ItemRegistry.beanseedItem;
            }
            if (this == BlockRegistry.pamsoybeanCrop)
            {
            	return ItemRegistry.soybeanseedItem;
            }
            if (this == BlockRegistry.pambellpepperCrop)
            {
            	return ItemRegistry.bellpepperseedItem;
            }
            if (this == BlockRegistry.pamchilipepperCrop)
            {
            	return ItemRegistry.chilipepperseedItem;
            }
            if (this == BlockRegistry.pameggplantCrop)
            {
            	return ItemRegistry.eggplantseedItem;
            }
            if (this == BlockRegistry.pamokraCrop)
            {
            	return ItemRegistry.okraseedItem;
            }
            if (this == BlockRegistry.pampeasCrop)
            {
            	return ItemRegistry.peasseedItem;
            }
            if (this == BlockRegistry.pamtomatoCrop)
            {
            	return ItemRegistry.tomatoseedItem;
            }
            //Textile Crops
            if (this == BlockRegistry.pamcottonCrop)
            {
            	return ItemRegistry.cottonseedItem;
            }
            //Tropical Crops
            if (this == BlockRegistry.pampineappleCrop)
            {
            	return ItemRegistry.pineappleseedItem;
            }
            if (this == BlockRegistry.pamgrapeCrop)
            {
            	return ItemRegistry.grapeseedItem;
            }
            if (this == BlockRegistry.pamkiwiCrop)
            {
            	return ItemRegistry.kiwiseedItem;
            }
            //Water Crops
            if (this == BlockRegistry.pamcranberryCrop)
            {
            	return ItemRegistry.cranberryseedItem;
            }
            if (this == BlockRegistry.pamriceCrop)
            {
            	return ItemRegistry.riceseedItem;
            }
            if (this == BlockRegistry.pamseaweedCrop)
            {
            	return ItemRegistry.seaweedseedItem;
            }
    	} 
    	if (BlockRegistry.cropsdropSeeds == false)
    	{
    	//Berry Crops
        if (this == BlockRegistry.pamblackberryCrop)
        {
        	return ItemRegistry.blackberryItem;
        }
        if (this == BlockRegistry.pamblueberryCrop)
        {
        	return ItemRegistry.blueberryItem;
        }
        if (this == BlockRegistry.pamcandleberryCrop)
        {
        	return ItemRegistry.candleberryItem;
        }
        if (this == BlockRegistry.pamraspberryCrop)
        {
        	return ItemRegistry.raspberryItem;
        }
        if (this == BlockRegistry.pamstrawberryCrop)
        {
        	return ItemRegistry.strawberryItem;
        }
        //Desert Crops
        if (this == BlockRegistry.pamcactusfruitCrop)
        {
        	return ItemRegistry.cactusfruitItem;
        }
        //Grass Crops
        if (this == BlockRegistry.pamasparagusCrop)
        {
        	return ItemRegistry.asparagusItem;
        }
        if (this == BlockRegistry.pambarleyCrop)
        {
        	return ItemRegistry.barleyItem;
        }
        if (this == BlockRegistry.pamoatsCrop)
        {
        	return ItemRegistry.oatsItem;
        }
        if (this == BlockRegistry.pamryeCrop)
        {
        	return ItemRegistry.ryeItem;
        }
        if (this == BlockRegistry.pamcornCrop)
        {
        	return ItemRegistry.cornItem;
        }
        if (this == BlockRegistry.pambambooshootCrop)
        {
        	return ItemRegistry.bambooshootItem;
        }
        //Gourd Crops
        if (this == BlockRegistry.pamcantaloupeCrop)
        {
        	return ItemRegistry.cantaloupeItem;
        }
        if (this == BlockRegistry.pamcucumberCrop)
        {
        	return ItemRegistry.cucumberItem;
        }
        if (this == BlockRegistry.pamwintersquashCrop)
        {
        	return ItemRegistry.wintersquashItem;
        }
        if (this == BlockRegistry.pamzucchiniCrop)
        {
        	return ItemRegistry.zucchiniItem;
        }
        //Ground Crops
        if (this == BlockRegistry.pambeetCrop)
        {
        	return ItemRegistry.beetItem;
        }
        if (this == BlockRegistry.pamonionCrop)
        {
        	return ItemRegistry.onionItem;
        }
        if (this == BlockRegistry.pamparsnipCrop)
        {
        	return ItemRegistry.parsnipItem;
        }
        if (this == BlockRegistry.pampeanutCrop)
        {
        	return ItemRegistry.peanutItem;
        }
        if (this == BlockRegistry.pamradishCrop)
        {
        	return ItemRegistry.radishItem;
        }
        if (this == BlockRegistry.pamrutabagaCrop)
        {
        	return ItemRegistry.rutabagaItem;
        }
        if (this == BlockRegistry.pamsweetpotatoCrop)
        {
        	return ItemRegistry.sweetpotatoItem;
        }
        if (this == BlockRegistry.pamturnipCrop)
        {
        	return ItemRegistry.turnipItem;
        }
        if (this == BlockRegistry.pamrhubarbCrop)
        {
        	return ItemRegistry.rhubarbItem;
        }
        //Herb Garden
        if (this == BlockRegistry.pamceleryCrop)
        {
        	return ItemRegistry.celeryItem;
        }
        if (this == BlockRegistry.pamgarlicCrop)
        {
        	return ItemRegistry.garlicItem;
        }
        if (this == BlockRegistry.pamgingerCrop)
        {
        	return ItemRegistry.gingerItem;
        }
        if (this == BlockRegistry.pamspiceleafCrop)
        {
        	return ItemRegistry.spiceleafItem;
        }
        if (this == BlockRegistry.pamtealeafCrop)
        {
        	return ItemRegistry.tealeafItem;
        }
        if (this == BlockRegistry.pamcoffeebeanCrop)
        {
        	return ItemRegistry.coffeebeanItem;
        }
        if (this == BlockRegistry.pammustardseedsCrop)
        {
        	return ItemRegistry.mustardseedsItem;
        }
        //Leafy Crops
        if (this == BlockRegistry.pambroccoliCrop)
        {
        	return ItemRegistry.broccoliItem;
        }
        if (this == BlockRegistry.pamcauliflowerCrop)
        {
        	return ItemRegistry.cauliflowerItem;
        }
        if (this == BlockRegistry.pamleekCrop)
        {
        	return ItemRegistry.leekItem;
        }
        if (this == BlockRegistry.pamlettuceCrop)
        {
        	return ItemRegistry.lettuceItem;
        }
        if (this == BlockRegistry.pamscallionCrop)
        {
        	return ItemRegistry.scallionItem;
        }
        if (this == BlockRegistry.pamartichokeCrop)
        {
        	return ItemRegistry.artichokeItem;
        }
        if (this == BlockRegistry.pambrusselsproutCrop)
        {
        	return ItemRegistry.brusselsproutItem;
        }
        if (this == BlockRegistry.pamcabbageCrop)
        {
        	return ItemRegistry.cabbageItem;
        }
        if (this == BlockRegistry.pamspinachCrop)
        {
        	return ItemRegistry.spinachItem;
        }
        //Mushroom Crops
        if (this == BlockRegistry.pamwhitemushroomCrop)
        {
        	return ItemRegistry.whitemushroomItem;
        }
        //Stalk Crops
        if (this == BlockRegistry.pambeanCrop)
        {
        	return ItemRegistry.beanItem;
        }
        if (this == BlockRegistry.pamsoybeanCrop)
        {
        	return ItemRegistry.soybeanItem;
        }
        if (this == BlockRegistry.pambellpepperCrop)
        {
        	return ItemRegistry.bellpepperItem;
        }
        if (this == BlockRegistry.pamchilipepperCrop)
        {
        	return ItemRegistry.chilipepperItem;
        }
        if (this == BlockRegistry.pameggplantCrop)
        {
        	return ItemRegistry.eggplantItem;
        }
        if (this == BlockRegistry.pamokraCrop)
        {
        	return ItemRegistry.okraItem;
        }
        if (this == BlockRegistry.pampeasCrop)
        {
        	return ItemRegistry.peasItem;
        }
        if (this == BlockRegistry.pamtomatoCrop)
        {
        	return ItemRegistry.tomatoItem;
        }
        //Textile Crops
        if (this == BlockRegistry.pamcottonCrop)
        {
        	return ItemRegistry.cottonItem;
        }
        //Tropical Crops
        if (this == BlockRegistry.pampineappleCrop)
        {
        	return ItemRegistry.pineappleItem;
        }
        if (this == BlockRegistry.pamgrapeCrop)
        {
        	return ItemRegistry.grapeItem;
        }
        if (this == BlockRegistry.pamkiwiCrop)
        {
        	return ItemRegistry.kiwiItem;
        }
        //Water Crops
        if (this == BlockRegistry.pamcranberryCrop)
        {
        	return ItemRegistry.cranberryItem;
        }
        if (this == BlockRegistry.pamriceCrop)
        {
        	return ItemRegistry.riceItem;
        }
        if (this == BlockRegistry.pamseaweedCrop)
        {
        	return ItemRegistry.seaweedItem;
        }
    	}
		return Items.wheat_seeds;
    }

    protected Item func_149865_P()
    {
    	//Berry Crops
        if (this == BlockRegistry.pamblackberryCrop)
        {
        	return ItemRegistry.blackberryItem;
        }
        if (this == BlockRegistry.pamblueberryCrop)
        {
        	return ItemRegistry.blueberryItem;
        }
        if (this == BlockRegistry.pamcandleberryCrop)
        {
        	return ItemRegistry.candleberryItem;
        }
        if (this == BlockRegistry.pamraspberryCrop)
        {
        	return ItemRegistry.raspberryItem;
        }
        if (this == BlockRegistry.pamstrawberryCrop)
        {
        	return ItemRegistry.strawberryItem;
        }
        //Desert Crops
        if (this == BlockRegistry.pamcactusfruitCrop)
        {
        	return ItemRegistry.cactusfruitItem;
        }
        //Grass Crops
        if (this == BlockRegistry.pamasparagusCrop)
        {
        	return ItemRegistry.asparagusItem;
        }
        if (this == BlockRegistry.pambarleyCrop)
        {
        	return ItemRegistry.barleyItem;
        }
        if (this == BlockRegistry.pamoatsCrop)
        {
        	return ItemRegistry.oatsItem;
        }
        if (this == BlockRegistry.pamryeCrop)
        {
        	return ItemRegistry.ryeItem;
        }
        if (this == BlockRegistry.pamcornCrop)
        {
        	return ItemRegistry.cornItem;
        }
        if (this == BlockRegistry.pambambooshootCrop)
        {
        	return ItemRegistry.bambooshootItem;
        }
        //Gourd Crops
        if (this == BlockRegistry.pamcantaloupeCrop)
        {
        	return ItemRegistry.cantaloupeItem;
        }
        if (this == BlockRegistry.pamcucumberCrop)
        {
        	return ItemRegistry.cucumberItem;
        }
        if (this == BlockRegistry.pamwintersquashCrop)
        {
        	return ItemRegistry.wintersquashItem;
        }
        if (this == BlockRegistry.pamzucchiniCrop)
        {
        	return ItemRegistry.zucchiniItem;
        }
        //Ground Crops
        if (this == BlockRegistry.pambeetCrop)
        {
        	return ItemRegistry.beetItem;
        }
        if (this == BlockRegistry.pamonionCrop)
        {
        	return ItemRegistry.onionItem;
        }
        if (this == BlockRegistry.pamparsnipCrop)
        {
        	return ItemRegistry.parsnipItem;
        }
        if (this == BlockRegistry.pampeanutCrop)
        {
        	return ItemRegistry.peanutItem;
        }
        if (this == BlockRegistry.pamradishCrop)
        {
        	return ItemRegistry.radishItem;
        }
        if (this == BlockRegistry.pamrutabagaCrop)
        {
        	return ItemRegistry.rutabagaItem;
        }
        if (this == BlockRegistry.pamsweetpotatoCrop)
        {
        	return ItemRegistry.sweetpotatoItem;
        }
        if (this == BlockRegistry.pamturnipCrop)
        {
        	return ItemRegistry.turnipItem;
        }
        if (this == BlockRegistry.pamrhubarbCrop)
        {
        	return ItemRegistry.rhubarbItem;
        }
        //Herb Garden
        if (this == BlockRegistry.pamceleryCrop)
        {
        	return ItemRegistry.celeryItem;
        }
        if (this == BlockRegistry.pamgarlicCrop)
        {
        	return ItemRegistry.garlicItem;
        }
        if (this == BlockRegistry.pamgingerCrop)
        {
        	return ItemRegistry.gingerItem;
        }
        if (this == BlockRegistry.pamspiceleafCrop)
        {
        	return ItemRegistry.spiceleafItem;
        }
        if (this == BlockRegistry.pamtealeafCrop)
        {
        	return ItemRegistry.tealeafItem;
        }
        if (this == BlockRegistry.pamcoffeebeanCrop)
        {
        	return ItemRegistry.coffeebeanItem;
        }
        if (this == BlockRegistry.pammustardseedsCrop)
        {
        	return ItemRegistry.mustardseedsItem;
        }
        //Leafy Crops
        if (this == BlockRegistry.pambroccoliCrop)
        {
        	return ItemRegistry.broccoliItem;
        }
        if (this == BlockRegistry.pamcauliflowerCrop)
        {
        	return ItemRegistry.cauliflowerItem;
        }
        if (this == BlockRegistry.pamleekCrop)
        {
        	return ItemRegistry.leekItem;
        }
        if (this == BlockRegistry.pamlettuceCrop)
        {
        	return ItemRegistry.lettuceItem;
        }
        if (this == BlockRegistry.pamscallionCrop)
        {
        	return ItemRegistry.scallionItem;
        }
        if (this == BlockRegistry.pamartichokeCrop)
        {
        	return ItemRegistry.artichokeItem;
        }
        if (this == BlockRegistry.pambrusselsproutCrop)
        {
        	return ItemRegistry.brusselsproutItem;
        }
        if (this == BlockRegistry.pamcabbageCrop)
        {
        	return ItemRegistry.cabbageItem;
        }
        if (this == BlockRegistry.pamspinachCrop)
        {
        	return ItemRegistry.spinachItem;
        }
        //Mushroom Crops
        if (this == BlockRegistry.pamwhitemushroomCrop)
        {
        	return ItemRegistry.whitemushroomItem;
        }
        //Stalk Crops
        if (this == BlockRegistry.pambeanCrop)
        {
        	return ItemRegistry.beanItem;
        }
        if (this == BlockRegistry.pamsoybeanCrop)
        {
        	return ItemRegistry.soybeanItem;
        }
        if (this == BlockRegistry.pambellpepperCrop)
        {
        	return ItemRegistry.bellpepperItem;
        }
        if (this == BlockRegistry.pamchilipepperCrop)
        {
        	return ItemRegistry.chilipepperItem;
        }
        if (this == BlockRegistry.pameggplantCrop)
        {
        	return ItemRegistry.eggplantItem;
        }
        if (this == BlockRegistry.pamokraCrop)
        {
        	return ItemRegistry.okraItem;
        }
        if (this == BlockRegistry.pampeasCrop)
        {
        	return ItemRegistry.peasItem;
        }
        if (this == BlockRegistry.pamtomatoCrop)
        {
        	return ItemRegistry.tomatoItem;
        }
        //Textile Crops
        if (this == BlockRegistry.pamcottonCrop)
        {
        	return ItemRegistry.cottonItem;
        }
        //Tropical Crops
        if (this == BlockRegistry.pampineappleCrop)
        {
        	return ItemRegistry.pineappleItem;
        }
        if (this == BlockRegistry.pamgrapeCrop)
        {
        	return ItemRegistry.grapeItem;
        }
        if (this == BlockRegistry.pamkiwiCrop)
        {
        	return ItemRegistry.kiwiItem;
        }
        //Water Crops
        if (this == BlockRegistry.pamcranberryCrop)
        {
        	return ItemRegistry.cranberryItem;
        }
        if (this == BlockRegistry.pamriceCrop)
        {
        	return ItemRegistry.riceItem;
        }
        if (this == BlockRegistry.pamseaweedCrop)
        {
        	return ItemRegistry.seaweedItem;
        }
		return Items.wheat;
    }
    

    	
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149868_a = new IIcon[4];

        for (int i = 0; i < this.field_149868_a.length; ++i)
        {
            this.field_149868_a[i] = p_149651_1_.registerIcon("harvestcraft:" + this.getTextureName() + "crop_" + i);
        }
    }
}