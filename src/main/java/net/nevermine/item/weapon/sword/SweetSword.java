package net.nevermine.item.weapon.sword;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;

import java.util.List;

public class SweetSword extends ItemSword implements SwordInterface {
	public SweetSword(final Item.ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setCreativeTab(Weaponizer.SwordsTab);
	}

	public boolean getIsRepairable(final ItemStack par1ItemStack, final ItemStack par2ItemStack) {
		return Itemizer.IngotRosite == par2ItemStack.getItem() || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}

	public boolean hitEntity(final ItemStack stack, final EntityLivingBase live, final EntityLivingBase live2) {
		final int size = live2.worldObj.getEntitiesWithinAABB(EntityLiving.class, live2.boundingBox.expand(5.0, 5.0, 5.0)).size();
		live2.heal(0.5f * size);
		stack.damageItem(1, live2);
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleString("item.SweetSword.desc.1", EnumChatFormatting.DARK_GREEN));
		list.add(StringUtil.getColourLocaleString("item.SweetSword.desc.2", EnumChatFormatting.DARK_GREEN));
	}
}
