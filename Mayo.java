// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mayo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mayo extends Assets
{
    public Mayo()
    {
        getImage().scale(getImage().getWidth() / 12, getImage().getHeight() / 12);
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
