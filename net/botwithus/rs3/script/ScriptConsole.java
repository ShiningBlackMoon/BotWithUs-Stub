package net.botwithus.rs3.script;

import java.io.OutputStream;

public class ScriptConsole extends OutputStream {
    public static final int MAX_CONSOLE_LINES = 2048;

    public void addLineToConsole(String line) {}
    public void addLineToConsole(String line, boolean sameLine) {}
    public void clear() {}
    public String[] getConsoleLines() { return null; }
    public String getInputBuffer() { return null; }
    public int getLineIndex() { return -1; }
    public boolean isScrollToBottom() { return false; }
    public void setInputBuffer(String inputBuffer) {}
    public void setLineIndex(int lineIndex) {}
    public void setScrollToBottom(boolean scrollToBottom) {}
    public void write(int b) {}
}
