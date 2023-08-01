package net.botwithus.rs3.game.queries;

import net.botwithus.rs3.game.hud.interfaces.Component;
import net.botwithus.rs3.game.item.Item;
import net.botwithus.rs3.game.queries.builders.EntityQueryBuilder;
import net.botwithus.rs3.game.queries.builders.animations.ProjectileQuery;
import net.botwithus.rs3.game.queries.builders.animations.SpotAnimationQuery;
import net.botwithus.rs3.game.queries.builders.components.ComponentQuery;
import net.botwithus.rs3.game.queries.builders.items.GroundItemQuery;
import net.botwithus.rs3.game.queries.builders.items.InventoryItemQuery;
import net.botwithus.rs3.game.queries.builders.objects.SceneObjectQuery;
import net.botwithus.rs3.game.queries.results.EntityResultSet;
import net.botwithus.rs3.game.queries.results.ResultSet;
import net.botwithus.rs3.game.scene.entities.animation.Projectile;
import net.botwithus.rs3.game.scene.entities.animation.SpotAnimation;
import net.botwithus.rs3.game.scene.entities.characters.npc.Npc;
import net.botwithus.rs3.game.scene.entities.characters.player.Player;
import net.botwithus.rs3.game.scene.entities.item.GroundItem;
import net.botwithus.rs3.game.scene.entities.object.SceneObject;

public class Queries {
    public static ResultSet<Component> queryComponents(ComponentQuery predicate) { return null; }
    public static EntityResultSet<GroundItem> queryGroundItems(GroundItemQuery predicate) { return null; }
    public static ResultSet<Item> queryInventoryItems(InventoryItemQuery predicate, int... ids) { return null; }
    public static EntityResultSet<Npc> queryNpcs(EntityQueryBuilder<?> predicate) { return null; }
    public static EntityResultSet<Player> queryPlayers(EntityQueryBuilder<Player> predicate) { return null; }
    public static EntityResultSet<Projectile> queryProjectiles(ProjectileQuery predicate) { return null; }
    public static EntityResultSet<SceneObject> querySceneObjects(SceneObjectQuery predicate) { return null; }
    public static EntityResultSet<SpotAnimation> querySpotAnimations(SpotAnimationQuery predicate) { return null; }
}
