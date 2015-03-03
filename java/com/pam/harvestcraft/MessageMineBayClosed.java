package com.pam.harvestcraft;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

//Server Side
public class MessageMineBayClosed implements IMessage, IMessageHandler<MessageMineBayClosed, IMessage>
{

	private int x, y, z;

	public MessageMineBayClosed()
	{
	}

	public MessageMineBayClosed(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		this.x = buf.readInt();
		this.y = buf.readInt();
		this.z = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
	}

	@Override
	public IMessage onMessage(MessageMineBayClosed message, MessageContext ctx)
	{
		EntityPlayerMP player = ctx.getServerHandler().playerEntity;

		TileEntity tile_entity = player.worldObj.getTileEntity(message.x, message.y, message.z);
		if (tile_entity instanceof TileEntityMarket)
		{
			TileEntityMarket tileEntityMarket = (TileEntityMarket) tile_entity;

			if (tileEntityMarket.getStackInSlot(0) != null)
			{
				player.entityDropItem(tileEntityMarket.getStackInSlot(0), 1);
				tileEntityMarket.setInventorySlotContents(0, null);
			}
			tileEntityMarket.setTrading(false);
		}
		player.worldObj.markBlockForUpdate(message.x, message.y, message.z);
		return null;
	}

}
