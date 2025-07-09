package net.nevermine.mob.entity.barathos;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityArkback extends EntityMob {
	public EntityArkback(final World par1World) {
		super(par1World);
		setSize(3.8f, 2.5f);
	}

	protected String getLivingSound() {
		return "nevermine:ArkbackLiving";
	}

	protected String getDeathSound() {
		return "nevermine:ArkbackDeath";
	}

	protected String getHurtSound() {
		return "nevermine:ArkbackHit";
	}

    public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("nevermine:VeryHeavyStep", 1.25f, 1.0f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(30) <= 2) {
			dropItem(Weaponizer.BaronGreatblade, 1);
		}
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
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
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 40.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(11.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
	}
}
