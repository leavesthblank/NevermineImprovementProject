package net.nevermine.boss.skeletalarmy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.nevermine.izer.SpecialBlockizer;

public class EntitySkelepigElite extends EntityMob {
	public EntitySkelepigElite(final World par1World) {
		super(par1World);
		setSize(0.7f, 1.5f);
	}

	protected String getLivingSound() {
		return "mob.skeleton.say";
	}

	protected String getDeathSound() {
		return "mob.skeleton.death";
	}

	protected String getHurtSound() {
		return "mob.skeleton.hurt";
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(14.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0);
	}
}
