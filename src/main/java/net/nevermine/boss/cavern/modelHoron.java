package net.nevermine.boss.cavern;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelHoron extends ModelBase {
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer leftarm2;
	ModelRenderer rightarm2;
	ModelRenderer rightarm3;
	ModelRenderer rightarm4;
	ModelRenderer rightarm5;
	ModelRenderer rightarm6;
	ModelRenderer rightarm7;
	ModelRenderer rightarm8;
	ModelRenderer rightarm9;
	ModelRenderer leftarm3;
	ModelRenderer leftarm4;
	ModelRenderer leftarm5;
	ModelRenderer rightarm10;
	ModelRenderer leftarm6;
	ModelRenderer rightarm11;
	ModelRenderer head;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer head6;
	ModelRenderer head7;
	ModelRenderer rightarm12;
	ModelRenderer rightarm13;
	ModelRenderer rightarm14;
	ModelRenderer rightarm15;
	ModelRenderer leftarm7;
	ModelRenderer leftleg8;
	ModelRenderer rightleg8;

	public modelHoron() {
		textureWidth = 128;
		textureHeight = 64;
		(body = new ModelRenderer(this, 67, 48)).addBox(-8.0f, 0.0f, -3.0f, 14, 8, 8);
		body.setRotationPoint(1.0f, -8.0f, -1.0f);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 46, 36)).addBox(-4.0f, -11.0f, 4.0f, 7, 4, 0);
		rightarm.setRotationPoint(-10.0f, -2.0f, 0.0f);
		rightarm.setTextureSize(128, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 46, 36)).addBox(-2.0f, -11.0f, 4.0f, 7, 4, 0);
		leftarm.setRotationPoint(9.0f, -2.0f, 0.0f);
		leftarm.setTextureSize(128, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 67, 31)).addBox(-7.0f, 0.0f, -1.0f, 3, 15, 0);
		rightleg.setRotationPoint(-4.0f, 9.0f, 0.5f);
		rightleg.setTextureSize(128, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 74, 31)).addBox(3.0f, 0.0f, -1.0f, 3, 15, 0);
		leftleg.setRotationPoint(5.0f, 9.0f, 0.5f);
		leftleg.setTextureSize(128, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 81, 32)).addBox(-3.0f, 0.0f, -3.0f, 6, 8, 6);
		body2.setRotationPoint(0.0f, 7.0f, 0.0f);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 0, 23)).addBox(-5.0f, 0.0f, -3.0f, 10, 8, 6);
		body3.setRotationPoint(0.0f, -1.0f, 0.0f);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 26, 38)).addBox(4.0f, 16.0f, -0.5f, 1, 9, 2);
		leftarm2.setRotationPoint(9.0f, -2.0f, 0.0f);
		leftarm2.setTextureSize(128, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 27, 58)).addBox(-5.0f, 10.0f, -1.0f, 2, 2, 3);
		rightarm2.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm2.setTextureSize(128, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 25, 50)).addBox(-3.0f, 11.0f, 1.0f, 2, 3, 2);
		rightarm3.setRotationPoint(-10.0f, -2.0f, 0.0f);
		rightarm3.setTextureSize(128, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.0f, 0.0f, 0.0f);
		(rightarm4 = new ModelRenderer(this, 55, 0)).addBox(-5.0f, -17.0f, -2.0f, 2, 2, 2);
		rightarm4.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm4.setTextureSize(128, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0.0f, 0.0f, 0.0f);
		(rightarm5 = new ModelRenderer(this, 23, 56)).addBox(-5.0f, 8.0f, -3.0f, 2, 1, 7);
		rightarm5.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm5.setTextureSize(128, 64);
		rightarm5.mirror = true;
		setRotation(rightarm5, 0.0f, 0.0f, 0.0f);
		(rightarm6 = new ModelRenderer(this, 29, 58)).addBox(-5.0f, 9.0f, -2.0f, 2, 1, 5);
		rightarm6.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm6.setTextureSize(128, 64);
		rightarm6.mirror = true;
		setRotation(rightarm6, 0.0f, 0.0f, 0.0f);
		(rightarm7 = new ModelRenderer(this, 0, 38)).addBox(-5.0f, -9.0f, -4.0f, 2, 17, 9);
		rightarm7.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm7.setTextureSize(128, 64);
		rightarm7.mirror = true;
		setRotation(rightarm7, 0.0f, 0.0f, 0.0f);
		(rightarm8 = new ModelRenderer(this, 55, 0)).addBox(-5.0f, -11.0f, 5.0f, 2, 2, 2);
		rightarm8.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm8.setTextureSize(128, 64);
		rightarm8.mirror = true;
		setRotation(rightarm8, 0.0f, 0.0f, 0.0f);
		(rightarm9 = new ModelRenderer(this, 55, 0)).addBox(-5.0f, -14.0f, 1.5f, 2, 2, 2);
		rightarm9.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm9.setTextureSize(128, 64);
		rightarm9.mirror = true;
		setRotation(rightarm9, 0.0f, 0.0f, 0.0f);
		(leftarm3 = new ModelRenderer(this, 25, 50)).addBox(2.0f, 11.0f, 1.0f, 2, 3, 2);
		leftarm3.setRotationPoint(9.0f, -2.0f, 0.0f);
		leftarm3.setTextureSize(128, 64);
		leftarm3.mirror = true;
		setRotation(leftarm3, 0.0f, 0.0f, 0.0f);
		(leftarm4 = new ModelRenderer(this, 34, 29)).addBox(4.0f, -2.0f, -1.0f, 1, 18, 3);
		leftarm4.setRotationPoint(9.0f, -2.0f, 0.0f);
		leftarm4.setTextureSize(128, 64);
		leftarm4.mirror = true;
		setRotation(leftarm4, 0.0f, 0.0f, 0.0f);
		(leftarm5 = new ModelRenderer(this, 108, 36)).addBox(-1.0f, -2.0f, -2.0f, 5, 13, 5);
		leftarm5.setRotationPoint(9.0f, -2.0f, 0.0f);
		leftarm5.setTextureSize(128, 64);
		leftarm5.mirror = true;
		setRotation(leftarm5, 0.0f, 0.0f, 0.0f);
		(rightarm10 = new ModelRenderer(this, 108, 36)).addBox(-3.0f, -2.0f, -2.0f, 5, 13, 5);
		rightarm10.setRotationPoint(-10.0f, -2.0f, 0.0f);
		rightarm10.setTextureSize(128, 64);
		rightarm10.mirror = true;
		setRotation(rightarm10, 0.0f, 0.0f, 0.0f);
		(leftarm6 = new ModelRenderer(this, 25, 50)).addBox(2.0f, 11.0f, -2.0f, 2, 3, 2);
		leftarm6.setRotationPoint(9.0f, -2.0f, 0.0f);
		leftarm6.setTextureSize(128, 64);
		leftarm6.mirror = true;
		setRotation(leftarm6, 0.0f, 0.0f, 0.0f);
		(rightarm11 = new ModelRenderer(this, 25, 50)).addBox(-3.0f, 11.0f, -2.0f, 2, 3, 2);
		rightarm11.setRotationPoint(-10.0f, -2.0f, 0.0f);
		rightarm11.setTextureSize(128, 64);
		rightarm11.mirror = true;
		setRotation(rightarm11, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 21, 17)).addBox(4.0f, -12.0f, -5.0f, 3, 3, 1);
		head.setRotationPoint(0.0f, -1.0f, -4.0f);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, -0.6108652f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head2.setRotationPoint(0.0f, -4.0f, -4.0f);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 21, 17)).addBox(-7.0f, -12.0f, -5.0f, 3, 3, 1);
		head3.setRotationPoint(0.0f, -1.0f, -4.0f);
		head3.setTextureSize(128, 64);
		head3.mirror = true;
		setRotation(head3, -0.6108652f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 34, 17)).addBox(4.0f, -9.0f, -7.0f, 3, 6, 3);
		head4.setRotationPoint(0.0f, -1.0f, -4.0f);
		head4.setTextureSize(128, 64);
		head4.mirror = true;
		setRotation(head4, -0.6108652f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 34, 17)).addBox(-7.0f, -9.0f, -7.0f, 3, 6, 3);
		head5.setRotationPoint(0.0f, -1.0f, -4.0f);
		head5.setTextureSize(128, 64);
		head5.mirror = true;
		setRotation(head5, -0.6108652f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 48, 22)).addBox(4.0f, -15.0f, -7.0f, 3, 6, 1);
		head6.setRotationPoint(0.0f, -1.0f, -4.0f);
		head6.setTextureSize(128, 64);
		head6.mirror = true;
		setRotation(head6, -0.6108652f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 48, 22)).addBox(-7.0f, -15.0f, -7.0f, 3, 6, 1);
		head7.setRotationPoint(0.0f, -1.0f, -4.0f);
		head7.setTextureSize(128, 64);
		head7.mirror = true;
		setRotation(head7, -0.6108652f, 0.0f, 0.0f);
		(rightarm12 = new ModelRenderer(this, 55, 0)).addBox(-5.0f, -17.0f, -4.0f, 2, 8, 2);
		rightarm12.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm12.setTextureSize(128, 64);
		rightarm12.mirror = true;
		setRotation(rightarm12, 0.0f, 0.0f, 0.0f);
		(rightarm13 = new ModelRenderer(this, 55, 0)).addBox(-5.0f, -14.0f, -0.5f, 2, 5, 2);
		rightarm13.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm13.setTextureSize(128, 64);
		rightarm13.mirror = true;
		setRotation(rightarm13, 0.0f, 0.0f, 0.0f);
		(rightarm14 = new ModelRenderer(this, 55, 0)).addBox(-5.0f, -11.0f, 3.0f, 2, 2, 2);
		rightarm14.setRotationPoint(-11.0f, 1.0f, 0.0f);
		rightarm14.setTextureSize(128, 64);
		rightarm14.mirror = true;
		setRotation(rightarm14, 0.0f, 0.0f, 0.0f);
		(rightarm15 = new ModelRenderer(this, 32, 4)).addBox(-4.0f, -7.0f, -3.0f, 7, 5, 7);
		rightarm15.setRotationPoint(-10.0f, -2.0f, 0.0f);
		rightarm15.setTextureSize(128, 64);
		rightarm15.mirror = true;
		setRotation(rightarm15, 0.0f, 0.0f, 0.0f);
		(leftarm7 = new ModelRenderer(this, 32, 4)).addBox(-2.0f, -7.0f, -3.0f, 7, 5, 7);
		leftarm7.setRotationPoint(9.0f, -2.0f, 0.0f);
		leftarm7.setTextureSize(128, 64);
		leftarm7.mirror = true;
		setRotation(leftarm7, 0.0f, 0.0f, 0.0f);
		(leftleg8 = new ModelRenderer(this, 43, 44)).addBox(-2.0f, 0.0f, -3.0f, 5, 15, 5);
		leftleg8.setRotationPoint(5.0f, 9.0f, 0.5f);
		leftleg8.setTextureSize(128, 64);
		leftleg8.mirror = true;
		setRotation(leftleg8, 0.0f, 0.0f, 0.0f);
		(rightleg8 = new ModelRenderer(this, 43, 44)).addBox(-4.0f, 0.0f, -3.0f, 5, 15, 5);
		rightleg8.setRotationPoint(-4.0f, 9.0f, 0.5f);
		rightleg8.setTextureSize(128, 64);
		rightleg8.mirror = true;
		setRotation(rightleg8, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
		leftarm2.render(par7);
		rightarm2.render(par7);
		rightarm3.render(par7);
		rightarm4.render(par7);
		rightarm5.render(par7);
		rightarm6.render(par7);
		rightarm7.render(par7);
		rightarm8.render(par7);
		rightarm9.render(par7);
		leftarm3.render(par7);
		leftarm4.render(par7);
		leftarm5.render(par7);
		rightarm10.render(par7);
		leftarm6.render(par7);
		rightarm11.render(par7);
		head.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		rightarm12.render(par7);
		rightarm13.render(par7);
		rightarm14.render(par7);
		rightarm15.render(par7);
		leftarm7.render(par7);
		leftleg8.render(par7);
		rightleg8.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / (float)(180f / Math.PI);
		head2.rotateAngleY = par4 / (float)(180f / Math.PI);
		head3.rotateAngleY = par4 / (float)(180f / Math.PI);
		head4.rotateAngleY = par4 / (float)(180f / Math.PI);
		head5.rotateAngleY = par4 / (float)(180f / Math.PI);
		head6.rotateAngleY = par4 / (float)(180f / Math.PI);
		head7.rotateAngleY = par4 / (float)(180f / Math.PI);
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		rightarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm3.rotateAngleZ = 0.0f;
		rightarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm4.rotateAngleZ = 0.0f;
		rightarm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm5.rotateAngleZ = 0.0f;
		rightarm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm6.rotateAngleZ = 0.0f;
		rightarm7.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm7.rotateAngleZ = 0.0f;
		rightarm8.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm8.rotateAngleZ = 0.0f;
		rightarm9.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm9.rotateAngleZ = 0.0f;
		rightarm10.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm10.rotateAngleZ = 0.0f;
		rightarm11.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm11.rotateAngleZ = 0.0f;
		rightarm12.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm12.rotateAngleZ = 0.0f;
		rightarm13.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm13.rotateAngleZ = 0.0f;
		rightarm14.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm14.rotateAngleZ = 0.0f;
		rightarm15.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm15.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		leftarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm3.rotateAngleZ = 0.0f;
		leftarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm4.rotateAngleZ = 0.0f;
		leftarm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm5.rotateAngleZ = 0.0f;
		leftarm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm6.rotateAngleZ = 0.0f;
		leftarm7.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm7.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		rightleg8.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg8.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftleg8.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
