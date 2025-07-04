package net.nevermine.mob.model.dustopia;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelDevourer extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer head2;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer leg3p2;
	ModelRenderer leg4p2;
	ModelRenderer leg1p2;
	ModelRenderer leg2p2;
	ModelRenderer leg1p3;
	ModelRenderer leg2p3;
	ModelRenderer leg2p4;
	ModelRenderer leg1p4;
	ModelRenderer body2;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;

	public modelDevourer() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -6.0f, 6, 6, 6);
		head.setRotationPoint(5.0f, 9.0f, -8.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 18, 25)).addBox(-6.0f, -17.0f, -8.0f, 14, 7, 10);
		body.setRotationPoint(-1.0f, 7.0f, 8.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 1.745329f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 23, 15)).addBox(-4.0f, 9.0f, 3.0f, 6, 3, 6);
		leg1.setRotationPoint(-6.0f, 12.0f, 7.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 23, 15)).addBox(-2.0f, 9.0f, 3.0f, 6, 3, 6);
		leg2.setRotationPoint(6.0f, 12.0f, 7.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 54)).addBox(-4.0f, 4.0f, -8.0f, 6, 4, 4);
		leg3.setRotationPoint(-8.0f, 15.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 54)).addBox(-2.0f, 4.0f, -8.0f, 6, 4, 4);
		leg4.setRotationPoint(8.0f, 15.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -6.0f, 6, 6, 6);
		head2.setRotationPoint(-5.0f, 9.0f, -8.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(Shape1 = new ModelRenderer(this, 48, 15)).addBox(0.0f, -1.0f, -10.0f, 2, 1, 6);
		Shape1.setRotationPoint(3.0f, 4.0f, -6.0f);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0.0f, 0.0f, 0.0f);
		(Shape2 = new ModelRenderer(this, 48, 15)).addBox(0.0f, -1.0f, -10.0f, 2, 1, 6);
		Shape2.setRotationPoint(10.0f, 7.0f, -8.0f);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0.0f, 0.0f, 1.570796f);
		(Shape3 = new ModelRenderer(this, 26, 6)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
		Shape3.setRotationPoint(3.0f, 4.0f, -6.0f);
		Shape3.setTextureSize(64, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0.0f, 0.0f, 0.0f);
		(Shape4 = new ModelRenderer(this, 26, 6)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
		Shape4.setRotationPoint(10.0f, 7.0f, -8.0f);
		Shape4.setTextureSize(64, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0.0f, 0.0f, 1.570796f);
		(Shape5 = new ModelRenderer(this, 35, 5)).addBox(0.0f, -2.0f, -4.0f, 2, 2, 6);
		Shape5.setRotationPoint(3.0f, 4.0f, -6.0f);
		Shape5.setTextureSize(64, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0.0f, 0.0f, 0.0f);
		(Shape6 = new ModelRenderer(this, 35, 5)).addBox(0.0f, -2.0f, -4.0f, 2, 2, 6);
		Shape6.setRotationPoint(10.0f, 7.0f, -8.0f);
		Shape6.setTextureSize(64, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0.0f, 0.0f, 1.570796f);
		(leg3p2 = new ModelRenderer(this, 0, 40)).addBox(-3.0f, 0.0f, -3.0f, 4, 9, 4);
		leg3p2.setRotationPoint(-8.0f, 15.0f, -5.0f);
		leg3p2.setTextureSize(64, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, -0.5235988f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 40)).addBox(-1.0f, 0.0f, -3.0f, 4, 9, 4);
		leg4p2.setRotationPoint(8.0f, 15.0f, -5.0f);
		leg4p2.setTextureSize(64, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, -0.5235988f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 0, 14)).addBox(-3.0f, 0.0f, -2.0f, 4, 6, 4);
		leg1p2.setRotationPoint(-6.0f, 12.0f, 7.0f);
		leg1p2.setTextureSize(64, 64);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 0, 14)).addBox(-1.0f, 0.0f, -2.0f, 4, 6, 4);
		leg2p2.setRotationPoint(6.0f, 12.0f, 7.0f);
		leg2p2.setTextureSize(64, 64);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(leg1p3 = new ModelRenderer(this, 0, 35)).addBox(-3.0f, 3.0f, 2.0f, 4, 3, 2);
		leg1p3.setRotationPoint(-6.0f, 12.0f, 7.0f);
		leg1p3.setTextureSize(64, 64);
		leg1p3.mirror = true;
		setRotation(leg1p3, 0.0f, 0.0f, 0.0f);
		(leg2p3 = new ModelRenderer(this, 0, 35)).addBox(-1.0f, 3.0f, 2.0f, 4, 3, 2);
		leg2p3.setRotationPoint(6.0f, 12.0f, 7.0f);
		leg2p3.setTextureSize(64, 64);
		leg2p3.mirror = true;
		setRotation(leg2p3, 0.0f, 0.0f, 0.0f);
		(leg2p4 = new ModelRenderer(this, 0, 25)).addBox(-1.0f, 3.0f, 4.0f, 4, 6, 4);
		leg2p4.setRotationPoint(6.0f, 12.0f, 7.0f);
		leg2p4.setTextureSize(64, 64);
		leg2p4.mirror = true;
		setRotation(leg2p4, 0.0f, 0.0f, 0.0f);
		(leg1p4 = new ModelRenderer(this, 0, 25)).addBox(-3.0f, 3.0f, 4.0f, 4, 6, 4);
		leg1p4.setRotationPoint(-6.0f, 12.0f, 7.0f);
		leg1p4.setTextureSize(64, 64);
		leg1p4.mirror = true;
		setRotation(leg1p4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 24, 42)).addBox(-6.0f, -10.0f, -8.0f, 10, 12, 10);
		body2.setRotationPoint(1.0f, 7.0f, 8.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 1.745329f, 0.0f, 0.0f);
		(Shape7 = new ModelRenderer(this, 26, 6)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
		Shape7.setRotationPoint(-5.0f, 4.0f, -6.0f);
		Shape7.setTextureSize(64, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0.0f, 0.0f, 0.0f);
		(Shape8 = new ModelRenderer(this, 35, 5)).addBox(0.0f, -2.0f, -4.0f, 2, 2, 6);
		Shape8.setRotationPoint(-5.0f, 4.0f, -6.0f);
		Shape8.setTextureSize(64, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0.0f, 0.0f, 0.0f);
		(Shape9 = new ModelRenderer(this, 48, 15)).addBox(0.0f, -1.0f, -10.0f, 2, 1, 6);
		Shape9.setRotationPoint(-5.0f, 4.0f, -6.0f);
		Shape9.setTextureSize(64, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0.0f, 0.0f, 0.0f);
		(Shape10 = new ModelRenderer(this, 26, 6)).addBox(0.0f, 0.0f, 0.0f, 2, 4, 2);
		Shape10.setRotationPoint(-10.0f, 9.0f, -8.0f);
		Shape10.setTextureSize(64, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0.0f, 0.0f, -1.570796f);
		(Shape11 = new ModelRenderer(this, 35, 5)).addBox(0.0f, -2.0f, -4.0f, 2, 2, 6);
		Shape11.setRotationPoint(-10.0f, 9.0f, -8.0f);
		Shape11.setTextureSize(64, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0.0f, 0.0f, -1.570796f);
		(Shape12 = new ModelRenderer(this, 48, 15)).addBox(0.0f, -1.0f, -10.0f, 2, 1, 6);
		Shape12.setRotationPoint(-10.0f, 9.0f, -8.0f);
		Shape12.setTextureSize(64, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0.0f, 0.0f, -1.570796f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		head2.render(par7);
		Shape1.render(par7);
		Shape2.render(par7);
		Shape3.render(par7);
		Shape4.render(par7);
		Shape5.render(par7);
		Shape6.render(par7);
		leg3p2.render(par7);
		leg4p2.render(par7);
		leg1p2.render(par7);
		leg2p2.render(par7);
		leg1p3.render(par7);
		leg2p3.render(par7);
		leg2p4.render(par7);
		leg1p4.render(par7);
		body2.render(par7);
		Shape7.render(par7);
		Shape8.render(par7);
		Shape9.render(par7);
		Shape10.render(par7);
		Shape11.render(par7);
		Shape12.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg1p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p2.rotateAngleY = 0.0f;
		leg1p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p3.rotateAngleY = 0.0f;
		leg1p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p4.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2 - 0.523f;
		leg3p2.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2 - 0.523f;
		leg2p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
