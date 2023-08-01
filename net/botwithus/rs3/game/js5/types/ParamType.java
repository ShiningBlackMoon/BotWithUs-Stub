package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.js5.types.configs.ConfigType;
import net.botwithus.rs3.game.js5.types.vars.ScriptVarType;

public interface ParamType extends ConfigType {
    int getDefaultInt();
    String getDefaultString();
    ScriptVarType getVarType();
    boolean isString();
}
