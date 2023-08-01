package net.botwithus.rs3.game.vars;

import net.botwithus.rs3.game.js5.types.vars.VarDomainType;
import org.jetbrains.annotations.Nullable;

public class VarManager {
    public static int getVarbitValue(int varbitId) { return -1; }
    public static int getVarc(int id) { return -1; }
    @Nullable public String getVarcString(int id) { return ""; }
    @Nullable public VarDomainType getVarDomain(int varbitId) { return VarDomainType.CLIENT; }
    public static int getVarValue(VarDomainType domain, int varId) { return -1; }
}
