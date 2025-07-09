package net.nevermine.mob.entity.lunalus;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Armorizer;

import java.util.List;

public class EntityRefluct extends EntityMob {
	private int pick;

	public EntityRefluct(final World par1World) {
		super(par1World);
		setSize(0.6f, 2.5f);
	}

	protected String getLivingSound() {
		return "nevermine:RefluctLiving";
	}

	protected String getDeathSound() {
		return "nevermine:RefluctHit";
	}

	protected String getHurtSound() {
		return "nevermine:RefluctHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 1.0f, 1.0f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(2) == 0) {
			dropItem(Itemizer.SilverCoin, 1 + rand.nextInt(1));
		}
		if (rand.nextInt(100) == 35) {
			dropItem(Itemizer.MilleniumUpgrader, 1);
		}
		if (rand.nextInt(30) == 17) {
			pick = rand.nextInt(4);
			if (pick == 1) {
				dropItem(Armorizer.SpaceKingHelmet, 1);
			}
			else if (pick == 2) {
				dropItem(Armorizer.SpaceKingBoots, 1);
			}
			else if (pick == 3) {
				dropItem(Armorizer.SpaceKingLeggings, 1);
			}
			else {
				dropItem(Armorizer.SpaceKingChestplate, 1);
			}
		}
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsLunalus, rand.nextInt(8));
        if (rand.nextInt(200) == 35) {
            dropItem(Itemizer.UpgradeKitLunar, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.Orbulon, 1);
        }
        if (rand.nextInt(40) == 0) {
            dropItem(Itemizer.ObservingEye, 1);
        }
        dropItem(Itemizer.Ivory,rand.nextInt(2));
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(13.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0);
	}
}
