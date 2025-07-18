package net.nevermine.mob.entity.barathos;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.assist.AddPackets;
import net.nevermine.gui.MobHitPacket;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityEilosapien extends EntityMob {
	public EntityEilosapien(final World par1World) {
		super(par1World);
		setSize(0.8f, 2.3f);
	}

	protected String getLivingSound() {
		return "nevermine:EilosapienLiving";
	}

	protected String getDeathSound() {
		return "nevermine:EilosapienDeath";
	}

	protected String getHurtSound() {
		return "nevermine:EilosapienHit";
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && rand.nextInt(5) == 2 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

    protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
        dropItem(Weaponizer.Baronator, 1);
		dropItem(Itemizer.SilverCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsBarathos, 3 + rand.nextInt(3));
        if (rand.nextInt(100) == 0) {
            dropItem(Itemizer.UpgradeKitRocky, 1);
        }
        if (rand.nextInt(4) == 0) {
            dropItem(Plantizer.ThornyPlantSeeds, 1 + rand.nextInt(3));
        }
        if (rand.nextInt(3) == 0) {
            dropItem(Itemizer.HiveChunk, 1 + rand.nextInt(3));
        }
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(17.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.7);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityPlayer && par1 instanceof EntityPlayerMP) {
				AddPackets.network.sendTo(new MobHitPacket(100, 6), (EntityPlayerMP)par1);
			}
			return true;
		}
		return false;
	}
}
