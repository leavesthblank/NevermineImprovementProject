package net.nevermine.npc.entity.artistry;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Armorizer;
import net.nevermine.npc.entity.EntityNevermineVillager;
import net.nevermine.npc.entity.RestockedRecipe;

import java.util.ArrayList;

public class EntityCreationMaster extends EntityNevermineVillager {
	private static ArrayList<RestockedRecipe> trades = new ArrayList<RestockedRecipe>();

	public EntityCreationMaster(final World var1) {
		super(var1);
	}

	public boolean getCanSpawnHere() {
		return worldObj.checkNoEntityCollision(boundingBox) && worldObj.getCollidingBoundingBoxes(this, boundingBox).isEmpty() && !worldObj.isAnyLiquid(boundingBox);
	}

	@Override
	public void interaction(final EntityPlayer p) {
		p.addChatMessage(StringUtil.getLocale("message.dialogue.creationMaster." + rand.nextInt(5)));
	}

	@Override
	public int guiID() {
		return 17;
	}

	@Override
	protected boolean canDespawn() {
		return true;
	}

	@Override
	public void addRecipies(final MerchantRecipeList list) {
		list.add(new RestockedRecipe(new ItemStack(Itemizer.LunaverCoin, 1, 1), new ItemStack(Armorizer.CreationBoots, 1)));
		list.add(new RestockedRecipe(new ItemStack(Itemizer.LunaverCoin, 1, 1), new ItemStack(Armorizer.CreationLeggings, 1)));
		list.add(new RestockedRecipe(new ItemStack(Itemizer.LunaverCoin, 1, 1), new ItemStack(Armorizer.CreationChestplate, 1)));
		list.add(new RestockedRecipe(new ItemStack(Itemizer.LunaverCoin, 1, 1), new ItemStack(Armorizer.CreationHelmet, 1)));
	}

	@Override
	public String mobName() {
		return "CreationMaster";
	}

	static {

	}
}
