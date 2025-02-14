// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Thrown item by Plankton
 * 
 * @Laynah @Quillan @Brendon
 * @14/02/2025
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
