package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.game.scene.entities.characters.PathingEntity;
import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class SequenceUpdateEvent implements EventMapper {
    public void fromSegment(MemorySegment segment) {}
    public int getAnimationId() { return -1; }
    public PathingEntity<?> getEntity() { return null; }
    public int getEntityType() { return -1; }
    public int getServerIndex() { return -1; }
    public MemorySegment toSegment(Arena arena) { return null; }
}
