package net.nevermine.mob.model.voxponds;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelCentinel extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;

	public modelCentinel() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 6);
		head.setRotationPoint(0.0f, 10.0f, -8.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 2, 32)).addBox(-7.0f, -14.0f, 1.0f, 6, 5, 1);
		body.setRotationPoint(4.0f, 12.0f, 4.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 8, 4);
		leg1.setRotationPoint(-3.0f, 16.0f, 7.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 8, 4);
		leg2.setRotationPoint(3.0f, 16.0f, 7.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 8, 4);
		leg3.setRotationPoint(-3.0f, 16.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 8, 4);
		leg4.setRotationPoint(3.0f, 16.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 18, 4)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 10);
		body2.setRotationPoint(0.0f, 9.0f, 2.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 38, 32)).addBox(-6.0f, -10.0f, -7.0f, 4, 3, 8);
		body3.setRotationPoint(4.0f, 13.0f, 4.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 30, 43)).addBox(-2.0f, -14.0f, -15.0f, 1, 5, 16);
		body4.setRotationPoint(4.0f, 12.0f, 4.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 0, 41)).addBox(-6.0f, -10.0f, -15.0f, 4, 1, 16);
		body5.setRotationPoint(4.0f, 12.0f, 4.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 30, 43)).addBox(-7.0f, -14.0f, -15.0f, 1, 5, 16);
		body6.setRotationPoint(4.0f, 12.0f, 4.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 18, 35)).addBox(-6.0f, -15.0f, -7.0f, 4, 1, 2);
		body7.setRotationPoint(4.0f, 12.0f, 4.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 0, 41)).addBox(-6.0f, -14.0f, -15.0f, 4, 1, 16);
		body8.setRotationPoint(4.0f, 12.0f, 4.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 18, 35)).addBox(-6.0f, -15.0f, -13.0f, 4, 1, 2);
		body9.setRotationPoint(4.0f, 12.0f, 4.0f);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
