package net.nevermine.mob.entity.gardencia;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityCarrotop extends EntityMob {
	public EntityCarrotop(final World par1World) {
		super(par1World);
		setSize(1.2f, 2.1f);
	}

	protected String getLivingSound() {
		return "nevermine:CarrotopLiving";
	}

	protected String getDeathSound() {
		return "nevermine:CarrotopDeath";
	}

	protected String getHurtSound() {
		return "nevermine:CarrotopHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (worldObj.isRaining()) {
			heal(0.2f);
		}
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && posY > 66.0 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(65) <= 4) {
			dropItem(Weaponizer.CarrotCannon, 1);
		}
		if (rand.nextInt(6) == 0) {
			dropItem(Itemizer.SmallPedalOrange, 1 + rand.nextInt(3));
		}
        dropItem(Itemizer.CoinsGardencia, rand.nextInt(8));
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        if (rand.nextInt(200) == 13) {
            dropItem(Itemizer.UpgradeKitFloro, 1);
        }
        if (rand.nextInt(8) == 0) {
            dropItem(Itemizer.NatureMelonSlice, 1 + rand.nextInt(2));
        }
        if (rand.nextInt(6) == 0) {
            dropItem(Plantizer.ChiliSeeds, 1 + rand.nextInt(3));
        }
        dropItem(Items.carrot,rand.nextInt(3));
        if (rand.nextInt(40) == 0) {
            dropItem(Items.golden_carrot,1);
        }
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0);
	}
}
