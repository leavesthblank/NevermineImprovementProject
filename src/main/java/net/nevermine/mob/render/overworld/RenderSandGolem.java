package net.nevermine.mob.render.overworld;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.overworld.modelSandGolem;

@SideOnly(Side.CLIENT)
public class RenderSandGolem extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelSandGolem model;

	public RenderSandGolem(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelSandGolem)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderSandGolem.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/sandgolem.png");
	}
}
