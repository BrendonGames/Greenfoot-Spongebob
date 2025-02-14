import greenfoot.*;

/*
 * Change your language in this menu (unused during demo)
 * 
 * @Jesse
 * @14/02/2025
 */
public class LanguageSettings extends World
{
    int volume;
    int gameSpeed;
    boolean music;
    int langId;

    public LanguageSettings(int volumeSet, int gameSpeedSet, boolean musicSet, int languageId)
    {
        super(800, 600, 1);
        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;
        showText("we only have english", 400, 300);
        addObject(new BackButton(volume, gameSpeed, music, langId), 100, 550);
    }
}
