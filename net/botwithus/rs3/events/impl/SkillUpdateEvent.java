package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class SkillUpdateEvent implements EventMapper {
    public static SkillUpdateEvent fromNative(MemorySegment struct) { return null; }
    public void fromSegment(MemorySegment segment) {}
    public int getActualLevel() { return -1; }
    public int getCurrentLevel() { return -1; }
    public int getExperience() { return -1; }
    public int getId() { return -1; }
    public int getMaxLevel() { return -1; }
    public int getOldActualLevel() { return -1; }
    public int getOldCurrentLevel() { return -1; }
    public int getOldExperience() { return -1; }
    public MemorySegment toSegment(Arena arena) { return null; }
}
