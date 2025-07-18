package net.nevermine.mob.render.creeponia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.entity.creeponia.EntityHost;
import net.nevermine.mob.model.overworld.modelHost;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderHost extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelHost model;
	private float scale;

	public RenderHost(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelHost)mainModel;
		scale = 2.5f;
	}

	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		preRenderCallback((EntityHost)par1EntityLivingBase, par2);
	}

	protected void preRenderCallback(final EntityHost par1EntityVoliant, final float par2) {
		GL11.glScalef(scale, scale, scale);
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderHost.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/host.png");
	}
}
