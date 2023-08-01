package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.annotations.Onymous;
import net.botwithus.rs3.game.js5.types.configs.ConfigType;

import java.util.List;

public interface LocationType extends ConfigType, Onymous {
    int getIntParam(int paramId);
    List<String> getOptions();
    String getStringParam(int paramId);
    boolean hasParam(int paramId);
}
