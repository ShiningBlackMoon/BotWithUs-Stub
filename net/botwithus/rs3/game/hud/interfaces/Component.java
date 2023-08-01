package net.botwithus.rs3.game.hud.interfaces;

import net.botwithus.rs3.game.annotations.Interactable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Component implements Interactable<Integer> {
    public Component(int type,
                     int spriteId,
                     int interfaceIndex,
                     int componentIndex,
                     int subComponentIndex,
                     int properties,
                     String text,
                     int fontId,
                     int textColor,
                     int textAlpha,
                     int itemId,
                     int itemAmount,
                     @NotNull String[] options) {
    }

    public int getComponentIndex() { return -1; }
    public int getInterfaceIndex() { return -1; }
    public int getItemAmount() { return -1; }
    public int getItemId() { return -1; }
    @NotNull public List<String> getOptions() { return new ArrayList<>(); }
    @Override public boolean interact(int option) { return false; }
    @Override public boolean interact(Integer type) { return false; }
    public BitSet getProperties() { return new BitSet(); }
    public int getSpriteId() { return -1; }
    public int getSubComponentIndex() { return -1; }
    public String getText() { return ""; }
    public int getTextAlpha() { return -1; }
    public Color getTextColor() { return Color.BLACK; }
    public int getTextFontId() { return -1; }
    public Component.Type getType() { return null; }

    public enum Type {
        BOX,
        BUTTON,
        CAROUSEL,
        CHECK,
        COMBO,
        CRMVIEW,
        DIVIDER,
        GRID,
        GROUP_BOX,
        INPUTS,
        LAYER,
        LIST,
        MEDIA,
        MODEL,
        PAGED_CAROUSEL,
        PAGED_LAYER,
        PANEL,
        RADIAL_PROGRESS_OVERLAY,
        RADIO_GROUP,
        SLIDER,
        SPRITE,
        TABLE,
        TEXT,
        TOOLTIP;

        public int getOpcode() { return -1; }
        @Nullable public static Component.Type resolve(int opcode) { return null; }
    }
}
