package net.botwithus.rs3.script;

public class ScriptThread extends Thread {
    public ScriptThread(boolean isBackground) {}
    public static ScriptThread getBackgroundThread() { return null; }
    public static ScriptThread getCurrentThread() { return null; }
    public void interrupt() {}
    public void run() {}
    public void runLater(Runnable task) {}
    public void start() {}
}
