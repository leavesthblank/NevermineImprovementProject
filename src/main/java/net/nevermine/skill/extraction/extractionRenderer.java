package net.nevermine.skill.extraction;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.event.player.KeyPressEvent;

public class extractionRenderer {
	Minecraft mc;
	public static int value;
	public static int percent;

	public extractionRenderer() {
		mc = Minecraft.getMinecraft();
	}

	@SubscribeEvent
	public void onRender(final TickEvent.RenderTickEvent event) {
		onTickRender();
	}

	private void onTickRender() {
		final ConfigurationHelper cfg = new ConfigurationHelper();
		if (mc.currentScreen == null && KeyPressEvent.skills) {
			final GuiIngame gig = mc.ingameGUI;
			final ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			final int i = scaledresolution.getScaledWidth();
			final int k = scaledresolution.getScaledHeight();
			mc.getTextureManager().bindTexture(new ResourceLocation("nevermine:textures/gui/extractionCircle.png"));
			int y = ConfigurationHelper.extractionY;
			int x = i - ConfigurationHelper.extractionX;
			if (KeyPressEvent.sshow == 0 || KeyPressEvent.sshow > 8) {
				y -= 7;
			}
			gig.drawTexturedModalRect(x, y, 0, 0, 25, 25);
			if (extractionRenderer.value == 100) {
				x -= 8;
			}
			Minecraft.getMinecraft().fontRenderer.drawString("" + extractionRenderer.value, x + 14, y - 1, 0);
			Minecraft.getMinecraft().fontRenderer.drawString("" + extractionRenderer.value, x + 14, y - 3, 0);
			Minecraft.getMinecraft().fontRenderer.drawString("" + extractionRenderer.value, x + 15, y - 2, 0);
			Minecraft.getMinecraft().fontRenderer.drawString("" + extractionRenderer.value, x + 13, y - 2, 0);
			Minecraft.getMinecraft().fontRenderer.drawString("" + extractionRenderer.value, x + 14, y - 2, 16777215);
			if (extractionRenderer.value == 100) {
				x += 8;
			}
			mc.getTextureManager().bindTexture(new ResourceLocation("nevermine:textures/gui/percentageBar.png"));
			y += 20;
			if (extractionRenderer.value != 100) {
				gig.drawTexturedModalRect(x, y, 0, 0, 25, 5);
				gig.drawTexturedModalRect(x, y, 0, 5, (int)(3.125 * (extractionRenderer.percent / 13.5)), 10);
			}
			else {
				gig.drawTexturedModalRect(x, y, 0, 5, 25, 10);
			}
		}
	}
}
