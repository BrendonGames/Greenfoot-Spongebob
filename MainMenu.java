import greenfoot.*;

public class MainMenu extends Menus
{
    int volume;
    int gameSpeed;
    boolean music;
    int langId;
    public static GreenfootSound menuMusic = new GreenfootSound("new_menu_music.wav"); // Shared music object

    public MainMenu(int volumeSet, int gameSpeedSet, boolean musicSet, int languageId) {    
        super(800, 600, 1);

        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;
        prepare();
        // Only start music if it's not already playing
        if (!menuMusic.isPlaying() && !musicSet) {
            menuMusic.playLoop();
            musicSet = true;
        }
    }

    private void prepare() {
        addObject(new MenuButton("Gevonden geheimen", new SecretsWorld()), 400, 200);
        addObject(new MenuButton("Speel spel", new GaryIsMissingOutside(0,0)), 400, 280);
        addObject(new MenuButton("Vrij spel", new FreePlayWorld()), 400, 360);
        addObject(new MenuButton("Instellingen", new SettingsWorld(volume, gameSpeed, music, langId)), 400, 440);

    }

    public void stopped() {
        // menuMusic.stop(); // Stop the music when leaving the menu
    }
}
