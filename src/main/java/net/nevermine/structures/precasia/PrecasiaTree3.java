package net.nevermine.structures.precasia;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class PrecasiaTree3 extends WorldGenerator {
	protected int[] GetValidSpawnBlocks() {
		return new int[0];
	}

	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		if (world.getBlock(i + 6, j - 1, k + 6) != Blockizer.GrassPrecasia && world.getBlock(i + 6, j - 1, k + 6) != Blockizer.StonePrecasianHigh) {
			return false;
		}
		world.setBlock(i + 0, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 0, j + 13, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 1, j + 13, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 1, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 1, j + 13, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 1, j + 13, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 1, j + 14, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 1, j + 14, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 12, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 2, j + 12, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 2, j + 13, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 13, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 13, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 13, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 13, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 14, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 14, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 14, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 14, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 15, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 2, j + 15, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 10, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 10, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 11, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 3, j + 11, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 3, j + 13, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 13, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 13, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 14, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 14, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 16, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 19, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 19, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 19, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 3, j + 19, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 10, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 10, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 10, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 10, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 4, j + 10, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 4, j + 10, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 10, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 10, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 11, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 11, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 16, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 16, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 16, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 17, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 18, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 18, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 4, j + 19, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 0, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 0, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 1, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 1, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 2, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 2, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 3, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 3, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 4, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 4, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 5, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 5, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 6, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 6, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 7, k + 5, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 7, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 7, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 7, k + 8, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 8, k + 4, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 8, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 8, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 8, k + 9, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 9, k + 3, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 9, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 9, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 9, k + 10, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 10, k + 1, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 10, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 10, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 10, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 10, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 10, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 10, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 10, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 10, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 10, k + 12, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 11, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 11, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 11, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 11, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 11, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 11, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 11, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 11, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 12, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 12, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 12, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 12, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 13, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 13, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 13, k + 8, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 14, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 14, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 14, k + 9, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 15, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 15, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 15, k + 10, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 16, k + 5, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 16, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 16, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 16, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 16, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 16, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 16, k + 12, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 17, k + 4, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 17, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 17, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 17, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 17, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 17, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 18, k + 3, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 18, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 18, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 5, j + 18, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 18, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 19, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 20, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 20, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 20, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 5, j + 20, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 0, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 0, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 1, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 1, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 2, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 2, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 3, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 3, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 4, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 4, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 5, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 5, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 6, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 6, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 7, k + 5, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 7, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 7, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 7, k + 8, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 8, k + 4, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 8, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 8, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 8, k + 9, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 9, k + 3, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 9, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 9, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 9, k + 10, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 10, k + 1, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 10, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 10, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 12, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 10, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 11, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 11, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 11, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 11, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 11, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 11, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 11, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 12, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 12, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 12, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 12, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 13, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 13, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 13, k + 8, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 14, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 14, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 14, k + 9, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 15, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 15, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 15, k + 10, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 16, k + 5, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 16, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 16, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 16, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 16, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 16, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 16, k + 12, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 17, k + 4, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 17, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 17, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 17, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 17, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 17, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 18, k + 3, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 18, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 18, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 6, j + 18, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 18, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 19, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 20, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 20, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 20, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 6, j + 20, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 10, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 10, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 10, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 10, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 7, j + 10, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 7, j + 10, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 10, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 10, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 11, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 11, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 16, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 16, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 16, k + 11, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 17, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 18, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 18, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 2, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 7, j + 19, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 10, k + 3, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 10, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 11, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 8, j + 11, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 8, j + 13, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 13, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 13, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 14, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 14, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 16, k + 10, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 19, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 19, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 19, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 8, j + 19, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 12, k + 6, Blockizer.WoodLucalus);
		world.setBlock(i + 9, j + 12, k + 7, Blockizer.WoodLucalus);
		world.setBlock(i + 9, j + 13, k + 4, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 13, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 13, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 13, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 13, k + 9, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 14, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 14, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 14, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 14, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 15, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 9, j + 15, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 10, j + 13, k + 5, Blockizer.LeavesLucalus);
		world.setBlock(i + 10, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 10, j + 13, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 10, j + 13, k + 8, Blockizer.LeavesLucalus);
		world.setBlock(i + 10, j + 14, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 10, j + 14, k + 7, Blockizer.LeavesLucalus);
		world.setBlock(i + 11, j + 13, k + 6, Blockizer.LeavesLucalus);
		world.setBlock(i + 11, j + 13, k + 7, Blockizer.LeavesLucalus);
		return true;
	}
}
