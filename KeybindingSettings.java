import greenfoot.*;

public class KeybindingSettings extends World {
    public KeybindingSettings() {
        super(800, 600, 1);
        showText("select keybind!", 400, 300);
        addObject(new BackButton(), 100, 550);
    }
}