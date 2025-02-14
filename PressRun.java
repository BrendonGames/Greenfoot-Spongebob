import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is used to put in some default settings and is only used during reset.
 * 
 * @Brendon
 * @14/02/2025
 */
public class PressRun extends Menus
{
    public PressRun()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.setWorld(new MainMenu(50, 50, false, 0));
    }
}
