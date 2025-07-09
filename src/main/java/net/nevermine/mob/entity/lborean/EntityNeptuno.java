package net.nevermine.mob.entity.lborean;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityNeptuno extends EntityMob {
	public EntityNeptuno(final World par1World) {
		super(par1World);
		setSize(2.2f, 4.6f);
	}

	protected String getLivingSound() {
		return "nevermine:NeptunoLiving";
	}

	protected String getDeathSound() {
		return "nevermine:NeptunoDeath";
	}

	protected String getHurtSound() {
		return "nevermine:NeptunoHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && rand.nextInt(10) == 4 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
        dropItem(Weaponizer.CoralGreatblade, 1);
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsLborean, rand.nextInt(8));
        if (rand.nextInt(200) == 0) {
            dropItem(Itemizer.UpgradeKitSeaside, 1);
        }
        if (rand.nextInt(12) == 0) {
            dropItem(Plantizer.BubbleBerrySeeds, 1);
        }
        if (rand.nextInt(15) == 0) {
            dropItem(Itemizer.PureCoralStone, 1);
        }
        if (rand.nextInt(15) == 0) {
            dropItem(Itemizer.PureRainStone, 1);
        }
        if (rand.nextInt(15) == 0) {
            dropItem(Itemizer.PureWaterStone, 1);
        }
        if (rand.nextInt(70) == 43) {
            dropItem(Itemizer.CoralArchergunWaterlogged, 1);
        }
        if (rand.nextInt(70) == 5) {
            dropItem(Itemizer.CoralCannonWaterlogged, 1);
        }
        if (rand.nextInt(70) == 16) {
            dropItem(Itemizer.ReeferWaterlogged, 1);
        }
        if (rand.nextInt(70) == 5) {
            dropItem(Itemizer.AquaCannonWaterlogged, 1);
        }
        if (rand.nextInt(70) == 5) {
            dropItem(Itemizer.CoralCloggerWaterlogged, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.CoralStone, 1);
        }
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (isInWater()) {
			heal(0.6f);
		}
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75.0);
	}

	public boolean attackEntityAsMob(final Entity par1Entity) {
		super.attackEntityAsMob(par1Entity);
		if (entityToAttack != null) {
			if (entityToAttack instanceof EntityPlayer && ((EntityPlayer)entityToAttack).getEntityAttribute(SharedMonsterAttributes.knockbackResistance).getAttributeValue() != 1.0) {
				entityToAttack.addVelocity(motionX * 7.0, 1.5, motionZ * 0.0);
			}
			if (entityToAttack instanceof EntityLiving) {
				((EntityLiving)entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 50, 0));
			}
			return true;
		}
		return false;
	}
}
