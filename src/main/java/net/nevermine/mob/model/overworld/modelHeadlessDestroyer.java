package net.nevermine.mob.model.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelHeadlessDestroyer extends ModelBase {
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer rightarm2;
	ModelRenderer rightarm3p4;
	ModelRenderer rightarm4p4;
	ModelRenderer rightarm5p4;
	ModelRenderer rightarm6p4;
	ModelRenderer rightarm7p4;
	ModelRenderer rightarm8p4;
	ModelRenderer body;
	ModelRenderer leftarm2;
	ModelRenderer rightarm9;
	ModelRenderer rightarm3;
	ModelRenderer rightarm4;
	ModelRenderer rightarmX;
	ModelRenderer rightarm5;
	ModelRenderer rightarm6;
	ModelRenderer rightarm7;
	ModelRenderer rightarm8;
	ModelRenderer rightarm3p2;
	ModelRenderer rightarm4p2;
	ModelRenderer rightarmp2;
	ModelRenderer rightarm5p2;
	ModelRenderer rightarm6p2;
	ModelRenderer rightarm7p2;
	ModelRenderer rightarm8p2;
	ModelRenderer rightarm3p3;
	ModelRenderer rightarm4p3;
	ModelRenderer rightarmp3;
	ModelRenderer rightarm5p3;
	ModelRenderer rightarm7p3;
	ModelRenderer rightarm8p3;
	ModelRenderer rightarm9p3;
	ModelRenderer rightarm9p4;

	public modelHeadlessDestroyer() {
		textureWidth = 64;
		textureHeight = 64;
		(leftarm = new ModelRenderer(this, 17, 37)).addBox(-2.0f, -5.0f, -4.0f, 7, 7, 8);
		leftarm.setRotationPoint(11.0f, -2.0f, 0.0f);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 2)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		rightleg.setRotationPoint(-6.0f, 12.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 2)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		leftleg.setRotationPoint(6.0f, 12.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 17, 37)).addBox(-5.0f, -5.0f, -4.0f, 7, 7, 8);
		rightarm2.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm2.setTextureSize(64, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(rightarm3p4 = new ModelRenderer(this, 13, 16)).addBox(4.0f, 15.0f, -14.0f, 2, 2, 18);
		rightarm3p4.setRotationPoint(-16.0f, 11.0f, -2.0f);
		rightarm3p4.setTextureSize(64, 64);
		rightarm3p4.mirror = true;
		setRotation(rightarm3p4, 0.0f, 0.0f, -1.570796f);
		(rightarm4p4 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 21.0f, -16.0f, 1, 2, 10);
		rightarm4p4.setRotationPoint(-16.0f, 11.0f, -2.0f);
		rightarm4p4.setTextureSize(64, 64);
		rightarm4p4.mirror = true;
		setRotation(rightarm4p4, 0.0f, 0.0f, -1.570796f);
		(rightarm5p4 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 17.0f, -14.0f, 1, 2, 6);
		rightarm5p4.setRotationPoint(-16.0f, 11.0f, -2.0f);
		rightarm5p4.setTextureSize(64, 64);
		rightarm5p4.mirror = true;
		setRotation(rightarm5p4, 0.0f, 0.0f, -1.570796f);
		(rightarm6p4 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 13.0f, -14.0f, 1, 2, 6);
		rightarm6p4.setRotationPoint(-16.0f, 11.0f, -2.0f);
		rightarm6p4.setTextureSize(64, 64);
		rightarm6p4.mirror = true;
		setRotation(rightarm6p4, 0.0f, 0.0f, -1.570796f);
		(rightarm7p4 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 11.0f, -15.0f, 1, 2, 8);
		rightarm7p4.setRotationPoint(-16.0f, 11.0f, -2.0f);
		rightarm7p4.setTextureSize(64, 64);
		rightarm7p4.mirror = true;
		setRotation(rightarm7p4, 0.0f, 0.0f, -1.570796f);
		(rightarm8p4 = new ModelRenderer(this, 0, 21)).addBox(4.5f, 9.0f, -16.0f, 1, 2, 10);
		rightarm8p4.setRotationPoint(-16.0f, 11.0f, -2.0f);
		rightarm8p4.setTextureSize(64, 64);
		rightarm8p4.mirror = true;
		setRotation(rightarm8p4, 0.0f, 0.0f, -1.570796f);
		(body = new ModelRenderer(this, 14, 37)).addBox(-9.0f, 0.0f, -4.0f, 18, 18, 7);
		body.setRotationPoint(0.0f, -6.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 40, 4)).addBox(-2.0f, -2.0f, -3.0f, 6, 21, 6);
		leftarm2.setRotationPoint(11.0f, -2.0f, 0.0f);
		leftarm2.setTextureSize(64, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(rightarm9 = new ModelRenderer(this, 40, 4)).addBox(-4.0f, -2.0f, -3.0f, 6, 21, 6);
		rightarm9.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm9.setTextureSize(64, 64);
		rightarm9.mirror = true;
		setRotation(rightarm9, 0.0f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 10, 14)).addBox(-2.0f, 15.0f, -14.0f, 2, 2, 20);
		rightarm3.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm3.setTextureSize(64, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.0f, 0.0f, 0.0f);
		(rightarm4 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 21.0f, -16.0f, 1, 2, 10);
		rightarm4.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm4.setTextureSize(64, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0.0f, 0.0f, 0.0f);
		(rightarmX = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 19.0f, -15.0f, 1, 2, 8);
		rightarmX.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarmX.setTextureSize(64, 64);
		rightarmX.mirror = true;
		setRotation(rightarmX, 0.0f, 0.0f, 0.0f);
		(rightarm5 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 17.0f, -14.0f, 1, 2, 6);
		rightarm5.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm5.setTextureSize(64, 64);
		rightarm5.mirror = true;
		setRotation(rightarm5, 0.0f, 0.0f, 0.0f);
		(rightarm6 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 13.0f, -14.0f, 1, 2, 6);
		rightarm6.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm6.setTextureSize(64, 64);
		rightarm6.mirror = true;
		setRotation(rightarm6, 0.0f, 0.0f, 0.0f);
		(rightarm7 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 11.0f, -15.0f, 1, 2, 8);
		rightarm7.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm7.setTextureSize(64, 64);
		rightarm7.mirror = true;
		setRotation(rightarm7, 0.0f, 0.0f, 0.0f);
		(rightarm8 = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 9.0f, -16.0f, 1, 2, 10);
		rightarm8.setRotationPoint(-11.0f, -2.0f, 0.0f);
		rightarm8.setTextureSize(64, 64);
		rightarm8.mirror = true;
		setRotation(rightarm8, 0.0f, 0.0f, 0.0f);
		(rightarm3p2 = new ModelRenderer(this, 10, 14)).addBox(4.0f, 15.0f, -14.0f, 2, 2, 20);
		rightarm3p2.setRotationPoint(7.0f, -2.0f, 0.0f);
		rightarm3p2.setTextureSize(64, 64);
		rightarm3p2.mirror = true;
		setRotation(rightarm3p2, 0.0f, 0.0f, 0.0f);
		(rightarm4p2 = new ModelRenderer(this, 0, 21)).addBox(4.5f, 21.0f, -16.0f, 1, 2, 10);
		rightarm4p2.setRotationPoint(7.0f, -2.0f, 0.0f);
		rightarm4p2.setTextureSize(64, 64);
		rightarm4p2.mirror = true;
		setRotation(rightarm4p2, 0.0f, 0.0f, 0.0f);
		(rightarmp2 = new ModelRenderer(this, 0, 21)).addBox(4.5f, 19.0f, -15.0f, 1, 2, 8);
		rightarmp2.setRotationPoint(7.0f, -2.0f, 0.0f);
		rightarmp2.setTextureSize(64, 64);
		rightarmp2.mirror = true;
		setRotation(rightarmp2, 0.0f, 0.0f, 0.0f);
		(rightarm5p2 = new ModelRenderer(this, 0, 21)).addBox(4.5f, 17.0f, -14.0f, 1, 2, 6);
		rightarm5p2.setRotationPoint(7.0f, -2.0f, 0.0f);
		rightarm5p2.setTextureSize(64, 64);
		rightarm5p2.mirror = true;
		setRotation(rightarm5p2, 0.0f, 0.0f, 0.0f);
		(rightarm6p2 = new ModelRenderer(this, 0, 21)).addBox(4.5f, 13.0f, -14.0f, 1, 2, 6);
		rightarm6p2.setRotationPoint(7.0f, -2.0f, 0.0f);
		rightarm6p2.setTextureSize(64, 64);
		rightarm6p2.mirror = true;
		setRotation(rightarm6p2, 0.0f, 0.0f, 0.0f);
		(rightarm7p2 = new ModelRenderer(this, 0, 21)).addBox(4.5f, 11.0f, -15.0f, 1, 2, 8);
		rightarm7p2.setRotationPoint(7.0f, -2.0f, 0.0f);
		rightarm7p2.setTextureSize(64, 64);
		rightarm7p2.mirror = true;
		setRotation(rightarm7p2, 0.0f, 0.0f, 0.0f);
		(rightarm8p2 = new ModelRenderer(this, 0, 21)).addBox(4.5f, 9.0f, -16.0f, 1, 2, 10);
		rightarm8p2.setRotationPoint(7.0f, -2.0f, 0.0f);
		rightarm8p2.setTextureSize(64, 64);
		rightarm8p2.mirror = true;
		setRotation(rightarm8p2, 0.0f, 0.0f, 0.0f);
		(rightarm3p3 = new ModelRenderer(this, 12, 16)).addBox(4.0f, 15.0f, -14.0f, 2, 2, 18);
		rightarm3p3.setRotationPoint(-16.0f, 5.0f, -2.0f);
		rightarm3p3.setTextureSize(64, 64);
		rightarm3p3.mirror = true;
		setRotation(rightarm3p3, 0.0f, 0.0f, -1.570796f);
		(rightarm4p3 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 21.0f, -16.0f, 1, 2, 10);
		rightarm4p3.setRotationPoint(-16.0f, 5.0f, -2.0f);
		rightarm4p3.setTextureSize(64, 64);
		rightarm4p3.mirror = true;
		setRotation(rightarm4p3, 0.0f, 0.0f, -1.570796f);
		(rightarmp3 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 19.0f, -15.0f, 1, 2, 8);
		rightarmp3.setRotationPoint(-16.0f, 5.0f, -2.0f);
		rightarmp3.setTextureSize(64, 64);
		rightarmp3.mirror = true;
		setRotation(rightarmp3, 0.0f, 0.0f, -1.570796f);
		(rightarm5p3 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 17.0f, -14.0f, 1, 2, 6);
		rightarm5p3.setRotationPoint(-16.0f, 5.0f, -2.0f);
		rightarm5p3.setTextureSize(64, 64);
		rightarm5p3.mirror = true;
		setRotation(rightarm5p3, 0.0f, 0.0f, -1.570796f);
		(rightarm7p3 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 11.0f, -15.0f, 1, 2, 8);
		rightarm7p3.setRotationPoint(-16.0f, 5.0f, -2.0f);
		rightarm7p3.setTextureSize(64, 64);
		rightarm7p3.mirror = true;
		setRotation(rightarm7p3, 0.0f, 0.0f, -1.570796f);
		(rightarm8p3 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 9.0f, -16.0f, 1, 2, 10);
		rightarm8p3.setRotationPoint(-16.0f, 5.0f, -2.0f);
		rightarm8p3.setTextureSize(64, 64);
		rightarm8p3.mirror = true;
		setRotation(rightarm8p3, 0.0f, 0.0f, -1.570796f);
		(rightarm9p3 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 11.0f, -15.0f, 1, 2, 8);
		rightarm9p3.setRotationPoint(-8.0f, 11.0f, -2.0f);
		rightarm9p3.setTextureSize(64, 64);
		rightarm9p3.mirror = true;
		setRotation(rightarm9p3, 0.0f, 0.0f, -1.570796f);
		(rightarm9p4 = new ModelRenderer(this, -1, 21)).addBox(4.5f, 13.0f, -14.0f, 1, 2, 6);
		rightarm9p4.setRotationPoint(-16.0f, 5.0f, -2.0f);
		rightarm9p4.setTextureSize(64, 64);
		rightarm9p4.mirror = true;
		setRotation(rightarm9p4, 0.0f, 0.0f, -1.570796f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		rightarm2.render(par7);
		rightarm3p4.render(par7);
		rightarm4p4.render(par7);
		rightarm5p4.render(par7);
		rightarm6p4.render(par7);
		rightarm7p4.render(par7);
		rightarm8p4.render(par7);
		body.render(par7);
		leftarm2.render(par7);
		rightarm9.render(par7);
		rightarm3.render(par7);
		rightarm4.render(par7);
		rightarmX.render(par7);
		rightarm5.render(par7);
		rightarm6.render(par7);
		rightarm7.render(par7);
		rightarm8.render(par7);
		rightarm3p2.render(par7);
		rightarm4p2.render(par7);
		rightarmp2.render(par7);
		rightarm5p2.render(par7);
		rightarm6p2.render(par7);
		rightarm7p2.render(par7);
		rightarm8p2.render(par7);
		rightarm3p3.render(par7);
		rightarm4p3.render(par7);
		rightarmp3.render(par7);
		rightarm5p3.render(par7);
		rightarm7p3.render(par7);
		rightarm8p3.render(par7);
		rightarm9p3.render(par7);
		rightarm9p4.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
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
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		rightarmp2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		rightarmp2.rotateAngleZ = 0.0f;
		rightarm3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		rightarm3p2.rotateAngleZ = 0.0f;
		rightarm4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		rightarm4p2.rotateAngleZ = 0.0f;
		rightarm5p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		rightarm5p2.rotateAngleZ = 0.0f;
		rightarm6p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		rightarm6p2.rotateAngleZ = 0.0f;
		rightarm7p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		rightarm7p2.rotateAngleZ = 0.0f;
		rightarm8p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		rightarm8p2.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
