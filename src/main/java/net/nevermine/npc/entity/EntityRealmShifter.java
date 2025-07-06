package net.nevermine.npc.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;

import java.util.ArrayList;

public class EntityRealmShifter extends EntityNevermineVillager {
	private static ArrayList<RestockedRecipe> trades = new ArrayList<RestockedRecipe>();

	public EntityRealmShifter(final World var1) {
		super(var1);
	}

	public boolean getCanSpawnHere() {
		return worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	@Override
	public void interaction(final EntityPlayer p) {
		p.addChatMessage(StringUtil.getLocale("message.dialogue.realmShifter." + rand.nextInt(5)));
	}

	@Override
	public int guiID() {
		return 34;
	}

	@Override
	protected boolean canDespawn() {
		return true;
	}

	@Override
	public void addRecipies(final MerchantRecipeList list) {
        list.add(new RestockedRecipe(new ItemStack(Itemizer.CopperCoin, 1, 1), new ItemStack(Blockizer.AncientRock, 3)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.CopperCoin, 5, 1), new ItemStack(Itemizer.CopperCoin, 5, 1),new ItemStack(Blockizer.AncientRock, 32)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.SilverCoin, 1, 1), new ItemStack(Blockizer.AncientRock, 64)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.CopperCoin, 20, 1), new ItemStack(Blockizer.CarvedRune1, 1)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.CopperCoin, 20, 1), new ItemStack(Blockizer.CarvedRune2, 1)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.CopperCoin, 20, 1), new ItemStack(Blockizer.CarvedRune3, 1)));
        list.add(new RestockedRecipe(new ItemStack(Itemizer.CopperCoin, 20, 1), new ItemStack(Blockizer.CarvedRune6, 1)));
	}

	@Override
	public String mobName() {
		return "RealmShifter";
	}

	static {

	}
}
