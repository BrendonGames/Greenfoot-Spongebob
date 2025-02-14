import greenfoot.*;

public class VolumeSettings extends World {
    public VolumeSettings() {
        super(800, 600, 1);
        showText("volume", 400, 300);
        addObject(new BackButton(), 100, 550);
    }
}