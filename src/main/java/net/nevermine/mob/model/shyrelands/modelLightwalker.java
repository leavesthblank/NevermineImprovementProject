package net.nevermine.mob.model.shyrelands;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelLightwalker extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;

	public modelLightwalker() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
		head.setRotationPoint(0.0F, 13.0F, 0.0F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0F, 0.0F, 0.0F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6);
		body.setRotationPoint(4.0F, -1.0F, 0.0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0F, 0.0F, 0.0F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		rightleg.setRotationPoint(-6.0F, 12.0F, 0.0F);
		rightleg.setTextureSize(64, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0F, 0.0F, 0.0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
		leftleg.setRotationPoint(6.0F, 12.0F, 0.0F);
		leftleg.setTextureSize(64, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0F, 0.0F, 0.0F);
		body2 = new ModelRenderer(this, 16, 16);
		body2.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6);
		body2.setRotationPoint(-4.0F, -1.0F, 0.0F);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0.0F, 0.0F, 0.0F);
		body3 = new ModelRenderer(this, 16, 16);
		body3.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6);
		body3.setRotationPoint(7.0F, 6.0F, 0.0F);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 0.0F, 0.0F, 0.0F);
		body4 = new ModelRenderer(this, 16, 16);
		body4.addBox(-3.0F, 0.0F, -3.0F, 6, 6, 6);
		body4.setRotationPoint(-7.0F, 6.0F, 0.0F);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 0.0F, 0.0F, 0.0F);
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		rightleg.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
		rightleg.rotateAngleY = 0.0F;

		leftleg.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
	}
}
