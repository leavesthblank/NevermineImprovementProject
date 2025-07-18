package net.nevermine.mob.render.greckon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.greckon.modelSilencer;

@SideOnly(Side.CLIENT)
public class RenderSilencer extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelSilencer model;

	public RenderSilencer(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelSilencer)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderSilencer.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/silencer.png");
	}
}
