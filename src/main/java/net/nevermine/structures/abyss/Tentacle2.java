package net.nevermine.structures.abyss;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class Tentacle2 extends WorldGenerator {
	protected int[] GetValidSpawnBlocks() {
		return new int[0];
	}

	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		world.setBlock(i + 0, j + 6, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 0, j + 7, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 0, j + 8, k + 0, Blockizer.TentacleBlock);
		world.setBlock(i + 0, j + 8, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 1, j + 0, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 1, j + 1, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 1, j + 2, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 1, j + 3, k + 1, Blockizer.TentacleEyeRed);
		world.setBlock(i + 1, j + 4, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 1, j + 5, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 1, j + 6, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 2, j + 6, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 3, j + 6, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 3, j + 7, k + 1, Blockizer.TentacleBlock);
		world.setBlock(i + 3, j + 7, k + 2, Blockizer.TentacleBlock);
		return true;
	}
}
