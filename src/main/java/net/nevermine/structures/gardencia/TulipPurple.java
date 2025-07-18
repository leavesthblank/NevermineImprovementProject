package net.nevermine.structures.gardencia;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class TulipPurple extends WorldGenerator {
	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		if (world.getBlock(i + 5, j - 1, k + 1) != Blockizer.GrassGardencia && world.getBlock(i + 5, j - 1, k + 1) != Blockizer.DirtGardencia) {
			return false;
		}
		world.setBlock(i + 0, j + 7, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 7, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 8, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 8, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 8, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 8, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 9, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 9, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 9, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 9, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 10, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 10, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 10, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 10, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 11, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 11, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 12, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 0, j + 12, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 7, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 7, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 1, j + 7, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 1, j + 7, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 8, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 8, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 8, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 8, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 9, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 9, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 9, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 9, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 10, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 10, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 10, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 1, j + 10, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 0, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 0, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 1, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 1, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 2, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 2, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 3, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 3, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 4, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 4, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 5, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 5, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 6, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 6, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 7, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 7, k + 1, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 7, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 7, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 7, k + 4, Blockizer.PlantStem);
		world.setBlock(i + 2, j + 7, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 8, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 8, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 8, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 8, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 8, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 8, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 9, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 9, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 9, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 9, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 9, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 9, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 10, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 10, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 10, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 10, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 10, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 10, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 11, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 11, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 11, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 11, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 12, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 12, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 12, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 2, j + 12, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 0, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 0, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 1, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 1, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 2, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 2, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 3, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 3, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 4, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 4, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 5, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 5, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 6, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 6, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 7, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 7, k + 1, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 7, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 7, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 7, k + 4, Blockizer.PlantStem);
		world.setBlock(i + 3, j + 7, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 8, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 8, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 8, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 8, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 8, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 8, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 9, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 9, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 9, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 9, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 9, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 9, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 10, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 10, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 10, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 10, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 10, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 10, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 11, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 11, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 11, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 11, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 12, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 12, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 12, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 3, j + 12, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 7, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 7, k + 2, Blockizer.PlantStem);
		world.setBlock(i + 4, j + 7, k + 3, Blockizer.PlantStem);
		world.setBlock(i + 4, j + 7, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 8, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 8, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 8, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 8, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 9, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 9, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 9, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 9, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 10, k + 0, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 10, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 10, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 4, j + 10, k + 5, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 7, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 7, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 8, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 8, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 8, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 8, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 9, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 9, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 9, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 9, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 10, k + 1, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 10, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 10, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 10, k + 4, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 11, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 11, k + 3, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 12, k + 2, Blockizer.PedalsPurple);
		world.setBlock(i + 5, j + 12, k + 3, Blockizer.PedalsPurple);
		return true;
	}
}
