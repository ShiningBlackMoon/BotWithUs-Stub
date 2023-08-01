package net.botwithus.rs3.imgui;

public class ImGui {
    public static boolean Begin(String label, int flags) { return false; }
    public static boolean BeginChild(String id, float width, float height, boolean border, int flags) { return false; }
    public static boolean BeginChildFrame(int id, float width, float height, int flags) { return false; }
    public static boolean BeginPopup(String id, int flags) { return false; }
    public static boolean BeginPopupModal(String id, int flags) { return false; }
    public static boolean BeginTabBar(String label, int flags) { return false; }
    public static boolean BeginTabItem(String label, int flags) { return false; }
    public static boolean BeginTable(String label, int columns, int flags) { return false; }
    public static void BeginTooltip() {}
    public static boolean Button(String name) { return false; }
    public static Vector2f CalcTextSize(String text) { return null; }
    public static boolean Checkbox(String label, boolean state) { return false; }
    public static void CloseCurrentPopup() {}
    public static boolean Combo(String label, NativeInteger currentItem, String... items) { return false; }
    public static void End() {}
    public static void EndChild() {}
    public static void EndChildFrame() {}
    public static void EndPopup() {}
    public static void EndTabBar() {}
    public static void EndTabItem() {}
    public static void EndTable() {}
    public static void EndTooltip() {}
    public static String GetClipboardText() { return null; }
    public static Vector2f GetItemRectMax() { return null; }
    public static Vector2f GetItemRectMin() { return null; }
    public static Vector2f GetItemRectSize() { return null; }
    public static boolean HasContextMenu(String id) { return false; }
    public static int InputInt(String label, int value) { return -1; }
    public static int InputInt(String label, int value, int step, int stepFast, int flags) { return -1; }
    public static String InputText(String label, String text) { return null; }
    public static String InputText(String label, String buffer, int size, int flags) { return null; }
    public static boolean IsItemClicked(ImGui.MouseButton button) { return false; }
    public static boolean IsItemHovered() { return false; }
    public static void ListBoxFooter() {}
    public static void ListBoxHeader(String label, float width, float height) {}
    public static boolean MenuItem(String label, String shortcut, NativeBoolean selected, boolean enabled) { return false; }
    public static void OpenPopup(String name, int flags) {}
    public static void PopID() {}
    public static void PopStyleColor() {}
    public static void PopStyleColor(int count) {}
    public static void PopStyleVar(int count) {}
    public static void PushID(int id) {}
    public static void PushID(String id) {}
    public static void PushStyleColor(int idx, float r, float g, float b, float a) {}
    public static void PushStyleVar(int idx, float var, float var1) {}
    public static void SameLine() {}
    public static void SameLine(float spacing) {}
    public static void SameLine(float offsetFromStartX, float spacing) {}
    public static boolean Selectable(String label, boolean selected, int flags) { return false; }
    public static void Separator() {}
    public static void SetClipboardText(String text, Object... args) {}
    public static void SetCursorPos(float x, float y) {}
    public static void SetCursorPosX(float x) {}
    public static void SetCursorPosY(float y) {}
    public static void SetScrollHereX(float x) {}
    public static void SetScrollHereY(float y) {}
    public static void SetWindowSize(float sizeX, float sizeY) {}
    public static void Spacing(float x, float y) {}
    public static boolean TabItemButton(String label, int flags) { return false; }
    public static void TableHeadersRow() {}
    public static boolean TableNextColumn() { return false; }
    public static void TableNextRow() {}
    public static void TableSetupColumn(String name, int flags) {}
    public static void Text(String fmt, Object... args) {}

    public static enum MouseButton {
        LEFT_BUTTON,
        RIGHT_BUTTON;

        public int getButton() { return -1; }
    }
}
