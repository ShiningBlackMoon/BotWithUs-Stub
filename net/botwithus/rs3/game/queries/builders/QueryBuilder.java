package net.botwithus.rs3.game.queries.builders;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.util.function.BiPredicate;

public interface QueryBuilder extends BiPredicate<MemoryLayout, MemorySegment> {
    public static final BiPredicate<MemoryLayout, MemorySegment> DEFAULT = null;
}
