package net.nevermine.mob.render.greckon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.greckon.modelGrillface;

@SideOnly(Side.CLIENT)
public class RenderGrillface extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelGrillface model;

	public RenderGrillface(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelGrillface)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderGrillface.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/grillface.png");
	}
}
