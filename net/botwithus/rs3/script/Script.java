package net.botwithus.rs3.script;

import net.botwithus.rs3.internal.plugins.ScriptDescription;

import java.util.function.Consumer;

public abstract class Script {
    public Script(String name, ScriptDescription scriptDescription) {}
    public final ScriptConfiguration getConfiguration() { return null; }
    public ScriptConsole getConsole() { return null; }
    public String getDescription() { return ""; }
    public ScriptGraphicsContext getGraphicsContext() { return null; }
    public final String getName() { return ""; }
    public void initialize() {}
    public final boolean isActive() { return false; }
    public boolean isBackgroundScript() { return false; }
    abstract void onLoop();
    public final void print(String message) {}
    public final void print(String message, Object... args) {}
    public final void println(String message) {}
    public final void println(String message, Object... args) {}
    public final void setActive(boolean active) {}
    public final <T> void subscribe(Class<T> eventType, Consumer<T> listener) {}
    public void uninitialize() {}
}
