package net.nevermine.npc.entity.lottoman;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Totemizer;
import net.nevermine.npc.entity.EntityNevermineVillager;
import net.nevermine.npc.entity.RestockedRecipe;

import java.util.ArrayList;

public class EntityLottomanBarathos extends EntityNevermineVillager {
	private static ArrayList<RestockedRecipe> trades = new ArrayList<RestockedRecipe>();

	public EntityLottomanBarathos(final World var1) {
		super(var1);
	}

	public boolean getCanSpawnHere() {
		return worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	@Override
	public void interaction(final EntityPlayer p) {
		p.addChatMessage(StringUtil.getLocale("message.dialogue.lottoManBarathos." + rand.nextInt(5)));
	}

	@Override
	public int guiID() {
		return 5;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	public void addRecipies(final MerchantRecipeList list) {
		list.add(new RestockedRecipe(new ItemStack(Itemizer.CoinsBarathos, 10, 1), new ItemStack(Totemizer.TotemBaronStaff)));
		list.add(new RestockedRecipe(new ItemStack(Itemizer.CoinsBarathos, 10, 1), new ItemStack(Totemizer.TotemBaronSSR)));
		list.add(new RestockedRecipe(new ItemStack(Itemizer.CoinsBarathos, 40, 1), new ItemStack(Itemizer.CoinsBarathos, 35), new ItemStack(Totemizer.TotemBaronStaff, 10)));
		list.add(new RestockedRecipe(new ItemStack(Itemizer.CoinsBarathos, 40, 1), new ItemStack(Itemizer.CoinsBarathos, 35), new ItemStack(Totemizer.TotemBaronSSR, 10)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.SilverCoin, 5, 1), new ItemStack(Itemizer.GemBag, 1)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.SilverCoin, 50, 1), new ItemStack(Itemizer.GemBag, 13)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.GoldCoin, 5, 1), new ItemStack(Itemizer.MagicRepairDust, 1)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.GoldCoin, 25, 1), new ItemStack(Itemizer.GoldCoin, 25), new ItemStack(Itemizer.MagicRepairDust, 15)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.Orbulon, 15, 1), new ItemStack(Itemizer.MagicRepairDust, 2)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.GoldCoin, 7, 1), new ItemStack(Itemizer.ShinyBox, 1)));
	}

	@Override
	public String mobName() {
		return "Lottoman";
	}

	static {

	}
}
