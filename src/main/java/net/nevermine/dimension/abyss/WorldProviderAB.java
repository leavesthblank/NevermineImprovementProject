package net.nevermine.dimension.abyss;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.nevermine.izer.Dimensionizer;

public class WorldProviderAB extends WorldProvider {

	@Override
	public String getDimensionName() {
		return ("DimensionAbyss");
	}

	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerAbyss(worldObj.getSeed(), terrainType);
		this.dimensionId = Dimensionizer.abyssId;
		this.hasNoSky = true;
	}

	@Override
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderAbyss(this.worldObj, this.worldObj.getSeed());
	}

	@Override
	public float getCloudHeight() {
		return 128.0F;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public boolean canSnowAt(int x, int y, int z, boolean checkLight) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Vec3 getFogColor(float par1, float par2) {
		float f2 = MathHelper.cos(par1 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;

		if (f2 < 1.5F) {
			f2 = 1.5F;
		}

		if (f2 > 5.0F) {
			f2 = 5.0F;
		}

		float f3 = 0.7529412F;
		float f4 = 0.84705883F;
		float f5 = 1.0F;
		f3 *= f2 * 0.94F + 0.06F;
		f4 *= f2 * 0.94F + 0.06F;
		f5 *= f2 * 0.91F + 0.09F;
		f3 = 0.414F * f2;
		f4 = 0.021F * f2;
		f5 = 0.03F * f2;
		return Vec3.createVectorHelper(f3, f4, f5);
	}

	@Override
	public boolean doesXZShowFog(int par1, int par2) {
		return true;
	}

	@Override
	public String getSaveFolder() {
		return "Abyss";
	}

	@Override
	public boolean isSurfaceWorld() {
		return false;

	}

	@Override
	public float calculateCelestialAngle(long var1, float var3) {
		return 0.4F;
	}

}
