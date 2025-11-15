package net.nevermine.container;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerContainer implements IExtendedEntityProperties {
	private final EntityPlayer player;

	public int runicCounter = 600;
	public int rosidCounter = 300;
	public int hydroplateCounter = 15;
	public int candyCounter = 1800;
	public int archaicCounter = 1600;
	public int mercurialCounter = 10;
	public int omniCounter = 120;
	public int knightCounter = 1;

	private PortalCoordinatesContainer portalReturnLocation = new PortalCoordinatesContainer(0, 0, 0);

	public PlayerContainer(final EntityPlayer pl) {
		player = pl;
	}

	public void saveNBTData(final NBTTagCompound n) {
		saveNBTPortalReturnData(n);
	}

	public void saveNBTPortalReturnData(NBTTagCompound baseTag) {
		final NBTTagCompound tag = baseTag.getCompoundTag("PlayerPersisted");

		final NBTTagCompound portalTag = new NBTTagCompound();

		portalTag.setDouble("posX", portalReturnLocation.x);
		portalTag.setDouble("posY", portalReturnLocation.y);
		portalTag.setDouble("posZ", portalReturnLocation.z);

		tag.setTag("PortalReturnLoc", portalTag);
		baseTag.setTag("PlayerPersisted", tag);
		player.getEntityData().setTag("PlayerPersisted", tag);
	}

	public void loadNBTData(final NBTTagCompound n) {
		final NBTTagCompound tag = n.getCompoundTag("PlayerPersisted");

		if (tag.hasKey("PortalReturnLoc")) {
			NBTTagCompound portalTag = tag.getCompoundTag("PortalReturnLoc");
			portalReturnLocation = new PortalCoordinatesContainer(portalTag.getDouble("posX"), portalTag.getDouble("posY"), portalTag.getDouble("posZ"));
		}

		player.getEntityData().setTag("PlayerPersisted", tag);
	}

	public void setPortalReturnLocation(final PortalCoordinatesContainer loc) {
		portalReturnLocation = loc;
	}

	public PortalCoordinatesContainer getPortalReturnLocation() {
		return portalReturnLocation;
	}

	@SubscribeEvent
	public void init(final Entity entity, final World world) {
	}

	public static PlayerContainer getProperties(final EntityPlayer pl) {
		return (PlayerContainer)pl.getExtendedProperties("AoAPlayer");
	}
}
