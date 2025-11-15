package net.nevermine.boss.skeletalarmy;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.boss.EntityBoss;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.izer.equipment.Armorizer;
import net.nevermine.izer.equipment.Weaponizer;

import java.util.List;

public class EntitySkeletron extends EntityMob implements EntityBoss {
	public EntitySkeletron(final World par1World) {
		super(par1World);
		setSize(1.2f, 1.5f);
	}

	protected String getLivingSound() {
		return "nevermine:SkeletronLiving";
	}

	protected String getDeathSound() {
		return "nevermine:SkeletronDeath";
	}

	protected String getHurtSound() {
		return "nevermine:SkeletronHit";
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		final int wep = rand.nextInt(4);

		if (wep == 1) {
			dropItem(Weaponizer.SkeletalSword, 1);
		}
		else if (wep == 2) {
			dropItem(Weaponizer.SkeletalBow, 1);
		}
		else if (wep == 3) {
			dropItem(Weaponizer.LightningStaff, 1);
		}
		else {
			dropItem(Weaponizer.BoneBlaster, 1);
		}

        dropItem(Armorizer.CommanderBoots, 1);
        dropItem(Armorizer.CommanderLeggings, 1);
        dropItem(Armorizer.CommanderChestplate, 1);
        dropItem(Armorizer.CommanderHelmet, 1);

        dropItem(Item.getItemFromBlock(SpecialBlockizer.SkeletorStatue),1 );
        dropItem(Item.getItemFromBlock(SpecialBlockizer.SkeleHopperStatue),1 );
        dropItem(Item.getItemFromBlock(SpecialBlockizer.SkeleelderStatue),1 );
        dropItem(Item.getItemFromBlock(SpecialBlockizer.SkelepigStatue),1 );
        dropItem(Item.getItemFromBlock(SpecialBlockizer.SkelemanStatue),1 );
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("nevermine:HeavyStep", 0.85f, 1.0f);
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(70.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1100.0);
	}

	public void onDeath(final DamageSource d) {
		super.onDeath(d);

		if (!worldObj.isRemote && d.getEntity() != null && d.getEntity() instanceof EntityPlayer) {
			final EntityPlayer p = (EntityPlayer)d.getEntity();

			IChatComponent msg = StringUtil.getLocaleWithArguments("message.mob.skeletalArmy.kill", p.getDisplayName());

			for (final EntityPlayer e : (List<EntityPlayer>)p.worldObj.getEntitiesWithinAABB(EntityPlayer.class, p.boundingBox.expand(50.0, 50.0, 50.0))) {
				e.addChatMessage(msg);
			}
		}
	}
}
