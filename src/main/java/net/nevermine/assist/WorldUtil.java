package net.nevermine.assist;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class WorldUtil {

	public static int getTrueWorldHeight(World world, int x, int z) {
		Block bl;
		boolean match1 = false;
		boolean match2 = false;

		try {
			int height;

			if (world.provider.dimensionId == ConfigurationHelper.deeplands) {
				height = 121;
			}
			else if (world.provider.dimensionId == -1) {
				height = 128;
			}
			else if (world.provider.dimensionId == ConfigurationHelper.crystevia) {
				height = 127;
			}
			else {
				return world.getHeightValue(x, z);
			}

			if (Math.abs(x) > 30000000 || Math.abs(z) > 30000000)
				return 64;

			for (int i = height; i > 0; i--) {
				if (world.getBlock(x, i, z) == Blocks.air) {
					if (match1) {
						if (!match2)
							match2 = true;
					}
					else {
						match1 = true;
					}
				}
				else {
					if (match1 && match2)
						return i;

					match1 = false;
					match2 = false;
				}
			}
		}
		catch (Exception e) {
			return 0;
		}

		return 0;
	}
}
