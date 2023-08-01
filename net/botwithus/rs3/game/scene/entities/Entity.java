package net.botwithus.rs3.game.scene.entities;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.Locatable;
import net.botwithus.rs3.game.annotations.Identifiable;
import net.botwithus.rs3.game.annotations.Validatable;
import org.jetbrains.annotations.Nullable;

public class Entity implements Identifiable, Validatable, Locatable {
    public Entity(int id, Entity.Type type, Area position) {}
    public Entity(int id, Entity.Type type, Coordinate position) {}

    @Override public Area getArea() { return null; }
    @Override public int getId() { return -1; }
    @Override public boolean validate() { return false; }

    @Nullable public Coordinate getCoordinate() { return new Coordinate(-1, -1, -1); }
    public Entity.Type getType() { return null; }

    public enum Type {
        COMBINED_LOCATION,
        COMBINED_LOCATION_SECTION,
        HINT_ARROW,
        HINT_ARROW_POINTER,
        HINT_TRAIL,
        HTIN_TRAIL_SOURCE,
        LIGHT_SOURCE,
        LOCATION,
        LOCATION_CONTAINER,
        LOCATION_INTERFACE,
        MAP_SQUARE,
        NPC_ENTITY,
        OBJ_STACK,
        PLAYER_ENTITY,
        PROJECTILE_ANIMATION,
        SPOT_ANIMATION,
        TERRAIN,
        WATER,
        WATER_CONTAINER;

        public final int getEntityTypeId() { return -1; }
        //Takes either an int of a String input. JDK18+ erasure stops overloading like this.
        public static Entity.Type valueOf(int entityTypeId) { return null; }
    }
}
