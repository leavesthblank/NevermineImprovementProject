package net.nevermine.block.functional;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.assist.ItemUtil;
import net.nevermine.assist.StringUtil;
import net.nevermine.container.PlayerContainer;
import net.nevermine.izer.Blockizer;
import net.nevermine.izer.Itemizer;
import net.nevermine.izer.equipment.Armorizer;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.skill.extraction.extractionHelper;

import java.util.Random;

import static net.nevermine.container.PlayerContainer.Deities.Pluton;
import static net.nevermine.container.PlayerContainer.Skills.Extraction;

public class BlockExtractionDevice extends Block {
	private boolean active;
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon side;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;

	public BlockExtractionDevice(final boolean on) {
		super(Material.iron);
		setBlockName("extractionDevice");
		setCreativeTab(active ? null : Itemizer.TablesTab);
		setHardness(5.0f);
		setResistance(10.0f);
		active = on;
		GameRegistry.registerBlock(this, active ? "extractionDeviceOn" : "extractionDevice");
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(final IIconRegister icon) {
		top = active ? icon.registerIcon("nevermine:animated/extractionDeviceON_top") : icon.registerIcon("nevermine:extractionDevice_top");
		side = active ? icon.registerIcon("nevermine:animated/extractionDeviceON_side") : icon.registerIcon("nevermine:extractionDevice_side");
		bottom = icon.registerIcon("nevermine:extractionDevice_bottom");
		blockIcon = active ? icon.registerIcon("nevermine:animated/extractionDeviceON_side") : icon.registerIcon("nevermine:extractionDevice_side");
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

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(final int p_149691_1_, final int p_149691_2_) {
		return (p_149691_1_ == 0) ? bottom : ((p_149691_1_ == 1) ? top : blockIcon);
	}

	public void onNeighborBlockChange(final World w, final int x, final int y, final int z, final Block neighbor) {
		Block bl = w.getBlock(x, y + 1, z);

		if (!isLava(bl)) {
			w.setBlock(x, y, z, Blockizer.ExtractionDevice);
		}
		else{
			w.setBlock(x, y, z, Blockizer.ExtractionDeviceOn);
		}
	}

	private boolean isLava(final Block b) {
		return b == Blocks.lava || b == Blocks.flowing_lava;
	}

	public boolean onBlockActivated(final World w, final int x, final int y, final int z, final EntityPlayer player, final int side, final float subX, final float subY, final float subZ) {
		if (!active || w.isRemote)
			return false;

		if (player.getHeldItem() != null && (player.getHeldItem().getItem() == Itemizer.StoneBowl || player.getHeldItem().getItem() == Itemizer.DiamondBowl)) {
			Random r = new Random();

					PlayerContainer cont = PlayerContainer.getProperties(player);

					if (extractionHelper.isExtractionFail(cont.getLevel(Extraction))) {
						player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.none"));
                        player.dropItem(Item.getItemFromBlock(Blocks.obsidian), 1);
						w.setBlock(x, y + 1, z, Blocks.air);
						return true;
					}
					else {
						int loot = extractionHelper.getLootPick(cont.getLevel(Extraction));
                        player.dropItem(Item.getItemFromBlock(Blocks.obsidian), 1);
                        if(r.nextInt(400)==0) {
                            if (!player.inventory.addItemStackToInventory(new ItemStack(Blockizer.CarvedRune1, 1)))
                                player.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune1), 1);
                        }
                        if(r.nextInt(400)==0) {
                            if (!player.inventory.addItemStackToInventory(new ItemStack(Blockizer.CarvedRune2, 1)))
                                player.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune2), 1);
                        }
                        if(r.nextInt(400)==0) {
                            if (!player.inventory.addItemStackToInventory(new ItemStack(Blockizer.CarvedRune3, 1)))
                                player.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune3), 1);
                        }
                        if(r.nextInt(400)==0) {
                            if (!player.inventory.addItemStackToInventory(new ItemStack(Blockizer.CarvedRune6, 1)))
                                player.dropItem(Item.getItemFromBlock(Blockizer.CarvedRune6), 1);
                        }
                        if(r.nextInt(100)==0) {
                            if (!player.inventory.addItemStackToInventory(new ItemStack(Blockizer.AncientRock, 4)))
                                player.dropItem(Item.getItemFromBlock(Blockizer.AncientRock), 4);
                        }

						switch (loot) {
							case 0:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.fail"));
								break;
							case 1:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.coal"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.coal, 4)))
									player.dropItem(Items.coal, 4);
								break;
							case 2:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.flint"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.flint, 4)))
									player.dropItem(Items.flint, 4);
								break;
							case 3:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.arrows"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.ElementalArrow, 8)))
									player.dropItem(Itemizer.ElementalArrow, 8);
                                if (r.nextBoolean())if(!player.inventory.addItemStackToInventory(new ItemStack(Items.quartz, 4))){
                                    player.dropItem(Items.quartz,4);
                                }
                                if (r.nextInt(2) == 0)if(!player.inventory.addItemStackToInventory(new ItemStack(Items.gold_ingot, 2))) {
                                    player.dropItem(Items.gold_ingot, 2);
                                }
                                if(player.dimension==ConfigurationHelper.deeplands){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunkCharged,4))){
                                        player.dropItem(Itemizer.RuniumChunkCharged,4);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(Blockizer.Deepcase),1))){
                                        player.dropItem(Item.getItemFromBlock(Blockizer.Deepcase),1);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RockBones,2))){
                                        player.dropItem(Itemizer.RockBones,2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedStone,1))){
                                        player.dropItem(Itemizer.UnchargedStone,1);
                                    }
                                    if (r.nextInt(50)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.BoulderDash,1))){
                                        player.dropItem(Itemizer.BoulderDash,1);
                                    }
                                    break;
                                }
                                if (player.dimension==ConfigurationHelper.lunalus){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLunar,2))) {
                                        player.dropItem(Itemizer.IngotLunar, 2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedOrb, 1))) {
                                        player.dropItem(Itemizer.UnchargedOrb, 1);
                                    }
                                    break;
                                }
                                if (player.dimension==ConfigurationHelper.dustopia){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.PrimordialSkull, 1))) {
                                        player.dropItem(Itemizer.PrimordialSkull, 1);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedOrb, 1))) {
                                        player.dropItem(Itemizer.UnchargedOrb, 1);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.PrimordialDust, 1))) {
                                        player.dropItem(Itemizer.PrimordialDust, 1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.greckon){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunkCharged,4))){
                                        player.dropItem(Itemizer.DarklyPowder,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ghoulasm,2))){
                                        player.dropItem(Itemizer.Ghoulasm,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.GhoulasmPrimed,2))){
                                        player.dropItem(Itemizer.GhoulasmPrimed,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.runandor){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RunicEnergy,1))){
                                        player.dropItem(Itemizer.RunicEnergy,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentB,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentB,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentG,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentG,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentR,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentR,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentY,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentY,1);
                                    }
                                    if (r.nextInt(30)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneStone,1))){
                                        player.dropItem(Itemizer.MegaRuneStone,1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.creeponia){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Items.gunpowder,2))){
                                        player.dropItem(Items.gunpowder,4);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Jewelyte,2))){
                                        player.dropItem(Itemizer.Jewelyte,2);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Gemenyte,2))){
                                        player.dropItem(Itemizer.Gemenyte,2);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ornamyte,2))){
                                        player.dropItem(Itemizer.Ornamyte,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.crystevia){
                                    if (r.nextInt(3)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsYellow,4))){
                                            player.dropItem(Itemizer.CrystalsYellow,4);
                                        }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsGreen,4))){
                                        player.dropItem(Itemizer.CrystalsGreen,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsWhite,4))){
                                        player.dropItem(Itemizer.CrystalsWhite,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsRed,4))){
                                        player.dropItem(Itemizer.CrystalsRed,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsBlue,4))){
                                        player.dropItem(Itemizer.CrystalsBlue,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsPurple,4))){
                                        player.dropItem(Itemizer.CrystalsPurple,4);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalBox,1))){
                                        player.dropItem(Itemizer.CrystalBox,1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.barathos){
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.HiveChunk,2))){
                                        player.dropItem(Itemizer.HiveChunk,2);
                                    }
                                    break;
                                }
							case 4:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.blazePowder"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.blaze_powder, 4)))
									player.dropItem(Items.blaze_powder, 4);
                                if (r.nextInt(4)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Items.blaze_rod, 4))){
                                    player.dropItem(Items.blaze_rod,4);
                                }

								break;
							case 5:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.limonite"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLimonite, 4)))
									player.dropItem(Itemizer.IngotLimonite, 4);
								break;
							case 6:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.bones"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.bone, 8)))
									player.dropItem(Items.bone, 8);
                                if (r.nextInt(2) == 0)if(!player.inventory.addItemStackToInventory(new ItemStack(Items.gold_ingot, 2))) {
                                    player.dropItem(Items.gold_ingot, 2);
                                }
                                if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ivory,4))){
                                    player.dropItem(Itemizer.Ivory,4);
                                }
                                player.dropItem(Itemizer.CopperCoin,4 + r.nextInt(6));
                                if(player.dimension==ConfigurationHelper.precasia){
                                    if (r.nextInt(10)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotSkeletal,2))){
                                        player.dropItem(Itemizer.IngotSkeletal,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.SkullboneFragment,4))){
                                        player.dropItem(Itemizer.SkullboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.ChestboneFragment,4))){
                                        player.dropItem(Itemizer.ChestboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.LegboneFragment,4))){
                                        player.dropItem(Itemizer.LegboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.FootboneFragment,4))){
                                        player.dropItem(Itemizer.FootboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ivory,4))){
                                        player.dropItem(Itemizer.Ivory,4);
                                    }
                                    break;
                                }
							case 7:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.coinsSilver"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.SilverCoin, 2)))
									player.dropItem(Itemizer.SilverCoin, 6 + r.nextInt(8));
								break;
							case 8:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.emerald"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.emerald, 1)))
									player.dropItem(Items.emerald, 1);
								break;
							case 9:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.experienceBottles"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.experience_bottle, 4)))
									player.dropItem(Items.experience_bottle, 4);
								break;
							case 10:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.rosite"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotRosite, 1)))
									player.dropItem(Itemizer.IngotRosite, 1);
                                player.dropItem(Itemizer.CopperCoin,10 + r.nextInt(14));
                                if(player.dimension==0){
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotJade,2))) {
                                            player.dropItem(Itemizer.IngotJade, 2);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.AmethystIngot,2))){
                                            player.dropItem(Itemizer.AmethystIngot,2);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunk,4))){
                                            player.dropItem(Itemizer.RuniumChunk,4);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLimonite,4))){
                                            player.dropItem(Itemizer.IngotLimonite,4);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotSapphire,2))){
                                            player.dropItem(Itemizer.IngotSapphire,2);
                                        }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.iromine){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLyon,2))){
                                        player.dropItem(Itemizer.IngotLyon,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.barathos){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotBlazium,2))){
                                        player.dropItem(Itemizer.IngotBlazium,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotBaronyte,2))){
                                        player.dropItem(Itemizer.IngotBaronyte,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotElecanium,2))){
                                        player.dropItem(Itemizer.IngotElecanium,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotVarsium,2))){
                                        player.dropItem(Itemizer.IngotVarsium,2);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.HiveChunk,2))){
                                        player.dropItem(Itemizer.HiveChunk,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.shyrelands){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotShyrestone,2))){
                                        player.dropItem(Itemizer.IngotShyrestone,2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotShyregem,2))){
                                        player.dropItem(Itemizer.IngotShyregem,2);
                                    }
                                    if (r.nextInt(12)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.AncientRing,1))){
                                        player.dropItem(Itemizer.AncientRing,1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.deeplands){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunkCharged,4))){
                                        player.dropItem(Itemizer.RuniumChunkCharged,4);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(Blockizer.Deepcase),1))){
                                        player.dropItem(Item.getItemFromBlock(Blockizer.Deepcase),1);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RockBones,2))){
                                        player.dropItem(Itemizer.RockBones,2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedStone,1))){
                                        player.dropItem(Itemizer.UnchargedStone,1);
                                    }
                                    if (r.nextInt(50)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.BoulderDash,1))){
                                        player.dropItem(Itemizer.BoulderDash,1);
                                    }
                                    break;
                                }
                                if (player.dimension==ConfigurationHelper.lunalus){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLunar,2))) {
                                        player.dropItem(Itemizer.IngotLunar, 2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedOrb, 1))) {
                                        player.dropItem(Itemizer.UnchargedOrb, 1);
                                    }
                                    break;
                                }
							case 11:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.blazeRods"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.blaze_rod, 4)))
									player.dropItem(Items.blaze_rod, 4);
								break;
							case 12:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.bullets"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MetalPellet, 32)))
									player.dropItem(Itemizer.MetalPellet, 32);
								break;
							case 13:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.dye"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.dye, 32, r.nextInt(16))))
									player.entityDropItem(new ItemStack(Items.dye, 32, r.nextInt(16)), 1.0f);
                                    player.dropItem(Itemizer.CopperCoin,16 + r.nextInt(20));
                                if(player.dimension==ConfigurationHelper.deeplands){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunkCharged,4))){
                                        player.dropItem(Itemizer.RuniumChunkCharged,4);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(Blockizer.Deepcase),1))){
                                        player.dropItem(Item.getItemFromBlock(Blockizer.Deepcase),1);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RockBones,2))){
                                        player.dropItem(Itemizer.RockBones,2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedStone,1))){
                                        player.dropItem(Itemizer.UnchargedStone,1);
                                    }
                                    if (r.nextInt(50)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.BoulderDash,1))){
                                        player.dropItem(Itemizer.BoulderDash,1);
                                    }
                                    break;
                                }
                                if (player.dimension==ConfigurationHelper.lunalus){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLunar,2))) {
                                        player.dropItem(Itemizer.IngotLunar, 2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedOrb, 1))) {
                                        player.dropItem(Itemizer.UnchargedOrb, 1);
                                    }
                                    break;
                                }
                                if (player.dimension==ConfigurationHelper.dustopia){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.PrimordialSkull, 1))) {
                                        player.dropItem(Itemizer.PrimordialSkull, 1);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedOrb, 1))) {
                                        player.dropItem(Itemizer.UnchargedOrb, 1);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.PrimordialDust, 1))) {
                                        player.dropItem(Itemizer.PrimordialDust, 1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.greckon){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunkCharged,4))){
                                        player.dropItem(Itemizer.DarklyPowder,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ghoulasm,2))){
                                        player.dropItem(Itemizer.Ghoulasm,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.GhoulasmPrimed,2))){
                                        player.dropItem(Itemizer.GhoulasmPrimed,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.runandor){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RunicEnergy,1))){
                                        player.dropItem(Itemizer.RunicEnergy,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentB,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentB,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentG,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentG,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentR,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentR,1);
                                    }
                                    if (r.nextInt(8)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneFragmentY,1))){
                                        player.dropItem(Itemizer.MegaRuneFragmentY,1);
                                    }
                                    if (r.nextInt(30)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MegaRuneStone,1))){
                                        player.dropItem(Itemizer.MegaRuneStone,1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.creeponia){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Items.gunpowder,2))){
                                        player.dropItem(Items.gunpowder,2);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Jewelyte,2))){
                                        player.dropItem(Itemizer.Jewelyte,2);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Gemenyte,2))){
                                        player.dropItem(Itemizer.Gemenyte,2);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ornamyte,2))){
                                        player.dropItem(Itemizer.Ornamyte,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.crystevia){
                                    if (r.nextInt(3)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsYellow,4))){
                                        player.dropItem(Itemizer.CrystalsYellow,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsGreen,4))){
                                        player.dropItem(Itemizer.CrystalsGreen,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsWhite,4))){
                                        player.dropItem(Itemizer.CrystalsWhite,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsRed))){
                                        player.dropItem(Itemizer.CrystalsRed,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsBlue,4))){
                                        player.dropItem(Itemizer.CrystalsBlue,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.CrystalsPurple,4))){
                                        player.dropItem(Itemizer.CrystalsPurple,4);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ghoulasm,2))){
                                        player.dropItem(Itemizer.CrystalBox,1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.barathos){
                                if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotBlazium,2))){
                                    player.dropItem(Itemizer.IngotBlazium,2);
                                }
                                if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotBaronyte,2))){
                                    player.dropItem(Itemizer.IngotBaronyte,2);
                                }
                                if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotElecanium,2))){
                                    player.dropItem(Itemizer.IngotElecanium,2);
                                }
                                if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotVarsium,2))){
                                    player.dropItem(Itemizer.IngotVarsium,2);
                                }
                                if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.HiveChunk,2))){
                                    player.dropItem(Itemizer.HiveChunk,2);
                                }
                                break;
                            }
                                if(player.dimension==ConfigurationHelper.shyrelands){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotShyrestone,2))){
                                        player.dropItem(Itemizer.IngotShyrestone,2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotShyregem,2))){
                                        player.dropItem(Itemizer.IngotShyregem,2);
                                    }
                                    if (r.nextInt(12)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.AncientRing,1))){
                                        player.dropItem(Itemizer.AncientRing,1);
                                    }
                                    break;
                                }
                                if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotRosite,2))){
                                    player.dropItem(Itemizer.IngotRosite,2);
                                    break;
                                }

								break;
							case 14:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.animaStones"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.FragmentedAnimaStone, 4)))
									player.dropItem(Itemizer.FragmentedAnimaStone, 4);
								break;
							case 15:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.runes"));
								if (!player.inventory.addItemStackToInventory(new ItemStack(ItemUtil.getRandomRune(), 64)))
									player.dropItem(ItemUtil.getRandomRune(), 64);
                                player.dropItem(Itemizer.CopperCoin,20 + r.nextInt(24));
                            if(player.dimension==-1) {
                                if (r.nextInt(100) == 0)
                                    if (!player.inventory.addItemStackToInventory(new ItemStack(Armorizer.InfernalHelmet, 1))) {
                                        player.dropItem(Armorizer.InfernalHelmet, 1);
                                    }
                                if (r.nextInt(100) == 0)
                                    if(!player.inventory.addItemStackToInventory(new ItemStack(Armorizer.InfernalChestplate, 1))) {
                                        player.dropItem(Armorizer.InfernalChestplate, 1);
                                    }
                                if (r.nextInt(100) == 0)
                                    if(!player.inventory.addItemStackToInventory(new ItemStack(Armorizer.InfernalLeggings, 1))) {
                                        player.dropItem(Armorizer.InfernalLeggings, 1);
                                    }
                                if (r.nextInt(100) == 0)
                                    if(!player.inventory.addItemStackToInventory(new ItemStack(Armorizer.InfernalBoots, 1))) {
                                        player.dropItem(Armorizer.InfernalBoots, 1);
                                    }
                                if (r.nextInt(4) == 0){
                                    if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotEmberstone, 2))) {
                                        player.dropItem(Itemizer.IngotEmberstone, 2);
                                    }
                                }
                                break;
                            }

							case 16:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.grenades"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Weaponizer.Grenade, 16)))
									player.dropItem(Weaponizer.Grenade, 16);
								break;
							case 17:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.diamond"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Items.diamond, 1)))
									player.dropItem(Items.diamond, 1);
                                player.dropItem(Itemizer.CopperCoin,24 + r.nextInt(28));
                                if(player.dimension==0){
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotJade,2))) {
                                            player.dropItem(Itemizer.IngotJade, 2);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.AmethystIngot,2))){
                                            player.dropItem(Itemizer.AmethystIngot,2);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunk,4))){
                                            player.dropItem(Itemizer.RuniumChunk,4);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLimonite,4))){
                                            player.dropItem(Itemizer.IngotLimonite,4);
                                        }
                                    if (r.nextInt(4)==0)
                                        if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotSapphire,2))){
                                            player.dropItem(Itemizer.IngotSapphire,2);
                                        }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.iromine){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLyon,2))){
                                        player.dropItem(Itemizer.IngotLyon,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.barathos){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotBlazium,2))){
                                        player.dropItem(Itemizer.IngotBlazium,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotBaronyte,2))){
                                        player.dropItem(Itemizer.IngotBaronyte,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotElecanium,2))){
                                        player.dropItem(Itemizer.IngotElecanium,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotVarsium,2))){
                                        player.dropItem(Itemizer.IngotVarsium,2);
                                    }
                                    if (r.nextInt(6)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.HiveChunk,2))){
                                        player.dropItem(Itemizer.HiveChunk,2);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.shyrelands){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotShyrestone,2))){
                                        player.dropItem(Itemizer.IngotShyrestone,2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotShyregem,2))){
                                        player.dropItem(Itemizer.IngotShyregem,2);
                                    }
                                    if (r.nextInt(12)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.AncientRing,1))){
                                        player.dropItem(Itemizer.AncientRing,1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.deeplands){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RuniumChunkCharged,4))){
                                        player.dropItem(Itemizer.RuniumChunkCharged,4);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Item.getItemFromBlock(Blockizer.Deepcase),1))){
                                        player.dropItem(Item.getItemFromBlock(Blockizer.Deepcase),1);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.RockBones,2))){
                                        player.dropItem(Itemizer.RockBones,2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedStone,1))){
                                        player.dropItem(Itemizer.UnchargedStone,1);
                                    }
                                    if (r.nextInt(50)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.BoulderDash,1))){
                                        player.dropItem(Itemizer.BoulderDash,1);
                                    }
                                    break;
                                }
                                if (player.dimension==ConfigurationHelper.lunalus){
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotLunar,2))) {
                                        player.dropItem(Itemizer.IngotLunar, 2);
                                    }
                                    if (r.nextInt(5)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.UnchargedOrb, 1))) {
                                        player.dropItem(Itemizer.UnchargedOrb, 1);
                                    }
                                    break;
                                }
                                if(player.dimension==ConfigurationHelper.precasia){
                                    if (r.nextInt(10)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.IngotSkeletal,2))){
                                        player.dropItem(Itemizer.IngotSkeletal,2);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.SkullboneFragment,4))){
                                        player.dropItem(Itemizer.SkullboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.ChestboneFragment,4))){
                                        player.dropItem(Itemizer.ChestboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.LegboneFragment,4))){
                                        player.dropItem(Itemizer.LegboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.FootboneFragment,4))){
                                        player.dropItem(Itemizer.FootboneFragment,4);
                                    }
                                    if (r.nextInt(3)==0)if(!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.Ivory,4))){
                                        player.dropItem(Itemizer.Ivory,4);
                                    }
                                    break;
                                }
							case 18:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.gemBags"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.GemBag, 2)))
									player.dropItem(Itemizer.GemBag, 2);
								break;
							case 19:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.shinyBox"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.ShinyBox, 1)))
									player.dropItem(Itemizer.ShinyBox, 1);
								break;
							case 20:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.coinGold"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.GoldCoin, 1)))
									player.dropItem(Itemizer.GoldCoin, 1);
								break;
							case 21:
								player.addChatMessage(StringUtil.getLocale("message.feedback.extraction.repairDust"));

								if (!player.inventory.addItemStackToInventory(new ItemStack(Itemizer.MagicRepairDust, 1)))
									player.dropItem(Itemizer.MagicRepairDust, 1);
								break;
							default:
								break;
						}

						if (player.dimension == 0)
							cont.adjustTribute(Pluton, 2);

						cont.addExperience(cont.getExpRequired(Extraction) / extractionHelper.getExpDenominator(cont.getLevel(Extraction)), Extraction);
						w.playSoundAtEntity(player, "nevermine:FiltrationLava", 5.85f, 1.0f);
					}

					player.getHeldItem().damageItem(1, player);

					if (player instanceof EntityPlayerMP)
						((EntityPlayerMP)player).sendContainerToPlayer(player.inventoryContainer);


			}

			return true;
		}
	}

