// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChumBucket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChumBucket extends Assets
{
    public ChumBucket()
    {
        getImage().scale(getImage().getWidth() / 7, getImage().getHeight() / 7);
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
