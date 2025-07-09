package net.nevermine.mob.entity.lborean;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.nevermine.boss.EntityBoss;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.izer.equipment.Armorizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityHydrolisk extends EntityMob implements EntityBoss {
	public EntityHydrolisk(final World par1World) {
		super(par1World);
		setSize(1.7f, 3.6f);
	}

	protected String getLivingSound() {
		return "nevermine:HydroliskLiving";
	}

	protected String getDeathSound() {
		return "nevermine:HydroliskDeath";
	}

	protected String getHurtSound() {
		return "nevermine:HydroliskHit";
	}

	protected void func_145780_a(final int p_145780_1_, final int p_145780_2_, final int p_145780_3_, final Block p_145780_4_) {
		playSound("nevermine:EmperorBeastStep", 0.55f, 1.0f);
	}

	protected void dropFewItems(final boolean par1, final int par2) {
		dropItem(Itemizer.SilverCoin, 5 + rand.nextInt(10));
        dropItem(Armorizer.HydroplateBoots, 1);
        dropItem(Armorizer.HydroplateHelmet, 1);
        dropItem(Armorizer.HydroplateLeggings, 1);
        dropItem(Armorizer.HydroplateChestplate, 1);
        dropItem(Weaponizer.ReefStaff,1);
        dropItem(Itemizer.CopperCoin, 5 + rand.nextInt(10));
        dropItem(Itemizer.CoinsLborean, rand.nextInt(8));
        if (rand.nextInt(200) == 0) {
            dropItem(Itemizer.UpgradeKitSeaside, 1);
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
        if (rand.nextInt(10) == 0) {
            dropItem(Itemizer.CoralStone, 1);
        }
        dropItem(Itemizer.MagicRepairDust, 1 + rand.nextInt(3));
        dropItem(Itemizer.SilverCoin, 1 + rand.nextInt(5));
        dropItem(Itemizer.GoldCoin, 1 + rand.nextInt(2));
        dropItem(Itemizer.CoinsLborean, 5 + rand.nextInt(28));
        dropItem(Itemizer.WaterRune, 6 + rand.nextInt(15));
        dropItem(Itemizer.KineticRune, 6 + rand.nextInt(15));
        dropItem(Items.fish, 3 + rand.nextInt(3));
        dropItem(Itemizer.BubbleBerries, 16 + rand.nextInt(17));
	}

	protected Entity findPlayerToAttack() {
		final EntityPlayer entityPlayer = worldObj.getClosestVulnerablePlayerToEntity(this, 16.0);
		return ((entityPlayer != null && canEntityBeSeen(entityPlayer)) ? entityPlayer : null);
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (isInWater()) {
			heal(1.0f);
		}
	}

	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(16.0);
		getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(52.0);
		getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(800.0);
	}
}
