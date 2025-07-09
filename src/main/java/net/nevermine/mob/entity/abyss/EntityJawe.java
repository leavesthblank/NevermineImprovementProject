package net.nevermine.mob.entity.abyss;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

import java.util.List;

import static net.nevermine.container.PlayerContainer.Skills.Hunter;

public class EntityJawe extends EntityMob {
	private int counter;
	private boolean pull;

	public EntityJawe(final World par1World) {
		super(par1World);
		counter = 80;
		pull = false;
		setSize(0.7f, 0.9f);
	}

	protected String getLivingSound() {
		return "nevermine:JaweLiving";
	}

	protected String getDeathSound() {
		return "nevermine:JaweDeath";
	}

	protected String getHurtSound() {
		return "nevermine:JaweHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL;
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	public void onDeath(final DamageSource src) {
		super.onDeath(src);
		if (!worldObj.isRemote && src.getEntity() != null && src.getEntity() instanceof EntityPlayer) {
			PlayerContainer.getProperties((EntityPlayer)src.getEntity()).addExperience(17.0f, Hunter);
		}
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));

		if (rand.nextInt(120) >= 110) {
			dropItem(Weaponizer.BombLauncher, 1);
		}
        dropItem(Itemizer.CoinsAbyss, rand.nextInt(8));

        if (rand.nextInt(200) == 35) {
            dropItem(Itemizer.UpgradeKitAbyssal, 1);
        }
        if (rand.nextInt(80) == 0) {
            dropItem(Itemizer.StaringEye, 1);
        }
        if (rand.nextInt(80) == 3) {
            dropItem(Itemizer.BookOfShadows, 1);
        }
        if (rand.nextInt(3) > 0) {
            dropItem(Items.rotten_flesh, 1+rand.nextInt(3));
        }
        if (rand.nextInt(10) <= 2) {
            dropItem(Itemizer.Ivory, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.Bloodstone, 1);
        }
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.3);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0);
	}
}
