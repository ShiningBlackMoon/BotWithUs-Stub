package net.botwithus.rs3.game;

import net.botwithus.rs3.game.scene.entities.characters.player.Player;
import org.jetbrains.annotations.Nullable;

public class Client {

    public Client() {}

    public static int getClientCycle() { return -1; }
    @Nullable public Client.GameState getGameState() { return null; }
    @Nullable public static Player getLocalPlayer() { return null; }

    public enum GameState {
        ACCOUNT_CREATION,
        ATTEMPTING_TO_REESTABLISH_NOTIFICATION,
        INITIALIZING,
        LOADING_NOTIFICATION,
        LOBBY_SCREEN,
        LOGGED_IN,
        LOGIN_SCREEN,
        RECONNECTING_TO_SERVER;

        public int getValue() { return -1; }
    }

}
