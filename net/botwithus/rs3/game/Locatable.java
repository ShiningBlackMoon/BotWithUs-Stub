package net.botwithus.rs3.game;

import org.jetbrains.annotations.NotNull;

public interface Locatable {

    default double distanceTo(@NotNull Locatable target) { return -1d; }
    Area getArea();
    default @NotNull Coordinate getCoordiate(){ return new Coordinate(-1, -1, -1); }

}
