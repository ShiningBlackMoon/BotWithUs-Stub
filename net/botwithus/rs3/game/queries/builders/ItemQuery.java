package net.botwithus.rs3.game.queries.builders;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemQuery<T> implements QueryBuilder {
    @Override public boolean test(MemoryLayout memoryLayout, MemorySegment segment) { return false; }
    public T category(int category) { return null; }
    public T cost(long price) { return null; }
    public T equipmentSlot(byte equipmentSlot) { return null; }
    public T grandExchangeBuyLImit(int geBuyLimit) { return null; }
    public T ids(int... itemIds) { return null; }
    public T isStackable(boolean isStackable) { return null; }
    public T membersOnly(boolean membersOnly) { return null; }
    public T name(String name) { return null; }
    public T name(String... itemNames) { return null; }
    public T name(String name, BiFunction<String, CharSequence, Boolean> spred) { return null; }
    public T name(Pattern... namePatterns) { return null; }
    public T name(Pattern[] names, Predicate<Matcher> pred) { return null; }
    public T name(Pattern pattern, BiFunction<Pattern, String, Boolean> function) { return null; }
    public T neverStacks(boolean neverStackable) { return null; }
    public T option(String name) { return null; }
    public T option(String... optionNames) { return null; }
    public T option(String option, BiFunction<String, CharSequence, Boolean> spred) { return null; }
    public T option(Pattern option) { return null; }
    public T option(Pattern option, Predicate<Matcher> pred) { return null; }
}
