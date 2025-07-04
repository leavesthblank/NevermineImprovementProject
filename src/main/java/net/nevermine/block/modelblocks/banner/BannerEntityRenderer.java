package net.nevermine.block.modelblocks.banner;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.nevermine.assist.TileResourceLocation;
import net.nevermine.common.nevermine;
import net.nevermine.izer.SpecialBlockizer;

public class BannerEntityRenderer {
	private static TileResourceLocation x;

	public static void init() {
		nevermine.registerItemRenderer(SpecialBlockizer.IllusionBanner, new RenderBannerItem(SpecialBlockizer.IllusionBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedIllusionBanner, new RenderBannerItem(SpecialBlockizer.GildedIllusionBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledIllusionBanner, new RenderBannerItem(SpecialBlockizer.BejeweledIllusionBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.ShadowBanner, new RenderBannerItem(SpecialBlockizer.ShadowBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedShadowBanner, new RenderBannerItem(SpecialBlockizer.GildedShadowBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledShadowBanner, new RenderBannerItem(SpecialBlockizer.BejeweledShadowBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.SkeletalBanner, new RenderBannerItem(SpecialBlockizer.SkeletalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedSkeletalBanner, new RenderBannerItem(SpecialBlockizer.GildedSkeletalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledSkeletalBanner, new RenderBannerItem(SpecialBlockizer.BejeweledSkeletalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.SeaBanner, new RenderBannerItem(SpecialBlockizer.SeaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedSeaBanner, new RenderBannerItem(SpecialBlockizer.GildedSeaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledSeaBanner, new RenderBannerItem(SpecialBlockizer.BejeweledSeaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.NetherBanner, new RenderBannerItem(SpecialBlockizer.NetherBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedNetherBanner, new RenderBannerItem(SpecialBlockizer.GildedNetherBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledNetherBanner, new RenderBannerItem(SpecialBlockizer.BejeweledNetherBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.NethengeicBanner, new RenderBannerItem(SpecialBlockizer.NethengeicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedNethengeicBanner, new RenderBannerItem(SpecialBlockizer.GildedNethengeicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledNethengeicBanner, new RenderBannerItem(SpecialBlockizer.BejeweledNethengeicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.UtopianBanner, new RenderBannerItem(SpecialBlockizer.UtopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedUtopianBanner, new RenderBannerItem(SpecialBlockizer.GildedUtopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledUtopianBanner, new RenderBannerItem(SpecialBlockizer.BejeweledUtopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.LottoBanner, new RenderBannerItem(SpecialBlockizer.LottoBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedLottoBanner, new RenderBannerItem(SpecialBlockizer.GildedLottoBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledLottoBanner, new RenderBannerItem(SpecialBlockizer.BejeweledLottoBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.AncientBanner, new RenderBannerItem(SpecialBlockizer.AncientBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedAncientBanner, new RenderBannerItem(SpecialBlockizer.GildedAncientBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledAncientBanner, new RenderBannerItem(SpecialBlockizer.BejeweledAncientBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.SoulBanner, new RenderBannerItem(SpecialBlockizer.SoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedSoulBanner, new RenderBannerItem(SpecialBlockizer.GildedSoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledSoulBanner, new RenderBannerItem(SpecialBlockizer.BejeweledSoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.HauntedBanner, new RenderBannerItem(SpecialBlockizer.HauntedBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedHauntedBanner, new RenderBannerItem(SpecialBlockizer.GildedHauntedBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledHauntedBanner, new RenderBannerItem(SpecialBlockizer.BejeweledHauntedBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.FungalBanner, new RenderBannerItem(SpecialBlockizer.FungalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedFungalBanner, new RenderBannerItem(SpecialBlockizer.GildedFungalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledFungalBanner, new RenderBannerItem(SpecialBlockizer.BejeweledFungalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GhoulBanner, new RenderBannerItem(SpecialBlockizer.GhoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedGhoulBanner, new RenderBannerItem(SpecialBlockizer.GildedGhoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledGhoulBanner, new RenderBannerItem(SpecialBlockizer.BejeweledGhoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.VoxBanner, new RenderBannerItem(SpecialBlockizer.VoxBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedVoxBanner, new RenderBannerItem(SpecialBlockizer.GildedVoxBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledVoxBanner, new RenderBannerItem(SpecialBlockizer.BejeweledVoxBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.DustopianBanner, new RenderBannerItem(SpecialBlockizer.DustopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedDustopianBanner, new RenderBannerItem(SpecialBlockizer.GildedDustopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledDustopianBanner, new RenderBannerItem(SpecialBlockizer.BejeweledDustopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.DeepBanner, new RenderBannerItem(SpecialBlockizer.DeepBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedDeepBanner, new RenderBannerItem(SpecialBlockizer.GildedDeepBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledDeepBanner, new RenderBannerItem(SpecialBlockizer.BejeweledDeepBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BoreicBanner, new RenderBannerItem(SpecialBlockizer.BoreicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedBoreicBanner, new RenderBannerItem(SpecialBlockizer.GildedBoreicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledBoreicBanner, new RenderBannerItem(SpecialBlockizer.BejeweledBoreicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.MechaBanner, new RenderBannerItem(SpecialBlockizer.MechaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedMechaBanner, new RenderBannerItem(SpecialBlockizer.GildedMechaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledMechaBanner, new RenderBannerItem(SpecialBlockizer.BejeweledMechaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.LunarBanner, new RenderBannerItem(SpecialBlockizer.LunarBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedLunarBanner, new RenderBannerItem(SpecialBlockizer.GildedLunarBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledLunarBanner, new RenderBannerItem(SpecialBlockizer.BejeweledLunarBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.RosidianBanner, new RenderBannerItem(SpecialBlockizer.RosidianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedRosidianBanner, new RenderBannerItem(SpecialBlockizer.GildedRosidianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledRosidianBanner, new RenderBannerItem(SpecialBlockizer.BejeweledRosidianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.RunicBanner, new RenderBannerItem(SpecialBlockizer.RunicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedRunicBanner, new RenderBannerItem(SpecialBlockizer.GildedRunicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledRunicBanner, new RenderBannerItem(SpecialBlockizer.BejeweledRunicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BaronBanner, new RenderBannerItem(SpecialBlockizer.BaronBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedBaronBanner, new RenderBannerItem(SpecialBlockizer.GildedBaronBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledBaronBanner, new RenderBannerItem(SpecialBlockizer.BejeweledBaronBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EnergyBanner, new RenderBannerItem(SpecialBlockizer.EnergyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedEnergyBanner, new RenderBannerItem(SpecialBlockizer.GildedEnergyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledEnergyBanner, new RenderBannerItem(SpecialBlockizer.BejeweledEnergyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedIllusionBanner, new RenderBannerItem(SpecialBlockizer.EncrustedIllusionBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedShadowBanner, new RenderBannerItem(SpecialBlockizer.EncrustedShadowBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedSkeletalBanner, new RenderBannerItem(SpecialBlockizer.EncrustedSkeletalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedSeaBanner, new RenderBannerItem(SpecialBlockizer.EncrustedSeaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedNetherBanner, new RenderBannerItem(SpecialBlockizer.EncrustedNetherBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedNethengeicBanner, new RenderBannerItem(SpecialBlockizer.EncrustedNethengeicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedUtopianBanner, new RenderBannerItem(SpecialBlockizer.EncrustedUtopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedLottoBanner, new RenderBannerItem(SpecialBlockizer.EncrustedLottoBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedSoulBanner, new RenderBannerItem(SpecialBlockizer.EncrustedSoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedAncientBanner, new RenderBannerItem(SpecialBlockizer.EncrustedAncientBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedHauntedBanner, new RenderBannerItem(SpecialBlockizer.EncrustedHauntedBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedFungalBanner, new RenderBannerItem(SpecialBlockizer.EncrustedFungalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedGhoulBanner, new RenderBannerItem(SpecialBlockizer.EncrustedGhoulBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedVoxBanner, new RenderBannerItem(SpecialBlockizer.EncrustedVoxBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedDustopianBanner, new RenderBannerItem(SpecialBlockizer.EncrustedDustopianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedDeepBanner, new RenderBannerItem(SpecialBlockizer.EncrustedDeepBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedBoreicBanner, new RenderBannerItem(SpecialBlockizer.EncrustedBoreicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedMechaBanner, new RenderBannerItem(SpecialBlockizer.EncrustedMechaBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedLunarBanner, new RenderBannerItem(SpecialBlockizer.EncrustedLunarBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedRosidianBanner, new RenderBannerItem(SpecialBlockizer.EncrustedRosidianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedRunicBanner, new RenderBannerItem(SpecialBlockizer.EncrustedRunicBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedBaronBanner, new RenderBannerItem(SpecialBlockizer.EncrustedBaronBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedEnergyBanner, new RenderBannerItem(SpecialBlockizer.EncrustedEnergyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EnergyBanner, new RenderBannerItem(SpecialBlockizer.EnergyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedEnergyBanner, new RenderBannerItem(SpecialBlockizer.GildedEnergyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledEnergyBanner, new RenderBannerItem(SpecialBlockizer.BejeweledEnergyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedLelyetianBanner, new RenderBannerItem(SpecialBlockizer.EncrustedLelyetianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.LelyetianBanner, new RenderBannerItem(SpecialBlockizer.LelyetianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedLelyetianBanner, new RenderBannerItem(SpecialBlockizer.GildedLelyetianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledLelyetianBanner, new RenderBannerItem(SpecialBlockizer.BejeweledLelyetianBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.SelyanBanner, new RenderBannerItem(SpecialBlockizer.SelyanBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.LuxonBanner, new RenderBannerItem(SpecialBlockizer.LuxonBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.PlutonBanner, new RenderBannerItem(SpecialBlockizer.PlutonBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.ErebonBanner, new RenderBannerItem(SpecialBlockizer.ErebonBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedClownBanner, new RenderBannerItem(SpecialBlockizer.EncrustedClownBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.ClownBanner, new RenderBannerItem(SpecialBlockizer.ClownBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedClownBanner, new RenderBannerItem(SpecialBlockizer.GildedClownBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledClownBanner, new RenderBannerItem(SpecialBlockizer.BejeweledClownBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedCrystalBanner, new RenderBannerItem(SpecialBlockizer.EncrustedCrystalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.CrystalBanner, new RenderBannerItem(SpecialBlockizer.CrystalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedCrystalBanner, new RenderBannerItem(SpecialBlockizer.GildedCrystalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledCrystalBanner, new RenderBannerItem(SpecialBlockizer.BejeweledCrystalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedGhostlyBanner, new RenderBannerItem(SpecialBlockizer.EncrustedGhostlyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GhostlyBanner, new RenderBannerItem(SpecialBlockizer.GhostlyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedGhostlyBanner, new RenderBannerItem(SpecialBlockizer.GildedGhostlyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledGhostlyBanner, new RenderBannerItem(SpecialBlockizer.BejeweledGhostlyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedBloodBanner, new RenderBannerItem(SpecialBlockizer.EncrustedBloodBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BloodBanner, new RenderBannerItem(SpecialBlockizer.BloodBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedBloodBanner, new RenderBannerItem(SpecialBlockizer.GildedBloodBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledBloodBanner, new RenderBannerItem(SpecialBlockizer.BejeweledBloodBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedVoidBanner, new RenderBannerItem(SpecialBlockizer.EncrustedVoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.VoidBanner, new RenderBannerItem(SpecialBlockizer.VoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedVoidBanner, new RenderBannerItem(SpecialBlockizer.GildedVoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledVoidBanner, new RenderBannerItem(SpecialBlockizer.BejeweledVoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedCandyBanner, new RenderBannerItem(SpecialBlockizer.EncrustedCandyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.CandyBanner, new RenderBannerItem(SpecialBlockizer.CandyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedCandyBanner, new RenderBannerItem(SpecialBlockizer.GildedCandyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledCandyBanner, new RenderBannerItem(SpecialBlockizer.BejeweledCandyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedGingerbreadBanner, new RenderBannerItem(SpecialBlockizer.EncrustedGingerbreadBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GingerbreadBanner, new RenderBannerItem(SpecialBlockizer.GingerbreadBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedGingerbreadBanner, new RenderBannerItem(SpecialBlockizer.GildedGingerbreadBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledGingerbreadBanner, new RenderBannerItem(SpecialBlockizer.BejeweledGingerbreadBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedCreepyBanner, new RenderBannerItem(SpecialBlockizer.EncrustedCreepyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.CreepyBanner, new RenderBannerItem(SpecialBlockizer.CreepyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedCreepyBanner, new RenderBannerItem(SpecialBlockizer.GildedCreepyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledCreepyBanner, new RenderBannerItem(SpecialBlockizer.BejeweledCreepyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedCreepoidBanner, new RenderBannerItem(SpecialBlockizer.EncrustedCreepoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.CreepoidBanner, new RenderBannerItem(SpecialBlockizer.CreepoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedCreepoidBanner, new RenderBannerItem(SpecialBlockizer.GildedCreepoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledCreepoidBanner, new RenderBannerItem(SpecialBlockizer.BejeweledCreepoidBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedImmortalBanner, new RenderBannerItem(SpecialBlockizer.EncrustedImmortalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.ImmortalBanner, new RenderBannerItem(SpecialBlockizer.ImmortalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedImmortalBanner, new RenderBannerItem(SpecialBlockizer.GildedImmortalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledImmortalBanner, new RenderBannerItem(SpecialBlockizer.BejeweledImmortalBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedFragmentBanner, new RenderBannerItem(SpecialBlockizer.EncrustedFragmentBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.FragmentBanner, new RenderBannerItem(SpecialBlockizer.FragmentBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedFragmentBanner, new RenderBannerItem(SpecialBlockizer.GildedFragmentBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledFragmentBanner, new RenderBannerItem(SpecialBlockizer.BejeweledFragmentBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedEnergy2Banner, new RenderBannerItem(SpecialBlockizer.EncrustedEnergy2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.Energy2Banner, new RenderBannerItem(SpecialBlockizer.Energy2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedEnergy2Banner, new RenderBannerItem(SpecialBlockizer.GildedEnergy2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledEnergy2Banner, new RenderBannerItem(SpecialBlockizer.BejeweledEnergy2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedSoul2Banner, new RenderBannerItem(SpecialBlockizer.EncrustedSoul2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.Soul2Banner, new RenderBannerItem(SpecialBlockizer.Soul2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedSoul2Banner, new RenderBannerItem(SpecialBlockizer.GildedSoul2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledSoul2Banner, new RenderBannerItem(SpecialBlockizer.BejeweledSoul2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedCreation2Banner, new RenderBannerItem(SpecialBlockizer.EncrustedCreation2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.Creation2Banner, new RenderBannerItem(SpecialBlockizer.Creation2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedCreation2Banner, new RenderBannerItem(SpecialBlockizer.GildedCreation2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledCreation2Banner, new RenderBannerItem(SpecialBlockizer.BejeweledCreation2Banner));
		nevermine.registerItemRenderer(SpecialBlockizer.ShyreBanner, new RenderBannerItem(SpecialBlockizer.ShyreBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedShyreBanner, new RenderBannerItem(SpecialBlockizer.GildedShyreBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledShyreBanner, new RenderBannerItem(SpecialBlockizer.BejeweledShyreBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedShyreBanner, new RenderBannerItem(SpecialBlockizer.EncrustedShyreBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.LightBanner, new RenderBannerItem(SpecialBlockizer.LightBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedLightBanner, new RenderBannerItem(SpecialBlockizer.GildedLightBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledLightBanner, new RenderBannerItem(SpecialBlockizer.BejeweledLightBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedLightBanner, new RenderBannerItem(SpecialBlockizer.EncrustedLightBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.ShinyBanner, new RenderBannerItem(SpecialBlockizer.ShinyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.GildedShinyBanner, new RenderBannerItem(SpecialBlockizer.GildedShinyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.BejeweledShinyBanner, new RenderBannerItem(SpecialBlockizer.BejeweledShinyBanner));
		nevermine.registerItemRenderer(SpecialBlockizer.EncrustedShinyBanner, new RenderBannerItem(SpecialBlockizer.EncrustedShinyBanner));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBanner.class, new RenderBanner());
	}
}
