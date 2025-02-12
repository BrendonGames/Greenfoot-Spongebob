// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Octo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squidward extends Characters
{
    public Squidward()
    {
        getImage().scale(getImage().getWidth() / 6, getImage().getHeight() / 6);
    }
    
    public void act()
    {
        getWorld().setPaintOrder(PlatformerSpongebobOutside.class);
    }
}
