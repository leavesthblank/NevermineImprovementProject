package net.nevermine.npc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelZal extends ModelBase {
	ModelRenderer head;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;

	public modelZal() {
		textureWidth = 128;
		textureHeight = 32;
		(head = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -8.0f, -4.0f, 4, 8, 8);
		head.setRotationPoint(0.0f, 17.0f, -0.4666667f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 108, 15)).addBox(-2.0f, -2.0f, -2.0f, 2, 12, 2);
		rightarm.setRotationPoint(-3.0f, 9.0f, 0.0f);
		rightarm.setTextureSize(128, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 108, 15)).addBox(0.0f, -2.0f, -2.0f, 2, 12, 2);
		leftarm.setRotationPoint(3.0f, 9.0f, 0.0f);
		leftarm.setTextureSize(128, 32);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 88, 1)).addBox(-2.0f, 0.0f, -2.0f, 4, 26, 4);
		rightleg.setRotationPoint(-8.0f, -2.0f, 0.0f);
		rightleg.setTextureSize(128, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 88, 1)).addBox(-2.0f, 0.0f, -2.0f, 4, 26, 4);
		leftleg.setRotationPoint(8.0f, -2.0f, 0.0f);
		leftleg.setTextureSize(128, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(body1 = new ModelRenderer(this, 16, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 11, 4);
		body1.setRotationPoint(0.0f, -2.0f, 0.0f);
		body1.setTextureSize(128, 32);
		body1.mirror = true;
		setRotation(body1, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 34, 0)).addBox(-1.0f, 0.0f, -2.0f, 10, 4, 5);
		body2.setRotationPoint(-4.0f, 3.0f, -0.5f);
		body2.setTextureSize(128, 32);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 34, 10)).addBox(0.0f, 0.0f, -2.0f, 20, 4, 5);
		body3.setRotationPoint(-10.0f, -6.0f, -0.5f);
		body3.setTextureSize(128, 32);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body1.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
