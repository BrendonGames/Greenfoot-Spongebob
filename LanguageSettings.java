import greenfoot.*;

public class LanguageSettings extends World {
    public LanguageSettings() {
        super(800, 600, 1);
        showText("we only have english", 400, 300);
        addObject(new BackButton(), 100, 550);
    }
}