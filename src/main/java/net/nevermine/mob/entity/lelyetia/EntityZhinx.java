package net.nevermine.mob.entity.lelyetia;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityZhinx extends EntityMob{

	public EntityZhinx(final World par1World) {
		super(par1World);
		setSize(0.6f, 1.5f);
	}

	protected String getLivingSound() {
		return "nevermine:ZhinxLiving";
	}

	protected String getDeathSound() {
		return "nevermine:ZhinxDeath";
	}

	protected String getHurtSound() {
		return "nevermine:ZhinxHit";
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.ZhinxDust, 1 + rand.nextInt(5));
        dropItem(Itemizer.CopperCoin,5+rand.nextInt(10));
        dropItem(Itemizer.CoinsLelyetia, rand.nextInt(8));
        if (rand.nextInt(200)==0){
            dropItem(Itemizer.UpgradeKitLelyetian,1);
        }
        if (rand.nextInt(40) == 15) {
            dropItem(Itemizer.GuardiansEye, 1);
        }
        if(rand.nextInt(40)==0){
            dropItem(Weaponizer.PowerRay,1);
        }
        if (rand.nextInt(10)==0){
            dropItem(Items.bone,1+rand.nextInt(3));
        }
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.3);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityPlayer) {
				final EntityPlayer entityPlayer = (EntityPlayer)par1;
				entityPlayer.rotationPitch += 25.0f;
				final EntityPlayer entityPlayer2 = (EntityPlayer)par1;
				entityPlayer2.rotationYaw += -30 + rand.nextInt(60);
			}
			return true;
		}
		return false;
	}
}
