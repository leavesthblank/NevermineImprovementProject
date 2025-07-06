package net.nevermine.item.functional;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemWritableBook;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.assist.StringUtil;
import net.nevermine.common.nevermine;
import net.nevermine.izer.Itemizer;

public class WornBook extends ItemWritableBook {
	static NBTTagCompound contents = new NBTTagCompound();

	public static ItemStack getBook() {
		ItemStack stack = new ItemStack(Itemizer.WornBook, 1);
		stack.setTagCompound(getBookContents());
		return stack;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (world.isRemote) {
			player.openGui(nevermine.instance, 42, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		}
        if (player.dimension==0){
            player.dropItem(Itemizer.RealmstoneMysterium,1);
            player.dropItem(Itemizer.RealmstonePrecasia,1);
            player.dropItem(Itemizer.RealmstoneDeeplands,1);
            player.dropItem(Itemizer.RealmstoneIromine,1);
            player.dropItem(Itemizer.RealmstoneImmortallis,1);
            player.dropItem(Itemizer.RealmstoneAbyss,1);
            player.dropItem(Itemizer.RealmstoneHaven,1);
            player.dropItem(Itemizer.RealmstoneLelyetia,1);
            player.dropItem(Itemizer.RealmstoneCeleve,1);
            player.dropItem(Itemizer.RealmstoneCreeponia,1);
            player.dropItem(Itemizer.RealmstoneGardencia,1);
            player.dropItem(Itemizer.RealmstoneBorean,1);
        }
        if (player.dimension == ConfigurationHelper.greckon){
            player.dropItem(Itemizer.RealmstoneDustopia,1);
            player.dropItem(Itemizer.RealmstoneShyrelands,1);
        }
        if (player.dimension == ConfigurationHelper.runandor){
            player.dropItem(Itemizer.RealmstoneBarathos,1);
        }
        if (player.dimension == ConfigurationHelper.mysterium){
            player.dropItem(Itemizer.RealmstoneVoxPonds,1);
        }
        if (player.dimension == ConfigurationHelper.deeplands){
            player.dropItem(Itemizer.RealmstoneCrystevia,1);
        }
        if (player.dimension == ConfigurationHelper.celeve){
            player.dropItem(Itemizer.RealmstoneCandyland,1);
        }
		return stack;
	}

	@SideOnly(Side.CLIENT)
	public static NBTTagCompound getBookContents() {
		contents.setString("author", StringUtil.getLocaleString("entity.CorruptedTraveller.name"));
		contents.setString("title", StringUtil.getLocaleString("item.WornBook.name"));
		NBTTagList pages = new NBTTagList();

		int i = 1;

		do {
			String st = StringUtil.getLocaleString("message.book.worn." + i);

			if (st.startsWith("message.book.worn.")) {
				i = 0;
			}
			else {
				pages.appendTag(new NBTTagString(st.replaceAll("<br>", "\n")));
				i++;
			}
		} while (i != 0);

		contents.setTag("pages", pages);

		return contents;
	}
}
