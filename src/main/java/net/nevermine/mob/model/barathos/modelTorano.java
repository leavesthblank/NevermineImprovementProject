package net.nevermine.mob.model.barathos;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class modelTorano extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer r1;
	ModelRenderer body2;
	ModelRenderer r2;
	ModelRenderer r3;
	ModelRenderer r4;
	ModelRenderer r5;
	ModelRenderer r6;
	ModelRenderer r7;
	ModelRenderer r8;
	ModelRenderer r9;
	ModelRenderer r10;
	ModelRenderer r11;
	ModelRenderer r12;
	ModelRenderer r13;
	ModelRenderer r14;
	ModelRenderer r15;
	ModelRenderer r16;

	public modelTorano() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, 7.0f, 0.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 0, 35)).addBox(-2.0f, 12.0f, -2.0f, 4, 4, 4);
		body.setRotationPoint(0.0f, 7.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(r1 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 15.0f, 3.0f, 6, 2, 1);
		r1.setRotationPoint(0.0f, 7.0f, 0.0f);
		r1.setTextureSize(64, 64);
		r1.mirror = true;
		setRotation(r1, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		body2.setRotationPoint(0.0f, 7.0f, 0.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(r2 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 3.0f, 6.0f, 6, 2, 1);
		r2.setRotationPoint(0.0f, 7.0f, 0.0f);
		r2.setTextureSize(64, 64);
		r2.mirror = true;
		setRotation(r2, 0.0f, 0.0f, 0.0f);
		(r3 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 7.0f, 5.0f, 6, 2, 1);
		r3.setRotationPoint(0.0f, 7.0f, 0.0f);
		r3.setTextureSize(64, 64);
		r3.mirror = true;
		setRotation(r3, 0.0f, 0.0f, 0.0f);
		(r4 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 11.0f, 4.0f, 6, 2, 1);
		r4.setRotationPoint(0.0f, 7.0f, 0.0f);
		r4.setTextureSize(64, 64);
		r4.mirror = true;
		setRotation(r4, 0.0f, 0.0f, 0.0f);
		(r5 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 3.0f, -7.0f, 6, 2, 1);
		r5.setRotationPoint(0.0f, 7.0f, 0.0f);
		r5.setTextureSize(64, 64);
		r5.mirror = true;
		setRotation(r5, 0.0f, 0.0f, 0.0f);
		(r6 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 7.0f, -6.0f, 6, 2, 1);
		r6.setRotationPoint(0.0f, 7.0f, 0.0f);
		r6.setTextureSize(64, 64);
		r6.mirror = true;
		setRotation(r6, 0.0f, 0.0f, 0.0f);
		(r7 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 11.0f, -5.0f, 6, 2, 1);
		r7.setRotationPoint(0.0f, 7.0f, 0.0f);
		r7.setTextureSize(64, 64);
		r7.mirror = true;
		setRotation(r7, 0.0f, 0.0f, 0.0f);
		(r8 = new ModelRenderer(this, 34, 6)).addBox(-7.0f, 3.0f, -3.0f, 1, 2, 6);
		r8.setRotationPoint(0.0f, 7.0f, 0.0f);
		r8.setTextureSize(64, 64);
		r8.mirror = true;
		setRotation(r8, 0.0f, 0.0f, 0.0f);
		(r9 = new ModelRenderer(this, 34, 1)).addBox(-3.0f, 15.0f, -4.0f, 6, 2, 1);
		r9.setRotationPoint(0.0f, 7.0f, 0.0f);
		r9.setTextureSize(64, 64);
		r9.mirror = true;
		setRotation(r9, 0.0f, 0.0f, 0.0f);
		(r10 = new ModelRenderer(this, 34, 6)).addBox(-4.0f, 15.0f, -3.0f, 1, 2, 6);
		r10.setRotationPoint(0.0f, 7.0f, 0.0f);
		r10.setTextureSize(64, 64);
		r10.mirror = true;
		setRotation(r10, 0.0f, 0.0f, 0.0f);
		(r11 = new ModelRenderer(this, 34, 6)).addBox(3.0f, 15.0f, -3.0f, 1, 2, 6);
		r11.setRotationPoint(0.0f, 7.0f, 0.0f);
		r11.setTextureSize(64, 64);
		r11.mirror = true;
		setRotation(r11, 0.0f, 0.0f, 0.0f);
		(r12 = new ModelRenderer(this, 34, 6)).addBox(4.0f, 11.0f, -3.0f, 1, 2, 6);
		r12.setRotationPoint(0.0f, 7.0f, 0.0f);
		r12.setTextureSize(64, 64);
		r12.mirror = true;
		setRotation(r12, 0.0f, 0.0f, 0.0f);
		(r13 = new ModelRenderer(this, 34, 6)).addBox(-5.0f, 11.0f, -3.0f, 1, 2, 6);
		r13.setRotationPoint(0.0f, 7.0f, 0.0f);
		r13.setTextureSize(64, 64);
		r13.mirror = true;
		setRotation(r13, 0.0f, 0.0f, 0.0f);
		(r14 = new ModelRenderer(this, 34, 6)).addBox(-6.0f, 7.0f, -3.0f, 1, 2, 6);
		r14.setRotationPoint(0.0f, 7.0f, 0.0f);
		r14.setTextureSize(64, 64);
		r14.mirror = true;
		setRotation(r14, 0.0f, 0.0f, 0.0f);
		(r15 = new ModelRenderer(this, 34, 6)).addBox(5.0f, 7.0f, -3.0f, 1, 2, 6);
		r15.setRotationPoint(0.0f, 7.0f, 0.0f);
		r15.setTextureSize(64, 64);
		r15.mirror = true;
		setRotation(r15, 0.0f, 0.0f, 0.0f);
		(r16 = new ModelRenderer(this, 34, 6)).addBox(6.0f, 3.0f, -3.0f, 1, 2, 6);
		r16.setRotationPoint(0.0f, 7.0f, 0.0f);
		r16.setTextureSize(64, 64);
		r16.mirror = true;
		setRotation(r16, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		r1.render(par7);
		body2.render(par7);
		r2.render(par7);
		r3.render(par7);
		r4.render(par7);
		r5.render(par7);
		r6.render(par7);
		r7.render(par7);
		r8.render(par7);
		r9.render(par7);
		r10.render(par7);
		r11.render(par7);
		r12.render(par7);
		r13.render(par7);
		r14.render(par7);
		r15.render(par7);
		r16.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		r1.rotateAngleY = par3 * 0.367f * 1.25f;
		r2.rotateAngleY = par3 * 0.367f * 1.25f;
		r3.rotateAngleY = par3 * 0.367f * 1.25f;
		r4.rotateAngleY = par3 * 0.367f * 1.25f;
		r5.rotateAngleY = par3 * 0.367f * 1.25f;
		r6.rotateAngleY = par3 * 0.367f * 1.25f;
		r7.rotateAngleY = par3 * 0.367f * 1.25f;
		r8.rotateAngleY = par3 * 0.367f * 1.25f;
		r9.rotateAngleY = par3 * 0.367f * 1.25f;
		r10.rotateAngleY = par3 * 0.367f * 1.25f;
		r11.rotateAngleY = par3 * 0.367f * 1.25f;
		r12.rotateAngleY = par3 * 0.367f * 1.25f;
		r13.rotateAngleY = par3 * 0.367f * 1.25f;
		r14.rotateAngleY = par3 * 0.367f * 1.25f;
		r15.rotateAngleY = par3 * 0.367f * 1.25f;
		r16.rotateAngleY = par3 * 0.367f * 1.25f;
	}
}
