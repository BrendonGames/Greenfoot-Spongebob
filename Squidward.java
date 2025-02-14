// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Squidward appears when being annoyed at his front door
 * 
 * @Brendon
 * @12/02/2025
 */
public class Squidward extends Characters
{
    public Squidward()
    {
        getImage().scale(getImage().getWidth() / 6, getImage().getHeight() / 6);
    }
    
    public void act()
    {
        getWorld().setPaintOrder(PanickedSpongebobOutside.class);
    }
}
