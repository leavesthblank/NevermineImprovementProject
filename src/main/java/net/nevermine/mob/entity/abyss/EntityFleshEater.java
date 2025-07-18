package net.nevermine.mob.entity.abyss;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

public class EntityFleshEater extends EntityMob{
	public EntityFleshEater(final World par1World) {
		super(par1World);
		setSize(0.6f, 1.5f);
	}

	protected String getLivingSound() {
		return "nevermine:FleshEaterLiving";
	}

	protected String getDeathSound() {
		return "nevermine:FleshEaterDeath";
	}

	protected String getHurtSound() {
		return "nevermine:FleshEaterHit";
	}

	public void onDeath(final DamageSource src) {
		super.onDeath(src);
		if (!worldObj.isRemote && src.getEntity() != null && src.getEntity() instanceof EntityPlayer) {
			PlayerContainer.getProperties((EntityPlayer)src.getEntity()).addExperience(120.0f, Hunter);
		}
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
		dropItem(Items.rotten_flesh, 3 + rand.nextInt(3));
        dropItem(Itemizer.CoinsAbyss, rand.nextInt(8));

        if (rand.nextInt(200) == 35) {
            dropItem(Itemizer.UpgradeKitAbyssal, 1);
        }
        if (rand.nextInt(40) == 0) {
            dropItem(Itemizer.StaringEye, 1);
        }
        if (rand.nextInt(4) == 0) {
            dropItem(Itemizer.EyeBulb, 1);
        }
		if (rand.nextInt(19) <= 1) {
			dropItem(Weaponizer.LegboneSword, 1);
		}
        if (rand.nextInt(80)== 0) {
            dropItem(Itemizer.BookOfShadows, 1);
        }
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.3);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase) {
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.hunger.id, 160, 15));
			}
			return true;
		}
		return false;
	}
}
