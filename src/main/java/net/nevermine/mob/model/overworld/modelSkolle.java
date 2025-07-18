package net.nevermine.mob.model.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelSkolle extends ModelBase {
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer head;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer head6;
	ModelRenderer head7;
	ModelRenderer rightarm2;
	ModelRenderer leftarm2;
	ModelRenderer head8;
	ModelRenderer head9;
	ModelRenderer head10;
	ModelRenderer head11;
	ModelRenderer head12;
	ModelRenderer head13;
	ModelRenderer head14;
	ModelRenderer head15;

	public modelSkolle() {
		textureWidth = 64;
		textureHeight = 32;
		(body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 8, 4);
		body.setRotationPoint(0.0f, 10.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 32, 0)).addBox(-3.0f, 4.0f, -2.0f, 3, 6, 3);
		rightarm.setRotationPoint(-5.0f, 12.0f, 0.0f);
		rightarm.setTextureSize(64, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 32, 0)).addBox(0.0f, 4.0f, -2.0f, 3, 6, 3);
		leftarm.setRotationPoint(5.0f, 12.0f, 0.0f);
		leftarm.setTextureSize(64, 32);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		rightleg.setRotationPoint(-2.0f, 18.0f, 0.0f);
		rightleg.setTextureSize(64, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leftleg.setRotationPoint(2.0f, 18.0f, 0.0f);
		leftleg.setTextureSize(64, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 45, 0)).addBox(-1.0f, -5.0f, -5.0f, 2, 1, 1);
		head.setRotationPoint(0.0f, 10.0f, 0.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 33, 10)).addBox(2.0f, -4.0f, -5.0f, 2, 1, 1);
		head2.setRotationPoint(0.0f, 10.0f, 0.0f);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 45, 8)).addBox(4.0f, -7.0f, -2.0f, 5, 3, 3);
		head3.setRotationPoint(0.0f, 10.0f, 0.0f);
		head3.setTextureSize(64, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 45, 0)).addBox(-4.0f, -8.0f, -5.0f, 8, 2, 1);
		head4.setRotationPoint(0.0f, 10.0f, 0.0f);
		head4.setTextureSize(64, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 33, 10)).addBox(-2.0f, -4.0f, -5.0f, 4, 2, 1);
		head5.setRotationPoint(0.0f, 10.0f, 0.0f);
		head5.setTextureSize(64, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 33, 10)).addBox(-4.0f, -4.0f, -5.0f, 2, 1, 1);
		head6.setRotationPoint(0.0f, 10.0f, 0.0f);
		head6.setTextureSize(64, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 45, 0)).addBox(-2.0f, -6.0f, -5.0f, 4, 1, 1);
		head7.setRotationPoint(0.0f, 10.0f, 0.0f);
		head7.setTextureSize(64, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 6, 4);
		rightarm2.setRotationPoint(-5.0f, 12.0f, 0.0f);
		rightarm2.setTextureSize(64, 32);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 6, 4);
		leftarm2.setRotationPoint(5.0f, 12.0f, 0.0f);
		leftarm2.setTextureSize(64, 32);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 40, 27)).addBox(-4.0f, -9.0f, 0.0f, 8, 1, 4);
		head8.setRotationPoint(0.0f, 10.0f, 0.0f);
		head8.setTextureSize(64, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 45, 8)).addBox(-9.0f, -7.0f, -2.0f, 5, 3, 3);
		head9.setRotationPoint(0.0f, 10.0f, 0.0f);
		head9.setTextureSize(64, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head10.setRotationPoint(0.0f, 10.0f, 0.0f);
		head10.setTextureSize(64, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 42, 26)).addBox(4.0f, -8.0f, 0.0f, 1, 1, 4);
		head11.setRotationPoint(0.0f, 10.0f, 0.0f);
		head11.setTextureSize(64, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 40, 27)).addBox(-4.0f, -9.0f, -4.0f, 8, 1, 4);
		head12.setRotationPoint(0.0f, 10.0f, 0.0f);
		head12.setTextureSize(64, 32);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 42, 26)).addBox(-5.0f, -8.0f, 0.0f, 1, 1, 4);
		head13.setRotationPoint(0.0f, 10.0f, 0.0f);
		head13.setTextureSize(64, 32);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 42, 26)).addBox(4.0f, -8.0f, -5.0f, 1, 1, 5);
		head14.setRotationPoint(0.0f, 10.0f, 0.0f);
		head14.setTextureSize(64, 32);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 42, 26)).addBox(-5.0f, -8.0f, -5.0f, 1, 1, 5);
		head15.setRotationPoint(0.0f, 10.0f, 0.0f);
		head15.setTextureSize(64, 32);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		head.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		rightarm2.render(par7);
		leftarm2.render(par7);
		head8.render(par7);
		head9.render(par7);
		head10.render(par7);
		head11.render(par7);
		head12.render(par7);
		head13.render(par7);
		head14.render(par7);
		head15.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 54.11268f;
		head3.rotateAngleY = par4 / 57.295776f;
		head3.rotateAngleX = par5 / 54.11268f;
		head4.rotateAngleY = par4 / 57.295776f;
		head4.rotateAngleX = par5 / 54.11268f;
		head5.rotateAngleY = par4 / 57.295776f;
		head5.rotateAngleX = par5 / 54.11268f;
		head6.rotateAngleY = par4 / 57.295776f;
		head6.rotateAngleX = par5 / 54.11268f;
		head7.rotateAngleY = par4 / 57.295776f;
		head7.rotateAngleX = par5 / 54.11268f;
		head8.rotateAngleY = par4 / 57.295776f;
		head8.rotateAngleX = par5 / 54.11268f;
		head9.rotateAngleY = par4 / 57.295776f;
		head9.rotateAngleX = par5 / 54.11268f;
		head10.rotateAngleY = par4 / 57.295776f;
		head10.rotateAngleX = par5 / 54.11268f;
		head11.rotateAngleY = par4 / 57.295776f;
		head11.rotateAngleX = par5 / 54.11268f;
		head12.rotateAngleY = par4 / 57.295776f;
		head12.rotateAngleX = par5 / 54.11268f;
		head13.rotateAngleY = par4 / 57.295776f;
		head13.rotateAngleX = par5 / 54.11268f;
		head14.rotateAngleY = par4 / 57.295776f;
		head14.rotateAngleX = par5 / 54.11268f;
		head15.rotateAngleY = par4 / 57.295776f;
		head15.rotateAngleX = par5 / 54.11268f;
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
