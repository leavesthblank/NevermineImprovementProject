package net.nevermine.mob.model.deeplands;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelCaseConstruct extends ModelBase {
	ModelRenderer Case2;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer R1;
	ModelRenderer Case;

	public modelCaseConstruct() {
		textureWidth = 64;
		textureHeight = 64;
		(Case2 = new ModelRenderer(this, 24, 13)).addBox(-6.0f, -1.0f, -4.0f, 12, 1, 8);
		Case2.setRotationPoint(0.0f, -5.0f, 0.0f);
		Case2.setTextureSize(64, 64);
		Case2.mirror = true;
		setRotation(Case2, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 6, 10, 6);
		rightleg.setRotationPoint(-4.0f, 14.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 6, 10, 6);
		leftleg.setRotationPoint(4.0f, 14.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -4.0f, 8, 4, 8);
		head.setRotationPoint(0.0f, -6.0f, 0.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 24, 22)).addBox(-6.0f, -4.0f, -4.0f, 12, 2, 8);
		body.setRotationPoint(0.0f, 16.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(R1 = new ModelRenderer(this, 24, 13)).addBox(-6.0f, -1.0f, -4.0f, 12, 1, 8);
		R1.setRotationPoint(0.0f, -4.0f, 0.0f);
		R1.setTextureSize(64, 64);
		R1.mirror = true;
		setRotation(R1, 0.0f, 0.0f, 0.0f);
		(Case = new ModelRenderer(this, 0, 32)).addBox(-8.0f, -8.0f, -8.0f, 16, 16, 16);
		Case.setRotationPoint(0.0f, 4.0f, 0.0f);
		Case.setTextureSize(64, 64);
		Case.mirror = true;
		setRotation(Case, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Case2.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		head.render(par7);
		body.render(par7);
		R1.render(par7);
		Case.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		R1.rotateAngleY = par3 * 0.067f * 1.25f;
		Case.rotateAngleY = par3 * -0.067f * 1.25f;
		Case2.rotateAngleY = par3 * -0.067f * 1.25f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
