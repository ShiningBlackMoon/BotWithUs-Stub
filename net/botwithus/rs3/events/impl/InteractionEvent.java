package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

public class InteractionEvent implements EventMapper {
    public static MemoryLayout mInteractionEvent;

    public static InteractionEvent fromNative(MemorySegment struct) { return null; }
    public void fromSegment(MemorySegment segment) {}
    public int getOpcode() { return -1; }
    public int getParam1() { return -1; }
    public int getParam2() { return -1; }
    public int getParam3() { return -1; }
    public MemorySegment toSegment(Arena arena) { return null; }
}
