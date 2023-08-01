package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.InventoryType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class InventoryLoader implements ConfigLoader<InventoryType> {
    @Override public InventoryType decode(int id, ByteBuffer buffer) { return null; }
    @Override public InventoryType initialize(int id) { return null; }
}
