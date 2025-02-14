import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlanktonDodge here.
 * 
 * @Laynah  @Quillan
 * @05-02-25 
 */
public class PlanktonDodge extends Minigames
{
    //the score variable
    private int scorePlankton;
    private int timer;
    
    /**
     * Constructor for objects of class PlanktonDodge.
     * 
     */
    public PlanktonDodge(int jellyfish)
    {
        super(1000, 400, 1);
        scorePlankton = jellyfish;
        gettingReady();
        addScore();
        timer = 3000;
    }
    
    public void act()
    {
        objects();
        timer--;
            if (timer == 0)
        {
            // thanks for playing the demo
            Greenfoot.stop();
        } 
    }
    
    /**
      * adding the score of the jellyfish's
      */
    public void addScore()
    {    
        scorePlankton = scorePlankton + 1;
    }
    
    /**
     * preparing the playable character
     */
    private void gettingReady()
    {
        PlanktonDodgeSpongebob planktondodgespongebob = new PlanktonDodgeSpongebob();
        addObject(planktondodgespongebob, 100, 300); 
    }
    
    public void objects()
    {
        if (Greenfoot.getRandomNumber(1361) <= 1 )
            {
                addObject(new Mayo(), 1000, 350);
            }
            
        if (Greenfoot.getRandomNumber(1650) <= 1 )
            {
                addObject(new ChumBucket(), 1000, 350);
            }
        
        if (Greenfoot.getRandomNumber(1237) <= 1 )
            {
                addObject(new ChumBucketHat(), 1000, 350);
            }
            
        if (Greenfoot.getRandomNumber(1572) <= 1 )
            {
                addObject(new CrappyPatty(), 1000, 350);
            }
        }
}

