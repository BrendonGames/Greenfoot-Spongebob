import greenfoot.*;

public class MusicVolumeSettings extends World {
    public MusicVolumeSettings() {
        super(800, 600, 1);
        showText("muziek volume", 400, 300);
        addObject(new BackButton(), 100, 550);
    }
}