import greenfoot.*;

public class SettingsMenu extends World {
    private GreenfootSound backgroundMusic;

    public SettingsMenu() {
        super(800, 600, 1);
        prepare();
        backgroundMusic = new GreenfootSound("menu_music.wav");
        backgroundMusic.playLoop();
    }

    private void prepare() {
        addObject(new SettingsButton("Set Volume", 1), 400, 100);
        addObject(new SettingsButton("Moeilijkheid (Game Speed)", 2), 400, 170);
        addObject(new SettingsButton("Donkere Modus (grap)", 3), 400, 240);
        addObject(new SettingsButton("Achtergrond muziek", 4), 400, 310);
        addObject(new SettingsButton("Microfoon checken", 5), 400, 380);
        addObject(new SettingsButton("Aanpasbare toetsen", 6), 400, 450);
        addObject(new SettingsButton("Taalselectie", 7), 400, 520);
        addObject(new BackButton(), 100, 550);
    }

    public void stopped() {
        backgroundMusic.stop();
    }
}