package net.nevermine.block.functional;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.nevermine.izer.Itemizer;

public class AscensionShrine extends Block {
	private static Block.SoundType rck = Block.soundTypeGlass;

	public AscensionShrine(final Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(Itemizer.FurnitureTab);
		setHardness(5.0f);
		setResistance(0.5f);
		setSoundType(AscensionShrine.rck);
	}

	public int getRenderBlockPass() {
		return 1;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(final IBlockAccess blockAccess, final int x, final int y, final int z, final int side) {
		final Block i1 = blockAccess.getBlock(x, y, z);
		return i1 != this && super.shouldSideBeRendered(blockAccess, x, y, z, side);
	}

	public Block setSoundType(final Block.SoundType name) {
		return setStepSound(name);
	}
}
