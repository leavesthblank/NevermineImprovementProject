package net.nevermine.mob.entity.mysterium;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityFungung extends EntityMob {
	public EntityFungung(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.9f);
	}

	protected String getLivingSound() {
		return "nevermine:FungiLiving";
	}

	protected String getDeathSound() {
		return "nevermine:FungiDeath";
	}

	protected String getHurtSound() {
		return "nevermine:FungiHit";
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.HavenShrooms, 3 + rand.nextInt(3));
		dropItem(Itemizer.SilverCoin, 3 + rand.nextInt(4));
		dropItem(Itemizer.ShroomStone, 1);
        dropItem(Weaponizer.ShroomicGreatblade, 1);
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.HavenShrooms, 1 + rand.nextInt(3));
        }
        if (rand.nextInt(7) == 0) {
            dropItem(Itemizer.FungalTea, 1);
        }
        if (rand.nextInt(5) == 0) {
            dropItem(Item.getItemFromBlock(Blocks.brown_mushroom), 4+rand.nextInt(6));
        }
        if (rand.nextInt(5) == 0) {
            dropItem(Item.getItemFromBlock(Blocks.red_mushroom), 4+rand.nextInt(6));
        }
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        if (rand.nextInt(100) == 13) {
            dropItem(Itemizer.ShroomStone, 1);
        }
        dropItem(Itemizer.CoinsMysterium, rand.nextInt(8));
	}

    protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.85f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && rand.nextInt(20) == 8 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
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
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase) {
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.poison.id, 100, 1));
			}
			return true;
		}
		return false;
	}
}
