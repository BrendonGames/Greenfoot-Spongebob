import greenfoot.*;

/*
 * The world where you can change the volume (unused during demo)
 * 
 * @Jesse
 * @14/02/2025
 */
public class VolumeSettings extends World
{
    int volume;
    int gameSpeed;
    boolean music;
    int langId;

    public VolumeSettings(int volumeSet, int gameSpeedSet, boolean musicSet, int languageId)
    {
        super(800, 600, 1);
        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;
        showText("volume", 400, 300);
        addObject(new BackButton(volume, gameSpeed, music, langId), 100, 550);
    }
}
