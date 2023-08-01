package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.ParamType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class ParamLoader implements ConfigLoader<ParamType> {
    @Override public ParamType decode(int id, ByteBuffer buffer) { return null; }
    @Override public ParamType initialize(int id) { return null; }
}
