package net.nevermine.mob.model.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelChimera extends ModelBase {
	ModelRenderer Head1;
	ModelRenderer Body1;
	ModelRenderer Mane;
	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Leg3;
	ModelRenderer Leg4;
	ModelRenderer Tail1;
	ModelRenderer Ear1;
	ModelRenderer Ear2;
	ModelRenderer Nose1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tail4;
	ModelRenderer Tail5;
	ModelRenderer Tail6;
	ModelRenderer Tail7;
	ModelRenderer Head2;
	ModelRenderer Nose2;
	ModelRenderer Ear3;
	ModelRenderer Ear4;
	ModelRenderer Body2;
	ModelRenderer Body3;

	public modelChimera() {
		textureWidth = 64;
		textureHeight = 32;
		(Head1 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -2.0f, 6, 6, 4);
		Head1.setRotationPoint(-1.0f, -2.0f, 0.0f);
		Head1.setTextureSize(64, 32);
		Head1.mirror = true;
		setRotation(Head1, 0.0f, 0.0f, 0.0f);
		(Body1 = new ModelRenderer(this, 50, 17)).addBox(2.0f, 0.0f, -1.0f, 1, 9, 6);
		Body1.setRotationPoint(0.0f, 14.0f, 2.0f);
		Body1.setTextureSize(64, 32);
		Body1.mirror = true;
		setRotation(Body1, 1.570796f, 0.0f, 0.0f);
		(Mane = new ModelRenderer(this, 21, 0)).addBox(-4.0f, -3.0f, -3.0f, 8, 6, 7);
		Mane.setRotationPoint(-1.0f, 14.0f, -3.0f);
		Mane.setTextureSize(64, 32);
		Mane.mirror = true;
		setRotation(Mane, 1.570796f, 0.0f, 0.0f);
		(Leg1 = new ModelRenderer(this, 39, 14)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		Leg1.setRotationPoint(-3.5f, 16.0f, 7.0f);
		Leg1.setTextureSize(64, 32);
		Leg1.mirror = true;
		setRotation(Leg1, 0.0f, 0.0f, 0.0f);
		(Leg2 = new ModelRenderer(this, 39, 14)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		Leg2.setRotationPoint(2.5f, 16.0f, 7.0f);
		Leg2.setTextureSize(64, 32);
		Leg2.mirror = true;
		setRotation(Leg2, 0.0f, 0.0f, 0.0f);
		(Leg3 = new ModelRenderer(this, 39, 14)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		Leg3.setRotationPoint(-5.5f, 16.0f, -4.0f);
		Leg3.setTextureSize(64, 32);
		Leg3.mirror = true;
		setRotation(Leg3, 0.0f, 0.0f, 0.0f);
		(Leg4 = new ModelRenderer(this, 39, 14)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		Leg4.setRotationPoint(3.5f, 16.0f, -4.0f);
		Leg4.setTextureSize(64, 32);
		Leg4.mirror = true;
		setRotation(Leg4, 0.0f, 0.0f, 0.0f);
		(Tail1 = new ModelRenderer(this, 26, 14)).addBox(-1.0f, -3.0f, -17.0f, 2, 6, 2);
		Tail1.setRotationPoint(-1.0f, 13.0f, 8.0f);
		Tail1.setTextureSize(64, 32);
		Tail1.mirror = true;
		setRotation(Tail1, -1.546791f, 0.0f, 0.0f);
		(Ear1 = new ModelRenderer(this, 55, 1)).addBox(-6.0f, -4.0f, 0.0f, 3, 8, 1);
		Ear1.setRotationPoint(-1.0f, -2.0f, 0.0f);
		Ear1.setTextureSize(64, 32);
		Ear1.mirror = true;
		setRotation(Ear1, 0.0f, 0.0f, 0.0f);
		(Ear2 = new ModelRenderer(this, 55, 1)).addBox(3.0f, -4.0f, 0.0f, 3, 8, 1);
		Ear2.setRotationPoint(-1.0f, -2.0f, 0.0f);
		Ear2.setTextureSize(64, 32);
		Ear2.mirror = true;
		setRotation(Ear2, 0.0f, 0.0f, 0.0f);
		(Nose1 = new ModelRenderer(this, 0, 10)).addBox(-2.0f, 0.0f, -3.0f, 3, 3, 1);
		Nose1.setRotationPoint(-0.5f, -2.0f, 0.0f);
		Nose1.setTextureSize(64, 32);
		Nose1.mirror = true;
		setRotation(Nose1, 0.0f, 0.0f, 0.0f);
		(Tail2 = new ModelRenderer(this, 33, 24)).addBox(-2.0f, -4.0f, -18.0f, 4, 4, 4);
		Tail2.setRotationPoint(-1.0f, 13.0f, 8.0f);
		Tail2.setTextureSize(64, 32);
		Tail2.mirror = true;
		setRotation(Tail2, -1.13622f, 0.0f, 0.0f);
		(Tail3 = new ModelRenderer(this, 33, 24)).addBox(-2.0f, 1.0f, -2.0f, 4, 4, 4);
		Tail3.setRotationPoint(-1.0f, 13.0f, 8.0f);
		Tail3.setTextureSize(64, 32);
		Tail3.mirror = true;
		setRotation(Tail3, 2.133892f, 0.0f, 0.0f);
		(Tail4 = new ModelRenderer(this, 26, 14)).addBox(-1.0f, 4.0f, -4.0f, 2, 6, 2);
		Tail4.setRotationPoint(-1.0f, 13.0f, 8.0f);
		Tail4.setTextureSize(64, 32);
		Tail4.mirror = true;
		setRotation(Tail4, 2.72875f, 0.0f, 0.0f);
		(Tail5 = new ModelRenderer(this, 33, 24)).addBox(-2.0f, 7.0f, -8.0f, 4, 4, 4);
		Tail5.setRotationPoint(-1.0f, 13.0f, 8.0f);
		Tail5.setTextureSize(64, 32);
		Tail5.mirror = true;
		setRotation(Tail5, 3.141593f, 0.0f, 0.0f);
		(Tail6 = new ModelRenderer(this, 26, 14)).addBox(-1.0f, 5.0f, -12.0f, 2, 6, 2);
		Tail6.setRotationPoint(-1.0f, 13.0f, 8.0f);
		Tail6.setTextureSize(64, 32);
		Tail6.mirror = true;
		setRotation(Tail6, -2.62497f, 0.0f, 0.0f);
		(Tail7 = new ModelRenderer(this, 33, 24)).addBox(-2.0f, 1.0f, -17.0f, 4, 4, 4);
		Tail7.setRotationPoint(-1.0f, 13.0f, 8.0f);
		Tail7.setTextureSize(64, 32);
		Tail7.mirror = true;
		setRotation(Tail7, -1.951877f, 0.0f, 0.0f);
		(Head2 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -2.0f, 6, 6, 4);
		Head2.setRotationPoint(-1.0f, 13.5f, -7.0f);
		Head2.setTextureSize(64, 32);
		Head2.mirror = true;
		setRotation(Head2, 0.0f, 0.0f, 0.0f);
		(Nose2 = new ModelRenderer(this, 0, 10)).addBox(-2.0f, 0.0f, -3.0f, 3, 3, 1);
		Nose2.setRotationPoint(-0.5f, 13.5f, -7.0f);
		Nose2.setTextureSize(64, 32);
		Nose2.mirror = true;
		setRotation(Nose2, 0.0f, 0.0f, 0.0f);
		(Ear3 = new ModelRenderer(this, 55, 1)).addBox(-6.0f, -4.0f, 0.0f, 3, 8, 1);
		Ear3.setRotationPoint(-1.0f, 13.5f, -7.0f);
		Ear3.setTextureSize(64, 32);
		Ear3.mirror = true;
		setRotation(Ear3, 0.0f, 0.0f, 0.0f);
		(Ear4 = new ModelRenderer(this, 55, 1)).addBox(3.0f, -4.0f, 0.0f, 3, 8, 1);
		Ear4.setRotationPoint(-1.0f, 13.5f, -7.0f);
		Ear4.setTextureSize(64, 32);
		Ear4.mirror = true;
		setRotation(Ear4, 0.0f, 0.0f, 0.0f);
		(Body2 = new ModelRenderer(this, 0, 16)).addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
		Body2.setRotationPoint(0.0f, 14.0f, 2.0f);
		Body2.setTextureSize(64, 32);
		Body2.mirror = true;
		setRotation(Body2, 1.570796f, 0.0f, 0.0f);
		(Body3 = new ModelRenderer(this, 50, 17)).addBox(-5.0f, 0.0f, -1.0f, 1, 9, 6);
		Body3.setRotationPoint(0.0f, 14.0f, 2.0f);
		Body3.setTextureSize(64, 32);
		Body3.mirror = true;
		setRotation(Body3, 1.570796f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Head1.render(par7);
		Body1.render(par7);
		Mane.render(par7);
		Leg1.render(par7);
		Leg2.render(par7);
		Leg3.render(par7);
		Leg4.render(par7);
		Tail1.render(par7);
		Ear1.render(par7);
		Ear2.render(par7);
		Nose1.render(par7);
		Tail2.render(par7);
		Tail3.render(par7);
		Tail4.render(par7);
		Tail5.render(par7);
		Tail6.render(par7);
		Tail7.render(par7);
		Head2.render(par7);
		Nose2.render(par7);
		Ear3.render(par7);
		Ear4.render(par7);
		Body2.render(par7);
		Body3.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		Head1.rotateAngleX = par5 / 28.647888f;
		Head2.rotateAngleX = par5 / 28.647888f;
		Nose1.rotateAngleX = par5 / 28.647888f;
		Nose2.rotateAngleX = par5 / 28.647888f;
		Ear1.rotateAngleX = par5 / 28.647888f;
		Ear2.rotateAngleX = par5 / 28.647888f;
		Ear3.rotateAngleX = par5 / 28.647888f;
		Ear4.rotateAngleX = par5 / 28.647888f;
		Leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		Leg1.rotateAngleY = 0.0f;
		Leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		Leg3.rotateAngleY = 0.0f;
		Leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		Leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
