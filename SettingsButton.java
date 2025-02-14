import greenfoot.*;

public class SettingsButton extends Actor {
    private int settingType;

    public SettingsButton(String text, int type) {
        settingType = type;
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
            Greenfoot.setWorld(new VolumeSettings());
            break;
        case 2:
            Greenfoot.setSpeed(Greenfoot.getSpeed() + 1);
            break;
        case 3:
            Greenfoot.setWorld(new DarkModeScreen()); // Show the dark mode image
            break;
        case 4:
            Greenfoot.setWorld(new MusicVolumeSettings());
            break;
        case 5:
            System.out.println(" Brendon wat wou je hier");
            break;
        case 6:
            Greenfoot.setWorld(new KeybindingSettings());
            break;
        case 7:
            Greenfoot.setWorld(new LanguageSettings());
            break;
    }
}
    }
