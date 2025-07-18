package net.nevermine.mob.render.immortallis;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.model.immortallis.modelGoldCreature;

@SideOnly(Side.CLIENT)
public class RenderGoldum extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelGoldCreature model;

	public RenderGoldum(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelGoldCreature)mainModel;
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderGoldum.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/goldum.png");
	}
}
