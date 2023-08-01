package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.ItemType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class ItemLoader implements ConfigLoader<ItemType> {
    @Override public ItemType decode(int id, ByteBuffer buffer) { return null; }
    @Override public ItemType initialize(int id) { return null; }
}
