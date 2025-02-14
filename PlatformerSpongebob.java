import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatformerSpongebob here.
 * 
 * @Brendon
 * @14/02/2025
 */
public class PlatformerSpongebob extends Player
{
    // Vars
    private int deltaY;
    private int gravity;
    private int jumpMomentum;
    private int minHeight;
    private boolean isJumping;

    // Text
    public boolean isTextActive;
    private boolean jellyfishInUI;
    private int textActiveTimer;

    // Loading next minigame
    private int nextLevelCountdown;
    private int langId;
    private int jellyfish;

    public PlatformerSpongebob()
    {
        getImage().scale(getImage().getWidth() / 4, getImage().getHeight() / 4);

        // Set jumping settings
        deltaY = 0;
        gravity = 1;
        jumpMomentum = 20;

        minHeight = 638;
    }

    public void act()
    {
        checkLocation();
        checkMovement();
        calculateDelta();
    }

    private void checkLocation()
    {
        if (getY() >= minHeight && deltaY <= 0)
        {
            setLocation(getX(), minHeight);
            deltaY = 0;
            isJumping = false;
        }
    }
    
    private void checkMovement()
    {
        // movement in 2D space
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 4, getY());
            setImage("scaredbob-right.png");
            getImage().scale(getImage().getWidth() / 4, getImage().getHeight() / 4);
        }

        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 4, getY());
            setImage("scaredbob-left.png");
            getImage().scale(getImage().getWidth() / 4, getImage().getHeight() / 4);
        }

        // Jump mechanics
        if (Greenfoot.isKeyDown("space") && !isJumping)
        {
            isJumping = true;
            deltaY = jumpMomentum;
        }
    }

    private void calculateDelta()
    {
        if (isJumping)
        {
            setLocation(getX(), getY() - deltaY);
            deltaY -= gravity;
        }
    }
}
