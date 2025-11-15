package net.nevermine.event.resource;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockOre;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.world.BlockEvent;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.assist.StringUtil;
import net.nevermine.block.generation.BlockForagingStone;
import net.nevermine.block.generation.OreBlock;
import net.nevermine.common.nevermine;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.Plantizer;
import net.nevermine.izer.equipment.Toolizer;

import java.util.Random;

public class HarvestingTracker {
	Random rand = new Random();

	@SubscribeEvent
	public void specialityToolHarvest(final BlockEvent.HarvestDropsEvent e) {
		if (e.world.isRemote || e.harvester == null || e.harvester instanceof FakePlayer || e.harvester.getHeldItem() == null)
			return;

		Item tool = e.harvester.getHeldItem().getItem();

		if (e.block instanceof BlockOre || e.block instanceof OreBlock) {
			if (EnchantmentHelper.getSilkTouchModifier(e.harvester))
				return;

			if (tool == Toolizer.OrnamytePickaxe) {
				if (e.block.getItemDropped(1, rand, 0) instanceof ItemBlock) {
					if (FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(e.block)) != null) {
						final ItemStack s = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(e.block));

						s.stackSize = 2;
						e.drops.clear();
						e.drops.add(s);
					}
				}
				else {
					e.drops.add(new ItemStack(e.block.getItemDropped(1, rand, 0), 1, e.world.getBlockMetadata(e.x, e.y, e.z)));
				}
			}
			else if (tool == Toolizer.GoofyPickaxe) {
				if (rand.nextBoolean()) {
					if (e.block.getItemDropped(1, rand, 0) instanceof ItemBlock) {
						if (FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(e.block)) != null) {
							final ItemStack s = FurnaceRecipes.smelting().getSmeltingResult(new ItemStack(e.block));
							s.stackSize = 4;
							e.drops.clear();
							e.drops.add(s);
						}
					}
					else {
						e.drops.add(new ItemStack(e.block.getItemDropped(1, rand, 0), 1, e.world.getBlockMetadata(e.x, e.y, e.z)));
					}
				}
				else {
					e.drops.clear();
				}
			}
		}
		else if (e.block instanceof BlockLog) {
			if (tool == Toolizer.OrnamyteAxe) {
				e.drops.add(new ItemStack(e.block.getItemDropped(1, rand, 0), 1, e.world.getBlockMetadata(e.x, e.y, e.z)));
			}
			else if (tool == Toolizer.GoofyAxe) {
				if (rand.nextBoolean()) {
					e.drops.add(new ItemStack(e.block.getItemDropped(1, rand, 0), 3, e.world.getBlockMetadata(e.x, e.y, e.z)));
				}
				else {
					e.drops.clear();
				}
			}
		}
		else {
			if (tool == Toolizer.OrnamyteShovel) {
				e.drops.add(new ItemStack(e.block.getItemDropped(1, rand, 0), 1, e.world.getBlockMetadata(e.x, e.y, e.z)));
			}
			else if (tool == Toolizer.GoofyShovel) {
				if (rand.nextBoolean()) {
					e.drops.add(new ItemStack(e.block.getItemDropped(1, rand, 0), 3, e.world.getBlockMetadata(e.x, e.y, e.z)));
				}
				else {
					e.drops.clear();
				}
			}
		}
	}

	@SubscribeEvent
	public void shyreHarvest(final BlockEvent.HarvestDropsEvent e) {
		if (!e.world.isRemote && e.harvester != null && e.harvester.dimension == ConfigurationHelper.shyrelands && e.block == Blockizer.ShyreRock && nevermine.rand.nextInt(25) == 0) {
			int pick = nevermine.rand.nextInt(40);

			if (pick < 3) {
				e.harvester.setPositionAndUpdate((int)e.harvester.posX, e.harvester.worldObj.getHeightValue((int)e.harvester.posX, (int)e.harvester.posZ) + 2, (int)e.harvester.posZ);
				e.harvester.worldObj.playSoundAtEntity(e.harvester, "nevermine:ShyreMineTeleport", 3.85F, 1.0F);
				e.harvester.addChatMessage(StringUtil.getLocale("message.event.shyreMineTeleport"));
			}
			else if (pick < 13) {
				e.harvester.addPotionEffect(new PotionEffect(Potion.wither.id, 60, 1));
				e.harvester.worldObj.playSoundAtEntity(e.harvester, "nevermine:ShyreMineWither", 3.85F, 1.0F);
				e.harvester.addChatMessage(StringUtil.getLocale("message.event.shyreMineWither"));
			}
			else if (pick < 23) {
				e.harvester.addPotionEffect(new PotionEffect(Potion.blindness.id, 140, 2));
				e.harvester.worldObj.playSoundAtEntity(e.harvester, "nevermine:ShyreMineBlind", 3.85F, 1.0F);
				e.harvester.addChatMessage(StringUtil.getLocale("message.event.shyreMineBlind"));
			}
			else if (pick < 33) {
				e.harvester.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 140, 1));
				e.harvester.worldObj.playSoundAtEntity(e.harvester, "nevermine:ShyreMineBind", 3.85F, 1.0F);
				e.harvester.addChatMessage(StringUtil.getLocale("message.event.shyreMineBind"));
			}
			else {
				e.world.setBlock(e.x, e.y, e.z, Blocks.flowing_lava);
			}
		}
	}

	@SubscribeEvent
	public void onLogging(final BlockEvent.HarvestDropsEvent e) {
		if (e.world.isRemote || !(e.block instanceof BlockLog) || e.harvester == null || e.harvester instanceof FakePlayer)
			return;

		if (rand.nextInt(20) > 0)
			return;

		if (rand.nextBoolean()) {
			switch (rand.nextInt(12)) {
				case 0:
					e.drops.add(new ItemStack(Items.stick, 16));
				case 1:
					e.drops.add(new ItemStack(Items.apple, 4));
					break;
				case 2:
					e.drops.add(new ItemStack(Plantizer.TeaSeeds, 1));
					break;
				case 3:
					e.drops.add(new ItemStack(Items.experience_bottle, 3 + rand.nextInt(7)));
					break;
				case 5:
					e.drops.add(new ItemStack(Itemizer.FragmentedAnimaStone, 1));
					break;
				case 6:
					e.drops.add(new ItemStack(Itemizer.GemBag, 1 + rand.nextInt(3)));
					break;
				case 11:
					e.drops.add(new ItemStack(Itemizer.IngotRosite, 1 + rand.nextInt(2)));
					break;
				default:
					break;
			}

			e.harvester.worldObj.playSoundAtEntity(e.harvester, "nevermine:ForagingItem", 1.0f, 1.0f);
		}
		else {
			for (ItemStack stack : e.drops) {
				if (stack.getItem() == Item.getItemFromBlock(e.block)) {
					e.drops.add(new ItemStack(stack.getItem(), 1 + rand.nextInt(2), stack.getItemDamage()));
					return;
				}
			}
		}
	}

	@SubscribeEvent
	public void onForagingBlock(final BlockEvent.HarvestDropsEvent e) {
		if (!e.world.isRemote && e.harvester != null && (e.block == Blocks.stone || e.block instanceof BlockForagingStone) && !(e.harvester instanceof FakePlayer)) {

            if (rand.nextInt(65) != 0)
				return;

			final int lootPick = rand.nextInt(21);

			switch (lootPick) {
				case 0:
					e.drops.add(new ItemStack(Items.coal, 3));
					break;
				case 1:
					e.drops.add(new ItemStack(Items.gold_nugget, 1));
					break;
				case 4:
					e.drops.add(new ItemStack(Items.ender_pearl, 1));
					break;
				case 5:
					e.drops.add(new ItemStack(Items.gunpowder, 16));
					break;
				case 8:
					e.drops.add(new ItemStack(Items.diamond, 2));
					break;
				case 10:
					e.drops.add(new ItemStack(Items.experience_bottle, 4));
					break;
				case 11:
					e.drops.add(new ItemStack(Itemizer.RealmstoneIromine, 1));
					break;
				case 13:
					switch (e.block.getUnlocalizedName()) {
						case "tile.stoneIromine":
							e.drops.add(new ItemStack(Itemizer.IngotLyon, 1));
							break;
						case "tile.deeplandsRock":
							e.drops.add(new ItemStack(Blockizer.Deepcase, 1));
							break;
						case "tile.stonePrecasiaLow":
							e.drops.add(new ItemStack(Itemizer.IngotSkeletal, 1));
							break;
						case "tile.stoneGreckon":
                            if(rand.nextBoolean()) {
                                e.drops.add(new ItemStack(Itemizer.IngotGhastly, 2));
                            }else {
                                e.drops.add(new ItemStack(Itemizer.IngotGhoulish, 2));
                            }
							break;
						case "tile.baronStone":
                            int a = rand.nextInt(3);
                            if(a == 0){
							    e.drops.add(new ItemStack(Itemizer.IngotBaronyte, 1));
                            } else if (a==1) {
                                e.drops.add(new ItemStack(Itemizer.IngotVarsium, 1));
                            } else {
                                e.drops.add(new ItemStack(Itemizer.IngotElecanium, 1));
                            }
                            break;
						case "tile.barathosHellstone":
							e.drops.add(new ItemStack(Itemizer.IngotBlazium, 1));
							break;
						case "tile.stoneAbyss":
							e.drops.add(new ItemStack(Itemizer.Bloodstone, 4));
							break;
						case "tile.stoneMysterium":
							e.drops.add(new ItemStack(Itemizer.IngotMystite, 2));
							break;
						case "tile.crysteviaRock":
                            int b = rand.nextInt(6);
                            if(b==0) {
                                e.drops.add(new ItemStack(Itemizer.CrystalsBlue, 4));
                            } else if (b==1) {
                                e.drops.add(new ItemStack(Itemizer.CrystalsRed, 4));
                            } else if (b==2) {
                                e.drops.add(new ItemStack(Itemizer.CrystalsGreen, 4));
                            } else if (b==3) {
                                e.drops.add(new ItemStack(Itemizer.CrystalsYellow, 4));
                            } else if (b==4) {
                                e.drops.add(new ItemStack(Itemizer.CrystalsWhite, 4));
                            } else {
                                e.drops.add(new ItemStack(Itemizer.CrystalsPurple, 4));
                            }
                            break;
                        case "tile.stoneHaven":
                            e.drops.add(new ItemStack(Itemizer.CrystalliteStone, 4));
                            break;
                        case "tile.stoneCreep":
                            e.drops.add(new ItemStack(Itemizer.Jewelyte, 2));
                            break;
                        case "tile.stoneUnstable":
                            e.drops.add(new ItemStack(Itemizer.Gemenyte, 2));
                            break;
                        case "tile.stonePrimed":
                            e.drops.add(new ItemStack(Itemizer.Ornamyte, 2));
                            break;
                        case "tile.stoneShyrelands":
                            if(rand.nextBoolean()) {
                                e.drops.add(new ItemStack(Itemizer.IngotShyrestone, 2));
                            }else {
                                e.drops.add(new ItemStack(Itemizer.IngotShyregem, 2));
                            }
                            break;
                            default:
							e.drops.add(new ItemStack(Itemizer.IngotJade, 2));
							break;
					}
					break;
				case 17:
					e.drops.add(new ItemStack(Itemizer.IngotRosite, 1 + rand.nextInt(2)));
					break;
				case 19:
					e.drops.add(new ItemStack(Itemizer.GoldCoin, 1 + rand.nextInt(2)));
					break;
				default:
					break;
			}
			e.harvester.worldObj.playSoundAtEntity(e.harvester, "nevermine:ForagingItem", 1.0f, 1.0f);
		}
	}
}
