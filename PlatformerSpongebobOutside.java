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
    private boolean triedHome;
    private int nextLevelCountdown;
    private boolean jellyfishInUI;
    // Settings for loading next minigame
    private int langId;
    private int jellyfish;


    public PlatformerSpongebobOutside(int languageId, int totalJellyfish)
    {
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);

        isTextActive = true;
        textActiveTimer = 125;

        spawnedSquidward = false;
        triedHome = false;
        jellyfishInUI = false;
        
        minWidth = getImage().getWidth();
        minHeight = getImage().getHeight();
        maxWidth = (int) Math.round(getImage().getWidth() * 1.5);
        maxHeight = (int) Math.round(getImage().getHeight() * 1.5);

        langId = languageId;
        jellyfish = totalJellyfish;
    }

    public void act()
    {
        countDown();
        checkMovement();
        checkLocation();

        jellyfishCountLocation();
        if (!jellyfishInUI)
        {
            getWorld().addObject(new JellyfishAmount(), 20, 20);
            jellyfishInUI = true;
        }

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
                    nextLevelCountdown = 500;
                }
            } else if (inFrontOfSpongebobsDoor && !triedHome)
            {
                if (!isAtPOI)
                {
                    getWorld().addObject(new SomethingsUp(), 733, 440);
                    isAtPOI = true;
                }
                // Pressed space in front of Spongebob's door
                if (Greenfoot.isKeyDown("space") && !isTextActive)
                {
                    getWorld().addObject(new Text(langId, 2), 1, 1);
                    textActiveTimer = 100;
                    triedHome = true;
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
    
    private void countDown()
    {
        if (textActiveTimer > 0)
        {
            isTextActive = true;
            textActiveTimer--;
        } else
        {
            isTextActive = false;
        }

        if (nextLevelCountdown == 0)
        {
            new GaryIsMissing();
        }
    }
    
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
