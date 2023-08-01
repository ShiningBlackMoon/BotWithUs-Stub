package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.game.item.Item;
import net.botwithus.rs3.internal.memory.EventMapper;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public class InventoryUpdateEvent implements EventMapper {
    public static InventoryUpdateEvent fromNative(MemorySegment segment) { return null; }
    public void fromSegment(MemorySegment segment) {}
    public int getInventoryId() { return -1; }
    public Item getNewItem() { return null; }
    public Item getOldItem() { return null; }
    public int getSlot() { return -1; }
    public MemorySegment toSegment(Arena arena) { return null; }
}
