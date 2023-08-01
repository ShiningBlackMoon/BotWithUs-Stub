package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class VariableUpdateEvent implements EventMapper {
    public static VariableUpdateEvent fromNative(MemorySegment struct) { return null; }
    public void fromSegment(MemorySegment segment) {}
    public int getId() { return -1; }
    public int getValue() { return -1; }
    public boolean isVarbit() { return false; }
    public MemorySegment toSegment(Arena arena) { return null; }
}
