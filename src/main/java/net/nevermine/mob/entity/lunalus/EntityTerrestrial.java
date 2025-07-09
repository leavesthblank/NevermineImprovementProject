package net.nevermine.mob.entity.lunalus;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.structures.vanilla.LunarPortalStructure;

public class EntityTerrestrial extends EntityMob {
	public EntityTerrestrial(final World par1World) {
		super(par1World);
		setSize(1.2f, 2.5f);
	}

	protected String getLivingSound() {
		return "nevermine:TerrestrialLiving";
	}

	protected String getDeathSound() {
		return "nevermine:TerrestrialHit";
	}

	protected String getHurtSound() {
		return "nevermine:TerrestrialHit";
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.85f, 1.0f);
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(11.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.7);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(120.0);
	}

	public void onDeath(final DamageSource var1) {
		super.onDeath(var1);
		if (!worldObj.isRemote) {
			final int posx = MathHelper.floor_double(posX);
			final int posz = MathHelper.floor_double(posZ);
			final int posy = MathHelper.floor_double(posY);
			new LunarPortalStructure().generate(worldObj, worldObj.rand, posx, posy, posz);
		}
	}

    protected void dropFewItems(final boolean par1, final int par2) {
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsLunalus, rand.nextInt(8));
        if (rand.nextInt(200) == 35) {
            dropItem(Itemizer.UpgradeKitLunar, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.Orbulon, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.ObservingEye, 1);
        }
    }

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase) {
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 150, 2));
			}
			return true;
		}
		return false;
	}
}
