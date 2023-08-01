package net.botwithus.rs3.game.queries.builders.items;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.queries.builders.ItemQuery;

public class GroundItemQuery extends ItemQuery<GroundItemQuery> {
    public GroundItemQuery amount(int amount) { return null; }
    public GroundItemQuery amount(int min, int max) { return null; }
    public GroundItemQuery itemId(int... itemIds) { return null; }
    public GroundItemQuery onTile(Coordinate coordinate) { return null; }
    public GroundItemQuery withinArea(Area area) { return null; }
}
