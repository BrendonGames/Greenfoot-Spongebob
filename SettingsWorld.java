import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
 * The world that leads to the settings
 * 
 * @Jesse @Brendon
 * @14/02/2025
 */

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
        addObject(new MenuButton("Settings", new SettingsMenu(volume, gameSpeed, music, langId)), 400, 440);
    }
}
