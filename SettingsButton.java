import greenfoot.*;

/*
 * Buttons used in the settings menu
 * 
 * @Jesse @Brendon
 * @14/02/2025
 */
public class SettingsButton extends Actor {
    private int settingType;
    int volume;
    int gameSpeed;
    boolean music;
    int langId;

    public SettingsButton(String text, int type, int volumeSet, int gameSpeedSet, boolean musicSet, int languageId) {
        settingType = type;
        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;
        GreenfootImage img = new GreenfootImage(300, 50);
        img.setColor(Color.BLACK);
        img.fillRect(0, 0, 300, 50);
        img.setColor(Color.WHITE);
        img.drawRect(0, 0, 299, 49);
        img.setFont(new Font("Arial", 18));
        img.drawString(text, 20, 30);
        setImage(img);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            handleSetting();
        }
    }

    private void handleSetting() {
    switch (settingType) {
        case 1:
            Greenfoot.setWorld(new VolumeSettings(volume, gameSpeed, music, langId));
            break;
        case 2:
            Greenfoot.setSpeed(50);
            break;
        case 3:
            Greenfoot.setWorld(new DarkModeScreen(volume, gameSpeed, music, langId)); // Show the dark mode image
            break;
        case 4:
            Greenfoot.setWorld(new MusicVolumeSettings(volume, gameSpeed, music, langId));
            break;
        case 5:
            System.out.println(" Brendon wat wou je hier");
            break;
        case 6:
            Greenfoot.setWorld(new KeybindingSettings(volume, gameSpeed, music, langId));
            break;
        case 7:
            Greenfoot.setWorld(new LanguageSettings(volume, gameSpeed, music, langId));
            break;
    }
}
    }
