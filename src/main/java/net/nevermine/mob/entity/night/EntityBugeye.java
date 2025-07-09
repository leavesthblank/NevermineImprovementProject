package net.nevermine.mob.entity.night;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.assist.AddPackets;
import net.nevermine.gui.MobHitPacket;
import net.nevermine.izer.Itemizer;
import net.nevermine.structures.vanilla.LunarPortalStructure;

public class EntityBugeye extends EntityMob {
	public EntityBugeye(final World par1World) {
		super(par1World);
		setSize(0.9f, 1.2f);
	}

	protected String getLivingSound() {
		return "nevermine:BugeyeLiving";
	}

	protected String getDeathSound() {
		return "nevermine:BugeyeDeath";
	}

	protected String getHurtSound() {
		return "nevermine:BugeyeHit";
	}

    protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("mob.pig.step", 1.0f, 1.0f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		if (rand.nextInt(2) == 0) {
			dropItem(Itemizer.CopperCoin, 2 + rand.nextInt(3));
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

	public boolean attackEntityAsMob(final Entity par1) {
		if (super.attackEntityAsMob(par1)) {
			if (par1 instanceof EntityPlayer && par1 instanceof EntityPlayerMP) {
				AddPackets.network.sendTo(new MobHitPacket(150, 8), (EntityPlayerMP)par1);
			}
			return true;
		}
		return false;
	}

	public boolean getCanSpawnHere() {
		final Block b = worldObj.getBlock((int)posX, (int)posY - 1, (int)posZ);
		return worldObj.difficultySetting != EnumDifficulty.PEACEFUL && isValidLightLevel() && (b == Blocks.grass || b == Blocks.dirt || b == Blocks.stained_hardened_clay || b == Blocks.stone || b == Blocks.sand || b == Blocks.snow || b == Blocks.snow_layer || b == Blocks.hardened_clay || b == Blocks.clay) && worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox) && !worldObj.isDaytime();
	}

	protected boolean isValidLightLevel() {
		return true;
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return (entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null;
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(35.0);
	}
}
