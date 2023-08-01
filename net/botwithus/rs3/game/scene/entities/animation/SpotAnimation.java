package net.botwithus.rs3.game.scene.entities.animation;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.scene.entities.Entity;

public class SpotAnimation extends Entity {
    public SpotAnimation(int id, Coordinate position) {
        super(id, Type.SPOT_ANIMATION, position);
    }
}
