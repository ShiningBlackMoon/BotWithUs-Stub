package net.botwithus.rs3.game.scene.entities.characters;

import net.botwithus.rs3.game.annotations.Identifiable;
import net.botwithus.rs3.game.annotations.Validatable;

public class Hitmark implements Identifiable, Validatable {
    @Override public int getId() { return 0; }
    @Override public boolean validate() { return false; }
    public int getDamage() { return -1; }
}
