package net.nevermine.mob.model.immortallis;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class modelUrv extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer leftleg2;
	ModelRenderer rightleg2;
	ModelRenderer leftarm3;
	ModelRenderer leftarm4;
	ModelRenderer leftarm5;
	ModelRenderer leftarm6;
	ModelRenderer leftarm7;
	ModelRenderer leftarm8;
	ModelRenderer leftarm9;
	ModelRenderer leftarm10;
	ModelRenderer leftarm11;

	public modelUrv() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 9, 8);
		head.setRotationPoint(0.0f, 0.0f, 0.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 0, 24)).addBox(-8.0f, 0.0f, -4.0f, 16, 12, 8);
		body.setRotationPoint(0.0f, 0.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 32, 8)).addBox(-1.0f, -2.0f, -4.0f, 8, 8, 8);
		leftarm.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 40, 53)).addBox(-3.0f, 0.0f, -3.0f, 6, 4, 6);
		rightleg.setRotationPoint(-6.0f, 12.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 40, 53)).addBox(-3.0f, 0.0f, -3.0f, 6, 4, 6);
		leftleg.setRotationPoint(6.0f, 12.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(leftleg2 = new ModelRenderer(this, 0, 45)).addBox(-5.0f, 4.0f, -5.0f, 10, 8, 10);
		leftleg2.setRotationPoint(6.0f, 12.0f, 0.0f);
		leftleg2.setTextureSize(64, 64);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0.0f, 0.0f, 0.0f);
		(rightleg2 = new ModelRenderer(this, 0, 45)).addBox(-5.0f, 4.0f, -5.0f, 10, 8, 10);
		rightleg2.setRotationPoint(-6.0f, 12.0f, 0.0f);
		rightleg2.setTextureSize(64, 64);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0.0f, 0.0f, 0.0f);
		(leftarm3 = new ModelRenderer(this, 12, 17)).addBox(5.5f, 14.5f, -10.0f, 1, 1, 4);
		leftarm3.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm3.setTextureSize(64, 64);
		leftarm3.mirror = true;
		setRotation(leftarm3, 0.0f, 0.0f, 0.0f);
		(leftarm4 = new ModelRenderer(this, 31, 45)).addBox(8.0f, 5.0f, -2.0f, 2, 4, 4);
		leftarm4.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm4.setTextureSize(64, 64);
		leftarm4.mirror = true;
		setRotation(leftarm4, 0.0f, 0.0f, 0.0f);
		(leftarm5 = new ModelRenderer(this, 48, 25)).addBox(4.0f, -3.0f, -2.0f, 4, 20, 4);
		leftarm5.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm5.setTextureSize(64, 64);
		leftarm5.mirror = true;
		setRotation(leftarm5, 0.0f, 0.0f, 0.0f);
		(leftarm6 = new ModelRenderer(this, 31, 45)).addBox(8.0f, -1.0f, -2.0f, 2, 4, 4);
		leftarm6.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm6.setTextureSize(64, 64);
		leftarm6.mirror = true;
		setRotation(leftarm6, 0.0f, 0.0f, 0.0f);
		(leftarm7 = new ModelRenderer(this, 31, 45)).addBox(8.0f, 11.0f, -2.0f, 2, 4, 4);
		leftarm7.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm7.setTextureSize(64, 64);
		leftarm7.mirror = true;
		setRotation(leftarm7, 0.0f, 0.0f, 0.0f);
		(leftarm8 = new ModelRenderer(this, 48, 25)).addBox(10.0f, -3.0f, -2.0f, 4, 20, 4);
		leftarm8.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm8.setTextureSize(64, 64);
		leftarm8.mirror = true;
		setRotation(leftarm8, 0.0f, 0.0f, 0.0f);
		(leftarm9 = new ModelRenderer(this, 0, 17)).addBox(5.0f, 14.0f, -6.0f, 2, 2, 4);
		leftarm9.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm9.setTextureSize(64, 64);
		leftarm9.mirror = true;
		setRotation(leftarm9, 0.0f, 0.0f, 0.0f);
		(leftarm10 = new ModelRenderer(this, 0, 17)).addBox(11.0f, 14.0f, -6.0f, 2, 2, 4);
		leftarm10.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm10.setTextureSize(64, 64);
		leftarm10.mirror = true;
		setRotation(leftarm10, 0.0f, 0.0f, 0.0f);
		(leftarm11 = new ModelRenderer(this, 12, 17)).addBox(11.5f, 14.5f, -10.0f, 1, 1, 4);
		leftarm11.setRotationPoint(9.0f, 2.0f, 0.0f);
		leftarm11.setTextureSize(64, 64);
		leftarm11.mirror = true;
		setRotation(leftarm11, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		GL11.glPushMatrix();
		GL11.glEnable(3042);
		GL11.glBlendFunc(770, 771);
		head.render(par7);
		body.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		leftleg2.render(par7);
		rightleg2.render(par7);
		leftarm3.render(par7);
		leftarm4.render(par7);
		leftarm5.render(par7);
		leftarm6.render(par7);
		leftarm7.render(par7);
		leftarm8.render(par7);
		leftarm9.render(par7);
		leftarm10.render(par7);
		leftarm11.render(par7);
		GL11.glPopMatrix();
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		rightleg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg2.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftleg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
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
		leftarm8.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm8.rotateAngleZ = 0.0f;
		leftarm9.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm9.rotateAngleZ = 0.0f;
		leftarm10.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm10.rotateAngleZ = 0.0f;
		leftarm11.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm11.rotateAngleZ = 0.0f;
	}
}
