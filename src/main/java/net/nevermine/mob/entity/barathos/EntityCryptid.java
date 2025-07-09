package net.nevermine.mob.entity.barathos;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityCryptid extends EntityMob {
	public EntityCryptid(final World par1World) {
		super(par1World);
		setSize(0.6f, 1.2f);
		isImmuneToFire = true;
	}

	protected String getLivingSound() {
		return "nevermine:CryptidLiving";
	}

	protected String getDeathSound() {
		return "nevermine:CryptidDeath";
	}

	protected String getHurtSound() {
		return "nevermine:CryptidHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && posY < 20.0 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(40) >= 37) {
			dropItem(Weaponizer.BaronSword, 1);
		}
		if (rand.nextInt(60) <= 5) {
			dropItem(Weaponizer.UnderworldStaff, 1);
		}
        dropItem(Itemizer.CoinsBarathos, 3 + rand.nextInt(3));
        if (rand.nextInt(200) == 0) {
            dropItem(Itemizer.UpgradeKitRocky, 1);
        }
        if (rand.nextInt(4) == 0) {
            dropItem(Plantizer.ThornyPlantSeeds, 1 + rand.nextInt(3));
        }
        if (rand.nextInt(5) == 0) {
            dropItem(Itemizer.HiveChunk, 1 + rand.nextInt(3));
        }
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0);
	}
}

