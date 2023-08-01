package net.botwithus.rs3.game;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class Area {

    public boolean contains(Locatable locatable) { return false; }
    public Coordinate getCentroid() {return null;}
    @NotNull public List<Coordinate> getCoordinates() { return new ArrayList<>(); }
    public final Set<Coordinate> getOverlap(Area area) { return null; }
    public final Set<Coordinate> getOverlap(Area area, boolean ignorePlane) { return null; }
    @NotNull public Coordinate getRandomCoordinate(){return new Coordinate(-1, -1, -1);}
    public boolean overlaps(Area area, boolean ignorePlane) {return false;}
    public boolean overlaps(Locatable locatable){return false;}
    public abstract Area.Circular toCircular();
    public abstract Area.Polygonal toPolygonal();
    public abstract Area.Rectangular toRectangular();
    public Area.Singular toSingular() {return null;}

    public class Circular extends Area {
        public Circular(Coordinate center, double radius) {}
        public Circular derive(int xOffset, int yOffset, int planeOffset) { return null; }
        //Gets the center Coordinate of this Area.Circular Area.
        public Coordinate getCoordinate(){ return null; }
        public double getRadius(){ return -1d; }
        @NotNull @Override public Area.Circular toCircular(){ return new Area.Circular(new Coordinate(-1, -1, -1), 1d); }
        @NotNull @Override public Area.Polygonal toPolygonal(){ return new Area.Polygonal(); }
        @NotNull @Override public Area.Rectangular toRectangular(){ return new Area.Rectangular(); }
    }

    public class Polygonal extends Area {
        public Polygonal(Coordinate... vertices) {}
        public Coordinate getCoordinate() { return new Coordinate(-1, -1, -1); }
        @NotNull @Override public Area.Circular toCircular() { return new Area.Circular(new Coordinate(-1, -1, -1), 1d); }
        @NotNull @Override public Area.Polygonal toPolygonal() { return new Area.Polygonal(); }
        @NotNull @Override public Area.Rectangular toRectangular() { return new Area.Rectangular(); }
    }

    public class Rectangular extends Area {
        public Circular derive(int xOffset, int yOffset, int planeOffset) { return null; }
        public Coordinate getBottomLeft() { return null; }
        public Coordinate getBottomRight() { return null; }
        public Coordinate getCoordinate() { return new Coordinate(-1, -1, -1); }
        public Coordinate getTopLeft() { return null; }
        public Coordinate getTopRight() { return null; }
        @NotNull @Override public Area.Circular toCircular() { return new Area.Circular(new Coordinate(-1, -1, -1), 1d); }
        @NotNull @Override public Area.Polygonal toPolygonal() { return new Area.Polygonal(); }
        @NotNull @Override public Area.Rectangular toRectangular() { return new Area.Rectangular(); }
    }

    public class Singular extends Area {
        public Coordinate getCoordinate() { return new Coordinate(-1, -1, -1); }
        @NotNull @Override public Area.Circular toCircular() { return new Area.Circular(new Coordinate(-1, -1, -1), 1d); }
        @NotNull @Override public Area.Polygonal toPolygonal() { return new Area.Polygonal(); }
        @NotNull @Override public Area.Rectangular toRectangular() { return new Area.Rectangular(); }
    }

}
