package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class ServerTickedEvent implements EventMapper {
    public static ServerTickedEvent fromNative(MemorySegment struct) { return null; }
    public void fromSegment(MemorySegment segment) {}
    public int getTicks() { return -1; }
    public MemorySegment toSegment(Arena arena) { return null; }
}
