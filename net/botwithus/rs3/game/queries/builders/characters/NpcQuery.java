package net.botwithus.rs3.game.queries.builders.characters;

import net.botwithus.rs3.game.queries.builders.PathingEntityQuery;
import net.botwithus.rs3.game.queries.results.EntityResultSet;
import net.botwithus.rs3.game.scene.entities.characters.npc.Npc;

public class NpcQuery extends PathingEntityQuery<NpcQuery> {
    public static NpcQuery newQuery() { return null; }
    public EntityResultSet<Npc> results() { return null; }
}
