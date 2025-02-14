import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SettingsWorld extends Menus {
    public SettingsWorld() {
        super(800, 600, 1);
        showText("Instellingen", 400, 300);
    }
}
addObject(new MenuButton("Instellingen", new SettingsMenu()), 400, 440);