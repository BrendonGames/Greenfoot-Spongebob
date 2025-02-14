// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChumBucketHat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChumBucketHat extends Assets
{
    public ChumBucketHat()
    {
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);
    }
    
    public void act()
    {
        setLocation(getX() - 10, getY());
        if (getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
