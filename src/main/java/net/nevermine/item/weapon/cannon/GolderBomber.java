package net.nevermine.item.weapon.cannon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.item.weapon.gun.BaseGun;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.projectiles.cannon.EntityGoldenCannonball;

import java.util.List;

public class GolderBomber extends BaseGun {
	private final float dmg = 40.0f;

	public GolderBomber(final int consumeChance, final String effect, final int uses, final int fireRate, final Item item) {
		super(consumeChance, effect, uses, fireRate, item);
		setCreativeTab(Weaponizer.CannonsTab);
	}

	@Override
	public void fireGun(final World world, final ItemStack stack, final EntityPlayer player, final float multi, boolean consume) {
		player.worldObj.spawnEntityInWorld(new EntityGoldenCannonball(player.worldObj, player, dmg * multi, 5, 0.06f));
		player.worldObj.spawnEntityInWorld(new EntityGoldenCannonball(player.worldObj, player, dmg * multi, 5, 0.03f));
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.damage.ranged", EnumChatFormatting.DARK_RED, Integer.toString((int)dmg)));
		list.add(StringUtil.getColourLocaleString("item.GolderBomber.desc.1", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getLocaleString("items.description.knockback.insane"));
		list.add(StringUtil.getLocaleString("items.description.speed.incrediblySlow"));
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.ammo", EnumChatFormatting.LIGHT_PURPLE, StringUtil.getLocaleString("item.CannonBall.name")));
	}
}
