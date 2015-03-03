package com.pam.harvestcraft;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class MessageMineBayBuy implements IMessage, IMessageHandler<MessageMineBayBuy, IMessage>
{

	private int itemNum, x, y, z;
	private boolean shouldClear;

	public MessageMineBayBuy()
	{
	}

	public MessageMineBayBuy(int itemNum, int x, int y, int z, boolean shouldClear)
	{
		this.itemNum = itemNum;
		this.x = x;
		this.y = y;
		this.z = z;
		this.shouldClear = shouldClear;
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		this.itemNum = buf.readInt();
		this.x = buf.readInt();
		this.y = buf.readInt();
		this.z = buf.readInt();
		this.shouldClear = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(itemNum);
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
		buf.writeBoolean(shouldClear);
	}

	@Override
	public IMessage onMessage(MessageMineBayBuy message, MessageContext ctx)
	{
		EntityPlayerMP player = ctx.getServerHandler().playerEntity;

		TileEntity tile_entity = player.worldObj.getTileEntity(message.x, message.y, message.z);
		if (tile_entity instanceof TileEntityMarket)
		{
			TileEntityMarket tileEntityMarket = (TileEntityMarket) tile_entity;
			RecipeData[] data = Recipes.getMineBayItems();
			int price = data[message.itemNum].getPrice();

			if (message.shouldClear)
			{
				tileEntityMarket.clearInventory();
			}
			else
			{
				tileEntityMarket.takeEmeraldFromSlot(price);
			}

			EntityItem var14 = new EntityItem(player.worldObj, player.posX, player.posY + 1, player.posZ, data[message.itemNum].getInput().copy());
			player.worldObj.spawnEntityInWorld(var14);
			//player.triggerAchievement(FurnitureAchievements.buyItem);
		}
		return null;
	}

}
