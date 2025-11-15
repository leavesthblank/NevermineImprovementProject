package net.nevermine.mob.entity.gardencia;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityPodPlant extends EntityMob{

	public EntityPodPlant(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.6f);
	}

	protected String getLivingSound() {
		return "nevermine:PodPlantLiving";
	}

	protected String getDeathSound() {
		return "nevermine:PodPlantDeath";
	}

	protected String getHurtSound() {
		return "nevermine:PodPlantHit";
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
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
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

		if (rand.nextInt(100) < 10) {
			dropItem(Weaponizer.NatureStaff, 1);
		}

		if (rand.nextInt(3) == 1) {
			dropItem(Itemizer.TrilliadLeaves, 1);
		}
        if (rand.nextInt(8)==0){
            dropItem(Item.getItemFromBlock(Blockizer.GardenGrass),1);
        }
        if (rand.nextInt(9)==0){
            dropItem(Items.stick,1+rand.nextInt(6));
        }
        if (rand.nextInt(10)==0){
            dropItem(Item.getItemFromBlock(Blocks.red_flower),1);
        }
        if (rand.nextInt(11)==0){
            dropItem(new ItemStack(Items.dye,1,10).getItem(),1);
        }
        if (rand.nextInt(20) == 1) {
            dropItem(Itemizer.SmallPedalGreen, 1);
        }
        if (rand.nextInt(20) == 1) {
            dropItem(Itemizer.SmallPedalRed, 1);
        }
        if (rand.nextInt(30)==0){
            dropItem(Weaponizer.Flowercorne,1);
        }
	}

    protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0);
	}

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityLivingBase) {
				((EntityLivingBase)par1).addPotionEffect(new PotionEffect(Potion.poison.id, 180, 2));
			}
			return true;
		}
		return false;
	}
}
