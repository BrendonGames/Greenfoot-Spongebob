// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlanktonDodge here.
 * 
 * @Laynah  
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
        super(512, 320, 1);
        scorePlankton = jellyfish;
    }
    
    /**
      * adding the score of the jellyfish's
      */
    public void addScore()
    {
            scorePlankton = scorePlankton + 1;
            showText("Jellyfish's: " + scorePlankton, 80, 25);
    }
    }

