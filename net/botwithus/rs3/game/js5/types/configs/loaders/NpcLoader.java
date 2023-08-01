package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.NpcType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class NpcLoader implements ConfigLoader<NpcType> {
    @Override public NpcType decode(int id, ByteBuffer buffer) { return null; }
    @Override public NpcType initialize(int id) { return null; }
}
