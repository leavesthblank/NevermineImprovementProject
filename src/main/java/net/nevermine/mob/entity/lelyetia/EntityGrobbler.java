package net.nevermine.mob.entity.lelyetia;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

import java.util.List;

public class EntityGrobbler extends EntityMob {
	public EntityGrobbler(final World par1World) {
		super(par1World);
		setSize(1.4f, 2.2f);
	}

	protected String getLivingSound() {
		return "nevermine:GrobblerLiving";
	}

	protected String getDeathSound() {
		return "nevermine:GrobblerDeath";
	}

	protected String getHurtSound() {
		return "nevermine:GrobblerHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 0.55f, 1.0f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && rand.nextInt(5) == 2 && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Weaponizer.Monster, 1);
        dropItem(Itemizer.CopperCoin,5+rand.nextInt(10));
        dropItem(Itemizer.CoinsLelyetia, rand.nextInt(8));
        if (rand.nextInt(200)==0){
            dropItem(Itemizer.UpgradeKitLelyetian,1);
        }
        if(rand.nextInt(4)==0){
            dropItem(new ItemStack(Items.dye,1,14).getItem(),1+rand.nextInt(4));
        }
        if (rand.nextInt(11)==0) {
            dropItem(Itemizer.SilverCoin, 1+rand.nextInt(2));
        }
        if (rand.nextInt(5)==0){
            dropItem(Items.leather,2+rand.nextInt(3));
        }
        if (rand.nextInt(40) == 15) {
            dropItem(Itemizer.GuardiansEye, 1);
        }
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.3);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0);
	}
}
