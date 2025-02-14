// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Thrown item by Plankton
 * 
 * @Laynah @Quillan @Brendon
 * @14/02/2025
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
