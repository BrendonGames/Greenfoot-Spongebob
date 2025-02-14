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
    
    // Vars
    private int deltaY;
    private int gravity;
    private int jumpMomentum;
    private int minHeight;
    private boolean isJumping;
    
    private int HP;

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
        calculateDelta();
        checkLocation();
        touching();
        getWorld().showText("HP: " + HP, getWorld().getWidth() - 40, 10);
    }
    
    public void move()
    {
        if (Greenfoot.isKeyDown("space") && !isJumping)
        {
            isJumping = true;
            deltaY = jumpMomentum;
        }
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
        
        deltaY = 0;
        gravity = 1;
        jumpMomentum = 22;

        minHeight = 300;
        
        HP = 100;
    }
    
    private void calculateDelta()
    {
        if (isJumping)
        {
            setLocation(getX(), getY() - deltaY);
            deltaY -= gravity;
        }
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
    
    public void touching()
    {
        if (isTouching(Mayo.class))
        {
            HP -= 10;
            removeTouching(Mayo.class);
        } 
        
        if (isTouching(ChumBucket.class))
        {
            HP -= 10;
            removeTouching(ChumBucket.class);
        }
        
        if (isTouching(ChumBucketHat.class))
        {
            HP -= 5;
            removeTouching(ChumBucketHat.class);
        }
        
        if (isTouching(CrappyPatty.class))
        {
            HP -= 5;
            removeTouching(CrappyPatty.class);
        }
        
        if (HP == 0)
        {
            getWorld().showText("You lost", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
