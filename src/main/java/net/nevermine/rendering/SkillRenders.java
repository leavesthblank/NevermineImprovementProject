package net.nevermine.rendering;

import net.nevermine.common.nevermine;
import net.nevermine.resource.energy.energyRenderer;

public class SkillRenders {
	public static void init() {
		nevermine.addSpecialEventBus(new energyRenderer());
	}
}
