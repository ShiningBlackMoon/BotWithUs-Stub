package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.item.Item;
import net.botwithus.rs3.game.js5.types.configs.ConfigType;

import java.util.List;

public interface InventoryType extends ConfigType {
    int getCapacity();
    List<Item> getStockItems();
}
