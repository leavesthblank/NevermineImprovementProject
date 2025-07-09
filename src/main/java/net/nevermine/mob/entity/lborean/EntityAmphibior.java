package net.nevermine.mob.entity.lborean;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Weaponizer;

import static net.nevermine.container.PlayerContainer.Skills.Hunter;

public class EntityAmphibior extends EntityMob{

	public EntityAmphibior(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.6f);
	}

	protected String getLivingSound() {
		return "nevermine:AmphibiorLiving";
	}

	protected String getDeathSound() {
		return "nevermine:AmphibiorDeath";
	}

	protected String getHurtSound() {
		return "nevermine:AmphibiorHit";
	}

	public void onDeath(final DamageSource var1) {
		super.onDeath(var1);
		if (!worldObj.isRemote && var1.getEntity() != null && var1.getEntity() instanceof EntityPlayer) {
			PlayerContainer.getProperties((EntityPlayer)var1.getEntity()).addExperience(750.0f, Hunter);
		}
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
		dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsLborean, rand.nextInt(8));
        if (rand.nextInt(200) == 0) {
            dropItem(Itemizer.UpgradeKitSeaside, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.CoralStone, 1);
        }
        if (rand.nextInt(12) == 0) {
            dropItem(Plantizer.BubbleBerrySeeds, 1);
        }
        if (rand.nextInt(15) == 0) {
            dropItem(Itemizer.PureCoralStone, 1);
        }
        if (rand.nextInt(15) == 0) {
            dropItem(Itemizer.PureRainStone, 1);
        }
        if (rand.nextInt(15) == 0) {
            dropItem(Itemizer.PureWaterStone, 1);
        }
		if (rand.nextInt(70) == 43) {
			dropItem(Itemizer.CoralArchergunWaterlogged, 1);
		}
        if (rand.nextInt(70) == 5) {
            dropItem(Itemizer.CoralCannonWaterlogged, 1);
        }
        if (rand.nextInt(70) == 16) {
            dropItem(Itemizer.ReeferWaterlogged, 1);
        }
        if (rand.nextInt(70) == 5) {
            dropItem(Itemizer.AquaCannonWaterlogged, 1);
        }
        if (rand.nextInt(70) == 5) {
            dropItem(Itemizer.CoralCloggerWaterlogged, 1);
        }
        if (rand.nextInt(22) == 5) {
            dropItem(Items.water_bucket, 1);
        }
        if (rand.nextInt(45) == 0) {
            dropItem(Weaponizer.BoreicBow, 1);
        }
        if (rand.nextInt(11) == 5) {
            dropItem(Itemizer.WaterRune, 4+rand.nextInt(5));
        }
        if (rand.nextInt(10) == 5) {
            dropItem(Item.getItemFromBlock(Blockizer.CoralOrange), 6 + rand.nextInt(8));
        }
        if (rand.nextInt(10) == 5) {
            dropItem(Item.getItemFromBlock(Blockizer.CoralPink), 6 + rand.nextInt(8));
        }
        if (rand.nextInt(10) == 5) {
            dropItem(Item.getItemFromBlock(Blockizer.CoralBlue), 6 + rand.nextInt(8));
        }
        if (rand.nextInt(9) == 5) {
            dropItem(Items.fish, 1);
        }
	}

    protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (isInWater()) {
			heal(2.0f);
		}
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(140.0);
	}

	public boolean attackEntityAsMob(final Entity par1Entity) {
		super.attackEntityAsMob(par1Entity);
		if (entityToAttack != null) {
			if (entityToAttack instanceof EntityPlayer && !worldObj.isRemote && rand.nextInt(4) == 2 && par1Entity.worldObj.provider.dimensionId != -1) {
				final int posx = MathHelper.floor_double(posX);
				final int posz = MathHelper.floor_double(posZ);
				final int posy = MathHelper.floor_double(posY);
				worldObj.setBlock(posx, posy, posz, Blocks.water);
			}
			return true;
		}
		return false;
	}
}
