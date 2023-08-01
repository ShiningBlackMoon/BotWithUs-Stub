package net.botwithus.rs3.game.scene.entities.object;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.js5.types.LocationType;
import net.botwithus.rs3.game.scene.entities.Entity;
import org.jetbrains.annotations.Nullable;

public class SceneObject extends Entity {
    public SceneObject(int id,
                       Type type,
                       Coordinate position,
                       boolean isHidden,
                       int locTypeId,
                       int shape,
                       int rotation) {
        super(id, type, position);
    }

    @Nullable public LocationType getConfigType() { return null; }
    public int getRotation() { return -1; }
    public int getShape() { return -1; }
    public boolean isHidden() { return false; }
}
