package net.botwithus.rs3.game.queries.builders.components;

import net.botwithus.rs3.game.hud.interfaces.Component;
import net.botwithus.rs3.game.queries.builders.QueryBuilder;
import net.botwithus.rs3.game.queries.results.ResultSet;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComponentQuery implements QueryBuilder {
    public ComponentQuery(int... interfaceIds) {}

    @Override public boolean test(MemoryLayout memoryLayout, MemorySegment memorySegment) { return false; }

    public ComponentQuery alpha(int alpha) { return null; }
    public ComponentQuery componentIndex(int... indices) { return null; }
    public ComponentQuery font(int fontId) { return null; }
    public int[] getInterfaceIds() { return null; }
    public Function<Integer, ?> getMapper() { return null; }
    public ComponentQuery item(int itemId) { return null; }
    public ComponentQuery item(int itemId, int amount) { return null; }
    public ComponentQuery itemName(String name) { return null; }
    public ComponentQuery itemName(String name, BiFunction<String, CharSequence, Boolean> spred) { return null; }
    public ComponentQuery itemName(Pattern... namePatterns) { return null; }
    public ComponentQuery itemName(Pattern[] names, Predicate<Matcher> pred) { return null; }
    public static ComponentQuery newQuery(int interfaceId) { return null; }
    public ComponentQuery option(String option) { return null; }
    public ComponentQuery option(String option, BiFunction<String, CharSequence, Boolean> spred) { return null; }
    public ResultSet<Component> results() { return null; }
    public ComponentQuery spriteId(int alpha) { return null; }
    public ComponentQuery subComponentIndex(int... subComps) { return null; }
    public ComponentQuery text(String text, BiFunction<String, CharSequence, Boolean> spred) { return null; }
    public ComponentQuery textColor(int color) { return null; }
    public ComponentQuery type(int... ids) { return null; }
    public <T> ComponentQuery withOptionMapper(Function<Integer, T> mapper) { return null; }
}
