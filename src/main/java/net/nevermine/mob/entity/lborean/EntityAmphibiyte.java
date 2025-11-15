package net.nevermine.mob.entity.lborean;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.assist.StringUtil;
import net.nevermine.boss.corallus.EntityCorallus;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;

import java.util.List;

public class EntityAmphibiyte extends EntityMob{
	private int angerLevel;
	private int randomSoundDelay;

	public EntityAmphibiyte(final World var1) {
		super(var1);
		angerLevel = 0;
		randomSoundDelay = 5;
		setSize(1.95f, 1.25f);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
	}

	public boolean canBreatheUnderwater() {
		return true;
	}

    protected void dropFewItems(final boolean par1, final int par2) {
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsLborean, rand.nextInt(8));
        if (rand.nextInt(200) == 0) {
            dropItem(Itemizer.UpgradeKitSeaside, 1);
        }
        if (rand.nextInt(12) == 0) {
            dropItem(Plantizer.BubbleBerrySeeds, 1);
        }
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.CoralStone, 1);
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
		dropItem(Itemizer.AmphibiyteLung, rand.nextInt(2));
	}

	protected float getSoundVolume() {
		return 0.4f;
	}

	protected String getLivingSound() {
		return "nevermine:AmphibiyteLiving";
	}

	protected String getDeathSound() {
		return "nevermine:AmphibiyteDeath";
	}

	protected String getHurtSound() {
		return "nevermine:AmphibiyteHit";
	}

	public boolean handleWaterMovement() {
		return false;
	}

	public boolean isInWater() {
		return worldObj.handleMaterialAcceleration(boundingBox.expand(0.0, -0.6000000238418579, 0.0), Material.water, this);
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (isInWater()) {
			if (entityToAttack != null && entityToAttack.posY > posY) {
				motionY = 0.25;
			}
			fallDistance = -0.5f;
		}

		if (isInWater()) {
			if (motionX > -1.100000023841858 && motionX < 1.100000023841858) {
				motionX *= 1.2000000476837158;
			}
			if (motionZ > -1.100000023841858 && motionZ < 1.100000023841858) {
				motionZ *= 1.2000000476837158;
			}
		}
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		setAir(300);
	}

	protected void fall(final float var1) {
	}

	public boolean attackEntityFrom(final DamageSource var1, final int var2) {
		final Entity var3 = var1.getEntity();
		if (var3 instanceof EntityPlayer) {
			final List<Entity> var4 = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(32.0, 32.0, 32.0));
			for (int var5 = 0; var5 < var4.size(); ++var5) {
				final Entity var6 = var4.get(var5);
				if (var6 instanceof EntityAmphibiyte) {
					((EntityAmphibiyte)var6).becomeAngryAt(var3);
				}
			}

			becomeAngryAt(var3);
		}

		return super.attackEntityFrom(var1, (float)var2);
	}

	private void becomeAngryAt(final Entity var1) {
		entityToAttack = var1;
		angerLevel = 400 + rand.nextInt(400);
		randomSoundDelay = rand.nextInt(40);
	}

	public void onDeath(final DamageSource d) {
		super.onDeath(d);
		if (rand.nextInt(50) == 32 && worldObj.provider.dimensionId != ConfigurationHelper.immortallis) {
			if (!worldObj.isRemote) {
				final EntityCorallus var2 = new EntityCorallus(worldObj);
				var2.setLocationAndAngles(posX, posY + 7.0, posZ, rand.nextFloat() * 360.0f, 0.0f);
				playSound("nevermine:CorallusSpawn", 0.85f, 1.0f);
				worldObj.spawnEntityInWorld(var2);

				IChatComponent msg = StringUtil.getLocale("message.mob.corallus.spawn");

				for (final EntityPlayer e : (List<EntityPlayer>)d.getEntity().worldObj.getEntitiesWithinAABB(EntityPlayer.class, d.getEntity().boundingBox.expand(50.0, 50.0, 50.0))) {
					e.addChatMessage(msg);
				}
			}
		}
	}
}
