package net.nevermine.mob.entity.candyland;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;

public class EntityLollypopper extends EntityMob {
	public EntityLollypopper(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.8f);
	}

	protected String getLivingSound() {
		return null;
	}

	protected String getDeathSound() {
		return "nevermine:LollypopperExplode";
	}

	protected String getHurtSound() {
		return "nevermine:CandyThump";
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

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsCandyland, rand.nextInt(8));
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.SpearmintCandy, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.PeppermintCandy, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.GingerbreadCookie, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.GingerbreadWing, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.SourPop, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.SourCandy, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.CandyCane, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.CandyCorn, 1);
        }
        if (rand.nextInt(15) <= 3) {
            dropItem(Itemizer.SourGummy, 1);
        }
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (isInWater()) {
			heal(0.4f);
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
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0);
	}
}
