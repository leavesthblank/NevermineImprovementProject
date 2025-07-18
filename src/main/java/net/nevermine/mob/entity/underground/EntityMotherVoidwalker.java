package net.nevermine.mob.entity.underground;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.izer.equipment.Armorizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityMotherVoidwalker extends EntityMob {
	public EntityMotherVoidwalker(final World par1World) {
		super(par1World);
		setSize(1.0f, 1.62f);
	}

	protected String getLivingSound() {
		return "nevermine:MotherVoidWalkerLiving";
	}

	protected String getDeathSound() {
		return "nevermine:MotherVoidWalkerDeath";
	}

	protected String getHurtSound() {
		return "nevermine:MotherVoidWalkerHit";
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && posY < 35.0 && isValidLightLevel() && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty();
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(8) > 0) {
			dropItem(Armorizer.VoidBoots, 1);
		}
		if (rand.nextInt(8) == 0) {
			dropItem(Weaponizer.VoidBow, 1);
		}
		if (rand.nextInt(8) > 0) {
			dropItem(Armorizer.VoidChestplate, 1);
		}
		if (rand.nextInt(8) > 0) {
			dropItem(Armorizer.VoidHelmet, 1);
		}
		if (rand.nextInt(8) > 0) {
			dropItem(Armorizer.VoidLeggings, 1);
		}
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.85f, 1.0f);
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.7);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase) {
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 4));
			}
			return true;
		}
		return false;
	}
}
