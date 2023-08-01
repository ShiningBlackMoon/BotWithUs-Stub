package net.botwithus.rs3.game.annotations;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Interactable<T> {
    default Function<Integer, T> getDefaultMapper() { return null; }
    @NotNull List<String> getOptions();
    boolean interact(int option);
    default boolean interact(String option) { return false; };
    default boolean interact(String option, BiFunction<String, CharSequence, Boolean> spred) { return false; }
    default boolean interact(String option, BiFunction<String, CharSequence, Boolean> spred, Function<Integer, T> typeMapper) { return false; }
    boolean interact(T type);
}
