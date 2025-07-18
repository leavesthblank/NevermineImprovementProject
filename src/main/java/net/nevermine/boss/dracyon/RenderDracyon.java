package net.nevermine.boss.dracyon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.nevermine.resource.boss.EternalBossStatus;

@SideOnly(Side.CLIENT)
public class RenderDracyon extends RenderLiving {
	private static final ResourceLocation EntityTexture;
	protected modelDracyon model;

	public RenderDracyon(final ModelBase par1ModelBase, final float par2) {
		super(par1ModelBase, par2);
		model = (modelDracyon)mainModel;
	}

	public void renderDracyon(final EntityDracyon var1, final double var2, final double var4, final double var6, final float var8, final float var9) {
		EternalBossStatus.setBossStatus(var1, true, 21);
		super.doRender(var1, var2, var4, var6, var8, var9);
	}

	public void doRender(final EntityLiving var1, final double var2, final double var4, final double var6, final float var8, final float var9) {
		renderDracyon((EntityDracyon)var1, var2, var4, var6, var8, var9);
	}

	public void doRender(final Entity var1, final double var2, final double var4, final double var6, final float var8, final float var9) {
		renderDracyon((EntityDracyon)var1, var2, var4, var6, var8, var9);
	}

	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderDracyon.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("nevermine:textures/mobs/dracyon.png");
	}
}
