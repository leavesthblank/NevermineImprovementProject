package net.nevermine.structures.dustopia;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class Cage2 extends WorldGenerator {
	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		if (world.getBlock(i + 1, j - 1, k + 5) != Blockizer.GrassDustopia && world.getBlock(i + 1, j - 1, k + 5) != Blockizer.DirtDustopia) {
			return false;
		}
		world.setBlock(i + 0, j + 5, k + 0, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 5, k + 1, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 5, k + 2, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 5, k + 8, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 5, k + 9, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 5, k + 10, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 6, k + 0, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 6, k + 1, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 6, k + 2, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 6, k + 8, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 6, k + 9, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 6, k + 10, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 7, k + 0, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 7, k + 1, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 7, k + 2, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 7, k + 8, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 7, k + 9, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 7, k + 10, Blockizer.DawnwoodBars);
		world.setBlock(i + 0, j + 8, k + 0, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 8, k + 1, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 8, k + 2, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 8, k + 8, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 8, k + 9, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 0, j + 8, k + 10, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 0, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 1, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 2, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 3, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 4, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 5, k + 0, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 5, k + 1, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 5, k + 2, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 5, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 5, k + 8, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 5, k + 9, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 5, k + 10, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 6, k + 0, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 6, k + 2, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 6, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 6, k + 8, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 6, k + 10, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 7, k + 0, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 7, k + 2, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 7, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 7, k + 8, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 7, k + 10, Blockizer.DawnwoodBars);
		world.setBlock(i + 1, j + 8, k + 0, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 8, k + 1, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 8, k + 2, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 8, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 8, k + 8, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 8, k + 9, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 8, k + 10, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 1, j + 9, k + 1, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 9, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 9, k + 9, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 1, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 2, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 3, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 4, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 5, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 6, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 7, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 8, Blockizer.StoneDustopia);
		world.setBlock(i + 1, j + 10, k + 9, Blockizer.StoneDustopia);
		world.setBlock(i + 2, j + 5, k + 0, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 5, k + 1, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 5, k + 2, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 5, k + 8, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 5, k + 9, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 5, k + 10, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 6, k + 0, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 6, k + 1, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 6, k + 2, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 6, k + 8, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 6, k + 9, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 6, k + 10, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 7, k + 0, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 7, k + 1, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 7, k + 2, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 7, k + 8, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 7, k + 9, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 7, k + 10, Blockizer.DawnwoodBars);
		world.setBlock(i + 2, j + 8, k + 0, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 8, k + 1, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 8, k + 2, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 8, k + 8, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 8, k + 9, Blockizer.DawnwoodPlanks);
		world.setBlock(i + 2, j + 8, k + 10, Blockizer.DawnwoodPlanks);
		return true;
	}
}
