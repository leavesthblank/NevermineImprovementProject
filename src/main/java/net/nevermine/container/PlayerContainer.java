package net.nevermine.container;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerContainer implements IExtendedEntityProperties {

	public int runicCounter = 600;
	public int rosidCounter = 300;
	public int hydroplateCounter = 15;
	public int candyCounter = 1800;
	public int archaicCounter = 1600;
	public int mercurialCounter = 10;
	public int omniCounter = 120;
	public int knightCounter = 1;

	public PlayerContainer(final EntityPlayer pl) {
	}

	public void saveNBTData(final NBTTagCompound n) {
	}

	public void loadNBTData(final NBTTagCompound n) {
	}

	@SubscribeEvent
	public void init(final Entity entity, final World world) {
	}

	public static PlayerContainer getProperties(final EntityPlayer pl) {
		return (PlayerContainer)pl.getExtendedProperties("AoAPlayer");
	}
}
