package com.bruh.testmod.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenerator implements IWorldGenerator{
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, ChunkGenerator chunkGenerator,
			AbstractChunkProvider chunkProvider) {
		
		switch (world.getWorldType().getId()) {
		case 0: //Overworld
			break;
		case -1: //Nether
			break;
		case 1: //End
			break;
		}
		
	}

}
