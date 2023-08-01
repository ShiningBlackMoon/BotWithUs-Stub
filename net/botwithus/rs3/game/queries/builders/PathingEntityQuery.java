package net.botwithus.rs3.game.queries.builders;

import java.util.function.BiFunction;
import java.util.regex.Pattern;

public class PathingEntityQuery<T extends PathingEntityQuery<T>> extends EntityQueryBuilder<T> {
    public T animation(int animationId) { return null; }
    public T combatLevel(int combatLevel) { return null; }
    public T health(int min, int max) { return null; }
    public T id(int index) { return null; }
    public T interactId(int interactId) { return null; }
    public T isMoving(boolean isMoving) { return null; }
    public T name(String name) { return null; }
    public T name(String... names) { return null; }
    public T name(String name, BiFunction<String, CharSequence, Boolean> function) { return null; }
    public T name(Pattern name) { return null; }
    public T option(String optionName) { return null; }
    public T option(Pattern optionPattern) { return null; }
    public T overheadText(String text) { return null; }
    public T overheadText(String text, BiFunction<String, CharSequence, Boolean> function) { return null; }
    public T overheadText(Pattern text) { return null; }
}
