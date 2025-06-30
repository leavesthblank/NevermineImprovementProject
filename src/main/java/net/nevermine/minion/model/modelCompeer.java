package net.nevermine.minion.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelCompeer extends ModelBase {
	ModelRenderer Body;
	ModelRenderer Leg_Front_1;
	ModelRenderer Leg_back;
	ModelRenderer Leg_back_2;
	ModelRenderer Leg_Front_2;
	ModelRenderer Head;
	ModelRenderer Back_Bone;

	public modelCompeer() {
		textureWidth = 128;
		textureHeight = 64;
		(Body = new ModelRenderer(this, 0, 0)).addBox(-5.0f, -5.0f, -8.0f, 10, 10, 16);
		Body.setRotationPoint(0.0f, 10.0f, -2.0f);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0.0f, 0.0f, 0.0f);
		(Leg_Front_1 = new ModelRenderer(this, 73, 14)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		Leg_Front_1.setRotationPoint(3.0f, 15.0f, -6.0f);
		Leg_Front_1.setTextureSize(64, 32);
		Leg_Front_1.mirror = true;
		setRotation(Leg_Front_1, 0.0f, 0.0f, 0.0f);
		(Leg_back = new ModelRenderer(this, 73, 0)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		Leg_back.setRotationPoint(3.0f, 15.0f, 3.0f);
		Leg_back.setTextureSize(64, 32);
		Leg_back.mirror = true;
		setRotation(Leg_back, 0.0f, 0.0f, 0.0f);
		(Leg_back_2 = new ModelRenderer(this, 73, 0)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		Leg_back_2.setRotationPoint(-3.0f, 15.0f, 3.0f);
		Leg_back_2.setTextureSize(64, 32);
		Leg_back_2.mirror = true;
		setRotation(Leg_back_2, 0.0f, 0.0f, 0.0f);
		(Leg_Front_2 = new ModelRenderer(this, 73, 14)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		Leg_Front_2.setRotationPoint(-3.0f, 15.0f, -6.0f);
		Leg_Front_2.setTextureSize(64, 32);
		Leg_Front_2.mirror = true;
		setRotation(Leg_Front_2, 0.0f, 0.0f, 0.0f);
		(Head = new ModelRenderer(this, 28, 28)).addBox(-4.0f, -4.0f, -9.0f, 8, 8, 9);
		Head.setRotationPoint(0.0f, 7.0f, -8.0f);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0.0f, 0.0f, 0.0f);
		(Back_Bone = new ModelRenderer(this, 0, 27)).addBox(-1.5f, -3.0f, -1.5f, 3, 3, 10);
		Back_Bone.setRotationPoint(0.0f, 5.0f, -4.0f);
		Back_Bone.setTextureSize(64, 32);
		Back_Bone.mirror = true;
		setRotation(Back_Bone, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Body.render(par7);
		Leg_Front_1.render(par7);
		Leg_back.render(par7);
		Leg_back_2.render(par7);
		Leg_Front_2.render(par7);
		Head.render(par7);
		Back_Bone.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		Head.rotateAngleY = par4 / 57.295776f;
		Head.rotateAngleX = par5 / 54.11268f;
		Leg_Front_1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		Leg_Front_1.rotateAngleY = 0.0f;
		Leg_back.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		Leg_back.rotateAngleY = 0.0f;
		Leg_back_2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		Leg_Front_2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
