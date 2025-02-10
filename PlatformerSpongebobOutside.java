import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformerSpongebob here.
 * 
 * @Brendon
 * @29/01/2025
 */
public class PlatformerSpongebobOutside extends Player
{
    private int minWidth;
    private int minHeight;
    private int maxWidth;
    private int maxHeight;
    public boolean isAtPOI;

    public PlatformerSpongebobOutside()
    {
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);
        
        minWidth = getImage().getWidth();
        minHeight = getImage().getHeight();
        maxWidth = (int) Math.round(getImage().getWidth() * 1.5);
        maxHeight = (int) Math.round(getImage().getHeight() * 1.5);
    }

    public void act()
    {
        checkMovement();
        checkLocation();
    }
    
    private void checkLocation()
    {
        int x = getX();
        int width = getImage().getWidth();
        int height = getImage().getHeight();
    
        boolean inFrontOfSpongebobsDoor = (x >= 700 && x <= 765) && (width <= minWidth && height <= minHeight);
        boolean inFrontOfSquidwardsDoor = (x >= 445 && x <= 535) && (width <= minWidth && height <= minHeight);
        boolean inFrontOfPatricksDoor = (x >= 160 && x <= 280) && (width <= minWidth && height <= minHeight);
    
        if (!isAtPOI)
        {
            if (inFrontOfSquidwardsDoor)
            {
                isAtPOI = true;
                getWorld().addObject(new SomethingsUp(), 472, 440);
            }
            else if (inFrontOfPatricksDoor)
            {
                isAtPOI = true;
                getWorld().addObject(new SomethingsUp(), 220, 440);
            }
            else if (inFrontOfSpongebobsDoor)
            {
                isAtPOI = true;
                getWorld().addObject(new SomethingsUp(), 733, 440);
            }
        }
        else if (!inFrontOfSquidwardsDoor && !inFrontOfPatricksDoor && !inFrontOfSpongebobsDoor)
        {
            isAtPOI = false;
        }
    }

    private void checkMovement()
    {
        // movement in 3D space
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 2, getY());
        }

        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 2, getY());
        }

        if ((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
            && (getImage().getWidth() >= minWidth || getImage().getHeight() >= minHeight)) {
            setLocation(getX(), getY() - 10);
            getImage().scale(
                (int) Math.round(getImage().getWidth() / 1.1),
                (int) Math.round(getImage().getHeight() / 1.1)
            );
        }

        if ((Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
                && (getImage().getWidth() <= maxWidth || getImage().getHeight() <= maxHeight)) {
            setLocation(getX(), getY() + 10);
            getImage().scale(
                    (int) Math.round(getImage().getWidth() * 1.1),
                    (int) Math.round(getImage().getHeight() * 1.1));
        }

    }
}
