package net.nevermine.structures.abyss;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;
import net.nevermine.npc.entity.lottoman.EntityLottomanAbyss;

import java.util.Random;

public class LottoAbyssStructure extends WorldGenerator {
	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		world.setBlock(i + 0, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 7, k + 1, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 7, k + 2, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 7, k + 3, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 7, k + 4, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 7, k + 5, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 7, k + 6, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 8, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 8, k + 1, Blocks.iron_bars);
		world.setBlock(i + 0, j + 8, k + 2, Blocks.iron_bars);
		world.setBlock(i + 0, j + 8, k + 3, Blocks.iron_bars);
		world.setBlock(i + 0, j + 8, k + 4, Blocks.iron_bars);
		world.setBlock(i + 0, j + 8, k + 5, Blocks.iron_bars);
		world.setBlock(i + 0, j + 8, k + 6, Blocks.iron_bars);
		world.setBlock(i + 0, j + 8, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 9, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 0, j + 9, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 1, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 1, j + 7, k + 1, Blocks.glass);
		world.setBlock(i + 1, j + 7, k + 2, Blocks.glass);
		world.setBlock(i + 1, j + 7, k + 3, Blocks.glass);
		world.setBlock(i + 1, j + 7, k + 4, Blocks.glass);
		world.setBlock(i + 1, j + 7, k + 5, Blocks.glass);
		world.setBlock(i + 1, j + 7, k + 6, Blocks.glass);
		world.setBlock(i + 1, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 1, j + 8, k + 0, Blocks.iron_bars);
		world.setBlock(i + 1, j + 8, k + 7, Blocks.iron_bars);
		world.setBlock(i + 2, j + 0, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 0, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 1, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 1, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 2, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 2, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 3, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 3, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 4, k + 2, Blockizer.EyeBlock);
		world.setBlock(i + 2, j + 4, k + 5, Blockizer.EyeBlock);
		world.setBlock(i + 2, j + 5, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 5, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 6, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 6, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 2, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 2, j + 7, k + 1, Blocks.glass);
		world.setBlock(i + 2, j + 7, k + 2, Blockizer.BloodstoneBricks);
		world.setBlock(i + 2, j + 7, k + 3, Blockizer.BloodstoneBricks);
		world.setBlock(i + 2, j + 7, k + 4, Blockizer.BloodstoneBricks);
		world.setBlock(i + 2, j + 7, k + 5, Blockizer.BloodstoneBricks);
		world.setBlock(i + 2, j + 7, k + 6, Blocks.glass);
		world.setBlock(i + 2, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 2, j + 8, k + 0, Blocks.iron_bars);
		world.setBlock(i + 2, j + 8, k + 7, Blocks.iron_bars);
		world.setBlock(i + 3, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 3, j + 7, k + 1, Blocks.glass);
		world.setBlock(i + 3, j + 7, k + 2, Blockizer.BloodstoneBricks);
		world.setBlock(i + 3, j + 7, k + 3, Blocks.glass);
		world.setBlock(i + 3, j + 7, k + 4, Blocks.glass);
		world.setBlock(i + 3, j + 7, k + 5, Blockizer.BloodstoneBricks);
		world.setBlock(i + 3, j + 7, k + 6, Blocks.glass);
		world.setBlock(i + 3, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 3, j + 8, k + 0, Blocks.iron_bars);
		world.setBlock(i + 3, j + 8, k + 7, Blocks.iron_bars);
		if (!world.isRemote) {
			final EntityLottomanAbyss var2 = new EntityLottomanAbyss(world);
			var2.setLocationAndAngles((double)(i + 3), (double)(j + 9), (double)(k + 4), rand.nextFloat() * 360.0f, 0.0f);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 4, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 4, j + 7, k + 1, Blocks.glass);
		world.setBlock(i + 4, j + 7, k + 2, Blockizer.BloodstoneBricks);
		world.setBlock(i + 4, j + 7, k + 3, Blocks.glass);
		world.setBlock(i + 4, j + 7, k + 4, Blocks.glass);
		world.setBlock(i + 4, j + 7, k + 5, Blockizer.BloodstoneBricks);
		world.setBlock(i + 4, j + 7, k + 6, Blocks.glass);
		world.setBlock(i + 4, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 4, j + 8, k + 0, Blocks.iron_bars);
		world.setBlock(i + 4, j + 8, k + 7, Blocks.iron_bars);
		world.setBlock(i + 5, j + 0, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 0, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 1, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 1, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 2, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 2, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 3, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 3, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 4, k + 2, Blockizer.EyeBlock);
		world.setBlock(i + 5, j + 4, k + 5, Blockizer.EyeBlock);
		world.setBlock(i + 5, j + 5, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 5, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 6, k + 2, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 6, k + 5, Blockizer.BloodStrands);
		world.setBlock(i + 5, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 5, j + 7, k + 1, Blocks.glass);
		world.setBlock(i + 5, j + 7, k + 2, Blockizer.BloodstoneBricks);
		world.setBlock(i + 5, j + 7, k + 3, Blockizer.BloodstoneBricks);
		world.setBlock(i + 5, j + 7, k + 4, Blockizer.BloodstoneBricks);
		world.setBlock(i + 5, j + 7, k + 5, Blockizer.BloodstoneBricks);
		world.setBlock(i + 5, j + 7, k + 6, Blocks.glass);
		world.setBlock(i + 5, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 5, j + 8, k + 0, Blocks.iron_bars);
		world.setBlock(i + 5, j + 8, k + 7, Blocks.iron_bars);
		world.setBlock(i + 6, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 6, j + 7, k + 1, Blocks.glass);
		world.setBlock(i + 6, j + 7, k + 2, Blocks.glass);
		world.setBlock(i + 6, j + 7, k + 3, Blocks.glass);
		world.setBlock(i + 6, j + 7, k + 4, Blocks.glass);
		world.setBlock(i + 6, j + 7, k + 5, Blocks.glass);
		world.setBlock(i + 6, j + 7, k + 6, Blocks.glass);
		world.setBlock(i + 6, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 6, j + 8, k + 0, Blocks.iron_bars);
		world.setBlock(i + 6, j + 8, k + 7, Blocks.iron_bars);
		world.setBlock(i + 7, j + 7, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 7, k + 1, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 7, k + 2, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 7, k + 3, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 7, k + 4, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 7, k + 5, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 7, k + 6, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 7, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 8, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 8, k + 1, Blocks.iron_bars);
		world.setBlock(i + 7, j + 8, k + 2, Blocks.iron_bars);
		world.setBlock(i + 7, j + 8, k + 3, Blocks.iron_bars);
		world.setBlock(i + 7, j + 8, k + 4, Blocks.iron_bars);
		world.setBlock(i + 7, j + 8, k + 5, Blocks.iron_bars);
		world.setBlock(i + 7, j + 8, k + 6, Blocks.iron_bars);
		world.setBlock(i + 7, j + 8, k + 7, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 9, k + 0, Blockizer.BloodstoneBricks);
		world.setBlock(i + 7, j + 9, k + 7, Blockizer.BloodstoneBricks);
		return true;
	}
}
