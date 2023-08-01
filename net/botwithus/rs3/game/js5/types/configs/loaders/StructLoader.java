package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.StructType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class StructLoader implements ConfigLoader<StructType> {
    @Override public StructType decode(int id, ByteBuffer buffer) { return null; }
    @Override public StructType initialize(int id) { return null; }
}
