import greenfoot.*;

/*
 * This is the main menu where you can choose what to do.
 * (only play game and settings menu are available during demo)
 * 
 * @Jesse
 * @14/02/2025
 */
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
        addObject(new MenuButton("X Found secrets X", new SettingsWorld(volume, gameSpeed, music, langId)), 400, 200);
        addObject(new MenuButton("Play game", new GaryIsMissingOutside(0,0)), 400, 280);
        addObject(new MenuButton("X Freeplay X", new SettingsWorld(volume, gameSpeed, music, langId)), 400, 360);
        addObject(new MenuButton("Settings", new SettingsWorld(volume, gameSpeed, music, langId)), 400, 440);
    }
}
