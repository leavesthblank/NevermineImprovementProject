package net.nevermine.mob.render.mysterium;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.mysterium.modelFungung;

@SideOnly(Side.CLIENT)
public class RenderFungung extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelFungung model;

	public RenderFungung(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelFungung)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderFungung.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/fungung.png");
	}
}
