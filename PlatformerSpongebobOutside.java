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
    public boolean isTextActive;
    private int textActiveTimer;
    private boolean spawnedSquidward;
    private int langId;

    public PlatformerSpongebobOutside(int languageId)
    {
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);

        isTextActive = true;
        textActiveTimer = 125;

        spawnedSquidward = false;
        
        minWidth = getImage().getWidth();
        minHeight = getImage().getHeight();
        maxWidth = (int) Math.round(getImage().getWidth() * 1.5);
        maxHeight = (int) Math.round(getImage().getHeight() * 1.5);

        langId = languageId;
    }

    public void act()
    {
        textCountDown();
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
        
        if (!isTextActive)
        {
            if (inFrontOfSquidwardsDoor && !spawnedSquidward) {
                // Check if SomethingsUp has already spawned
                if (!isAtPOI) {
                    getWorld().addObject(new SomethingsUp(), 472, 440);
                    isAtPOI = true;
                }
                // Pressed space in front of Squidward's door
                if (Greenfoot.isKeyDown("space") && !isTextActive) 
                {
                    // Makes Squidward appear and tells Spongebob to go away
                    getWorld().addObject(new Squidward(), 522, 510);
                    getWorld().addObject(new Text(langId, 3), 0, 0);
                    textActiveTimer = 150;
                    spawnedSquidward = true;
                }

            } else if (inFrontOfPatricksDoor) {
                if (!isAtPOI) {
                    getWorld().addObject(new SomethingsUp(), 220, 440);
                    isAtPOI = true;
                }
                // Pressed space in front of Patrick's door
                if (Greenfoot.isKeyDown("space") && !isTextActive) 
                {

                }
            } else if (inFrontOfSpongebobsDoor)
            {
                if (!isAtPOI)
                {
                    getWorld().addObject(new SomethingsUp(), 733, 440);
                    isAtPOI = true;
                }
                // Pressed space in front of Spongebob's door
                if (Greenfoot.isKeyDown("space") && !isTextActive)
                {

                }
            }
            else 
            {
                isAtPOI = false;
            }
        } 
    }

    private void checkMovement()
    {
        if (!isTextActive) {
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
                        (int) Math.round(getImage().getHeight() * 1.1)
                        );
            }
        }
    }
    
    private void textCountDown()
    {
        if (textActiveTimer > 0)
        {
            isTextActive = true;
            textActiveTimer--;
        } 
        else 
        {
            isTextActive = false;
        }
    }
}
