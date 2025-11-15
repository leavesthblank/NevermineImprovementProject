package net.nevermine.assist;

import net.nevermine.common.nevermine;
import net.nevermine.event.creature.CreatureInnervation;
import net.nevermine.event.dimensional.*;
import net.nevermine.event.equipment.*;
import net.nevermine.event.player.liveDieEvent;
import net.nevermine.event.player.worldJoin;
import net.nevermine.event.resource.*;
import net.nevermine.resource.boss.bossBarTickHandler;
import net.nevermine.resource.energy.energyTickHandler;

public class AddBusses {
	public static void init() {
		nevermine.addSpecialEventBus(new worldJoin());
		nevermine.addEventBus(new worldJoin());
		nevermine.addEventBus(new ArmorEffects());
		nevermine.addSpecialEventBus(new ArmorEffects());
		nevermine.addSpecialEventBus(new CreatureInnervation());
		nevermine.addEventBus(new CreatureInnervation());
		nevermine.addSpecialEventBus(new SniperEvent());
		nevermine.addSpecialEventBus(new HoldItemEvent());
		nevermine.addSpecialEventBus(new HelmetEvent());
		nevermine.addEventBus(new SniperEvent());
		nevermine.addSpecialEventBus(new CavernAmbientEvent());
		nevermine.addSpecialEventBus(new LelyetianUnder());
		nevermine.addSpecialEventBus(new TributeTicker());
		nevermine.addEventBus(new TributeTicker());
		nevermine.addSpecialEventBus(new liveDieEvent());
		nevermine.postForgeEvent(new liveDieEvent());
		nevermine.addEventBus(new HarvestingTracker());
		nevermine.addSpecialEventBus(new energyTickHandler());
		nevermine.addSpecialEventBus(new bossBarTickHandler());
	}
}
