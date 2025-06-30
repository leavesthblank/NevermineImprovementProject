package net.nevermine.mob.render.creeponia;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.nevermine.mob.entity.creeponia.EntityCaveCreepoid;
import net.nevermine.mob.model.creeponia.modelCaveCreepoid;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderCaveCreepoid extends RenderLiving {
	private static final ResourceLocation armoredCaveCreepoidTextures = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
	private static final ResourceLocation CaveCreepoidTextures = new ResourceLocation("nevermine:textures/mobs/caveCreepoid.png");
	private ModelBase CaveCreepoidModel;

	public RenderCaveCreepoid() {
		super(new modelCaveCreepoid(), 0.5f);
		CaveCreepoidModel = new modelCaveCreepoid();
	}

	protected void preRenderCallback(final EntityCaveCreepoid p_77041_1_, final float p_77041_2_) {
		float f1 = p_77041_1_.getCreeperFlashIntensity(p_77041_2_);
		final float f2 = 1.0f + MathHelper.sin(f1 * 100.0f) * f1 * 0.01f;
		if (f1 < 0.0f) {
			f1 = 0.0f;
		}
		if (f1 > 1.0f) {
			f1 = 1.0f;
		}
		f1 *= f1;
		f1 *= f1;
		final float f3 = (1.0f + f1 * 0.4f) * f2;
		final float f4 = (1.0f + f1 * 0.1f) / f2;
		GL11.glScalef(f3, f4, f3);
	}

	protected int getColorMultiplier(final EntityCaveCreepoid p_77030_1_, final float p_77030_2_, final float p_77030_3_) {
		final float f2 = p_77030_1_.getCreeperFlashIntensity(p_77030_3_);
		if ((int)(f2 * 10.0f) % 2 == 0) {
			return 0;
		}
		int i = (int)(f2 * 0.2f * 255.0f);
		if (i < 0) {
			i = 0;
		}
		if (i > 255) {
			i = 255;
		}
		final short short1 = 255;
		final short short2 = 255;
		final short short3 = 255;
		return i << 24 | short1 << 16 | short2 << 8 | short3;
	}

	protected int shouldRenderPass(final EntityCaveCreepoid p_77032_1_, final int p_77032_2_, final float p_77032_3_) {
		if (p_77032_1_.getPowered()) {
			if (p_77032_1_.isInvisible()) {
				GL11.glDepthMask(false);
			}
			else {
				GL11.glDepthMask(true);
			}
			if (p_77032_2_ == 1) {
				final float f1 = p_77032_1_.ticksExisted + p_77032_3_;
				bindTexture(RenderCaveCreepoid.armoredCaveCreepoidTextures);
				GL11.glMatrixMode(GL11.GL_TEXTURE);
				GL11.glLoadIdentity();
				final float f2 = f1 * 0.01f;
				final float f3 = f1 * 0.01f;
				GL11.glTranslatef(f2, f3, 0.0f);
				setRenderPassModel(CaveCreepoidModel);
				GL11.glMatrixMode(GL11.GL_MODELVIEW);
				GL11.glEnable(GL11.GL_BLEND);
				final float f4 = 0.5f;
				GL11.glColor4f(f4, f4, f4, 1.0f);
				GL11.glDisable(GL11.GL_LIGHTING);
				GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
				return 1;
			}
			if (p_77032_2_ == 2) {
				GL11.glMatrixMode(GL11.GL_TEXTURE);
				GL11.glLoadIdentity();
				GL11.glMatrixMode(GL11.GL_MODELVIEW);
				GL11.glEnable(GL11.GL_LIGHTING);
				GL11.glDisable(GL11.GL_BLEND);
			}
		}
		return -1;
	}

	protected int inheritRenderPass(final EntityCaveCreepoid p_77035_1_, final int p_77035_2_, final float p_77035_3_) {
		return -1;
	}

	protected ResourceLocation getEntityTexture(final EntityCaveCreepoid p_110775_1_) {
		return RenderCaveCreepoid.CaveCreepoidTextures;
	}

	protected void preRenderCallback(final EntityLivingBase p_77041_1_, final float p_77041_2_) {
		preRenderCallback((EntityCaveCreepoid)p_77041_1_, p_77041_2_);
	}

	protected int getColorMultiplier(final EntityLivingBase p_77030_1_, final float p_77030_2_, final float p_77030_3_) {
		return getColorMultiplier((EntityCaveCreepoid)p_77030_1_, p_77030_2_, p_77030_3_);
	}

	protected int shouldRenderPass(final EntityLivingBase p_77032_1_, final int p_77032_2_, final float p_77032_3_) {
		return shouldRenderPass((EntityCaveCreepoid)p_77032_1_, p_77032_2_, p_77032_3_);
	}

	protected int inheritRenderPass(final EntityLivingBase p_77035_1_, final int p_77035_2_, final float p_77035_3_) {
		return inheritRenderPass((EntityCaveCreepoid)p_77035_1_, p_77035_2_, p_77035_3_);
	}

	protected ResourceLocation getEntityTexture(final Entity p_110775_1_) {
		return getEntityTexture((EntityCaveCreepoid)p_110775_1_);
	}
}
