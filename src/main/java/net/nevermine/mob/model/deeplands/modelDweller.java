package net.nevermine.mob.model.deeplands;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelDweller extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer head2;

	public modelDweller() {
		textureWidth = 64;
		textureHeight = 32;
		(head = new ModelRenderer(this, 0, 0)).addBox(-8.0f, -4.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(13.0f, -10.0f, 0.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 16, 24)).addBox(-4.0f, 0.0f, -2.0f, 10, 3, 4);
		body.setRotationPoint(-1.0f, -11.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		rightleg.setRotationPoint(-3.0f, 18.0f, 0.0f);
		rightleg.setTextureSize(64, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leftleg.setRotationPoint(3.0f, 18.0f, 0.0f);
		leftleg.setTextureSize(64, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 48, 5)).addBox(-4.0f, 0.0f, -2.0f, 4, 23, 4);
		body2.setRotationPoint(2.0f, -8.0f, 0.0f);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 10, 3, 4);
		body3.setRotationPoint(-1.0f, 15.0f, 0.0f);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-8.0f, -4.0f, -4.0f, 8, 8, 8);
		head2.setRotationPoint(-5.0f, -10.0f, 0.0f);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
		head2.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
