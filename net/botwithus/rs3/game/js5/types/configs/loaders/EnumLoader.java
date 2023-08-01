package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.EnumType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class EnumLoader implements ConfigLoader<EnumType> {
    @Override public EnumType decode(int id, ByteBuffer buffer) { return null; }
    @Override public EnumType initialize(int id) { return null; }
}
