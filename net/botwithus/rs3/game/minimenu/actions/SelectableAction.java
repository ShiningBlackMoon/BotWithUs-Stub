package net.botwithus.rs3.game.minimenu.actions;

public enum SelectableAction implements MiniMenuAction {
    SELECT_COMPONENT_ITEM,
    SELECT_GROUND_ITEM,
    SELECT_NPC,
    SELECT_OBJECT,
    SELECT_PLAYER,
    SELECT_TILE,
    SELECT_COMPONENT;

    @Override public int getType() { return 0; }
}
