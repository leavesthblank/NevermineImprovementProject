package net.nevermine.mob.model.abyss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelBloodsucker extends ModelBase {
	ModelRenderer body;
	ModelRenderer leg1p1;
	ModelRenderer leg6p1;
	ModelRenderer leg2p1;
	ModelRenderer leg5p1;
	ModelRenderer leg1p2;
	ModelRenderer leg5p2;
	ModelRenderer leg6p2;
	ModelRenderer leg2p2;
	ModelRenderer head1;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer leg4p2;
	ModelRenderer leg4p1;
	ModelRenderer leg3p1;
	ModelRenderer leg3p2;
	ModelRenderer leg2p3;
	ModelRenderer leg4p3;
	ModelRenderer leg6p3;
	ModelRenderer leg1p3;
	ModelRenderer leg3p3;
	ModelRenderer leg5p3;

	public modelBloodsucker() {
		textureWidth = 128;
		textureHeight = 32;
		(body = new ModelRenderer(this, 34, 0)).addBox(-5.0f, -10.0f, -7.0f, 10, 26, 5);
		body.setRotationPoint(0.0f, 8.0f, 3.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 1.570796f, 0.0f, 0.0f);
		(leg1p1 = new ModelRenderer(this, 91, 2)).addBox(-8.0f, -2.0f, -2.0f, 8, 3, 4);
		leg1p1.setRotationPoint(-3.0f, 9.0f, -5.0f);
		leg1p1.setTextureSize(128, 32);
		leg1p1.mirror = true;
		setRotation(leg1p1, 0.0f, 0.0f, 0.0f);
		(leg6p1 = new ModelRenderer(this, 91, 2)).addBox(0.0f, -2.0f, -2.0f, 8, 3, 4);
		leg6p1.setRotationPoint(3.0f, 9.0f, 17.0f);
		leg6p1.setTextureSize(128, 32);
		leg6p1.mirror = true;
		setRotation(leg6p1, 0.0f, 0.0f, 0.0f);
		(leg2p1 = new ModelRenderer(this, 91, 2)).addBox(0.0f, -2.0f, -2.0f, 8, 3, 4);
		leg2p1.setRotationPoint(3.0f, 9.0f, -5.0f);
		leg2p1.setTextureSize(128, 32);
		leg2p1.mirror = true;
		setRotation(leg2p1, 0.0f, 0.0f, 0.0f);
		(leg5p1 = new ModelRenderer(this, 91, 2)).addBox(-8.0f, -2.0f, -2.0f, 8, 3, 4);
		leg5p1.setRotationPoint(-3.0f, 9.0f, 17.0f);
		leg5p1.setTextureSize(128, 32);
		leg5p1.mirror = true;
		setRotation(leg5p1, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 86, 14)).addBox(-10.0f, 1.0f, 0.0f, 2, 14, 0);
		leg1p2.setRotationPoint(-3.0f, 9.0f, -5.0f);
		leg1p2.setTextureSize(128, 32);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg5p2 = new ModelRenderer(this, 86, 14)).addBox(-10.0f, 1.0f, 0.0f, 2, 14, 0);
		leg5p2.setRotationPoint(-3.0f, 9.0f, 17.0f);
		leg5p2.setTextureSize(128, 32);
		leg5p2.mirror = true;
		setRotation(leg5p2, 0.0f, 0.0f, 0.0f);
		(leg6p2 = new ModelRenderer(this, 118, 14)).addBox(8.0f, 1.0f, 0.0f, 2, 14, 0);
		leg6p2.setRotationPoint(3.0f, 9.0f, 17.0f);
		leg6p2.setTextureSize(128, 32);
		leg6p2.mirror = true;
		setRotation(leg6p2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 118, 14)).addBox(8.0f, 1.0f, 0.0f, 2, 14, 0);
		leg2p2.setRotationPoint(3.0f, 9.0f, -5.0f);
		leg2p2.setTextureSize(128, 32);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(head1 = new ModelRenderer(this, 0, 15)).addBox(1.0f, 1.0f, -12.0f, 1, 1, 6);
		head1.setRotationPoint(0.0f, 12.0f, -6.0f);
		head1.setTextureSize(128, 32);
		head1.mirror = true;
		setRotation(head1, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -8.0f, 8, 5, 8);
		head2.setRotationPoint(0.0f, 12.0f, -6.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 15)).addBox(-2.0f, 1.0f, -12.0f, 1, 1, 6);
		head3.setRotationPoint(0.0f, 12.0f, -6.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 118, 14)).addBox(8.0f, 1.0f, 0.0f, 2, 14, 0);
		leg4p2.setRotationPoint(3.0f, 9.0f, 6.0f);
		leg4p2.setTextureSize(128, 32);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg4p1 = new ModelRenderer(this, 91, 2)).addBox(0.0f, -2.0f, -2.0f, 8, 3, 4);
		leg4p1.setRotationPoint(3.0f, 9.0f, 6.0f);
		leg4p1.setTextureSize(128, 32);
		leg4p1.mirror = true;
		setRotation(leg4p1, 0.0f, 0.0f, 0.0f);
		(leg3p1 = new ModelRenderer(this, 91, 2)).addBox(-8.0f, -2.0f, -2.0f, 8, 3, 4);
		leg3p1.setRotationPoint(-3.0f, 9.0f, 6.0f);
		leg3p1.setTextureSize(128, 32);
		leg3p1.mirror = true;
		setRotation(leg3p1, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 86, 14)).addBox(-10.0f, 1.0f, 0.0f, 2, 14, 0);
		leg3p2.setRotationPoint(-3.0f, 9.0f, 6.0f);
		leg3p2.setTextureSize(128, 32);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg2p3 = new ModelRenderer(this, 67, 14)).addBox(4.0f, 1.0f, -2.0f, 4, 14, 4);
		leg2p3.setRotationPoint(3.0f, 9.0f, -5.0f);
		leg2p3.setTextureSize(128, 32);
		leg2p3.mirror = true;
		setRotation(leg2p3, 0.0f, 0.0f, 0.0f);
		(leg4p3 = new ModelRenderer(this, 67, 14)).addBox(4.0f, 1.0f, -2.0f, 4, 14, 4);
		leg4p3.setRotationPoint(3.0f, 9.0f, 6.0f);
		leg4p3.setTextureSize(128, 32);
		leg4p3.mirror = true;
		setRotation(leg4p3, 0.0f, 0.0f, 0.0f);
		(leg6p3 = new ModelRenderer(this, 67, 14)).addBox(4.0f, 1.0f, -2.0f, 4, 14, 4);
		leg6p3.setRotationPoint(3.0f, 9.0f, 17.0f);
		leg6p3.setTextureSize(128, 32);
		leg6p3.mirror = true;
		setRotation(leg6p3, 0.0f, 0.0f, 0.0f);
		(leg1p3 = new ModelRenderer(this, 67, 14)).addBox(-8.0f, 1.0f, -2.0f, 4, 14, 4);
		leg1p3.setRotationPoint(-3.0f, 9.0f, -5.0f);
		leg1p3.setTextureSize(128, 32);
		leg1p3.mirror = true;
		setRotation(leg1p3, 0.0f, 0.0f, 0.0f);
		(leg3p3 = new ModelRenderer(this, 67, 14)).addBox(-8.0f, 1.0f, -2.0f, 4, 14, 4);
		leg3p3.setRotationPoint(-3.0f, 9.0f, 6.0f);
		leg3p3.setTextureSize(128, 32);
		leg3p3.mirror = true;
		setRotation(leg3p3, 0.0f, 0.0f, 0.0f);
		(leg5p3 = new ModelRenderer(this, 67, 14)).addBox(-8.0f, 1.0f, -2.0f, 4, 14, 4);
		leg5p3.setRotationPoint(-3.0f, 9.0f, 17.0f);
		leg5p3.setTextureSize(128, 32);
		leg5p3.mirror = true;
		setRotation(leg5p3, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		leg1p1.render(par7);
		leg6p1.render(par7);
		leg2p1.render(par7);
		leg5p1.render(par7);
		leg1p2.render(par7);
		leg5p2.render(par7);
		leg6p2.render(par7);
		leg2p2.render(par7);
		head1.render(par7);
		head2.render(par7);
		head3.render(par7);
		leg4p2.render(par7);
		leg4p1.render(par7);
		leg3p1.render(par7);
		leg3p2.render(par7);
		leg2p3.render(par7);
		leg4p3.render(par7);
		leg6p3.render(par7);
		leg1p3.render(par7);
		leg3p3.render(par7);
		leg5p3.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head1.rotateAngleY = par4 / 57.295776f;
		head1.rotateAngleX = par5 / 54.11268f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 54.11268f;
		head3.rotateAngleY = par4 / 57.295776f;
		head3.rotateAngleX = par5 / 54.11268f;
		leg1p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p1.rotateAngleY = 0.0f;
		leg3p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p1.rotateAngleY = 0.0f;
		leg5p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg5p1.rotateAngleY = 0.0f;
		leg1p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p2.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p2.rotateAngleY = 0.0f;
		leg5p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg5p2.rotateAngleY = 0.0f;
		leg1p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p3.rotateAngleY = 0.0f;
		leg3p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p3.rotateAngleY = 0.0f;
		leg5p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg5p3.rotateAngleY = 0.0f;
		leg2p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg6p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg6p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg6p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
