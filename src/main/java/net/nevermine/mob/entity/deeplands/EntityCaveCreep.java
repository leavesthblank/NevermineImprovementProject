package net.nevermine.mob.entity.deeplands;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;

public class EntityCaveCreep extends EntityMob {
	public EntityCaveCreep(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.5f);
	}

	protected String getLivingSound() {
		return "nevermine:CaveCreepLiving";
	}

	protected String getDeathSound() {
		return "nevermine:CaveCreepDeath";
	}

	protected String getHurtSound() {
		return "nevermine:CaveCreepHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && posY < 120.0 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.RockBones, rand.nextInt(4));
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        if (rand.nextInt(200) == 35) {
            dropItem(Itemizer.UpgradeKitPredator, 1);
        }
        if (rand.nextInt(40) == 16) {
            dropItem(Itemizer.BoulderDash, 1);
        }
        dropItem(Itemizer.CoinsDeeplands, rand.nextInt(8));
        if (rand.nextInt(40) == 16) {
            dropItem(Itemizer.UnchargedStone, 1);
        }
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (rand.nextInt(250) == 178) {
			heal(25.0f);
		}
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(35.0);
	}
}
