package net.botwithus.rs3.game.scene.entities.characters.npc;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.annotations.Interactable;
import net.botwithus.rs3.game.js5.types.NpcType;
import net.botwithus.rs3.game.minimenu.actions.NPCAction;
import net.botwithus.rs3.game.scene.entities.characters.Headbar;
import net.botwithus.rs3.game.scene.entities.characters.Hitmark;
import net.botwithus.rs3.game.scene.entities.characters.PathingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Npc extends PathingEntity<NPCAction> implements Interactable<NPCAction> {
    public Npc(int id,
               Type type,
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
        super(id, type, position, name, overheadText, health, maxHealth, isMoving, interactIndex, combatLevel, animationId, headbars, hitmarks);
    }

    @Override public Area getArea() { return null; }
    @Override public int getId() { return 0; }
    @Override public @NotNull List<String> getOptions() { return null; }
    @Override public boolean interact(int option) { return false; }
    @Override public boolean interact(NPCAction type) { return false; }
    @Override public @Nullable String getName() { return null; }
    @Override public boolean validate() { return false; }
    @Nullable public NpcType getConfigType() { return null; }
}
