package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.VarbitType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class VarbitLoader implements ConfigLoader<VarbitType> {
    @Override public VarbitType decode(int id, ByteBuffer buffer) { return null; }
    @Override public VarbitType initialize(int id) { return null; }
}
