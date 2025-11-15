package net.nevermine.block.functional;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.nevermine.izer.Itemizer;

public class CavernShrine extends Block {
	private static Block.SoundType rck = Block.soundTypeStone;

	public CavernShrine(final Material p_i45394_1_) {
		super(p_i45394_1_);
		setCreativeTab(Itemizer.TablesTab);
		setHardness(-1.0f);
		setResistance(999999999f);
		setSoundType(CavernShrine.rck);
	}
	public Block setSoundType(final Block.SoundType name) {
		return setStepSound(name);
	}
}
