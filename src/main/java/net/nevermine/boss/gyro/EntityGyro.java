package net.nevermine.boss.gyro;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.boss.EntityBoss;
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.mob.ai.EntityAIFlying;
import net.nevermine.projectiles.enemy.EntityGyroShot;

import java.util.List;

import static net.nevermine.container.PlayerContainer.Skills.Hunter;

public class EntityGyro extends EntityAIFlying implements IRangedAttackMob, EntityBoss {
	private ChunkCoordinates currentFlightTarget;
	private int flyTimer;
	private int musicTick;
	private EntityAIArrowAttack aiArrowAttack;

	public EntityGyro(final World var1) {
		super(var1);
		musicTick = 1;
		aiArrowAttack = new EntityAIArrowAttack(this, getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), 20, 60, 15.0f);
		final double moveSpeed = 0.6499999761581421;
		isImmuneToFire = true;
		tasks.addTask(7, new EntityAIArrowAttack(this, 0.25, 20, 64.0f));
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIRestrictSun(this));
		tasks.addTask(3, new EntityAIFleeSun(this, moveSpeed));
		tasks.addTask(5, new EntityAIWander(this, moveSpeed));
		tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		tasks.addTask(6, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		flyTimer = 0;
		setSize(2.0f, 2.4f);
	}

	public boolean getCanSpawnHere() {
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Item.getItemFromBlock(SpecialBlockizer.GyroStatue), 1);

		final int choose = rand.nextInt(5);

		if (choose == 1) {
			dropItem(Weaponizer.ClownCannon, 1);
		}
		else if (choose == 2) {
			dropItem(Weaponizer.Gimmick, 1);
		}
		else if (choose == 3) {
			dropItem(Weaponizer.Spectacle, 1);
		}
		else if (choose == 4) {
			dropItem(Weaponizer.BigTop, 1);
		}
		else {
			dropItem(Weaponizer.ClownCracker, 1);
		}
	}

	public void onDeath(final DamageSource var1) {
		super.onDeath(var1);

		if (!worldObj.isRemote && var1.getEntity() instanceof EntityPlayer) {
			final EntityPlayer p = (EntityPlayer)var1.getEntity();

			IChatComponent msg = StringUtil.getLocaleWithArguments("message.mob.gyro.kill", p.getDisplayName());

			for (final EntityPlayer e : (List<EntityPlayer>)p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, p.boundingBox.expand(50.0, 50.0, 50.0))) {
				e.addChatMessage(msg);
			}

			PlayerContainer cont = PlayerContainer.getProperties((EntityPlayer)var1.getEntity());

			if (cont.getLevel(Hunter) >= 30)
				cont.addExperience(3500, Hunter);
		}
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3499999940395355);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(9.0);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2500.0);
	}

	protected boolean isAIEnabled() {
		return true;
	}

	protected float getSoundPitch() {
		return super.getSoundPitch() * 2.95f;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		--musicTick;
		if (musicTick == 0) {
			musicTick = 255;
			playSound("nevermine:MusicGyro", 4.0f, 1.0f);
		}
		final EntityPlayer var1 = worldObj.getClosestVulnerablePlayerToEntity(this, 45.0);
		if (var1 == null || var1.getDistanceToEntity(this) > 45.0f) {
			return;
		}
		if (!worldObj.isRemote && rand.nextInt(6) == 4) {
			final EntityGyroShot var2 = new EntityGyroShot(worldObj, this, 5.0f);
			final double var3 = var1.posX - posX;
			final double var4 = var1.posY + var1.getEyeHeight() - 1.100000023841858 - var2.posY;
			final double var5 = var1.posZ - posZ;
			final float var6 = MathHelper.sqrt_double(var3 * var3 + var5 * var5) * 0.2f;
			var2.setThrowableHeading(var3, var4 + var6, var5, 1.6f, 12.0f);
			playSound("nevermine:Minigun", 1.0f, 1.0f / (getRNG().nextFloat() * 0.4f + 0.8f));
			worldObj.spawnEntityInWorld(var2);
		}
	}

	public void attackEntityWithRangedAttack(final EntityLivingBase var1, final float f) {
		final EntityGyroShot var2 = new EntityGyroShot(worldObj, this, 5.0f);
		final double var3 = var1.posX - posX;
		final double var4 = var1.posY + var1.getEyeHeight() - 1.100000023841858 - var2.posY;
		final double var5 = var1.posZ - posZ;
		final float var6 = MathHelper.sqrt_double(var3 * var3 + var5 * var5) * 0.2f;
		var2.setThrowableHeading(var3, var4 + var6, var5, 1.6f, 12.0f);
		playSound("nevermine:Minigun", 1.0f, 1.0f / (getRNG().nextFloat() * 0.4f + 0.8f));
		worldObj.spawnEntityInWorld(var2);
	}

	protected String getLivingSound() {
		return "nevermine:GyroLiving";
	}

	protected String getHurtSound() {
		return "nevermine:GyroHit";
	}

	protected String getDeathSound() {
		return "nevermine:GyroDeath";
	}

	public void onUpdate() {
		super.onUpdate();
		motionY *= 0.6000000238418579;
	}

	protected void updateAITasks() {
		super.updateAITasks();
		if (getAttackTarget() != null) {
			final int var1 = (int)getAttackTarget().posX;
			final int var2 = (int)getAttackTarget().posY;
			final int var3 = (int)getAttackTarget().posZ;
			currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
		}
		else if (flyTimer != 0) {
			flyTimer = 120;
			currentFlightTarget = new ChunkCoordinates((int)(posX + rand.nextInt(16)) - 8, (int)(posY + rand.nextInt(32)) - 16, (int)(posZ + rand.nextInt(16)) - 8);
		}
		if (currentFlightTarget != null) {
			final double var4 = currentFlightTarget.posX - posX;
			final double var5 = currentFlightTarget.posY + rand.nextFloat() + 1.0 - posY;
			final double var6 = currentFlightTarget.posZ - posZ;
			if (Math.signum(var4) != 0.0 || Math.signum(var5) != 0.0 || Math.signum(var6) != 0.0) {
				motionX += (Math.signum(var4) * 0.15 - motionX) * 0.10000000149011612;
				motionY += (Math.signum(var5) * 1.699999988079071 - motionY) * 0.10000000149011612;
				motionZ += (Math.signum(var6) * 0.15 - motionZ) * 0.10000000149011612;
				final float var7 = (float)(Math.atan2(motionZ, motionX) * 180.0 / 3.141592653589793) - 90.0f;
				final float var8 = MathHelper.wrapAngleTo180_float(var7 - rotationYaw);
				moveForward = 0.5f;
				rotationYaw += var8;
			}
			--flyTimer;
		}
	}

	protected boolean canTriggerWalking() {
		return false;
	}

	@Override
	protected void fall(final float par1) {
	}

	@Override
	protected void updateFallState(final double par1, final boolean par3) {
	}

	public boolean doesEntityNotTriggerPressurePlate() {
		return true;
	}

	public void onCollideWithPlayer(final EntityPlayer par1EntityPlayer) {
		if (!isDead)
			attackEntityAsMob(par1EntityPlayer);
	}
}
