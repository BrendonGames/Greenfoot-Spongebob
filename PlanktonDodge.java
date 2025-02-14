// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        addObject(planktondodgespongebob, 100, 200); 
    }
    }

