package net.botwithus.rs3.script;

import java.util.concurrent.Callable;

public class Execution {
    public static boolean delay(long time) { return false; }
    public static boolean delayUntil(long timeout, Callable<Boolean> predicate) { return false; }
    public static boolean delayWhile(long timeout, Callable<Boolean> predicate) { return false; }
}
