package net.nevermine.item.weapon.greatblade;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;
import net.nevermine.projectiles.auxillary.EntityGreatblade;

import java.util.List;

public class TidalGreatblade extends BaseGreatblade {
	private float dmg;

	public TidalGreatblade(final int uses, final float dealDamage) {
		super(uses, dealDamage);
		dmg = dealDamage;
	}

	@Override
	public void fireGreatblade(final World world, final ItemStack stack, final EntityPlayer player) {
		player.worldObj.spawnEntityInWorld(new EntityGreatblade(player.worldObj, player, dmg, 7));
	}

	@Override
	public boolean getIsRepairable(final ItemStack par1ItemStack, final ItemStack par2ItemStack) {
		return Itemizer.MagicRepairDust == par2ItemStack.getItem() || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}

	@Override
	public void addInformation(final ItemStack item, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.damage.ranged", EnumChatFormatting.DARK_RED, Integer.toString((int)dmg)));
		list.add(StringUtil.getColourLocaleString("item.TidalGreatblade.desc.1", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getColourLocaleString("item.TidalGreatblade.desc.2", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getColourLocaleString("items.description.greatblade.desc.1", EnumChatFormatting.AQUA));
		list.add(StringUtil.getColourLocaleString("items.description.greatblade.desc.2", EnumChatFormatting.AQUA));
	}
}
