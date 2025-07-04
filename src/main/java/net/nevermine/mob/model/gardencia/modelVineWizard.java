package net.nevermine.mob.model.gardencia;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelVineWizard extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer head2;
	ModelRenderer leftarm2;
	ModelRenderer rightarm2;
	ModelRenderer rightarm3;
	ModelRenderer rightarm4;
	ModelRenderer rightarm5;
	ModelRenderer rightarm6;
	ModelRenderer rightarm7;
	ModelRenderer rightarm8;

	public modelVineWizard() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 25, 0)).addBox(-1.5f, -2.0f, -2.0f, 3, 5, 3);
		head.setRotationPoint(0.0f, -3.0f, 0.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 1, 52)).addBox(-4.0f, -10.0f, 3.0f, 8, 10, 1);
		body.setRotationPoint(0.0f, 0.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 40, 51)).addBox(1.0f, -4.0f, -7.0f, 2, 2, 2);
		rightarm.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0.3490659f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 36, 37)).addBox(-1.0f, 6.0f, -2.0f, 4, 8, 4);
		leftarm.setRotationPoint(7.0f, 2.0f, 0.0f);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		rightleg.setRotationPoint(-3.0f, 12.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		leftleg.setRotationPoint(3.0f, 12.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 16, 16)).addBox(-5.0f, 0.0f, -3.0f, 10, 12, 7);
		body2.setRotationPoint(0.0f, 0.0f, 0.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 1, 35)).addBox(-5.0f, -10.0f, -2.0f, 1, 10, 6);
		body3.setRotationPoint(0.0f, 0.0f, 0.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 17, 35)).addBox(4.0f, -10.0f, -2.0f, 1, 10, 6);
		body4.setRotationPoint(0.0f, 0.0f, 0.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -6.0f, -3.0f, 6, 6, 6);
		head2.setRotationPoint(0.0f, -3.0f, 0.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 40, 1)).addBox(-2.0f, -2.0f, -3.0f, 6, 8, 6);
		leftarm2.setRotationPoint(7.0f, 2.0f, 0.0f);
		leftarm2.setTextureSize(64, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 40, 1)).addBox(-4.0f, -2.0f, -3.0f, 6, 8, 6);
		rightarm2.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm2.setTextureSize(64, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 36, 37)).addBox(-3.0f, 6.0f, -2.0f, 4, 8, 4);
		rightarm3.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm3.setTextureSize(64, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.0f, 0.0f, 0.0f);
		(rightarm4 = new ModelRenderer(this, 56, 32)).addBox(-2.0f, -4.0f, -7.0f, 2, 20, 2);
		rightarm4.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm4.setTextureSize(64, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0.3490659f, 0.0f, 0.0f);
		(rightarm5 = new ModelRenderer(this, 40, 56)).addBox(-3.0f, -8.0f, -7.0f, 4, 4, 2);
		rightarm5.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm5.setTextureSize(64, 64);
		rightarm5.mirror = true;
		setRotation(rightarm5, 0.3490659f, 0.0f, 0.0f);
		(rightarm6 = new ModelRenderer(this, 40, 51)).addBox(-5.0f, -4.0f, -7.0f, 2, 2, 2);
		rightarm6.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm6.setTextureSize(64, 64);
		rightarm6.mirror = true;
		setRotation(rightarm6, 0.3490659f, 0.0f, 0.0f);
		(rightarm7 = new ModelRenderer(this, 40, 51)).addBox(1.0f, -10.0f, -7.0f, 2, 2, 2);
		rightarm7.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm7.setTextureSize(64, 64);
		rightarm7.mirror = true;
		setRotation(rightarm7, 0.3490659f, 0.0f, 0.0f);
		(rightarm8 = new ModelRenderer(this, 40, 51)).addBox(-5.0f, -10.0f, -7.0f, 2, 2, 2);
		rightarm8.setRotationPoint(-7.0f, 2.0f, 0.0f);
		rightarm8.setTextureSize(64, 64);
		rightarm8.mirror = true;
		setRotation(rightarm8, 0.3490659f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		head2.render(par7);
		leftarm2.render(par7);
		rightarm2.render(par7);
		rightarm3.render(par7);
		rightarm4.render(par7);
		rightarm5.render(par7);
		rightarm6.render(par7);
		rightarm7.render(par7);
		rightarm8.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head2.rotateAngleY = par4 / (float)(180f / Math.PI);
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		rightarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm3.rotateAngleZ = 0.0f;
		rightarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm4.rotateAngleZ = 0.0f;
		rightarm5.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm5.rotateAngleZ = 0.0f;
		rightarm6.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm6.rotateAngleZ = 0.0f;
		rightarm7.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm7.rotateAngleZ = 0.0f;
		rightarm8.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f + 0.349f;
		rightarm8.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
