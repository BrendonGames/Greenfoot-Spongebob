// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Thrown item by Plankton
 * 
 * @Laynah @Quillan @Brendon
 * @14/02/2025
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
