import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SettingsWorld extends Menus
{
    int volume;
    int gameSpeed;
    boolean music;
    int langId;

    public SettingsWorld(int volumeSet, int gameSpeedSet, boolean musicSet, int languageId) {
        super(800, 600, 1);
        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;
        showText("Instellingen", 400, 300);
        addObject(new MenuButton("Instellingen", new SettingsMenu(volume, gameSpeed, music, langId)), 400, 440);
    }
}
