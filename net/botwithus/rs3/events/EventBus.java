package net.botwithus.rs3.events;

import net.botwithus.rs3.script.Script;

import java.lang.foreign.MemorySegment;
import java.util.function.Consumer;

public class EventBus {
    public static final EventBus EVENT_BUS = null;

    public <T> void publish(Script owner, T event) {}
    public <T> void publish(T event) {}
    public static void receiveNativeEvent(int eventCode, MemorySegment nativeEvent) {}
    public <T> Subscription<T> subscribe(Script owner, Class<T> eventType, Consumer<T> listener) { return null; }
    public <T> void unsubscribe(Subscription<T> sub) {}
    public <T> void unsubscribe(Script owner, Class<T> eventType, Consumer<T> listener) {}
}
