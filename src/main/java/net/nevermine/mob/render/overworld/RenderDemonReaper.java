package net.nevermine.mob.render.overworld;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.overworld.modelNightReaper;

@SideOnly(Side.CLIENT)
public class RenderDemonReaper extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelNightReaper model;

	public RenderDemonReaper(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelNightReaper)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderDemonReaper.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/demonreaper.png");
	}
}
