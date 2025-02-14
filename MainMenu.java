import greenfoot.*;

public class MainMenu extends Menus {
    private GreenfootSound menuMusic;

    public MainMenu() {    
        super(800, 600, 1);
        prepare();
        menuMusic = new GreenfootSound("menu_music.wav"); // Load the music
        menuMusic.playLoop(); // Play it in a loop
    }

    private void prepare() {
        addObject(new MenuButton("Gevonden geheimen", new SecretsWorld()), 400, 200);
        addObject(new MenuButton("Speel spel", new GaryIsMissingOutside(0,0)), 400, 280);
        addObject(new MenuButton("Vrij spel", new FreePlayWorld()), 400, 360);
        addObject(new MenuButton("Instellingen", new SettingsWorld()), 400, 440);

    }

    public void stopped() {
        menuMusic.stop(); // Stop the music when leaving the menu
    }
}