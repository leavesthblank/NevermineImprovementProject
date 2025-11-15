package net.nevermine.block.generation.structure;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.nevermine.izer.Itemizer;

public class RuneShrine extends Block {
	public RuneShrine(final Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(Itemizer.GenerationTab);
		setHardness(1.0f);
		setResistance(5.0f);
	}

	public boolean onBlockActivated(final World w, final int x, final int y, final int z, final EntityPlayer p, final int var6, final float var7, final float var8, final float var9) {
		if (w.isRemote || p.isSneaking())
			return true;

        Block bl = w.getBlock(x + 3, y + 2, z + 3);
		boolean success = false;

		switch (bl.getUnlocalizedName()) {
			case "tile.runePostFire":
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.FireRune, 1);
					success = true;
				}
				break;
			case "tile.runePostWater":
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.WaterRune, 1);
					success = true;
				}
				break;
			case "tile.runePostPoison":
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.PoisonRune, 1);
					success = true;
				}
				break;
			case "tile.runePostWither":
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.WitherRune, 1);
					success = true;
				}
				break;
			case "tile.runePostLunar":
				if (p.inventory.consumeInventoryItem(Itemizer.RuneCharged)) {
					p.dropItem(Itemizer.LunarRune, 1);
					success = true;
				}
				break;
			case "tile.runePostEnergy":
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.EnergyRune,1);
					success = true;
				}
				break;
			case "tile.runePostStrike":
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.StrikeRune, 1);
					success = true;
				}
				break;
			case "tile.runePostStorm":
				if (p.inventory.consumeInventoryItem(Itemizer.RuneCharged)) {
					p.dropItem(Itemizer.StormRune, 1);
					success = true;
				}
				break;
			case "tile.runePostKinetic":
				if (p.inventory.consumeInventoryItem(Itemizer.RuneCharged)) {
					p.dropItem(Itemizer.KineticRune, 1);
					success = true;
				}
				break;
			case "tile.runePostPower":
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.PowerRune, 1);
					success = true;
				}
				break;
			case "tile.runePostCompass":
				if (p.inventory.consumeInventoryItem(Itemizer.RuneCharged)) {
					p.dropItem(Itemizer.CompassRune, 1);
					success = true;
				}
				break;
			case "tile.runePostDistortion":
				if (p.inventory.consumeInventoryItem(Itemizer.RuneCharged)) {
					p.dropItem(Itemizer.DistortionRune, 1);
					success = true;
				}
				break;
			case "tile.runePostLife":
				if (p.inventory.consumeInventoryItem(Itemizer.RuneCharged)) {
					p.dropItem(Itemizer.LifeRune, 1);
					success = true;
				}
				break;
			default:
				if (p.inventory.consumeInventoryItem(Itemizer.Rune)) {
					p.dropItem(Itemizer.WindRune, 1);
					success = true;
				}
				break;
		}

		if (success) {
			w.playSoundAtEntity(p, "nevermine:RuneMake", 1.85f, 1.0f);

			if (p instanceof EntityPlayerMP)
				((EntityPlayerMP)p).sendContainerToPlayer(p.inventoryContainer);
		}

		return true;
	}
}
