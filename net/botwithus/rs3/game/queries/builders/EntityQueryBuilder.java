package net.botwithus.rs3.game.queries.builders;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

public class EntityQueryBuilder<T> implements QueryBuilder {
    @Override public boolean test(MemoryLayout memoryLayout, MemorySegment memorySegment) { return false; }
    public T inside(Area area) { return null; }
    public T off(Coordinate coordinate) { return null; }
    public T on(Coordinate coordinate) { return null; }
    public T outside(Area area) { return null; }
}
