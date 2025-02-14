import greenfoot.*;

public class SettingsMenu extends World {
    private GreenfootSound backgroundMusic;
    int volume;
    int gameSpeed;
    boolean music;
    int langId;

    public SettingsMenu(int volumeSet, int gameSpeedSet, boolean musicSet, int languageId) {
        super(800, 600, 1);
        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;
        prepare();
    }

    private void prepare() {
        addObject(new SettingsButton("Set Volume", 1, volume, gameSpeed, music, langId), 400, 100);
        addObject(new SettingsButton("Moeilijkheid (Game Speed)", 2, volume, gameSpeed, music, langId), 400, 170);
        addObject(new SettingsButton("Donkere Modus (grap)", 3, volume, gameSpeed, music, langId), 400, 240);
        addObject(new SettingsButton("Achtergrond muziek", 4, volume, gameSpeed, music, langId), 400, 310);
        addObject(new SettingsButton("Microfoon checken", 5, volume, gameSpeed, music, langId), 400, 380);
        addObject(new SettingsButton("Aanpasbare toetsen", 6, volume, gameSpeed, music, langId), 400, 450);
        addObject(new SettingsButton("Taalselectie", 7, volume, gameSpeed, music, langId), 400, 520);
        addObject(new BackButton(volume, gameSpeed, music, langId), 100, 550);
    }

    public void stopped() {
        backgroundMusic.stop();
    }
}
