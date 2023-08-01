package net.botwithus.rs3.game.js5.types.configs.loaders;

import net.botwithus.rs3.game.js5.types.configs.ConfigLoader;
import net.botwithus.rs3.internal.filesystem.configs.impl.ComponentTypeImpl;

import java.nio.ByteBuffer;

public class ComponentLoader implements ConfigLoader<ComponentTypeImpl> {
    @Override public ComponentTypeImpl decode(int id, ByteBuffer buffer) { return null; }
    @Override public ComponentTypeImpl initialize(int id) { return null; }
}
