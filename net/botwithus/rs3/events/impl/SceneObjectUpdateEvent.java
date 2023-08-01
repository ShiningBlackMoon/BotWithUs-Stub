package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class SceneObjectUpdateEvent implements EventMapper {
    public void fromSegment(MemorySegment segment) {}
    public int getObjectId() { return -1; }
    public int getPlane() { return -1; }
    public int getRotation() { return -1; }
    public int getType() { return -1; }
    public int getX() { return -1; }
    public int getY() { return -1; }
    public MemorySegment toSegment(Arena arena) { return null; }
}
