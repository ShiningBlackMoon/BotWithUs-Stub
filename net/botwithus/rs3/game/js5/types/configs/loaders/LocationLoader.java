package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.LocationType;
import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;

import java.nio.ByteBuffer;

public class LocationLoader implements ConfigLoader<LocationType> {
    @Override public LocationType decode(int id, ByteBuffer buffer) { return null; }
    @Override public LocationType initialize(int id) { return null; }
}
