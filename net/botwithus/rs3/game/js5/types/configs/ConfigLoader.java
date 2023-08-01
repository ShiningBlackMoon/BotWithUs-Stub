package net.botwithus.rs3.game.js5.types.configs;

import java.nio.ByteBuffer;

public interface ConfigLoader<T extends ConfigType> {
    T decode(int id, ByteBuffer buffer);
    T initialize(int id);
    default void postDecode() {}
}
