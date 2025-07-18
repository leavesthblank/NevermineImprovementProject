package net.nevermine.boss.graw;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelGraw extends ModelBase {
	ModelRenderer Shape1;
	ModelRenderer WingL;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer WingR;
	ModelRenderer WingR2;
	ModelRenderer WingL2;
	ModelRenderer WingR3;
	ModelRenderer WingL3;
	ModelRenderer WingR4;
	ModelRenderer WingL4;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;

	public modelGraw() {
		textureWidth = 256;
		textureHeight = 64;
		(Shape1 = new ModelRenderer(this, 82, 0)).addBox(0.0f, 0.0f, 0.0f, 14, 8, 14);
		Shape1.setRotationPoint(-7.0f, 3.0f, 19.0f);
		Shape1.setTextureSize(256, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0.0f, 0.0f, 0.0f);
		(WingL = new ModelRenderer(this, 196, 10)).addBox(0.0f, 1.0f, 20.0f, 22, 1, 2);
		WingL.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL.setTextureSize(256, 64);
		WingL.mirror = true;
		setRotation(WingL, 0.0f, 0.0f, 0.0f);
		(Shape2 = new ModelRenderer(this, 82, 0)).addBox(0.0f, 0.0f, 0.0f, 14, 8, 14);
		Shape2.setRotationPoint(-7.0f, 3.0f, 2.0f);
		Shape2.setTextureSize(256, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0.0f, 0.0f, 0.0f);
		(Shape3 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		Shape3.setRotationPoint(0.0f, 17.0f, -18.0f);
		Shape3.setTextureSize(256, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0.0f, 0.0f, 0.0f);
		(Shape4 = new ModelRenderer(this, 113, 23)).addBox(0.0f, 0.0f, 0.0f, 14, 7, 14);
		Shape4.setRotationPoint(-6.0f, 11.0f, -14.0f);
		Shape4.setTextureSize(256, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0.0f, 0.0f, 0.0f);
		(Shape5 = new ModelRenderer(this, 0, 39)).addBox(16.0f, 0.0f, 0.0f, 0, 2, 16);
		Shape5.setRotationPoint(-7.0f, 19.0f, -16.0f);
		Shape5.setTextureSize(256, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0.0f, 0.0f, 0.0f);
		(Shape6 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		Shape6.setRotationPoint(-7.0f, 17.0f, -18.0f);
		Shape6.setTextureSize(256, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0.0f, 0.0f, 0.0f);
		(Shape7 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		Shape7.setRotationPoint(7.0f, 17.0f, -18.0f);
		Shape7.setTextureSize(256, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0.0f, 0.0f, 0.0f);
		(Shape8 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 16);
		Shape8.setRotationPoint(-7.0f, 21.0f, -16.0f);
		Shape8.setTextureSize(256, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0.0f, 0.0f, 0.0f);
		(Shape9 = new ModelRenderer(this, 0, 39)).addBox(0.0f, 0.0f, 0.0f, 0, 2, 16);
		Shape9.setRotationPoint(-7.0f, 19.0f, -16.0f);
		Shape9.setTextureSize(256, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0.0f, 0.0f, 0.0f);
		(WingR = new ModelRenderer(this, 196, 10)).addBox(-21.0f, 1.0f, 20.0f, 22, 1, 2);
		WingR.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR.setTextureSize(256, 64);
		WingR.mirror = true;
		setRotation(WingR, 0.0f, 0.0f, 0.0f);
		(WingR2 = new ModelRenderer(this, 159, 21)).addBox(-21.0f, 0.0f, 0.0f, 22, 5, 6);
		WingR2.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR2.setTextureSize(256, 64);
		WingR2.mirror = true;
		setRotation(WingR2, 0.0f, 0.0f, 0.0f);
		(WingL2 = new ModelRenderer(this, 159, 21)).addBox(0.0f, 0.0f, 0.0f, 22, 5, 6);
		WingL2.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL2.setTextureSize(256, 64);
		WingL2.mirror = true;
		setRotation(WingL2, 0.0f, 0.0f, 0.0f);
		(WingR3 = new ModelRenderer(this, 102, 46)).addBox(-21.0f, 2.0f, 6.0f, 22, 1, 16);
		WingR3.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR3.setTextureSize(256, 64);
		WingR3.mirror = true;
		setRotation(WingR3, 0.0f, 0.0f, 0.0f);
		(WingL3 = new ModelRenderer(this, 102, 46)).addBox(0.0f, 2.0f, 6.0f, 22, 1, 16);
		WingL3.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL3.setTextureSize(256, 64);
		WingL3.mirror = true;
		setRotation(WingL3, 0.0f, 0.0f, 0.0f);
		(WingR4 = new ModelRenderer(this, 196, 10)).addBox(-21.0f, 1.0f, 12.0f, 22, 1, 2);
		WingR4.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR4.setTextureSize(256, 64);
		WingR4.mirror = true;
		setRotation(WingR4, 0.0f, 0.0f, 0.0f);
		(WingL4 = new ModelRenderer(this, 196, 10)).addBox(0.0f, 1.0f, 12.0f, 22, 1, 2);
		WingL4.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL4.setTextureSize(256, 64);
		WingL4.mirror = true;
		setRotation(WingL4, 0.0f, 0.0f, 0.0f);
		(Shape10 = new ModelRenderer(this, 175, 34)).addBox(-3.0f, -12.0f, 0.0f, 6, 22, 1);
		Shape10.setRotationPoint(12.0f, 10.0f, 35.0f);
		Shape10.setTextureSize(256, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0.0f, 0.0f, 0.6981317f);
		(Shape11 = new ModelRenderer(this, 202, 35)).addBox(0.0f, 0.0f, 0.0f, 8, 8, 16);
		Shape11.setRotationPoint(6.0f, 14.0f, 31.0f);
		Shape11.setTextureSize(256, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0.0f, 1.047198f, 0.0f);
		(Shape12 = new ModelRenderer(this, 49, 49)).addBox(3.0f, 6.0f, 16.0f, 2, 2, 6);
		Shape12.setRotationPoint(6.0f, 14.0f, 31.0f);
		Shape12.setTextureSize(256, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0.0f, 1.047198f, 0.0f);
		(Shape13 = new ModelRenderer(this, 202, 35)).addBox(0.0f, 0.0f, 0.0f, 8, 8, 16);
		Shape13.setRotationPoint(-10.0f, 14.0f, 24.0f);
		Shape13.setTextureSize(256, 64);
		Shape13.mirror = true;
		setRotation(Shape13, 0.0f, -1.047198f, 0.0f);
		(Shape14 = new ModelRenderer(this, 49, 49)).addBox(6.0f, 6.0f, 16.0f, 2, 2, 6);
		Shape14.setRotationPoint(-10.0f, 14.0f, 24.0f);
		Shape14.setTextureSize(256, 64);
		Shape14.mirror = true;
		setRotation(Shape14, 0.0f, -1.047198f, 0.0f);
		(Shape15 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 20, 12, 35);
		Shape15.setRotationPoint(-10.0f, 11.0f, 0.0f);
		Shape15.setTextureSize(256, 64);
		Shape15.mirror = true;
		setRotation(Shape15, 0.0f, 0.0f, 0.0f);
		(Shape16 = new ModelRenderer(this, 175, 34)).addBox(-3.0f, -12.0f, 0.0f, 6, 22, 1);
		Shape16.setRotationPoint(0.0f, 9.0f, 35.0f);
		Shape16.setTextureSize(256, 64);
		Shape16.mirror = true;
		setRotation(Shape16, 0.0f, 0.0f, 0.0f);
		(Shape17 = new ModelRenderer(this, 175, 34)).addBox(-3.0f, -12.0f, 0.0f, 6, 22, 1);
		Shape17.setRotationPoint(-12.0f, 10.0f, 35.0f);
		Shape17.setTextureSize(256, 64);
		Shape17.mirror = true;
		setRotation(Shape17, 0.0f, 0.0f, -0.6981317f);
		(Shape18 = new ModelRenderer(this, 49, 49)).addBox(6.0f, 6.0f, 16.0f, 2, 2, 6);
		Shape18.setRotationPoint(6.0f, 14.0f, 31.0f);
		Shape18.setTextureSize(256, 64);
		Shape18.mirror = true;
		setRotation(Shape18, 0.0f, 1.047198f, 0.0f);
		(Shape19 = new ModelRenderer(this, 49, 49)).addBox(0.0f, 6.0f, 16.0f, 2, 2, 6);
		Shape19.setRotationPoint(-10.0f, 14.0f, 24.0f);
		Shape19.setTextureSize(256, 64);
		Shape19.mirror = true;
		setRotation(Shape19, 0.0f, -1.047198f, 0.0f);
		(Shape20 = new ModelRenderer(this, 49, 49)).addBox(0.0f, 6.0f, 16.0f, 2, 2, 6);
		Shape20.setRotationPoint(6.0f, 14.0f, 31.0f);
		Shape20.setTextureSize(256, 64);
		Shape20.mirror = true;
		setRotation(Shape20, 0.0f, 1.047198f, 0.0f);
		(Shape21 = new ModelRenderer(this, 49, 49)).addBox(3.0f, 6.0f, 16.0f, 2, 2, 6);
		Shape21.setRotationPoint(-10.0f, 14.0f, 24.0f);
		Shape21.setTextureSize(256, 64);
		Shape21.mirror = true;
		setRotation(Shape21, 0.0f, -1.047198f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Shape1.render(par7);
		WingL.render(par7);
		Shape2.render(par7);
		Shape3.render(par7);
		Shape4.render(par7);
		Shape5.render(par7);
		Shape6.render(par7);
		Shape7.render(par7);
		Shape8.render(par7);
		Shape9.render(par7);
		WingR.render(par7);
		WingR2.render(par7);
		WingL2.render(par7);
		WingR3.render(par7);
		WingL3.render(par7);
		WingR4.render(par7);
		WingL4.render(par7);
		Shape10.render(par7);
		Shape11.render(par7);
		Shape12.render(par7);
		Shape13.render(par7);
		Shape14.render(par7);
		Shape15.render(par7);
		Shape16.render(par7);
		Shape17.render(par7);
		Shape18.render(par7);
		Shape19.render(par7);
		Shape20.render(par7);
		Shape21.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		WingR.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL.rotateAngleZ = -WingR.rotateAngleZ;
		WingR2.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL2.rotateAngleZ = -WingR.rotateAngleZ;
		WingR3.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL3.rotateAngleZ = -WingR.rotateAngleZ;
		WingR4.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL4.rotateAngleZ = -WingR.rotateAngleZ;
	}
}
