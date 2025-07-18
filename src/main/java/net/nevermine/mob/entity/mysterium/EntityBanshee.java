package net.nevermine.mob.entity.mysterium;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.Itemizer;

import static net.nevermine.container.PlayerContainer.Skills.Hunter;

public class EntityBanshee extends EntityMob{

	public EntityBanshee(final World par1World) {
		super(par1World);
		setSize(1.0f, 2.3f);
	}

	protected String getLivingSound() {
		return "nevermine:BansheeLiving";
	}

	protected String getDeathSound() {
		return "nevermine:BansheeDeath";
	}

	protected String getHurtSound() {
		return "nevermine:BansheeHit";
	}

	public void onDeath(final DamageSource var1) {
		super.onDeath(var1);
		if (var1.getEntity() != null && var1.getEntity() instanceof EntityPlayer) {
			PlayerContainer.getProperties((EntityPlayer)var1.getEntity()).addExperience(60.0f, Hunter);
		}
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(3) == 1) {
			dropItem(Itemizer.GhostlyPowder, 1);
		}
        if (rand.nextInt(3) == 0) {
            dropItem(Itemizer.Phantasm, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.HavenShrooms, 1 + rand.nextInt(3));
        }
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        if (rand.nextInt(100) == 13) {
            dropItem(Itemizer.ShroomStone, 1);
        }
        dropItem(Itemizer.CoinsMysterium, rand.nextInt(8));
	}

    protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.7);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(70.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase && par1 instanceof EntityPlayer) {
				if (((EntityPlayer)par1).inventory.hasItem(Itemizer.ScreamShield)) {
					((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 80, 5));
					((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.blindness.id, 80, 5));
					addPotionEffect(new PotionEffect(Potion.invisibility.id, 100, 1));
					addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 0));
				}
				else {
					((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 150, 5));
					((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.poison.id, 150, 5));
					addPotionEffect(new PotionEffect(Potion.invisibility.id, 100, 1));
					addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 1));
				}
			}
			return true;
		}
		return false;
	}
}
