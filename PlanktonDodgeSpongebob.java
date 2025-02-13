// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlanktonDodgeSpongebob here.
 * 
 * @Laynah (your name) 
 * @05-02-25 (a version number or a date)
 */
public class PlanktonDodgeSpongebob extends Player
{
    /**
     * Act - do whatever the PlanktonDodgeSpongebob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkForJellyfish();
    }
    
    /**
     * check if spongebob is touching a jellyfish
     */
    public void checkForJellyfish()
    {
        if(isTouching(Jellyfish.class))
        {
            PlanktonDodge planktonDodge = (PlanktonDodge)getWorld();
            planktonDodge.addScore();
            removeTouching(Jellyfish.class);
        }
    }
}
