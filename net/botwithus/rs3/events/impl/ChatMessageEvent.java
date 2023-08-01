package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class ChatMessageEvent implements EventMapper {

    public void fromSegment(MemorySegment segment) {}
    public String getMessage() { return ""; }
    public int getMessageType() { return -1; }
    public String getName() { return ""; }
    public MemorySegment toSegment(Arena arena) { return null; }

}
