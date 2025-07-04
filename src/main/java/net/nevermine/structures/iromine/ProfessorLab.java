package net.nevermine.structures.iromine;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.SpecialBlockizer;
import net.nevermine.npc.entity.EntityProfessor;

import java.util.Random;

public class ProfessorLab extends WorldGenerator {

	public ProfessorLab() {
	}

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 0, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 0, j + 1, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 0, j + 2, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 0, j + 3, k + 7, Blockizer.CogBlock);
		world.setBlock(i + 0, j + 4, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 0, j + 5, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 0, j + 6, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 1, j + 6, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 0, k + 0, SpecialBlockizer.Iropole);
		world.setBlock(i + 2, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 1, k + 0, SpecialBlockizer.Iropole);
		world.setBlock(i + 2, j + 1, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 2, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 2, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 4, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 5, k + 0, SpecialBlockizer.Iropole);
		world.setBlock(i + 2, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 6, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 6, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 6, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 2, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 0, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 3, j + 1, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 1, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 1, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 1, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 1, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 1, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 1, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 1, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 1, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 3, j + 2, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 2, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 2, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 2, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 3, j + 2, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 3, j + 2, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 3, j + 2, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 2, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 2, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 3, j + 3, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 3, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 3, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 3, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 3, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 3, k + 10, Blockizer.CogBlock);
		world.setBlock(i + 3, j + 4, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 4, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 3, j + 5, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 5, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 3, j + 6, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 6, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 6, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 6, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 3, j + 6, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 3, j + 6, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 3, j + 6, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 6, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 6, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 6, k + 10, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 7, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 3, j + 7, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 7, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 7, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 7, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 7, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 3, j + 7, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 1, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 2, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 2, k + 7, Blockizer.IroGlass);
		world.setBlock(i + 4, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 4, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 6, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 6, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 4, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 8, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 8, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 8, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 4, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 1, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 2, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 5, j + 2, k + 7, Blockizer.IroGlass);
		world.setBlock(i + 5, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 5, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 6, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 5, j + 6, k + 7, Blockizer.IroGlass);
		world.setBlock(i + 5, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 5, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 5, j + 8, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 5, j + 8, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 5, j + 8, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 5, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 1, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 2, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 6, j + 2, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 4, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 6, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 5, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 6, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 6, j + 6, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 6, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 6, j + 8, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 6, j + 8, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 6, j + 8, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 6, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 0, k + 7, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 2, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 7, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 4, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 7, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 5, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 5, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 6, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 7, j + 6, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 6, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 7, j + 7, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 9, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 9, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 7, j + 9, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 0, k + 7, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 2, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 8, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 4, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 8, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 5, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 5, k + 9, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 6, k + 1, Blockizer.IroGlass);
		if (!world.isRemote) {
			EntityProfessor var2 = new EntityProfessor(world);
			var2.setLocationAndAngles(i + 8, j + 6, k + 5, rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(var2);
		}
		world.setBlock(i + 8, j + 6, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 6, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 8, j + 7, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 8, j + 9, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 8, j + 9, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 8, j + 9, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 9, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 0, k + 7, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 2, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 9, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 3, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 4, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 9, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 5, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 5, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 6, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 9, j + 6, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 6, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 9, j + 7, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 9, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 9, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 9, j + 9, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 1, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 2, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 10, j + 2, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 4, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 10, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 5, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 6, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 10, j + 6, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 10, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 10, j + 8, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 10, j + 8, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 10, j + 8, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 10, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 0, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 0, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 0, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 0, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 0, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 1, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 1, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 2, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 2, k + 7, Blockizer.IroGlass);
		world.setBlock(i + 11, j + 3, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 5, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 5, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 5, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 5, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 11, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 6, k + 1, Blockizer.IroGlass);
		world.setBlock(i + 11, j + 6, k + 7, Blockizer.IroGlass);
		world.setBlock(i + 11, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 11, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 11, j + 8, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 11, j + 8, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 11, j + 8, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 11, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 0, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 0, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 0, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 0, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 0, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 1, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 1, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 1, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 1, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 1, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 1, k + 6, Blockizer.IroCarpet);
		world.setBlock(i + 12, j + 1, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 2, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 2, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 2, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 2, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 2, k + 5, Blockizer.IroCarpet);
		world.setBlock(i + 12, j + 2, k + 7, Blockizer.IroGlass);
		world.setBlock(i + 12, j + 3, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 3, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 3, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 3, k + 4, Blockizer.IroCarpet);
		world.setBlock(i + 12, j + 3, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 4, k + 3, Blockizer.IroCarpet);
		world.setBlock(i + 12, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 5, k + 2, Blockizer.IroCarpet);
		world.setBlock(i + 12, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 6, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 6, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 7, k + 1, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 7, k + 7, Blockizer.IrobrickStriped);
		world.setBlock(i + 12, j + 8, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 8, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 8, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 8, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 12, j + 8, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 0, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 13, j + 1, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 1, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 1, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 1, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 1, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 1, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 1, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 1, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 1, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 13, j + 2, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 2, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 2, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 2, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 2, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 2, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 2, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 2, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 2, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 13, j + 3, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 3, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 3, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 3, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 3, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 3, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 3, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 3, k + 10, Blockizer.CogBlock);
		world.setBlock(i + 13, j + 4, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 4, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 13, j + 5, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 2, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 3, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 4, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 5, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 6, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 5, k + 10, SpecialBlockizer.Iropole);
		world.setBlock(i + 13, j + 6, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 6, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 6, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 6, k + 3, Blockizer.IroGlass);
		world.setBlock(i + 13, j + 6, k + 4, Blockizer.IroGlass);
		world.setBlock(i + 13, j + 6, k + 5, Blockizer.IroGlass);
		world.setBlock(i + 13, j + 6, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 6, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 6, k + 9, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 6, k + 10, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 7, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 13, j + 7, k + 2, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 7, k + 3, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 7, k + 4, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 7, k + 5, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 7, k + 6, Blockizer.IrobrickStriped);
		world.setBlock(i + 13, j + 7, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 0, k + 0, SpecialBlockizer.Iropole);
		world.setBlock(i + 14, j + 0, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 1, k + 0, SpecialBlockizer.Iropole);
		world.setBlock(i + 14, j + 1, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 2, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 2, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 4, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 4, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 5, k + 0, SpecialBlockizer.Iropole);
		world.setBlock(i + 14, j + 5, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 5, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 6, k + 0, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 6, k + 1, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 6, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 14, j + 6, k + 8, Blockizer.IrobrickDotted);
		world.setBlock(i + 15, j + 6, k + 7, Blockizer.IrobrickDotted);
		world.setBlock(i + 16, j + 0, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 16, j + 1, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 16, j + 2, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 16, j + 3, k + 7, Blockizer.CogBlock);
		world.setBlock(i + 16, j + 4, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 16, j + 5, k + 7, SpecialBlockizer.Iropole);
		world.setBlock(i + 16, j + 6, k + 7, Blockizer.IrobrickDotted);

		return true;
	}
}