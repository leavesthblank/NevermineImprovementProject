package net.nevermine.item.weapon.energy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.projectiles.energy.EntitySeaocronShot;

import java.util.List;

public class Seaocron extends BaseEnergy {
	private final float dmg = 20.0f;

	public Seaocron(final int consumeChance, final String effect, final int uses, final int fireRate, final int cost) {
		super(consumeChance, effect, uses, fireRate, cost);
	}

	@Override
	public void fireAncient(final World world, final ItemStack stack, final EntityPlayer player) {
		player.worldObj.spawnEntityInWorld(new EntitySeaocronShot(player.worldObj, player, dmg));
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.damage.ranged", EnumChatFormatting.DARK_RED, Integer.toString((int)dmg)));
		list.add(StringUtil.getColourLocaleString("item.Seaocron.desc.1", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getLocaleString("items.description.speed.slow"));
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.energy.cost", EnumChatFormatting.LIGHT_PURPLE, "100"));
	}
}
