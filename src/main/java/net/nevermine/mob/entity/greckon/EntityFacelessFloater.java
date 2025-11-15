package net.nevermine.mob.entity.greckon;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Armorizer;

public class EntityFacelessFloater extends EntityMob {
	public EntityFacelessFloater(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.9f);
	}

	protected String getLivingSound() {
		return "nevermine:FacelessRunnerLiving";
	}

	protected String getDeathSound() {
		return "nevermine:FacelessRunnerDeath";
	}

	protected String getHurtSound() {
		return "nevermine:FacelessRunnerHit";
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsGreckon, rand.nextInt(8));
        if (rand.nextInt(200) == 135) {
            dropItem(Itemizer.UpgradeKitHaunted, 1);
        }
        if (rand.nextInt(10) == 4) {
            dropItem(Itemizer.Ghoulasm, 1);
        }

		if (rand.nextInt(10) == 4) {
			dropItem(Itemizer.DarklyPowder, 2);
		}
        if (rand.nextInt(11) == 4) {
            dropItem(Itemizer.IngotGhoulish, 1);
        }
        if (rand.nextInt(15) == 4) {
            dropItem(Itemizer.SilverCoin, 1);
        }
        if (rand.nextInt(7)==0){
            dropItem(Item.getItemFromBlock(Blockizer.HauntedFlower),1+rand.nextInt(3));
        }
        if (rand.nextInt(70)==0){
            dropItem(Armorizer.PhantasmHelmet,1);
        }
        if (rand.nextInt(70)==0){
            dropItem(Armorizer.PhantasmChestplate,1);
        }
        if (rand.nextInt(70)==0){
            dropItem(Armorizer.PhantasmLeggings,1);
        }
        if (rand.nextInt(70)==0){
            dropItem(Armorizer.PhantasmBoots,1);
        }
        if (rand.nextInt(35)==0){
            dropItem(Armorizer.NecroHelmet,1);
        }
        if (rand.nextInt(35)==0){
            dropItem(Armorizer.NecroChestplate,1);
        }
        if (rand.nextInt(35)==0){
            dropItem(Armorizer.NecroLeggings,1);
        }
        if (rand.nextInt(35)==0){
            dropItem(Armorizer.NecroBoots,1);
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
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(70.0);
	}
}
