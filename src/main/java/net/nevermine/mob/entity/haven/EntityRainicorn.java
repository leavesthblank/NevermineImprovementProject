package net.nevermine.mob.entity.haven;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.fx.trail.*;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityRainicorn extends EntityMob {
	public EntityRainicorn(final World par1World) {
		super(par1World);
		setSize(1.4f, 1.6f);
	}

	protected String getLivingSound() {
		return "nevermine:RainicornLiving";
	}

	protected String getDeathSound() {
		return "nevermine:RainicornDeath";
	}

	protected String getHurtSound() {
		return "nevermine:RainicornHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

    public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 32.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsHaven, rand.nextInt(8));
        if (rand.nextInt(40) == 0) {
            dropItem(Itemizer.VoliantHeart, 1);
        }
        if (rand.nextInt(40) == 0) {
            dropItem(Itemizer.HeavyBoulder, 1);
        }
        if (rand.nextInt(200) == 35) {
            dropItem(Itemizer.UpgradeKitLight, 1);
        }
		if (rand.nextInt(30) == 23) {
			dropItem(Weaponizer.ColorCannon, 1);
		}
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0);
	}

	public float getAIMoveSpeed() {
		return 2.3f;
	}

	public void moveEntityWithHeading(final float par1, final float par2) {
		if (isInWater()) {
			final double d0 = posY;
			moveFlying(par1, par2, 0.52f);
			moveEntity(motionX, motionY, motionZ);
			motionX *= 0.800000011920929;
			motionY *= 0.800000011920929;
			motionZ *= 0.800000011920929;
			motionY -= 0.02;
			if (isCollidedHorizontally && isOffsetPositionInLiquid(motionX, motionY + 0.6000000238418579 - posY + d0, motionZ)) {
				motionY = 0.30000001192092896;
			}
		}
		else if (handleLavaMovement()) {
			final double d0 = posY;
			moveFlying(par1, par2, 0.02f);
			moveEntity(motionX, motionY, motionZ);
			motionX *= 0.5;
			motionY *= 0.5;
			motionZ *= 0.5;
			motionY -= 0.02;
			if (isCollidedHorizontally && isOffsetPositionInLiquid(motionX, motionY + 0.6000000238418579 - posY + d0, motionZ)) {
				motionY = 0.30000001192092896;
			}
		}
		else {
			float f2 = 0.91f;
			final float f3 = 0.16277136f / (f2 * f2 * f2);
			float f4;
			if (onGround) {
				f4 = getAIMoveSpeed() * f3;
			}
			else {
				f4 = jumpMovementFactor;
			}
			moveFlying(par1, par2, f4);
			f2 = 0.91f;
			if (isOnLadder()) {
				final float f5 = 0.15f;
				if (motionX < -f5) {
					motionX = -f5;
				}
				if (motionX > f5) {
					motionX = f5;
				}
				if (motionZ < -f5) {
					motionZ = -f5;
				}
				if (motionZ > f5) {
					motionZ = f5;
				}
				fallDistance = 0.0f;
				if (motionY < -0.15) {
					motionY = -0.15;
				}
			}
			moveEntity(motionX, motionY, motionZ);
			if (isCollidedHorizontally && isOnLadder()) {
				motionY = 0.2;
			}
			if (worldObj.isRemote && (!worldObj.blockExists((int)posX, 0, (int)posZ) || !worldObj.getChunkFromBlockCoords((int)posX, (int)posZ).isChunkLoaded)) {
				if (posY > 0.0) {
					motionY = -0.1;
				}
				else {
					motionY = 0.0;
				}
			}
			else {
				motionY -= 0.08;
			}
			motionY *= 0.9800000190734863;
			motionX *= f2;
			motionZ *= f2;
		}
		prevLimbSwingAmount = limbSwingAmount;
		final double d0 = posX - prevPosX;
		final double d2 = posZ - prevPosZ;
		float f6 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 4.0f;
		if (f6 > 1.0f) {
			f6 = 1.0f;
		}
		limbSwingAmount += (f6 - limbSwingAmount) * 0.4f;
		limbSwing += limbSwingAmount;
	}

	@SideOnly(Side.CLIENT)
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote) {
			for (int var3 = 0; var3 < 8; ++var3) {
				final PurpleTrail var4 = new PurpleTrail(worldObj, posX, posY - 1.5, posZ, 0.0, 0.0, 0.0, 5);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var4);
				final GreenTrail var5 = new GreenTrail(worldObj, posX, posY, posZ, 0.0, 0.0, 0.0, 5);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var5);
				final RedTrail var6 = new RedTrail(worldObj, posX, posY + 1.5, posZ, 0.0, 0.0, 0.0, 5);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var6);
				final YellowTrail var7 = new YellowTrail(worldObj, posX, posY + 0.5, posZ, 0.0, 0.0, 0.0, 5);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var7);
				final CyanTrail var8 = new CyanTrail(worldObj, posX, posY - 0.5, posZ, 0.0, 0.0, 0.0, 5);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var8);
				final OrangeTrail var9 = new OrangeTrail(worldObj, posX, posY + 1.0, posZ, 0.0, 0.0, 0.0, 5);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var9);
				final BlueTrail var10 = new BlueTrail(worldObj, posX, posY - 1.0, posZ, 0.0, 0.0, 0.0, 5);
				FMLClientHandler.instance().getClient().effectRenderer.addEffect(var10);
			}
		}
	}
}
