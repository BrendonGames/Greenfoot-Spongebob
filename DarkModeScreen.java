import greenfoot.*;

/*
 * A joke image pops up
 * 
 * @Jesse
 * @14/02/2025
 */

public class DarkModeScreen extends World
{
    int volume;
    int gameSpeed;
    boolean music;
    int langId;
    public DarkModeScreen(int volumeSet, int gameSpeedSet, boolean musicSet, int languageId) {
        super(800, 600, 1);
        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;
        GreenfootImage image = new GreenfootImage("darkmode.png"); 
        setBackground(image);
        addObject(new BackButton(volume, gameSpeed, music, langId), 100, 550);
    }
}
