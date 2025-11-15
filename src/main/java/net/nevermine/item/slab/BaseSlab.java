package net.nevermine.item.slab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.ArmorUtil;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;

import java.util.List;
import java.util.Random;

public abstract class BaseSlab extends Item {
	private int cost;
	private int level;
	private EntityTameable minion;

	public BaseSlab(final int price, final int req) {
		cost = price;
		level = req;
		setCreativeTab(Itemizer.SlabTab);
	}

	public ItemStack onItemRightClick(final ItemStack stack, final World world, final EntityPlayer player) {
		if (!world.isRemote && (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(this))) {
			useSlab(world, stack, player);
			player.worldObj.playSoundAtEntity(player, "nevermine:Slab", 1.0f, 1.0f);
		}

		return stack;
	}

	public abstract void useSlab(final World p0, final ItemStack p1, final EntityPlayer p2);

	public static boolean isWearingArmour(EntityPlayer pl) {
		final ItemStack stackBoots = pl.inventory.armorItemInSlot(0);
		final ItemStack stackLegs = pl.inventory.armorItemInSlot(1);
		final ItemStack stackBody = pl.inventory.armorItemInSlot(2);
		final ItemStack stackHelmet = pl.inventory.armorItemInSlot(3);

		final Item boots = stackBoots != null ? stackBoots.getItem() : null;
		final Item legs = stackLegs != null ? stackLegs.getItem() : null;
		final Item body = stackBody != null ? stackBody.getItem() : null;
		final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;

		return ArmorUtil.isCreationArmor(boots, legs, body, helmet);
	}

	public void addBuff(final EntityTameable min, final EntityPlayer p) {
		if (isWearingArmour(p)) {
			final int pick = new Random().nextInt(4);

			if (pick == 1) {
				min.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 1));
			}
			else if (pick == 2) {
				min.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1200, 1));
			}
			else if (pick == 3) {
				min.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1200, 1));
			}
			else {
				min.addPotionEffect(new PotionEffect(Potion.resistance.id, 1200, 1));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.slab.cost", EnumChatFormatting.LIGHT_PURPLE, Integer.toString(cost / 600)));
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.skillRequirement", EnumChatFormatting.RED, Integer.toString(level), StringUtil.getLocaleString("skills.creation.name")));
	}
}
