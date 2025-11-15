package net.nevermine.event.equipment;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.nevermine.assist.*;
import net.nevermine.container.PlayerContainer;
import net.nevermine.event.player.HealthMessage;
import net.nevermine.item.ItemRune;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Armorizer;
import net.nevermine.minion.entity.EntityOrbling;
import net.nevermine.minion.entity.EntityRosid;
import net.nevermine.projectiles.auxillary.EntityElementalArrow;
import net.nevermine.projectiles.cannon.EntityGrenadeShot;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ArmorEffects {
	public static final String[] isImmuneToFire;
	public static final String[] isJumping;
	public static final Random rand = new Random();

	@SubscribeEvent
	public void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent e) {
		final EntityPlayer player = e.player;

		final ItemStack stackBoots = player.inventory.armorItemInSlot(0);
		final ItemStack stackLegs = player.inventory.armorItemInSlot(1);
		final ItemStack stackBody = player.inventory.armorItemInSlot(2);
		final ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

		final Item boots = stackBoots != null ? stackBoots.getItem() : null;
		final Item legs = stackLegs != null ? stackLegs.getItem() : null;
		final Item body = stackBody != null ? stackBody.getItem() : null;
		final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;

		if (ArmorUtil.isRockboneArmor(boots, legs, body, helmet)) {
			player.setPositionAndUpdate(player.posX, player.posY + 0.5, player.posZ);
		}
	}

	@SubscribeEvent
	public void onPlayerFallEvent(final LivingFallEvent e) {
        if (e.entity instanceof EntityPlayer && !e.entity.worldObj.isRemote) {
            final EntityPlayer player = (EntityPlayer) e.entity;

            final ItemStack stackBoots = player.inventory.armorItemInSlot(0);
            final ItemStack stackLegs = player.inventory.armorItemInSlot(1);
            final ItemStack stackBody = player.inventory.armorItemInSlot(2);
            final ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

            final Item boots = stackBoots != null ? stackBoots.getItem() : null;
            final Item legs = stackLegs != null ? stackLegs.getItem() : null;
            final Item body = stackBody != null ? stackBody.getItem() : null;
            final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;


            if (ArmorUtil.isRockboneArmor(boots, legs, body, helmet)) {
                e.setCanceled(true);
            }

            if (ArmorUtil.isAmethindArmor(boots, legs, body, helmet)) {
                e.setCanceled(true);
            }

            if (ArmorUtil.isAlacrityArmor(boots, legs, body, helmet)) {
                e.setCanceled(true);
            }

            if (ArmorUtil.isLunarArmor(boots, legs, body, helmet)) {
                e.setCanceled(true);
            }

            if (ArmorUtil.isHunterArmor(boots, legs, body, helmet)) {
                e.setCanceled(true);
            }
        }
    }


	@SubscribeEvent
	public void onPlayerHurtEvent(final LivingHurtEvent e) {
		if (e.entity instanceof EntityPlayer) {
			final DamageSource s = e.source;
			final EntityPlayer player = (EntityPlayer)e.entity;
			PlayerContainer adventPl = PlayerContainer.getProperties(player);

			final ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			final ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			final ItemStack stackBody = player.inventory.armorItemInSlot(2);
			final ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

			final Item boots = stackBoots != null ? stackBoots.getItem() : null;
			final Item legs = stackLegs != null ? stackLegs.getItem() : null;
			final Item body = stackBody != null ? stackBody.getItem() : null;
			final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;


						if (ArmorUtil.isExplosiveArmor(boots, legs, body, helmet) && s.isExplosion())
							e.setCanceled(true);
                        if (ArmorUtil.isVoidArmor(boots, legs, body, helmet) && s.getSourceOfDamage() instanceof EntityLivingBase && !s.isProjectile()) {
                            if(rand.nextInt(5)==0) {
                                ((EntityLivingBase) s.getSourceOfDamage()).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 60));
                                ((EntityLivingBase) s.getSourceOfDamage()).addPotionEffect(new PotionEffect(Potion.weakness.id, 40, 100));
                            }
                        }

						if (ArmorUtil.isIceArmor(boots, legs, body, helmet) && s.getSourceOfDamage() instanceof EntityLivingBase && !s.isProjectile()) {
							((EntityLivingBase)s.getSourceOfDamage()).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, (int)e.ammount * 10, 1));
						}
						if (ArmorUtil.isOmniArmor(boots, legs, body, helmet) && s.isExplosion())
							e.setCanceled(true);
						if (ArmorUtil.isSpaceKingArmor(boots, legs, body, helmet) && player.getHealth() > 0 && rand.nextInt(3) == 2) {
							final EntityOrbling var4 = new EntityOrbling(player.worldObj, player);

							var4.setLocationAndAngles(player.posX, player.posY + 1.5, player.posZ, player.rotationYaw, player.rotationPitch);
							player.worldObj.spawnEntityInWorld(var4);
						}
						if (ArmorUtil.isMercurialArmor(boots, legs, body, helmet)) {
							if (e.source.getSourceOfDamage() instanceof EntityMob)
								--adventPl.mercurialCounter;

							if (adventPl.mercurialCounter <= 0) {
								player.worldObj.createExplosion(player, player.posX, player.posY, player.posZ, 6.0f, false);
								adventPl.mercurialCounter = 10;
							}

							if (s.isExplosion())
								e.setCanceled(true);
						}
						if (ArmorUtil.isElecanyteArmor(boots, legs, body, helmet) && (s.isProjectile() || s.damageType.equals("thrown") || s.damageType.equals("mob"))) {
							if (!player.worldObj.isRemote)
								e.ammount *= 0.4f;
						}

						if (ArmorUtil.isExoplateArmor(boots, legs, body, helmet) && (s.isProjectile() || s.damageType.equals("thrown") || s.damageType.equals("mob"))) {
							if (player.getFoodStats().getFoodLevel() > 0) {
								player.getFoodStats().setFoodLevel((int)(player.getFoodStats().getFoodLevel() - e.ammount * 0.25));
								e.ammount *= 0.2f;
							}
							else {
								player.getFoodStats().setFoodLevel((int)(player.getFoodStats().getFoodLevel() - e.ammount * 0.2));
								e.ammount *= 0.8f;
							}
						}

						if (ArmorUtil.isPrimordialArmor(boots, legs, body, helmet) && rand.nextInt(3) == 2) {
							player.worldObj.playSoundAtEntity(player, "nevermine:Dodge", 3.0f, 1.0f);
							e.setCanceled(true);
						}

						if (ArmorUtil.isInnervationArmor(boots, legs, body, helmet) && rand.nextInt(2) == 1) {
							player.worldObj.playSoundAtEntity(player, "nevermine:Dodge", 3.0f, 1.0f);
							e.setCanceled(true);
						}

						if (ArmorUtil.isHydroplateArmor(boots, legs, body, helmet)) {
							--adventPl.hydroplateCounter;

							if (adventPl.hydroplateCounter <= 0) {
								player.addPotionEffect(new PotionEffect(22, 150, 2));
								adventPl.hydroplateCounter = 15;
							}
						}

						if (ArmorUtil.isKnightArmor(boots, legs, body, helmet)) {
							if (player.getHealth() - e.ammount <= 0 || e.ammount < 1 || e.source == DamageSource.magic || e.source == DamageSource.wither)
								return;

							--adventPl.knightCounter;

							if (adventPl.knightCounter <= 0) {
								int pick = rand.nextInt(4);

								if (pick == 0) {
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 40, 1));
								}
								else if (pick == 1) {
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40, 1));
								}
								else if (pick == 2) {
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 1));
								}
								else {
									player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 1));
								}

								adventPl.knightCounter = 1;
							}
						}

						if (ArmorUtil.isPredatiousArmor(boots, legs, body, helmet) && (s.isProjectile() || s.damageType.equals("thrown")) && rand.nextInt(5) == 2) {
							player.worldObj.playSoundAtEntity(player, "nevermine:Dodge", 3.0f, 1.0f);
							e.setCanceled(true);
						}

						if (ArmorUtil.isPurityArmor(boots, legs, body, helmet) && (s.isProjectile() || s.damageType.equals("thrown"))) {
							e.ammount *= 0.75;
						}

						if (ArmorUtil.isBaronArmor(boots, legs, body, helmet) && s.damageType.equals("mob") && !s.isProjectile()) {
							e.ammount *= 0.75;
						}

						if (ArmorUtil.isSubterraneanArmor(boots, legs, body, helmet) && e.source.getEntity() instanceof EntityMob && s.damageType.equals("mob") && !s.isProjectile()) {
							final EntityMob mob = (EntityMob)e.source.getEntity();

							if (mob.getHealth() > e.ammount) {
								mob.setHealth(mob.getHealth() - e.ammount);
								mob.attackEntityFrom(DamageSource.magic, 0.0f);
							}
							else {
								mob.attackEntityFrom(DamageSource.magic, e.ammount);
							}
						}

						if (ArmorUtil.isEmbrodiumArmor(boots, legs, body, helmet) && e.source.getEntity() instanceof EntityMob && s.damageType.equals("mob") && !s.isProjectile()) {
							(e.source.getEntity()).setFire(5);
						}

						if (ArmorUtil.isGhastlyArmor(boots, legs, body, helmet) && e.source.getEntity() instanceof EntityMob && s.damageType.equals("mob") && !s.isProjectile()) {
							((EntityMob)e.source.getEntity()).addPotionEffect(new PotionEffect(Potion.poison.id, 100, 4));
						}

						if (ArmorUtil.isFungalArmor(boots, legs, body, helmet) && e.source.getEntity() instanceof EntityMob && s.damageType.equals("mob") && !s.isProjectile()) {
							final EntityMob mob = (EntityMob)e.source.getEntity();
							final float hp = mob.getHealth();

							mob.setHealth(hp - (e.ammount * 3.5f));
							mob.attackEntityFrom(DamageSource.causeIndirectMagicDamage(mob, player), 0.0f);
							e.ammount *= 1.5;
						}
		}
	}

	@SubscribeEvent
	public void onPlayerDoingDamageEvent(final LivingHurtEvent e) {
		if (e.source.getEntity() instanceof EntityPlayer) {
			final DamageSource s = e.source;
			final EntityPlayer player = (EntityPlayer)e.source.getEntity();

			final ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			final ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			final ItemStack stackBody = player.inventory.armorItemInSlot(2);
			final ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

			final Item boots = stackBoots != null ? stackBoots.getItem() : null;
			final Item legs = stackLegs != null ? stackLegs.getItem() : null;
			final Item body = stackBody != null ? stackBody.getItem() : null;
			final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;

            if(boots==null&legs==null&body==null&helmet==null)
                return;

					if (ArmorUtil.isPurityArmor(boots, legs, body, helmet) && s.isProjectile())
						e.ammount *= 1.25;

					if (ArmorUtil.isBaronArmor(boots, legs, body, helmet) && !s.isProjectile() && !s.isMagicDamage())
						e.ammount *= 1.25;

					if (ArmorUtil.isBoreicArmor(boots, legs, body, helmet) && !s.isProjectile() && !s.isMagicDamage() && rand.nextInt(100) <= 33)
						e.ammount *= 1.25;

					if (ArmorUtil.isCrystallisArmor(boots, legs, body, helmet) && !s.isProjectile() && !s.isMagicDamage()) {
						if (rand.nextInt(5) == 2) {
							s.getEntity().attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)s.getEntity()), e.ammount * 0.45f);
						}
						if (rand.nextInt(100) <= 66) {
							e.ammount *= 2.0;
						}
					}

					if (ArmorUtil.isLyonicArmor(boots, legs, body, helmet) && !s.isProjectile() && !s.isMagicDamage()) {
						final int healthPercent = EntityUtil.getPercentageOfMaxHealth((EntityPlayer)s.getEntity());

						if (healthPercent > 80) {
							e.ammount *= 1.15;
						}
						else if (healthPercent > 60) {
							e.ammount *= 1.3;
						}
						else if (healthPercent > 40) {
							e.ammount *= 1.5;
						}
						else if (healthPercent > 20) {
							e.ammount *= 1.75;
						}
						else {
							e.ammount *= 2.0;
						}
					}

					if (ArmorUtil.isPredatiousArmor(boots, legs, body, helmet) && s.getSourceOfDamage() instanceof EntityElementalArrow)
						e.ammount *= 1.7;

					if (ArmorUtil.isLyndamyteArmor(boots, legs, body, helmet) && !s.isProjectile() && !s.isMagicDamage())
						e.ammount *= 1.1;
		}
	}

	@SubscribeEvent
	public void onTickEvent(final TickEvent.PlayerTickEvent ev) {
		final EntityPlayer pl = ev.player;
		final World world = pl.worldObj;
		final UUID uuid = pl.getUniqueID();
		final PlayerContainer adventPl = PlayerContainer.getProperties(pl);

		final ItemStack stackBoots = pl.inventory.armorItemInSlot(0);
		final ItemStack stackLegs = pl.inventory.armorItemInSlot(1);
		final ItemStack stackBody = pl.inventory.armorItemInSlot(2);
		final ItemStack stackHelmet = pl.inventory.armorItemInSlot(3);
		final ItemStack weildedItem = pl.getHeldItem();

		final Item boots = stackBoots != null ? stackBoots.getItem() : null;
		final Item legs = stackLegs != null ? stackLegs.getItem() : null;
		final Item body = stackBody != null ? stackBody.getItem() : null;
		final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;
		final Item sniper = weildedItem != null ? weildedItem.getItem() : null;

		pl.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0);
					if (ArmorUtil.isAlacrityArmor(boots, legs, body, helmet)) {
						pl.addPotionEffect(new PotionEffect(8, -1, 4));
					}

					if (ArmorUtil.isHaulingArmor(boots, legs, body, helmet) && pl.isInWater()) {

						pl.setAir(10);

						if (pl instanceof EntityPlayerMP)
							AddPackets.network.sendTo(new HealthMessage(pl.getHealth() + 0.1f), (EntityPlayerMP)pl);

						pl.heal(0.1f);

						pl.motionX *= 1.5;
						if (ev.player.motionX > 1.0)
							ev.player.motionX = 1.0;

						if (ev.player.motionX < -1.0)
							ev.player.motionX = -1.0;

						pl.motionZ *= 1.5;
						if (ev.player.motionZ > 1.0)
							ev.player.motionZ = 1.0;

						if (ev.player.motionZ < -1.0)
							ev.player.motionZ = -1.0;

						if (ev.player.isSneaking()) {
							ev.player.motionX = 0.0;
							ev.player.motionZ = 0.0;
						}
						if (ev.player.motionY > 0.0)
							ev.player.motionY = 0.4000000059604645;

					}

					if (ArmorUtil.isInfusionArmor(boots, legs, body, helmet) && pl.getHealth() < pl.getMaxHealth()) {
						if (pl instanceof EntityPlayerMP)
							AddPackets.network.sendTo(new HealthMessage(pl.getHealth() + 0.5f), (EntityPlayerMP)pl);

						pl.setHealth(pl.getHealth() + 0.5f);
					}
					if (ArmorUtil.isVitalityArmor(boots, legs, body, helmet)) {
						pl.addPotionEffect(new PotionEffect(Potion.digSpeed.id, -1, 5));
					}
					if (ArmorUtil.isHunterArmor(boots, legs, body, helmet)) {
						if (pl.isPotionActive(Potion.jump.id))
							pl.removePotionEffect(Potion.jump.id);

						if (pl.motionY == 0.0 && pl.isSneaking()) {
							if (pl.motionX < 1.25 && pl.motionX > -1.25)
								pl.motionX *= 1.2000000476837158;

							if (pl.motionZ < 1.25 && pl.motionZ > -1.25)
								pl.motionZ *= 1.2000000476837158;
						}

						if (pl.motionY > 0.0 && pl.motionY < 0.4)
							pl.motionY *= 1.100000023841858;

						if (pl.motionY < 0.0)
							pl.motionY *= 0.8999999761581421;

						pl.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, -1, 2));
					}

					if (ArmorUtil.isExoplateArmor(boots, legs, body, helmet) && pl.getFoodStats().getFoodLevel() <= 0) {
						pl.addPotionEffect(new PotionEffect(Potion.poison.id, 60, 0));
					}

					if (!world.isRemote && ArmorUtil.isRosidianArmor(boots, legs, body, helmet)) {
						--adventPl.rosidCounter;

						if (adventPl.rosidCounter <= 0) {
							adventPl.rosidCounter = 300;
							final EntityRosid var4 = new EntityRosid(ev.player.worldObj);

							var4.setLocationAndAngles(ev.player.posX, ev.player.posY, ev.player.posZ, ev.player.rotationYaw, ev.player.rotationPitch);
							ev.player.worldObj.spawnEntityInWorld(var4);
						}
					}

					if (ArmorUtil.isHydrangicArmor(boots, legs, body, helmet)) {
						HashMap<ItemRune, Integer> runes = new HashMap<ItemRune, Integer>();
						runes.put((ItemRune)Itemizer.LifeRune, 1);
						runes.put((ItemRune)Itemizer.DistortionRune, 1);
						runes.put((ItemRune)Itemizer.EnergyRune, 1);

						if (!pl.capabilities.isCreativeMode && EntityUtil.getPercentageOfMaxHealth(pl) < 20 && ItemUtil.tryConsumeRunes(runes, pl, false, null)) {
                            if (pl instanceof EntityPlayerMP)
                                AddPackets.network.sendTo(new HealthMessage(pl.getHealth() + 10.0f), (EntityPlayerMP) pl);

                            pl.setHealth(pl.getHealth() + 10.0f);
                            if (boots == Armorizer.HydrangicBoots) {
                                stackBoots.damageItem(30, pl);
                            }
                            if (helmet == Armorizer.HydrangicHelmet){
                                stackHelmet.damageItem(30, pl);
                            }
                            if (body ==Armorizer.HydrangicChestplate) {
                                stackBody.damageItem(30, pl);
                            }
                            if (legs == Armorizer.HydrangicLeggings)
                                stackLegs.damageItem(30, pl);
						}
					}

					if (ArmorUtil.isArchaicArmor(boots, legs, body, helmet)) {
						if (adventPl.archaicCounter > 0)
							--adventPl.archaicCounter;

						if (EntityUtil.getPercentageOfMaxHealth(pl) < 20) {
							for (final EntityLiving e : (List<EntityLiving>)pl.worldObj.getEntitiesWithinAABB(EntityLiving.class, pl.boundingBox.expand(6.0, 6.0, 6.0))) {
								e.addVelocity(pl.motionX * 7.5, pl.motionY * 0.5, pl.motionZ * 7.0);
							}

							if (adventPl.archaicCounter <= 0) {
								pl.heal(pl.getMaxHealth());
								adventPl.archaicCounter = 1600;
							}
						}
					}

					if (ArmorUtil.isNethengeicArmor(boots, legs, body, helmet)) {
						if (EntityUtil.getPercentageOfMaxHealth(pl) < 51) {
							if (pl.getHealth() > 0.0f) {
								if (pl instanceof EntityPlayerMP)
									AddPackets.network.sendTo(new HealthMessage(pl.getHealth() + 0.02f), (EntityPlayerMP)pl);

								pl.setHealth(pl.getHealth() + 0.02f);
							}
						}
						else {
							ev.player.addPotionEffect(new PotionEffect(5, -1, 0, true));
						}
					}

					if (ArmorUtil.isBiogenicArmor(boots, legs, body, helmet)) {
						if (pl.worldObj.getBlockLightValue((int)pl.posX, (int)pl.posY, (int)pl.posZ) < 7) {
							PotionEffect nVision = pl.getActivePotionEffect(Potion.nightVision);

							if (nVision == null || nVision.getDuration() < 250)
								pl.addPotionEffect(new PotionEffect(16, 300, 10, true));
						}

						if (EntityUtil.getPercentageOfMaxHealth(pl) < 51) {
							if (pl.getHealth() > 0.0f)
								pl.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, -1, 2, true));
						}
						else {
							pl.addPotionEffect(new PotionEffect(Potion.damageBoost.id, -1, 0, true));
						}
					}

					if (ArmorUtil.isLunarArmor(boots, legs, body, helmet)) {
						pl.addPotionEffect(new PotionEffect(8, -1, 4, true));

						if (pl.worldObj.getBlockLightValue((int)pl.posX, (int)pl.posY, (int)pl.posZ) < 7) {
							PotionEffect nVision = pl.getActivePotionEffect(Potion.nightVision);

							if (nVision == null || nVision	.getDuration() < 250)
								pl.addPotionEffect(new PotionEffect(16, 300, 10, true));
						}
					}

					if (ArmorUtil.isSpeedArmor(boots, legs, body, helmet)) {
						pl.addPotionEffect(new PotionEffect(1, -1, 1, true));
					}

					if (ArmorUtil.isOmniArmor(boots, legs, body, helmet)) {
						--adventPl.omniCounter;

						if (adventPl.omniCounter <= 0) {
							for (EntityMob e2 : (List<EntityMob>)pl.worldObj.getEntitiesWithinAABB(EntityMob.class, pl.boundingBox.expand(12.0, 12.0, 12.0))) {
								EntityGrenadeShot var5 = new EntityGrenadeShot(pl.worldObj, pl, 10.0f, 0);
								final double var6 = e2.posX - pl.posX;
								final double var7 = e2.posY + e2.getEyeHeight() - 1.100000023841858 - var5.posY;
								final double var8 = e2.posZ - pl.posZ;
								final float var9 = MathHelper.sqrt_double(var6 * var6 + var8 * var8) * 0.2f;

								var5.setThrowableHeading(var6, var7 + var9, var8, 1.6f, 12.0f);
								pl.worldObj.spawnEntityInWorld(var5);
							}

							adventPl.omniCounter = 120;
						}
					}

					if (ArmorUtil.isExpeditionArmor(boots, legs, body, helmet)) {
						pl.addPotionEffect(new PotionEffect(1, -1, 10, true));
					}

					if (ArmorUtil.isZargoniteArmor(boots, legs, body, helmet)) {
						for (final EntityMob e3 : (List<EntityMob>)pl.worldObj.getEntitiesWithinAABB(EntityMob.class, pl.boundingBox.expand(4.0, 4.0, 4.0))) {
							if (e3.getHealth() > 0.15f) {
								e3.setHealth(e3.getHealth() - 0.15f);
							}
							else {
								e3.attackEntityFrom(DamageSource.causeIndirectMagicDamage(e3, pl), 0.15f);
							}
						}
					}

					if (ArmorUtil.isRockboneArmor(boots, legs, body, helmet)) {
						if (!pl.capabilities.isCreativeMode) {
							if (!pl.isInWater()) {
								pl.motionY -= 0.009999999776482582;
							}
							else {
								pl.motionY -= 0.00249999994;
							}
						}
						pl.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0);
					}

					if (ArmorUtil.isWeakenArmor(boots, legs, body, helmet)) {
						pl.addPotionEffect(new PotionEffect(11, -1, 0, true));
					}

					if (ArmorUtil.isCommanderArmor(boots, legs, body, helmet)) {
						if (pl.getHealth() > 0.0f) {
							if (pl instanceof EntityPlayerMP)
								AddPackets.network.sendTo(new HealthMessage(pl.getHealth() + 0.025f), (EntityPlayerMP)pl);

							pl.setHealth(pl.getHealth() + 0.025f);
						}
					}

					if (ArmorUtil.isNecroArmor(boots, legs, body, helmet)) {
						pl.addPotionEffect(new PotionEffect(3, -1, 0, true));
					}

					if (ArmorUtil.isSkeletalArmor(boots, legs, body, helmet)) {
						if (pl.getFoodStats().needFood()) {
							pl.getFoodStats().addStats(1, 0.0f);
						}
					}

					if (ArmorUtil.isCandyArmor(boots, legs, body, helmet)) {
						--adventPl.candyCounter;

						if (EntityUtil.getPercentageOfMaxHealth(pl) < 20 && adventPl.candyCounter <= 0) {
							pl.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 140, 1));
							pl.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 140, 1));
							pl.addPotionEffect(new PotionEffect(Potion.regeneration.id, 140, 1));
							pl.addPotionEffect(new PotionEffect(Potion.resistance.id, 140, 1));
							pl.addPotionEffect(new PotionEffect(Potion.nightVision.id, 140, 1));
							pl.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 140, 1));
							pl.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 140, 1));
							adventPl.candyCounter = 1800;
						}
					}

					if (ArmorUtil.isPhantasmArmor(boots, legs, body, helmet)) {
						final int healthPercent = EntityUtil.getPercentageOfMaxHealth(pl);

						if (healthPercent > 75) {
							pl.addPotionEffect(new PotionEffect(1, -1, 1, true));
						}
						else if (healthPercent > 50) {
							pl.addPotionEffect(new PotionEffect(1, -1, 2, true));
						}
						else if (healthPercent > 25) {
							pl.addPotionEffect(new PotionEffect(1, -1, 3, true));
						}
						else {
							pl.addPotionEffect(new PotionEffect(1, -1, 4, true));
						}
					}

					if (ArmorUtil.isRunicArmor(boots, legs, body, helmet)) {
						final int healthPercent = EntityUtil.getPercentageOfMaxHealth(pl);

						--adventPl.runicCounter;

						if (healthPercent < 40) {
							pl.addPotionEffect(new PotionEffect(1, -1, 1, true));
						}

						if (healthPercent < 33 && adventPl.runicCounter <= 0) {
							pl.addPotionEffect(new PotionEffect(22, 200, 2, true));
							adventPl.runicCounter = 600;
						}
					}

					if (ArmorUtil.isUtopianArmor(boots, legs, body, helmet) && ev.player.isInsideOfMaterial(Material.water)) {
						final int healthPercent = EntityUtil.getPercentageOfMaxHealth(pl);

						if (healthPercent > 0 && healthPercent < 100) {
							if (pl instanceof EntityPlayerMP)
								AddPackets.network.sendTo(new HealthMessage(pl.getHealth() + 0.2f), (EntityPlayerMP)pl);

							pl.setHealth(pl.getHealth() + 0.2f);
						}
					}


		if (pl.dimension == ConfigurationHelper.voxponds && !pl.capabilities.isCreativeMode) {
			if (!(ArmorUtil.isHazmatArmor(boots, legs, body, helmet) || helmet == Armorizer.FaceMask)) {
				if (pl.getHealth() > 0.0f)
					pl.setHealth(pl.getHealth() - 0.1f);
			}
		}

		if (helmet == Armorizer.SealordHelmet) {
			if (pl.isInWater()) {
				pl.motionX *= 1.2000000476837158;
				if (pl.motionX > 1.0)
					pl.motionX = 1.0;

				if (pl.motionX < -1.0)
					pl.motionX = -1.0;

				pl.motionZ *= 1.2000000476837158;
				if (pl.motionZ > 1.0)
					pl.motionZ = 1.0;

				if (pl.motionZ < -1.0)
					pl.motionZ = -1.0;

				if (pl.isSneaking()) {
					pl.motionX = 0.0;
					pl.motionZ = 0.0;
				}

				if (pl.motionY > 0.0)
					pl.motionY = 0.4000000059604645;
			}
		}
		else if (helmet == Armorizer.NightVisionGoggles) {
			final boolean light = world.getBlockLightValue((int)ev.player.posX, (int)ev.player.posY, (int)ev.player.posZ) < 7;

			if (light) {
				PotionEffect nVision = ev.player.getActivePotionEffect(Potion.nightVision);

				if (nVision == null || nVision.getDuration() < 250)
					ev.player.addPotionEffect(new PotionEffect(16, 300, 10));
			}
		}
		else if (helmet == Armorizer.AchelosHelmet && pl.isInsideOfMaterial(Material.water)) {
			final int healthPercent = EntityUtil.getPercentageOfMaxHealth(pl);

			if (healthPercent > 0 && healthPercent < 100) {
				if (pl instanceof EntityPlayerMP)
					AddPackets.network.sendTo(new HealthMessage(pl.getHealth() + 0.05f), (EntityPlayerMP)pl);

				pl.setHealth(pl.getHealth() + 0.05f);
			}

		}
	}

	@SubscribeEvent
	public void onPlayerAttackEvent(final LivingAttackEvent e) {
		if (e.entity instanceof EntityPlayer) {
			final EntityPlayer player = (EntityPlayer)e.entity;

			final ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			final ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			final ItemStack stackBody = player.inventory.armorItemInSlot(2);
			final ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

			final Item boots = stackBoots != null ? stackBoots.getItem() : null;
			final Item legs = stackLegs != null ? stackLegs.getItem() : null;
			final Item body = stackBody != null ? stackBody.getItem() : null;
			final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;

			if (e.source.equals(DamageSource.drown)) {
				if (helmet == Armorizer.OceanusHelmet)
					e.setCanceled(true);
			}
			else if (e.source.equals(DamageSource.magic)) {
				if (ArmorUtil.isPoisonArmor(boots, legs, body, helmet)) {
					e.setCanceled(true);
				}
				else if (ArmorUtil.isGhastlyArmor(boots, legs, body, helmet)) {
					e.setCanceled(true);
				}
			}
			else if (e.source.equals(DamageSource.wither)) {
				if (ArmorUtil.isWitherArmor(boots, legs, body, helmet))
					e.setCanceled(true);
			}
			else if (e.source.isFireDamage()) {
				if (ArmorUtil.isNethengeicArmor(boots, legs, body, helmet)) {
					e.setCanceled(true);
				}
				else if (ArmorUtil.isInfernalArmor(boots, legs, body, helmet)) {
					e.setCanceled(true);
				}
				else if (ArmorUtil.isVitalityArmor(boots, legs, body, helmet)) {
					e.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent
	public void LivingJumpEvent(final LivingEvent.LivingJumpEvent e) {
		if (e.entity instanceof EntityPlayer) {
			final EntityPlayer player = (EntityPlayer)e.entity;
			final ItemStack stackBoots = player.inventory.armorItemInSlot(0);
			final ItemStack stackLegs = player.inventory.armorItemInSlot(1);
			final ItemStack stackBody = player.inventory.armorItemInSlot(2);
			final ItemStack stackHelmet = player.inventory.armorItemInSlot(3);

			final Item boots = stackBoots != null ? stackBoots.getItem() : null;
			final Item legs = stackLegs != null ? stackLegs.getItem() : null;
			final Item body = stackBody != null ? stackBody.getItem() : null;
			final Item helmet = stackHelmet != null ? stackHelmet.getItem() : null;

			if (ArmorUtil.isLunarArmor(boots, legs, body, helmet)) {
				final float hp = player.getHealth();
				player.setHealth(hp + 0.5f);
			}
			else if (ArmorUtil.isAuguryArmor(boots, legs, body, helmet)) {
				player.addPotionEffect(new PotionEffect(22, 100, 0));
			}
		}
	}

	static {
		isImmuneToFire = new String[] {"ag", "field_70178_ae", "isImmuneToFire"};
		isJumping = new String[] {"bd", "field_70703_bu", "isJumping"};
	}
}
