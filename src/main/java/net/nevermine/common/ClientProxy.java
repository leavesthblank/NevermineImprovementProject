package net.nevermine.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.nevermine.assist.StringUtil;
import net.nevermine.block.modelblocks.animated.AnimatedModelBlockEntityRenderer;
import net.nevermine.block.modelblocks.banner.BannerEntityRenderer;
import net.nevermine.block.modelblocks.statue.StatueEntityRenderer;
import net.nevermine.block.modelblocks.utility.UtilityBlockEntityRenderer;
import net.nevermine.event.player.ClientTicker;
import net.nevermine.event.recoil.RecoilClientTick;
import net.nevermine.gui.screen.HelmetScreen;
import net.nevermine.gui.screen.MobScreen;
import net.nevermine.gui.screen.ScopeSniper;
import net.nevermine.rendering.MobRenders;
import net.nevermine.rendering.ProjectileRenders;
import net.nevermine.rendering.SkillRenders;
import net.nevermine.rendering.WeaponRenders;
import net.nevermine.resource.boss.bossBarRenderer;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	@Override
	public void RenderInformation() {
		StatueEntityRenderer.init();
		BannerEntityRenderer.init();
		UtilityBlockEntityRenderer.init();
		AnimatedModelBlockEntityRenderer.init();
		MobRenders.init();
		ProjectileRenders.init();
		WeaponRenders.init();
		nevermine.addEventBus(new ScopeSniper());
		nevermine.addEventBus(new MobScreen());
		nevermine.addEventBus(new HelmetScreen());
		nevermine.postFMLEvent(new ClientTicker());
		SkillRenders.init();
		nevermine.addSpecialEventBus(new bossBarRenderer());
    }

	@Override
	public void displayMobScreen(final int ticks, final int screen) {
		MobScreen.showTicks = ticks;
		MobScreen.image = screen;
	}

	@Override
	public void displayScopeScreen(final boolean on, final int screen, final EntityPlayer player) {
		if (player.getCommandSenderName() == Minecraft.getMinecraft().thePlayer.getCommandSenderName()) {
			ScopeSniper.show = on;
			ScopeSniper.image = screen;
		}
	}

	@Override
	public void displayHelmetScreen(final boolean on, final int screen, final EntityPlayer player) {
		if (player.getCommandSenderName() == Minecraft.getMinecraft().thePlayer.getCommandSenderName()) {
			HelmetScreen.show = on;
			HelmetScreen.image = screen;
		}
	}

	@Override
	public void recoilTicking(final float recoil) {
		RecoilClientTick.tickNumber = 25;
		RecoilClientTick.recoil = recoil;
	}

	@Override
	public void setPlayerHealth(final float health) {
		Minecraft.getMinecraft().thePlayer.setHealth(health);
	}

	@Override
	public void sendPlayerMessage(final String msg, String colour) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentTranslation(colour + StringUtil.getLocaleString(msg)));
	}
}
