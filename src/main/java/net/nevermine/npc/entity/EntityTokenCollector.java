package net.nevermine.npc.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.izer.equipment.Armorizer;
import net.nevermine.izer.equipment.Weaponizer;

public class EntityTokenCollector extends EntityNevermineVillager {
	public EntityTokenCollector(final World var1) {
		super(var1);
	}

	@Override
	public void interaction(final EntityPlayer p) {
		p.addChatMessage(StringUtil.getLocale("message.dialogue.tokenCollector." + rand.nextInt(5)));
	}

	@Override
	public int guiID() {
		return 38;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	public boolean isEntityInvulnerable() {
		return true;
	}

	@Override
	public void addRecipies(final MerchantRecipeList var2) {
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 2, 1), new ItemStack(Itemizer.AugmentFire, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 4, 1), new ItemStack(Itemizer.AugmentImpairment, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 8, 1), new ItemStack(Itemizer.AugmentPoison, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 10, 1), new ItemStack(Itemizer.AugmentPower, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 12, 1), new ItemStack(Itemizer.AugmentWither, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 15, 1), new ItemStack(Itemizer.AugmentEquality, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 20, 1), new ItemStack(Itemizer.AugmentBattle, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 10, 1), new ItemStack(Weaponizer.VulcammerSword, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 20, 1), new ItemStack(Weaponizer.EverfightStaff, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 20, 1), new ItemStack(Weaponizer.EvermightStaff, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 25, 1), new ItemStack(Weaponizer.Odious, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 30, 1), new ItemStack(Weaponizer.Deadlock, 1)));
		var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 1, 1), new ItemStack(SpecialBlockizer.ImmortalBanner, 3)));
        var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 5, 1), new ItemStack(SpecialBlockizer.GildedImmortalBanner, 3)));
        var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 25, 1), new ItemStack(SpecialBlockizer.BejeweledImmortalBanner, 3)));
        var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 8, 1), new ItemStack(Armorizer.ArchaicHelmet, 1)));
        var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 8, 1), new ItemStack(Armorizer.ArchaicChestplate, 1)));
        var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 8, 1), new ItemStack(Armorizer.ArchaicLeggings, 1)));
        var2.add(new RestockedRecipe(new ItemStack(Itemizer.DungeonTokens, 8, 1), new ItemStack(Armorizer.ArchaicBoots, 1)));
	}

	@Override
	public String mobName() {
		return "Token Trader";
	}
}
