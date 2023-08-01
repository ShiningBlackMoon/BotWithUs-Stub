package net.botwithus.rs3.game.scene.entities.animation;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.scene.entities.Entity;
import net.botwithus.rs3.game.scene.entities.characters.PathingEntity;

public class Projectile extends Entity {
    public Projectile(int id,
                      Coordinate position,
                      int sourceIndex,
                      int sourceType,
                      int targetIndex,
                      int targetType,
                      long startCycle,
                      long endCycle,
                      Coordinate start,
                      Coordinate end) {
        super(id, Type.PROJECTILE_ANIMATION, position);
    }

    public Coordinate getDestination() { return null; }
    public long getEndCycle() { return -1L; }
    public PathingEntity<?> getSource() { return null; }
    public double getSpeed() { return -1d; }
    public Coordinate getStart() { return null; }
    public long getStartCycle() { return -1L; }
    public PathingEntity<?> getTarget() { return null; }
    public boolean hasReachedTarget(long currentCycle) { return false; }
    public boolean isInFlight(long currentCycle) { return false; }
}
