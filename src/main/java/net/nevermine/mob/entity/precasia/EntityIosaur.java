package net.nevermine.mob.entity.precasia;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

import static net.nevermine.container.PlayerContainer.Skills.Hunter;

public class EntityIosaur extends EntityMob{

	public EntityIosaur(final World par1World) {
		super(par1World);
		setSize(1.5f, 1.85f);
	}

	protected String getLivingSound() {
		return "nevermine:IosaurLiving";
	}

	protected String getDeathSound() {
		return "nevermine:IosaurDeath";
	}

	protected String getHurtSound() {
		return "nevermine:IosaurHit";
	}

	public void onDeath(final DamageSource var1) {
		super.onDeath(var1);
		if (!worldObj.isRemote && var1.getEntity() != null && var1.getEntity() instanceof EntityPlayer) {
			PlayerContainer.getProperties((EntityPlayer)var1.getEntity()).addExperience(200.0f, Hunter);
		}
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("nevermine:DinoStep", 0.85f, 1.0f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsPrecasian, rand.nextInt(8));
        if (rand.nextInt(200) == 97) {
            dropItem(Itemizer.UpgradeKitPrecasian, 1);
        }
        if (rand.nextInt(10)==0) {
            dropItem(Itemizer.JungleThorns, 1);
        }
        if (rand.nextInt(8) == 0) {
            dropItem(Items.bone, 1+rand.nextInt(3));
        }
        if (rand.nextInt(9) == 0) {
            dropItem(Items.leather, 1+rand.nextInt(4));
        }
		if (rand.nextInt(33) == 15) {
			dropItem(Weaponizer.RejuvenationStaff, 1);
		}
        if (rand.nextInt(40) == 15) {
            dropItem(Weaponizer.LegboneSword, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.SkullboneFragment, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.ChestboneFragment, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.LegboneFragment, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.FootboneFragment, 1);
        }
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		final float current = getHealth();

		if (current < getMaxHealth() && current > 0.25) {
			setHealth(current + 1.5f);
		}
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(120.0);
	}

	public boolean attackEntityAsMob(final Entity par1Entity) {
		super.attackEntityAsMob(par1Entity);
		if (entityToAttack != null) {
			entityToAttack.addVelocity(motionX * 5.5, motionY * 0.3, motionZ * 10.0);
			if (entityToAttack instanceof EntityLiving) {
				((EntityLiving)entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 50, 0));
			}
			return true;
		}
		return false;
	}
}
