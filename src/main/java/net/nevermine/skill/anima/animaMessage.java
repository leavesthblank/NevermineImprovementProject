package net.nevermine.skill.anima;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class animaMessage implements IMessage {
	private int value;
	private int percent;

	public animaMessage() {
	}

	public animaMessage(final int level, final int per) {
		value = level;
		percent = per;
	}

	public void fromBytes(final ByteBuf buf) {
		value = buf.readInt();
		percent = buf.readInt();
	}

	public void toBytes(final ByteBuf buf) {
		buf.writeInt(value);
		buf.writeInt(percent);
	}

	public static class Handler implements IMessageHandler<animaMessage, IMessage> {
		public IMessage onMessage(final animaMessage msg, final MessageContext ctx) {
			animaRenderer.value = msg.value;
			animaRenderer.percent = msg.percent;
			return null;
		}
	}
}
