package net.botwithus.rs3.game.js5.types.vars;

import net.botwithus.rs3.game.annotations.Identifiable;
import org.jetbrains.annotations.NotNull;

public enum VarDomainType implements Identifiable {
    CLAN,
    CLAN_SETTING,
    CLIENT,
    NPC,
    OBJECT,
    PLAYER,
    PLAYER_GROUP;

    @NotNull public static VarDomainType fromId(int id) { return CLAN; }
    @Override public int getId() { return 0; }
}
