import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlanktonDodgeSpongebob here.
 * 
 * @Laynah @Quillan
 * @14-02-25 (a version number or a date)
 */
public class PlanktonDodgeSpongebob extends Player
{    
    private int Jellyfish;
    private boolean JellyfishInUI;
    
    /**
     * Act - do whatever the PlanktonDodgeSpongebob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkForJellyfish();
        
        // Jellyfish counter
        JellyfishCountLocation();
        if (!JellyfishInUI)
        {
            getWorld().addObject(new JellyfishAmount(), 20, 20);
            JellyfishInUI = true;
        }
        move();
    }
    
    public void move()
    {
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
                setLocation(getX(), getY() - 2);
            }

            if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) {
                setLocation(getX(), getY() + 2);
            }
    }
    
    /**
     * check if spongebob is touching a jellyfish
     */
    public void checkForJellyfish()
    {
        if(isTouching (Jellyfish.class))
        {
            PlanktonDodge planktonDodge = (PlanktonDodge)getWorld();
            planktonDodge.addScore();
            removeTouching(Jellyfish.class);
        }
    }
    
    public PlanktonDodgeSpongebob()
    {
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);
    }
    
    private void JellyfishCountLocation()
    {
        if (Jellyfish < 10)
        {
            getWorld().showText(": " + Jellyfish, 55, 20);
            getWorld().showText("" , 60, 20);
            getWorld().showText("" , 65, 20);
            getWorld().showText("" , 70, 20);
        }
        else if (Jellyfish < 100)
        {
            getWorld().showText("" , 55, 20);
            getWorld().showText(": " + Jellyfish, 60, 20);
            getWorld().showText("" , 65, 20);
            getWorld().showText("" , 70, 20);
        }
        else if (Jellyfish < 1000)
        {
            getWorld().showText("" , 55, 20);
            getWorld().showText("" , 60, 20);
            getWorld().showText(": " + Jellyfish, 65, 20);
            getWorld().showText("" , 70, 20);
        } 
        else if (Jellyfish < 10000)
        {
            getWorld().showText("" , 55, 20);
            getWorld().showText("" , 60, 20);
            getWorld().showText("" , 65, 20);
            getWorld().showText(": " + Jellyfish, 70, 20);
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
