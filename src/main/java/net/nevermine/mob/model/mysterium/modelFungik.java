package net.nevermine.mob.model.mysterium;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelFungik extends ModelBase {
	ModelRenderer head1;
	ModelRenderer body;
	ModelRenderer rightarm1;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg2;
	ModelRenderer leftleg;
	ModelRenderer rightleg2;
	ModelRenderer head2;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer rightarm2;
	ModelRenderer rightarm3;
	ModelRenderer rightarm4;

	public modelFungik() {
		textureWidth = 128;
		textureHeight = 64;
		(head1 = new ModelRenderer(this, 40, 0)).addBox(-8.0f, -12.0f, -8.0f, 16, 6, 16);
		head1.setRotationPoint(0.0f, -4.0f, 0.0f);
		head1.setTextureSize(128, 64);
		head1.mirror = true;
		setRotation(head1, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 71, 25)).addBox(-10.0f, -4.0f, -4.0f, 6, 3, 6);
		body.setRotationPoint(11.0f, 0.0f, 9.0f);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, -1.047198f, 0.0f, 0.0f);
		(rightarm1 = new ModelRenderer(this, 113, 16)).addBox(-3.0f, -10.0f, -11.0f, 4, 3, 4);
		rightarm1.setRotationPoint(-8.0f, -2.0f, 0.0f);
		rightarm1.setTextureSize(128, 64);
		rightarm1.mirror = true;
		setRotation(rightarm1, 0.6108652f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 21, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 16, 4);
		leftarm.setRotationPoint(8.0f, -2.0f, 0.0f);
		leftarm.setTextureSize(128, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 48)).addBox(-3.0f, 6.0f, -3.0f, 6, 10, 6);
		rightleg.setRotationPoint(-4.0f, 8.0f, 0.0f);
		rightleg.setTextureSize(128, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg2 = new ModelRenderer(this, 0, 48)).addBox(-3.0f, 6.0f, -3.0f, 6, 10, 6);
		leftleg2.setRotationPoint(4.0f, 8.0f, 0.0f);
		leftleg2.setTextureSize(128, 64);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 33)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leftleg.setRotationPoint(4.0f, 8.0f, 0.0f);
		leftleg.setTextureSize(128, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(rightleg2 = new ModelRenderer(this, 0, 33)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		rightleg2.setRotationPoint(-4.0f, 8.0f, 0.0f);
		rightleg2.setTextureSize(128, 64);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -6.0f, -4.0f, 8, 6, 8);
		head2.setRotationPoint(0.0f, -4.0f, 0.0f);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 28, 46)).addBox(-7.0f, 0.0f, -2.0f, 14, 12, 4);
		body2.setRotationPoint(0.0f, -4.0f, 0.0f);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 71, 36)).addBox(-10.0f, -3.0f, -4.0f, 6, 3, 6);
		body3.setRotationPoint(4.0f, -4.0f, 9.0f);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, -0.6981317f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 59, 23)).addBox(-8.0f, -1.0f, -2.0f, 2, 11, 2);
		body4.setRotationPoint(11.0f, 0.0f, 9.0f);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, -1.047198f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 59, 23)).addBox(-8.0f, 0.0f, -2.0f, 2, 11, 2);
		body5.setRotationPoint(4.0f, -4.0f, 9.0f);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, -0.6981317f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 21, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 16, 4);
		rightarm2.setRotationPoint(-8.0f, -2.0f, 0.0f);
		rightarm2.setTextureSize(128, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 113, 24)).addBox(-2.0f, 1.0f, -10.0f, 2, 14, 2);
		rightarm3.setRotationPoint(-8.0f, -2.0f, 0.0f);
		rightarm3.setTextureSize(128, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.6108652f, 0.0f, 0.0f);
		(rightarm4 = new ModelRenderer(this, 113, 42)).addBox(-2.0f, -7.0f, -10.0f, 2, 8, 2);
		rightarm4.setRotationPoint(-8.0f, -2.0f, 0.0f);
		rightarm4.setTextureSize(128, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0.6108652f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head1.render(par7);
		body.render(par7);
		rightarm1.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg2.render(par7);
		leftleg.render(par7);
		rightleg2.render(par7);
		head2.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		rightarm2.render(par7);
		rightarm3.render(par7);
		rightarm4.render(par7);
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
		rightarm1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.61f;
		rightarm1.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		rightarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.61f;
		rightarm3.rotateAngleZ = 0.0f;
		rightarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.61f;
		rightarm4.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		rightleg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg2.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftleg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
