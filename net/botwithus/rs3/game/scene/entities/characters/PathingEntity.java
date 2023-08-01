package net.botwithus.rs3.game.scene.entities.characters;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.annotations.Interactable;
import net.botwithus.rs3.game.annotations.Onymous;
import net.botwithus.rs3.game.js5.types.SequenceType;
import net.botwithus.rs3.game.minimenu.actions.MiniMenuAction;
import net.botwithus.rs3.game.scene.entities.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PathingEntity<T extends MiniMenuAction> extends Entity implements Interactable<T>, Onymous {
    public PathingEntity(int id,
                         Entity.Type type,
                         Coordinate position,
                         String name,
                         String overheadText,
                         int health,
                         int maxHealth,
                         boolean isMoving,
                         int interactIndex,
                         int combatLevel,
                         int animationId,
                         Headbar[] headbars,
                         Hitmark[] hitmarks) {
        super(id, type, position);
    }

    @Override public @Nullable String getName() { return null; }
    @Override public @NotNull List<String> getOptions() { return null; }
    @Override public boolean interact(int option) { return false; }
    @Override public boolean interact(T type) { return false; }
    public int getAnimationId() { return -1; }
    @Nullable public SequenceType getAnimationType() { return null; }
    public int getCombatLevel() { return -1; }
    public int getCurrentHealth() { return -1; }
    @NotNull public List<Headbar> getHeadbars() { return new ArrayList<>(); }
    @NotNull public List<Hitmark> getHitmarks() { return new ArrayList<>(); }
    public int getInteractIndex() { return -1; }
    public int getMaximumHealth() { return -1; }
    public String getOverheadText() { return null; }
    @Nullable public PathingEntity<?> getTarget() { return null; }
    public boolean isMoving() { return false; }
    public void setAnimationId(int animationId) {}
}
