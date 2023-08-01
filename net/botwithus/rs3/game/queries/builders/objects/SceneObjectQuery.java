package net.botwithus.rs3.game.queries.builders.objects;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.queries.builders.EntityQueryBuilder;
import net.botwithus.rs3.game.queries.results.EntityResultSet;
import net.botwithus.rs3.game.scene.entities.object.SceneObject;

import java.util.function.BiFunction;
import java.util.regex.Pattern;

public class SceneObjectQuery extends EntityQueryBuilder<SceneObjectQuery> {
    public SceneObjectQuery contains(String name) { return null; }
    public SceneObjectQuery hidden(boolean value) { return null; }
    public SceneObjectQuery id(int objectId) { return null; }
    public SceneObjectQuery inside(Area area) { return null; }
    public SceneObjectQuery name(String name) { return null; }
    public SceneObjectQuery name(String... names) { return null; }
    public SceneObjectQuery name(String name, BiFunction<String, CharSequence, Boolean> function) { return null; }
    public SceneObjectQuery name(Pattern pattern) { return null; }
    public SceneObjectQuery name(Pattern pattern, BiFunction<Pattern, String, Boolean> function) { return null; }
    public static SceneObjectQuery newQuery() { return null; }
    public SceneObjectQuery option(String optionName) { return null; }
    public SceneObjectQuery option(String... optionNames) { return null; }
    public SceneObjectQuery option(Pattern optionPattern) { return null; }
    public EntityResultSet<SceneObject> results() { return null; }
}
