package net.nevermine.assist;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.nevermine.common.nevermine;
import net.nevermine.event.player.HealthMessage;
import net.nevermine.gui.GuiHandler;
import net.nevermine.gui.MobHitPacket;

public class AddPackets {
	public static SimpleNetworkWrapper network;

	public static void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(nevermine.instance, new GuiHandler());
		(AddPackets.network = NetworkRegistry.INSTANCE.newSimpleChannel("NeverminePackets")).registerMessage(MobHitPacket.Handler.class, MobHitPacket.class, 0, Side.CLIENT);
		AddPackets.network.registerMessage(HealthMessage.Handler.class, HealthMessage.class, 6, Side.CLIENT);
	}
}
