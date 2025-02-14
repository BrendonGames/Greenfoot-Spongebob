import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PressRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PressRun extends Menus
{

    /**
     * Constructor for objects of class PressRun.
     * 
     */
    public PressRun()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.setWorld(new MainMenu(50, 50, true, 0));
    }
}
