package net.botwithus.rs3.game.queries.builders.characters;

import net.botwithus.rs3.game.queries.builders.PathingEntityQuery;
import net.botwithus.rs3.game.queries.results.EntityResultSet;
import net.botwithus.rs3.game.scene.entities.characters.player.Player;

public class PlayerQuery extends PathingEntityQuery<PlayerQuery> {
    public static PlayerQuery newQuery() { return null; }
    public EntityResultSet<Player> results() { return null; }
}
