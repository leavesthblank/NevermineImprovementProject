package net.nevermine.item.functional;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.mob.entity.lborean.EntityAmphibiyte;
import net.nevermine.mob.entity.overworld.*;
import net.nevermine.skill.hauling.haulingHelper;

import java.util.List;
import java.util.Random;

import static net.nevermine.container.PlayerContainer.Skills.Hauling;

public class WeaponsBox extends Item {
	Random rand = new Random();

	public WeaponsBox() {
		setCreativeTab(Itemizer.TotemsTab);
	}

	public boolean onItemUse(final ItemStack stack, final EntityPlayer player, final World world, final int par4, final int par5, final int par6, final int par7, final float par8, final float par9, final float par10) {
		if (world.isRemote)
			return true;

		PlayerContainer cont = PlayerContainer.getProperties(player);

		if (rand.nextInt(10) == 0) {
			Entity entity = null;
			switch (rand.nextInt(5)) {
				case 0:
					entity = new EntitySeaTroll(world);
					break;
				case 1:
					entity = new EntitySpinux(world);
					break;
				case 2:
					entity = new EntityAmphibiyte(world);
					break;
				case 3:
					entity = new EntitySeaSkeleton(world);
					break;
				case 4:
					entity = new EntitySeaSpider(world);
					break;
				default:
					break;
			}

			entity.setLocationAndAngles(player.posX, player.posY, player.posZ, rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(entity);
		}
		else {
			ItemStack lootStack = null;
			final int lvl = cont.getLevel(Hauling);

			switch (rand.nextInt(8)) {
				case 0:
					lootStack = new ItemStack(Weaponizer.GooBall, lvl < 50 ? 16 : 32);
					break;
				case 1:
					lootStack = new ItemStack(Weaponizer.Vulkram, lvl < 50 ? 16 : 32);
					break;
				case 2:
					lootStack = new ItemStack(Weaponizer.HellFire, lvl < 50 ? 16 : 32);
					break;
				case 3:
					lootStack = new ItemStack(Weaponizer.Chakram, lvl < 50 ? 16 : 32);
					break;
				case 4:
					lootStack = new ItemStack(Itemizer.CannonBall, lvl < 50 ? 32 : 64);
					break;
				case 5:
					lootStack = new ItemStack(Itemizer.MetalPellet, lvl < 50 ? 32 : 64);
					break;
				case 6:
					lootStack = new ItemStack(Itemizer.MetalSlug, lvl < 50 ? 32 : 64);
					break;
				case 7:
					lootStack = new ItemStack(Itemizer.ElementalArrow, lvl < 50 ? 32 : 64);
					break;
				default:
					break;
			}

			if (!player.inventory.addItemStackToInventory(lootStack))
				player.entityDropItem(lootStack, 0f);
		}

		cont.addExperience((cont.getExpRequired(Hauling) / haulingHelper.getExpDenominator(cont.getLevel(Hauling))) * 1.5f, Hauling);
		--stack.stackSize;

		if (player instanceof EntityPlayerMP)
			((EntityPlayerMP)player).sendContainerToPlayer(player.inventoryContainer);

		return true;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleString("item.WeaponsBox.desc.1", EnumChatFormatting.GOLD));
	}
}
