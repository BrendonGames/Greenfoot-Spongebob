// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrappyPatty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrappyPatty extends Assets
{
    public CrappyPatty()
    {
        getImage().scale(getImage().getWidth() / 6, getImage().getHeight() / 6);
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
