package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.annotations.Onymous;
import net.botwithus.rs3.game.js5.types.configs.ConfigType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ItemType extends ConfigType,Onymous {
    @NotNull List<String> getBackpackOptions();
    int getCategory();
    long getCost();
    int getEquipmentSlotId();
    int getGrandExchangeBuyLimit();
    @NotNull List<String> getGroundOptions();
    int getIntParam(int paramId);
    @NotNull List<String> getInventoryOptions(InventoryType inventoryType);
    @NotNull ItemType.Stackability getStackability();
    String getStringParam(int paramId);
    boolean hasParam(int paramId);
    boolean isMembersOnly();

    enum Stackability {
        ALWAYS,
        NEVER,
        SOMETIMES
    }
}
