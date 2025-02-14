import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spongebob ran out of his house to try and find Gary. This Spongebob can move left, right, 
 * forwards and backwards. This is the most important actor within the GaryIsMissing portion.
 * This actor handles almost everything within this minigame.
 * 
 * @Brendon
 * @29/01/2025
 */
public class PanickedSpongebobOutside extends Player
{
    // Image sizes
    private int minWidth;
    private int minHeight;
    private int maxWidth;
    private int maxHeight;

    // Location
    public boolean isAtPOI;
    
    // Interacted with locations
    private boolean spawnedSquidward;
    private boolean triedHome;
    private boolean gotToPatrick;

    // Text
    public boolean isTextActive;
    private boolean jellyfishInUI;
    private int textActiveTimer;
    
    // Loading next minigame
    private int nextLevelCountdown;
    private int langId;
    private int jellyfish;


    public PanickedSpongebobOutside(int languageId, int totalJellyfish)
    {
        getImage().scale(getImage().getWidth() / 5, getImage().getHeight() / 5);

        spawnedSquidward = false;
        triedHome = false;
        gotToPatrick = false;
        
        minWidth = getImage().getWidth();
        minHeight = getImage().getHeight();
        maxWidth = (int) Math.round(getImage().getWidth() * 1.5);
        maxHeight = (int) Math.round(getImage().getHeight() * 1.5);
        
        // Default vars
        isTextActive = true;
        textActiveTimer = 125;
        jellyfishInUI = false;
        
        nextLevelCountdown = -1;
        langId = languageId;
        jellyfish = totalJellyfish;
    }

    public void act()
    {
        countDowns();
        checkMovement();
        checkLocation();

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
                    // Makes Squidward appear and tells Spongebob to go away and you gain 10 jellyfish
                    getWorld().addObject(new Squidward(), 522, 510);
                    getWorld().addObject(new Text(langId, 3), 0, 0);
                    textActiveTimer = 175;
                    spawnedSquidward = true;
                    jellyfish = jellyfish + 10;
                }

            } else if (inFrontOfPatricksDoor && !gotToPatrick) {
                if (!isAtPOI) {
                    getWorld().addObject(new SomethingsUp(), 220, 440);
                    isAtPOI = true;
                }
                // Pressed space in front of Patrick's door
                if (Greenfoot.isKeyDown("space") && !isTextActive) 
                {
                    getWorld().addObject(new Text(langId, 4), 1, 1);
                    textActiveTimer = 200;
                    nextLevelCountdown = 200;
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
    
    private void countDowns()
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
            Greenfoot.setWorld(new GaryIsMissing(langId, jellyfish));
        } 
        else
        {
            nextLevelCountdown--;
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
