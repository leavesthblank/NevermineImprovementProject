package net.nevermine.item.functional;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.assist.StringUtil;
import net.nevermine.boss.bane.EntityBane;
import net.nevermine.izer.Itemizer;

import java.util.List;

public class HauntedIdol extends Item {
	public HauntedIdol() {
		setCreativeTab(Itemizer.MiscTab);
	}

	public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer player, final World par3World, final int x, final int y, final int z, final int par7, final float par8, final float par9, final float par10) {
		if (par3World.provider.dimensionId == ConfigurationHelper.greckon) {
			if (!par3World.isRemote && par1ItemStack.getItem() == Itemizer.HauntedIdol) {
				if (par3World.difficultySetting == EnumDifficulty.PEACEFUL) {
					player.addChatMessage(StringUtil.getLocale("message.feedback.spawnBoss.fail"));
					return false;
				}

				final EntityBane var5 = new EntityBane(par3World);
				var5.setPosition((double)x, (double)(y + 1), (double)z);
				par3World.spawnEntityInWorld(var5);

				IChatComponent msg = StringUtil.getLocaleWithArguments("message.mob.bane.spawn", player.getDisplayName());

				for (final EntityPlayer e : (List<EntityPlayer>)player.worldObj.getEntitiesWithinAABB(EntityPlayer.class, player.boundingBox.expand(50.0, 50.0, 50.0))) {
					e.addChatMessage(msg);
				}

				return true;
			}
		}
		return false;
	}
}
