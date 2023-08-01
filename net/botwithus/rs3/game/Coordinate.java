package net.botwithus.rs3.game;

import java.awt.*;

public class Coordinate {
    //Constructor
    public Coordinate(int x, int y, int z) {}
    public Coordinate(Coordinate pos) {}

    //Native Methods
    public static Coordinate copy(Coordinate pos) {return null;}
    public Coordinate derive(int xOffset, int yOffset, int planeOffset){return null;}
    public Area getArea(){return null;}
    public Coordinate getCoordinate(){return null;}
    public int getRegionId(){return -1;}
    public int getRegionX(){return -1;}
    public int getRegionY(){return -1;}
    public int getX(){return -1;}
    public int getXInRegion(){return -1;}
    public int getY(){return -1;}
    public int getYInRegion(){return -1;}
    public int getZ(){return -1;}
    public boolean isEastOf(Locatable locatable){return false;}
    public boolean isNorthOf(Locatable locatable){return false;}
    public boolean isSouthOf(Locatable locatable){return false;}
    public boolean isWestOf(Locatable locatable){return false;}
    public Point toPoint(){return null;}

}
