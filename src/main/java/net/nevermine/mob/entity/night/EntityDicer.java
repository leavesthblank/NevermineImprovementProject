package net.nevermine.mob.entity.night;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.structures.vanilla.LunarPortalStructure;

import java.util.List;

public class EntityDicer extends EntityMob {
	public EntityDicer(final World par1World) {
		super(par1World);
		setSize(2.15f, 2.9f);
	}

	protected String getLivingSound() {
		return "nevermine:DicerLiving";
	}

	protected String getDeathSound() {
		return "nevermine:DicerDeath";
	}

	protected String getHurtSound() {
		return "nevermine:DicerHit";
	}

	private Item dropBanner() {
		return Item.getItemFromBlock(SpecialBlockizer.SoulBanner);
	}

	public boolean getCanSpawnHere() {
		return !worldObj.isDaytime() && worldObj.checkNoEntityCollision(boundingBox) && isValidLightLevel() && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
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
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.7);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		for (final EntityPlayer e : (List<EntityPlayer>)worldObj.getEntitiesWithinAABB(EntityPlayer.class, boundingBox.expand(7.0, 7.0, 7.0))) {
			if (e.capabilities.isCreativeMode)
				continue;

			e.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 65, 1));
		}
	}

    public void onDeath(final DamageSource var1) {
        super.onDeath(var1);
        if (!worldObj.isRemote && rand.nextInt(100) == 0 ) {
            final int posx = MathHelper.floor_double(posX);
            final int posz = MathHelper.floor_double(posZ);
            final int posy = MathHelper.floor_double(posY);
            new LunarPortalStructure().generate(worldObj, worldObj.rand, posx, posy, posz);
        }
    }
}
