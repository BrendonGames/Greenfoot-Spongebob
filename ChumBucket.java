// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Thrown item by Plankton
 * 
 * @Laynah @Quillan @Brendon
 * @14/02/2025
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
