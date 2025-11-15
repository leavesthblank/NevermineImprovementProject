package net.nevermine.item.food;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;

import java.util.List;

public class HotRod extends ItemFood {
	public HotRod() {
		super(9, 0.9f, true);
		setCreativeTab(Itemizer.MiscTab);
		setAlwaysEdible();
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getLocaleString("item.HotRod.desc.1"));
		list.add(StringUtil.getLocaleString("item.HotRod.desc.2"));
	}
}
