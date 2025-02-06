import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SomethingsUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SomethingsUp extends Assets
{
    public SomethingsUp()
    {
        getImage().scale(getImage().getWidth() * 3, getImage().getHeight() * 3);
    }

    public void act()
    {
        PlatformerSpongebobOutside spongebob = (PlatformerSpongebobOutside)getWorld().getObjects(PlatformerSpongebobOutside.class).get(0);
        if (!spongebob.isAtPOI)
        {
            beGone();
        }
    }
    
    public void beGone()
    {
        getWorld().removeObject(this);
    }
}
