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

    public PlatformerSpongebob(int languageId, int totalJellyfish)
    {
        getImage().scale(getImage().getWidth() / 4, getImage().getHeight() / 4);

        // Set jumping settings
        deltaY = 0;
        gravity = 1;
        jumpMomentum = 20;

        minHeight = 638;

        jellyfish = totalJellyfish;
        langId = languageId;
    }

    public void act()
    {
        checkLocation();
        checkMovement();
        calculateDelta();

        // Jellyfish counter
        jellyfishCountLocation();
        if (!jellyfishInUI)
        {
            getWorld().addObject(new JellyfishAmount(), 20, 20);
            jellyfishInUI = true;
        }
    }

    private void checkLocation()
    {
        // Checks if on the ground or on platform
        if (getY() >= minHeight && deltaY <= 0)
        {
            setLocation(getX(), minHeight);
            deltaY = 0;
            isJumping = false;
        }

        if (isTouching(Platform.class) && deltaY <= 0)
        {
            
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

    // 
    private void calculateDelta()
    {
        if (isJumping)
        {
            setLocation(getX(), getY() - deltaY);
            deltaY -= gravity;
        }
    }

    // Sets the counter location besides the jellyfish
    private void jellyfishCountLocation()
    {
        if (jellyfish < 10)
        {
            getWorld().showText(": " + jellyfish, 55, 20);
            getWorld().showText("" , 60, 20);
            getWorld().showText("" , 65, 20);
            getWorld().showText("" , 70, 20);
        }
        else if (jellyfish < 100)
        {
            getWorld().showText("" , 55, 20);
            getWorld().showText(": " + jellyfish, 60, 20);
            getWorld().showText("" , 65, 20);
            getWorld().showText("" , 70, 20);
        }
        else if (jellyfish < 1000)
        {
            getWorld().showText("" , 55, 20);
            getWorld().showText("" , 60, 20);
            getWorld().showText(": " + jellyfish, 65, 20);
            getWorld().showText("" , 70, 20);
        } 
        else if (jellyfish < 10000)
        {
            getWorld().showText("" , 55, 20);
            getWorld().showText("" , 60, 20);
            getWorld().showText("" , 65, 20);
            getWorld().showText(": " + jellyfish, 70, 20);
        } 
        else
        {
            getWorld().showText("" , 55, 20);
            getWorld().showText("" , 60, 20);
            getWorld().showText("" , 65, 20);
            getWorld().showText("", 70, 20);
            getWorld().showText(": 9999+", 75, 20);
        }
    }
}
