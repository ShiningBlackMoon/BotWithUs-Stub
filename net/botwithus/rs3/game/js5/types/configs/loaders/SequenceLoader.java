package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.SequenceType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class SequenceLoader implements ConfigLoader<SequenceType> {
    @Override public SequenceType decode(int id, ByteBuffer buffer) { return null; }
    @Override public SequenceType initialize(int id) { return null; }
}
