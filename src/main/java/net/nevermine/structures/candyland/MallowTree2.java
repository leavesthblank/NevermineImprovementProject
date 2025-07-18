package net.nevermine.structures.candyland;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class MallowTree2 extends WorldGenerator {

	public MallowTree2() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 6, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 6, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 6, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 7, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 7, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 7, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 8, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 8, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 8, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 9, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 9, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 0, j + 9, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 0, k + 1, Blockizer.Licorice);
		world.setBlock(i + 1, j + 1, k + 1, Blockizer.Licorice);
		world.setBlock(i + 1, j + 2, k + 1, Blockizer.Licorice);
		world.setBlock(i + 1, j + 3, k + 1, Blockizer.Licorice);
		world.setBlock(i + 1, j + 4, k + 1, Blockizer.Licorice);
		world.setBlock(i + 1, j + 5, k + 1, Blockizer.Licorice);
		world.setBlock(i + 1, j + 6, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 6, k + 1, Blockizer.Licorice);
		world.setBlock(i + 1, j + 6, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 7, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 7, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 7, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 8, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 8, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 8, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 9, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 9, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 1, j + 9, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 6, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 6, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 6, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 7, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 7, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 7, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 8, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 8, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 8, k + 2, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 9, k + 0, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 9, k + 1, Blockizer.Marshmallow);
		world.setBlock(i + 2, j + 9, k + 2, Blockizer.Marshmallow);

		return true;
	}
}