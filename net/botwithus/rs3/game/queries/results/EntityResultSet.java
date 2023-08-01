package net.botwithus.rs3.game.queries.results;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.scene.entities.Entity;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EntityResultSet<T extends Entity> extends ResultSet<T>{
    public EntityResultSet(List<T> results) { super(results); }
    public T nearest() { return null; }
    public T nearestTo(@NotNull Coordinate coordinate) { return null; }
    public T nearestTo(Entity entity) { return null; }
}
