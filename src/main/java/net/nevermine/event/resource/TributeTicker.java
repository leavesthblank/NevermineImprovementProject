package net.nevermine.event.resource;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.assist.StringUtil;

import java.util.List;

import static cpw.mods.fml.common.gameevent.TickEvent.Phase.END;

public class TributeTicker {
	@SubscribeEvent
	public void tickWorld(final TickEvent.WorldTickEvent evt) {
		if (evt.world.isRemote || evt.phase != END || evt.world.provider.dimensionId != 0)
			return;

		long time = evt.world.getWorldTime() % 24000L;
		if (time == 12500L) {
			for (EntityPlayer p : (List<EntityPlayer>)evt.world.playerEntities) {
				p.addChatMessage(StringUtil.getColourLocale("message.event.nightfall", EnumChatFormatting.LIGHT_PURPLE));
			}
		}
		else if (time == 23031L) {
			for (EntityPlayer p : (List<EntityPlayer>)evt.world.playerEntities) {
				p.addChatMessage(StringUtil.getColourLocale("message.event.sunrise", EnumChatFormatting.LIGHT_PURPLE));
			}
		}
	}

	@SubscribeEvent
	public void onPlaceEvent(final BlockEvent.PlaceEvent e) {
		if (e.player.capabilities.isCreativeMode)
			return;

		if (e.player.dimension == ConfigurationHelper.immortallis) {
			e.setCanceled(true);
			e.player.setFire(10);
			e.player.addChatMessage(StringUtil.getColourLocale("message.feedback.blockPlace.immortallis", EnumChatFormatting.DARK_RED));
		}
	}

	@SubscribeEvent
	public void onBucketEvent(final PlayerInteractEvent e) {
		if (e.entityPlayer.capabilities.isCreativeMode)
			return;

		if (e.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
			if (e.entityPlayer.getHeldItem() != null && (e.entityPlayer.getHeldItem().getItem() == Items.water_bucket || e.entityPlayer.getHeldItem().getItem() == Items.lava_bucket)) {
				if (e.entity.dimension == ConfigurationHelper.immortallis) {
					e.setCanceled(true);
					e.entityPlayer.addChatMessage(StringUtil.getColourLocale("message.feedback.blockPlace.immortallis", EnumChatFormatting.DARK_RED));
				}
			}
		}
	}
}
