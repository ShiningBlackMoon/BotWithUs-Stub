package net.botwithus.rs3.game.queries.builders.items;

import net.botwithus.rs3.game.item.Item;
import net.botwithus.rs3.game.queries.builders.ItemQuery;
import net.botwithus.rs3.game.queries.builders.QueryBuilder;
import net.botwithus.rs3.game.queries.results.ResultSet;
import org.jetbrains.annotations.NotNull;

public class InventoryItemQuery extends ItemQuery<InventoryItemQuery> implements QueryBuilder {
    public InventoryItemQuery ids(int... itemIds) { return null; }
    @NotNull public InventoryItemQuery inventories(int... inventoryIds) { return null; }
    @NotNull public static InventoryItemQuery newQuery(int... ids) { return null; }
    public ResultSet<Item> results() { return null; }
    public InventoryItemQuery slots(int... slots) { return null; }
    public InventoryItemQuery stack(int amount) { return null; }
    public InventoryItemQuery stack(int min, int max) { return null; }
}
