package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.js5.types.configs.ConfigType;
import net.botwithus.rs3.game.js5.types.vars.ScriptVarType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface EnumType extends ConfigType {
    int getEntryCount();
    @Nullable Integer getInput(Object output);
    @NotNull List<Integer> getInputs();
    ScriptVarType getInputType();
    int getIntDefault();
    @Nullable Object getOutput(int input);
    @NotNull List<Object> getOutputs();
    ScriptVarType getOutputType();
    String getStringDefault();
}
