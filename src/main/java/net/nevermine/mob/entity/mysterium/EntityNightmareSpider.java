package net.nevermine.mob.entity.mysterium;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;

public class EntityNightmareSpider extends EntityMob{

	public EntityNightmareSpider(final World par1World) {
		super(par1World);
		setSize(1.0f, 1.1f);
	}

	protected String getLivingSound() {
		return "nevermine:NightmareSpiderLiving";
	}

	protected String getDeathSound() {
		return "nevermine:NightmareSpiderDeath";
	}

	protected String getHurtSound() {
		return "nevermine:NightmareSpiderHit";
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(4) == 0) {
			dropItem(Itemizer.NightmareFlakes, 2);
		}
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.HavenShrooms, 1 + rand.nextInt(3));
        }
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        if (rand.nextInt(100) == 13) {
            dropItem(Itemizer.ShroomStone, 1);
        }
        dropItem(Itemizer.CoinsMysterium, rand.nextInt(8));
        dropItem(Items.spider_eye, rand.nextInt(2));
        dropItem(Items.string, rand.nextInt(3));
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.4);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase) {
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.confusion.id, 10, 100));
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.blindness.id, 80, 10));
			}
			return true;
		}
		return false;
	}
}
