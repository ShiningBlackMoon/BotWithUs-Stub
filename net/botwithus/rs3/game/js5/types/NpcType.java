package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.annotations.Onymous;
import net.botwithus.rs3.game.js5.types.configs.ConfigType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NpcType extends ConfigType, Onymous {
    int getCombatLevel();
    @NotNull NpcType getCurrentState();
    int getIntParam(int paramId);
    @NotNull List<String> getOptions();
    int getSize();
    @NotNull List<NpcType> getStates();
    @Nullable String getStringParam(int paramId);
    boolean hasParam(int paramId);
}
