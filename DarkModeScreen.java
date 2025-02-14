import greenfoot.*;

public class DarkModeScreen extends World {
    public DarkModeScreen() {
        super(800, 600, 1);
        GreenfootImage image = new GreenfootImage("darkmode.png"); 
        setBackground(image);
        addObject(new BackButton(), 100, 550);
    }
}