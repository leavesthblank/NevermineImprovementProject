package net.nevermine.mob.entity.night;

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
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.structures.vanilla.LunarPortalStructure;

import static net.nevermine.container.PlayerContainer.Skills.Hunter;

public class EntityDarkBeast extends EntityMob {
	public EntityDarkBeast(final World par1World) {
		super(par1World);
		setSize(1.0f, 2.2f);
	}

	protected String getDeathSound() {
		return "nevermine:DarkBeastDeath";
	}

	protected String getLivingSound() {
		return "nevermine:DarkBeastLiving";
	}

	protected String getHurtSound() {
		return "nevermine:DarkBeastHit";
	}

	public void onDeath(final DamageSource var1) {
		super.onDeath(var1);
        if (!worldObj.isRemote && rand.nextInt(60) == 0 ) {
            final int posx = MathHelper.floor_double(posX);
            final int posz = MathHelper.floor_double(posZ);
            final int posy = MathHelper.floor_double(posY);
            new LunarPortalStructure().generate(worldObj, worldObj.rand, posx, posy, posz);
        }
	}

    protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));

		if (rand.nextBoolean()) {
			dropItem(Itemizer.Moonstone, 1);
		}

		if (rand.nextInt(50) == 36) {
			dropItem(Weaponizer.MoonShiner, 1);
		}

		if (rand.nextInt(14) == 0) {
			dropItem(Itemizer.ScreamShield, 1);
		}
	}

	public boolean getCanSpawnHere() {
		return !worldObj.isDaytime() && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.85f, 1.0f);
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
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase) {
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.blindness.id, 100, 4));
			}
			return true;
		}
		return false;
	}
}
