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

    public PlatformerSpongebobOutside()
    {
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
        if (getX() >= 450 && getX() <= 495 &&  getImage().getWidth() <= maxWidth || getImage().getHeight() <= maxHeight)
        {
            // Check if in front of Squidwards door
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
