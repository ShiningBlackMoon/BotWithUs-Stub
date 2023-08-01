package net.botwithus.rs3.script.events;

import net.botwithus.rs3.events.impl.InteractionEvent;

import java.util.function.Consumer;

public interface InteractionListener extends Consumer<InteractionEvent> {
    default void accept(InteractionEvent event) {}
    void onInteraction(InteractionEvent event);
}
