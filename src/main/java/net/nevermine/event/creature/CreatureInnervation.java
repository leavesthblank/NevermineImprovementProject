package net.nevermine.event.creature;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;

import java.util.Random;

public class CreatureInnervation {
	private Random rand;

	public CreatureInnervation() {
		rand = new Random();
	}

	@SubscribeEvent
	public void goldPickup(final PlayerEvent.ItemPickupEvent e) {
		if (!e.player.worldObj.isRemote && (e.pickedUp.getEntityItem().getItem() == Itemizer.PureGold || e.pickedUp.getEntityItem().getItem() == Itemizer.ImpureGold)) {
			e.player.inventory.consumeInventoryItem(e.pickedUp.getEntityItem().getItem());
		}
	}

	@SubscribeEvent
	public void heartToss(final ItemTossEvent e) {
		if (!e.player.worldObj.isRemote && e.entityItem.getEntityItem().getItem() == Itemizer.HeartStone) {
			for (int i = 0; i < e.entityItem.getEntityItem().stackSize; i++) {
				e.player.heal(20);
			}
			e.entityItem.setDead();
			e.player.worldObj.playSoundAtEntity(e.player, "nevermine:HeartPickup", 2.85f, 1.0f);
		}
	}

	@SubscribeEvent
	public void heartPickup(final PlayerEvent.ItemPickupEvent e) {
		if (!e.player.worldObj.isRemote && e.pickedUp.getEntityItem().getItem() == Itemizer.HeartStone) {
			e.player.heal(20);
			e.pickedUp.setDead();
			e.player.worldObj.playSoundAtEntity(e.player, "nevermine:HeartPickup", 2.85f, 1.0f);
		}
	}

	@SubscribeEvent
	public void onPlayerInnervationDodge(final LivingHurtEvent e) {
		if (!e.entity.worldObj.isRemote && e.entity instanceof EntityPlayer && e.source != DamageSource.outOfWorld && e.source != DamageSource.starve) {

            if (rand.nextInt(4) == 0) {
				if (rand.nextBoolean()) {
					e.setCanceled(true);
				}
				else {
					((EntityLivingBase)e.entity).heal(4.0f);
				}

				e.entity.worldObj.playSoundAtEntity(e.entity, "nevermine:MagickeFire", 1.0f, 1.0f);
			}
		}
	}

	@SubscribeEvent
	public void onKill(final LivingDeathEvent e) {
		if (!e.entity.worldObj.isRemote && e.entity instanceof EntityLiving) {
			if (rand.nextInt(8) == 5) {
				e.entity.worldObj.playSoundAtEntity(e.entity, "nevermine:HeartstoneDrop", 2.85f, 1.0f);
				e.entity.dropItem(Itemizer.HeartStone, 1);
			}

            if(e.entity.dimension==0){
                if(rand.nextInt(4)==0){
                    e.entity.dropItem(Itemizer.CopperCoin,rand.nextInt(9));
                }
                if(rand.nextInt(27)==0){
                    e.entity.dropItem(Plantizer.TeaSeeds,1);
                }
                if(rand.nextInt(11)==0){
                    e.entity.dropItem(Items.bone,1);
                }
                if(rand.nextInt(15)==0){
                    e.entity.dropItem(Items.coal,1);
                }
                if(rand.nextInt(200)==0){
                    e.entity.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune1),1);
                }
                if(rand.nextInt(200)==0){
                    e.entity.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune2),1);
                }
                if(rand.nextInt(200)==0){
                    e.entity.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune3),1);
                }
                if(rand.nextInt(200)==0){
                    e.entity.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune6),1);
                }
            }

			if (rand.nextInt(100) != 0)
				return;

			switch (rand.nextInt(7)) {
				case 0:
					e.entity.dropItem(Itemizer.pStoneBlooming, 1);
					break;
				case 1:
					e.entity.dropItem(Itemizer.pStoneGleaming, 1);
					break;
				case 2:
					e.entity.dropItem(Itemizer.pStoneGlaring, 1);
					break;
				case 3:
					e.entity.dropItem(Itemizer.pStoneGlowing, 1);
					break;
				case 4:
					e.entity.dropItem(Itemizer.pStoneGlistening, 1);
					break;
				case 5:
					e.entity.dropItem(Itemizer.pStoneRadiant, 1);
					break;
				case 6:
					e.entity.dropItem(Itemizer.pStoneShining, 1);
					break;
				default:
					break;
			}
		}
	}
}
