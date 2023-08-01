package net.botwithus.rs3.game.scene.entities.item;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.annotations.Interactable;
import net.botwithus.rs3.game.annotations.Onymous;
import net.botwithus.rs3.game.js5.types.ItemType;
import net.botwithus.rs3.game.minimenu.actions.GroundItemAction;
import net.botwithus.rs3.game.scene.entities.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GroundItem extends Entity implements Interactable<GroundItemAction>, Onymous {
    public GroundItem(int id, Coordinate position, int stackSize) { super(id, Type.OBJ_STACK, position); }

    @Override public @NotNull List<String> getOptions() { return null; }
    @Override public boolean interact(int option) {return false; }
    @Override public boolean interact(GroundItemAction type) { return false;}
    @Override public @Nullable String getName() { return null; }
    public int getStackSize() { return -1; }
    public ItemType getConfigType() { return null; }
    @Override public Area getArea() { return null; }
    @Override public int getId() { return 0; }
    @Override public boolean validate() { return false; }
}
