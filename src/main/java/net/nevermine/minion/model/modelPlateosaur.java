package net.nevermine.minion.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelPlateosaur extends ModelBase {
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
	ModelRenderer head2;

	public modelPlateosaur() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 34, 0)).addBox(-2.0f, -10.0f, -7.0f, 4, 9, 4);
		head.setRotationPoint(0.0f, 8.0f, -8.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, -0.3490659f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 2, 39)).addBox(-2.0f, -10.0f, -7.0f, 2, 14, 10);
		body.setRotationPoint(-1.0f, 7.0f, 8.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, -0.7853982f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 10, 4);
		leg1.setRotationPoint(-3.0f, 14.0f, 7.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 10, 4);
		leg2.setRotationPoint(3.0f, 14.0f, 7.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 10, 4);
		leg3.setRotationPoint(-3.0f, 14.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 10, 4);
		leg4.setRotationPoint(3.0f, 14.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 19, 17)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 10);
		body2.setRotationPoint(0.0f, 7.0f, 2.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 2, 39)).addBox(-6.0f, -10.0f, -7.0f, 2, 14, 10);
		body3.setRotationPoint(-1.0f, 7.0f, 2.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, -0.7853982f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 2, 39)).addBox(6.0f, -10.0f, -7.0f, 2, 14, 10);
		body4.setRotationPoint(-1.0f, 7.0f, 2.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, -0.7853982f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 2, 39)).addBox(2.0f, -10.0f, -7.0f, 2, 14, 10);
		body5.setRotationPoint(-1.0f, 7.0f, 8.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, -0.7853982f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -8.0f, 8, 8, 8);
		head2.setRotationPoint(0.0f, 8.0f, -8.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
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
		head2.render(par7);
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
