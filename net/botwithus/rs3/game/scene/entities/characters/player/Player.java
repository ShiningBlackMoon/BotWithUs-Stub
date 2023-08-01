package net.botwithus.rs3.game.scene.entities.characters.player;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.minimenu.actions.PlayerAction;
import net.botwithus.rs3.game.scene.entities.characters.Headbar;
import net.botwithus.rs3.game.scene.entities.characters.Hitmark;
import net.botwithus.rs3.game.scene.entities.characters.PathingEntity;

public class Player extends PathingEntity<PlayerAction> {
    public Player(int id,
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
}
