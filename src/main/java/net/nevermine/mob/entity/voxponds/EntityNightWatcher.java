package net.nevermine.mob.entity.voxponds;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;

public class EntityNightWatcher extends EntityMob {
	public EntityNightWatcher(final World par1World) {
		super(par1World);
		setSize(0.6f, 2.7f);
	}

	protected String getLivingSound() {
		return "nevermine:NightWatcherLiving";
	}

	protected String getDeathSound() {
		return "nevermine:NightWatcherHit";
	}

	protected String getHurtSound() {
		return "nevermine:NightWatcherHit";
	}

	public boolean getCanSpawnHere() {
		return !worldObj.isDaytime() && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

    protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsVoxPonds, rand.nextInt(8));
        if (rand.nextInt(200) == 1) {
            dropItem(Itemizer.UpgradeKitApoco, 1);
        }
        if (rand.nextInt(10) == 1) {
            dropItem(Itemizer.ToxicLump, 1);
        }
        if (rand.nextInt(50) == 1) {
            dropItem(Itemizer.VileStone, 1);
        }
        if (rand.nextInt(10) == 5) {
            dropItem(Itemizer.SludgeParasite, 1);
        }
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.3);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(90.0);
	}
}
