package net.botwithus.rs3.game.queries.builders.animations;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.queries.builders.QueryBuilder;
import net.botwithus.rs3.game.queries.results.EntityResultSet;
import net.botwithus.rs3.game.scene.entities.animation.Projectile;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

public class ProjectileQuery implements QueryBuilder {
    @Override public boolean test(MemoryLayout memoryLayout, MemorySegment segment) { return false; }
    public ProjectileQuery endCycle(int endCycle) { return null; }
    public ProjectileQuery endX(int endX) { return null; }
    public ProjectileQuery endY(int endY) { return null; }
    public ProjectileQuery id(int id) { return null; }
    public static ProjectileQuery newQuery() { return null; }
    public ProjectileQuery position(Coordinate coordinate) { return null; }
    public EntityResultSet<Projectile> results() { return null; }
    public ProjectileQuery sourceIndex(int sourceIndex) { return null; }
    public ProjectileQuery sourceType(int sourceType) { return null; }
    public ProjectileQuery startCycle(int startCycle) { return null; }
    public ProjectileQuery startX(int startX) { return null; }
    public ProjectileQuery startY(int startY) { return null; }
    public ProjectileQuery targetIndex(int targetIndex) { return null; }
    public ProjectileQuery targetType(int targetType) { return null; }
    public ProjectileQuery withinArea(Area area) { return null; }
}
