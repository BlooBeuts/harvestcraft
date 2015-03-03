package com.pam.harvestcraft;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;


import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

//Server Side
public class MessageMineBayBrowse implements IMessage, IMessageHandler<MessageMineBayBrowse, IMessage>
{

	private int itemNum, x, y, z;

	public MessageMineBayBrowse()
	{
	}

	public MessageMineBayBrowse(int itemNum, int x, int y, int z)
	{
		this.itemNum = itemNum;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		this.itemNum = buf.readInt();
		this.x = buf.readInt();
		this.y = buf.readInt();
		this.z = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(itemNum);
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
	}

	@Override
	public IMessage onMessage(MessageMineBayBrowse message, MessageContext ctx)
	{
		EntityPlayerMP player = ctx.getServerHandler().playerEntity;

		TileEntity tile_entity = player.worldObj.getTileEntity(message.x, message.y, message.z);
		if (tile_entity instanceof TileEntityMarket)
		{
			TileEntityMarket tileEntityMarket = (TileEntityMarket) tile_entity;
			tileEntityMarket.setBrowsingInfo(message.itemNum);
		}
		player.worldObj.markBlockForUpdate(message.x, message.y, message.z);
		return null;
	}
}
