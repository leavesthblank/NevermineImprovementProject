package net.nevermine.event.player;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class worldJoin {
	@SubscribeEvent
	public void onJoinWorld(final EntityJoinWorldEvent e) {
		if (e.entity instanceof EntityPlayer) {

			if (e.entity.posY <= 2) {
				((EntityPlayer)e.entity).setPositionAndUpdate(e.entity.posX, (double)e.entity.worldObj.getHeightValue((int)e.entity.posX, (int)e.entity.posZ), e.entity.posZ);
			}
		}
	}
}
