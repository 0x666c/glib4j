package io.x666c.glib4j.math;

import io.x666c.glib4j.math.FastNoise.CellularDistanceFunction;
import io.x666c.glib4j.math.FastNoise.CellularReturnType;
import io.x666c.glib4j.math.FastNoise.FractalType;
import io.x666c.glib4j.math.FastNoise.Interp;

public class Noise {
	
	private static FastNoise noise;
	static {
		noise = new FastNoise((int) MathUtil.getSeed());
	}
	
	public static float perlin(float x, float y) {
		return noise.GetPerlin(x, y);
	}
	public static float perlin(float x, float y, float z) {
		return noise.GetPerlin(x, y, z);
	}
	
	public static float perlinFractal(float x, float y) {
		return noise.GetPerlinFractal(x, y);
	}
	public static float perlinFractal(float x, float y, float z) {
		return noise.GetPerlinFractal(x, y);
	}
	
	public static float cellular(float x, float y) {
		return noise.GetCellular(x, y);
	}
	public static float cellular(float x, float y, float z) {
		return noise.GetCellular(x, y, z);
	}
	
	public static float cubic(float x, float y) {
		return noise.GetCubic(x, y);
	}
	public static float cubic(float x, float y, float z) {
		return noise.GetCubic(x, y, z);
	}
	
	public static float simplex(float x, float y) {
		return noise.GetSimplex(x, y);
	}
	public static float simplex(float x, float y, float z) {
		return noise.GetSimplex(x, y, z);
	}
	
	public static float simplexFractal(float x, float y) {
		return noise.GetSimplexFractal(x, y);
	}
	public static float simplexFractal(float x, float y, float z) {
		return noise.GetSimplexFractal(x, y, z);
	}
	
	public static float valueNoise(float x, float y) {
		return noise.GetValue(x, y);
	}
	public static float valueNoise(float x, float y, float z) {
		return noise.GetValue(x, y, z);
	}
	
	public static float valueFractal(float x, float y) {
		return noise.GetValueFractal(x, y);
	}
	public static float valueFractal(float x, float y, float z) {
		return noise.GetValueFractal(x, y, z);
	}
	
	public static float white(float x, float y) {
		return noise.GetWhiteNoise(x, y);
	}
	public static float white(float x, float y, float z) {
		return noise.GetWhiteNoise(x, y, z);
	}
	public static float white(float x, float y, float z, float w) {
		return noise.GetWhiteNoise(x, y, z, w);
	}
	
	public static float white(int x, int y) {
		return noise.GetWhiteNoiseInt(x, y);
	}
	public static float white(int x, int y, int z) {
		return noise.GetWhiteNoiseInt(x, y, z);
	}
	public static float white(int x, int y, int z, int w) {
		return noise.GetWhiteNoiseInt(x, y, z, w);
	}
	
	public static void setFrequency(float f) {
		noise.SetFrequency(f);
	}
	
	public static void setOctaves(int o) {
		noise.SetFractalOctaves(o);
	}
	
	public static void setLacunarity(int o) {
		noise.SetFractalLacunarity(o);
	}
	
	public static void setFractalType(FractalType t) {
		noise.SetFractalType(t);
	}
	
	public static void setInterpolationAlgo(Interp i) {
		noise.SetInterp(i);
	}
	
	public static void setDistanceFunc(CellularDistanceFunction f) {
		noise.SetCellularDistanceFunction(f);
	}
	
	public static void setInterpolationAlgo(CellularReturnType r) {
		noise.SetCellularReturnType(r);
	}
	
	public static void setGradientPerturbAmp(float f) {
		noise.SetGradientPerturbAmp(f);
	}
	
}