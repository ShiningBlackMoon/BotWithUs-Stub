package net.botwithus.rs3.game.item;

import net.botwithus.rs3.game.annotations.Identifiable;
import net.botwithus.rs3.game.annotations.Onymous;
import net.botwithus.rs3.game.js5.types.InventoryType;
import net.botwithus.rs3.game.js5.types.ItemType;
import org.jetbrains.annotations.Nullable;

public class Item implements Identifiable, Onymous {
    public Item(int inventoryId, int slot, int id, int stackSize) {}

    @Override public int getId() { return -1; }
    @Nullable @Override public String getName() { return null; }

    @Nullable public ItemType getConfigType() { return null; }
    @Nullable public InventoryType getInventory() { return null; }
    public int getSlot() { return -1; }
    public int getStackSize() { return -1; }
    public int getVarbitValue(int varbitId) { return -1; }

}
