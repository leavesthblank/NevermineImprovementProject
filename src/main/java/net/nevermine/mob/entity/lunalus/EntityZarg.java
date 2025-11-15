package net.nevermine.mob.entity.lunalus;

import net.minecraft.block.Block;
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
import net.nevermine.izer.equipment.Weaponizer;

public class EntityZarg extends EntityMob{

	public EntityZarg(final World par1World) {
		super(par1World);
		setSize(0.6f, 2.5f);
	}
	protected String getLivingSound() {
		return "nevermine:ZargLiving";
	}

	protected String getDeathSound() {
		return "nevermine:ZargHit";
	}

	protected String getHurtSound() {
		return "nevermine:ZargHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 1.0f, 1.0f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(65) == 25) {
			dropItem(Weaponizer.DualSight, 1);
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
		if (rand.nextInt(19) == 17) {
			int pick = rand.nextInt(4);

			if (pick == 1) {
				dropItem(Armorizer.ZargoniteHelmet, 1);
			}
			else if (pick == 2) {
				dropItem(Armorizer.ZargoniteBoots, 1);
			}
			else if (pick == 3) {
				dropItem(Armorizer.ZargoniteLeggings, 1);
			}
			else {
				dropItem(Armorizer.ZargoniteChestplate, 1);
			}
		}
        if (rand.nextInt(8) == 0) {
            dropItem(Item.getItemFromBlock(Blockizer.LunarBricks), 3+rand.nextInt(4));
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Item.getItemFromBlock(Blockizer.TwinkleStone), 1+rand.nextInt(3));
        }
        if (rand.nextInt(15) == 0) {
            dropItem(Itemizer.IngotLunar, 1);
        }
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (rand.nextInt(120) == 34 && !worldObj.isRemote && entityToAttack != null) {
			final EntityFakeZorp var2 = new EntityFakeZorp(worldObj);
			var2.setLocationAndAngles(entityToAttack.posX, entityToAttack.posY, entityToAttack.posZ, rand.nextFloat() * 360.0f, 0.0f);
			worldObj.spawnEntityInWorld(var2);
		}
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(70.0);
	}
}
