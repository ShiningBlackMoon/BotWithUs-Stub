package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.EffectType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class EffectLoader implements ConfigLoader<EffectType> {
    @Override public EffectType decode(int id, ByteBuffer buffer) { return null; }
    @Override public EffectType initialize(int id) { return null; }
}
