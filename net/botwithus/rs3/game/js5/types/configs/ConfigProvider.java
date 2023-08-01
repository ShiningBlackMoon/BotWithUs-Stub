package net.botwithus.rs3.game.js5.types.configs;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.Iterator;

public class ConfigProvider<T extends ConfigType> implements Iterable<T> {
    @NotNull @Override public Iterator<T> iterator() { return null; }
    public int capacity() { return -1; }
    public void clear() {}
    public void dump(Path path) {}
    public void dump(Path path, int count) {}
    public T get(int id) { return null; }
    public long loadedArchiveCount() { return -1L; } //Deprecated
}
