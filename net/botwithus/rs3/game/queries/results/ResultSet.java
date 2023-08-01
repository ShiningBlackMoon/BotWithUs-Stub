package net.botwithus.rs3.game.queries.results;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ResultSet<T> implements Iterable<T> {
    public ResultSet(List<T> results) {}

    public T first() { return null; }
    public boolean isEmpty() { return false; }
    public Iterator<T> iterator() { return null; }
    public T last() { return null; }
    @NotNull public ResultSet<T> limit(int num) { return this; }
    public T random() { return null; }
    public int size() { return -1; }
    public Stream<T> stream() { return null; }
}
