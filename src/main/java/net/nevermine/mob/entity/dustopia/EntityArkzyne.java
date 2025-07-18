package net.nevermine.mob.entity.dustopia;

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

public class EntityArkzyne extends EntityMob{

	public EntityArkzyne(final World par1World) {
		super(par1World);
		setSize(1.4f, 2.5f);
	}

	protected String getLivingSound() {
		return "nevermine:ArkzyneLiving";
	}

	protected String getDeathSound() {
		return "nevermine:ArkzyneDeath";
	}

	protected String getHurtSound() {
		return "nevermine:ArkzyneHit";
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
		dropItem(Itemizer.SilverCoin, 1);

		if (rand.nextInt(100) < 9) {
			dropItem(Weaponizer.Sabbath, 1);
		}
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsDustopia, rand.nextInt(8));
        if (rand.nextInt(200) == 135) {
            dropItem(Itemizer.UpgradeKitDarkly, 1);
        }
        if (rand.nextInt(5) <= 1) {
            dropItem(Itemizer.PrimordialSkull, 1 + rand.nextInt(3));
        }
        if (rand.nextInt(5)==0){
            dropItem(Items.coal,1 + rand.nextInt(5));
        }
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(11.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75.0);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		for (final EntityPlayer e : (List<EntityPlayer>)worldObj.getEntitiesWithinAABB(EntityPlayer.class, boundingBox.expand(11.0, 11.0, 11.0))) {
			if (e.capabilities.isCreativeMode)
				continue;

			e.addVelocity((double)((rand.nextInt(2) - rand.nextInt(3)) / 4), (double)(1 / (rand.nextInt(10) + 4) - rand.nextInt(2)), (double)((rand.nextInt(2) - rand.nextInt(3)) / 4));
		}
	}
}
