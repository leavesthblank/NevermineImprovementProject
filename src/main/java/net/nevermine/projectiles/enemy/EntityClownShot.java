package net.nevermine.projectiles.enemy;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.nevermine.fx.trail.CyanTrail;
import net.nevermine.fx.trail.GreenTrail;
import net.nevermine.fx.trail.RedTrail;

public class EntityClownShot extends EntityThrowable {
	private float damage;
	private int clr;
	private int age;

	public EntityClownShot(final World par1World) {
		super(par1World);
		age = 0;
	}

	public EntityClownShot(final World par1World, final EntityMob entityGoblin, final float dmg, final int color) {
		super(par1World, entityGoblin);
		age = 0;
		clr = color;
		damage = 4.0f;
	}

	public EntityClownShot(final World par1World, final double par2, final double par4, final double par6) {
		super(par1World, par2, par4, par6);
		age = 0;
	}

	protected float getGravityVelocity() {
		return 0.075f;
	}

	protected void onImpact(final MovingObjectPosition movingobjectposition) {
		if (movingobjectposition.entityHit instanceof EntityLivingBase) {
			movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), damage);
		}
		if (!worldObj.isRemote) {
			setDead();
		}
	}

	public void onUpdate() {
		super.onUpdate();
		if (age == 40) {
			if (!worldObj.isRemote) {
				setDead();
			}
		}
		else {
			++age;
		}
	}

	@SideOnly(Side.CLIENT)
	public void onEntityUpdate() {
		super.onEntityUpdate();
		for (int var3 = 0; var3 < 8; ++var3) {
			final CyanTrail var4 = new CyanTrail(worldObj, posX, posY, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var4);
			final GreenTrail var5 = new GreenTrail(worldObj, posX, posY - 0.25, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var5);
			final RedTrail var6 = new RedTrail(worldObj, posX, posY + 0.25, posZ, 0.0, 0.0, 0.0, 5);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var6);
		}
	}
}
