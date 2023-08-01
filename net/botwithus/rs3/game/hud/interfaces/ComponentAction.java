package net.botwithus.rs3.game.hud.interfaces;

import net.botwithus.rs3.game.minimenu.actions.MiniMenuAction;

public enum ComponentAction implements MiniMenuAction {
    COMPONENT,
    COMPONENT_ITEM,
    DIALOGUE;

    @Override public int getType() { return 0; }
}
