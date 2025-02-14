import greenfoot.*;

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
