package net.nevermine.mob.entity.lunalus;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityInmateX extends EntityMob {
	public EntityInmateX(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.6f);
	}

	protected String getLivingSound() {
		return "nevermine:GoblinLiving";
	}

	protected String getDeathSound() {
		return "nevermine:GoblinDeath";
	}

	protected String getHurtSound() {
		return "nevermine:GoblinHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(25) == 3) {
			dropItem(Itemizer.UnchargedOrb, 1);
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
        if (rand.nextInt(30) == 0) {
            dropItem(Weaponizer.SunStaff, 1);
        }
        if (rand.nextInt(12) == 0) {
            dropItem(Itemizer.IngotLunar, 1);
        }
        if (rand.nextInt(9) == 0) {
            dropItem(Item.getItemFromBlock(Blocks.iron_bars), 1+rand.nextInt(3));
        }
        if (rand.nextInt(16) == 0) {
            dropItem(Item.getItemFromBlock(Blockizer.OrbSunfire), 1);
        }
	}

	private Item dropBanner() {
		return Item.getItemFromBlock(SpecialBlockizer.LunarBanner);
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0);
	}
}
