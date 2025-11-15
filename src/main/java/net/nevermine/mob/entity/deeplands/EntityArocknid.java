package net.nevermine.mob.entity.deeplands;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityArocknid extends EntityMob{
	public EntityArocknid(final World par1World) {
		super(par1World);
		setSize(2.5f, 1.5f);
	}


	protected String getLivingSound() {
		return "nevermine:CaveBugLiving";
	}

	protected String getDeathSound() {
		return "nevermine:CaveBugDeath";
	}

	protected String getHurtSound() {
		return "nevermine:CaveBugHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && posY < 120.0 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.SilverCoin, 1 + rand.nextInt(2));

		if (rand.nextBoolean()) {
			dropItem(Itemizer.WitherRune, 16);
		}
		else {
			dropItem(Itemizer.FireRune, 16);
		}
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        if (rand.nextInt(200) == 35) {
            dropItem(Itemizer.UpgradeKitPredator, 1);
        }
        if (rand.nextInt(40) == 16) {
            dropItem(Itemizer.BoulderDash, 1);
        }
        dropItem(Itemizer.CoinsDeeplands, rand.nextInt(8));
        if (rand.nextInt(40) == 16) {
            dropItem(Itemizer.UnchargedStone, 1);
        }
        if (rand.nextInt(6) == 0) {
            dropItem(Items.spider_eye, 1 + rand.nextInt(3));
        }
        if (rand.nextInt(6) == 0) {
            dropItem(Items.flint, 2 + rand.nextInt(15));
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Item.getItemFromBlock(Blocks.web), 1);
        }
        if (rand.nextInt(20) == 0) {
            dropItem(Weaponizer.RockPickSword, 1);
        }
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(9.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0);
	}
}
