// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GaryIsMissing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GaryIsMissingOutside extends Minigames
{
    //the score veriable
    private int scorePlatformer;
    /**
     * Constructor for objects of class GaryIsMissing.
     * 
     */
    public GaryIsMissingOutside(int jellyfish /* other vars settings; secrets */)
    {
        super(1000, 761, 1);
        scorePlatformer = jellyfish;
        addObject(new PlatformerSpongebobOutside(), 731, 541);
        addObject(new Text(0, 1), 1, 1);
        showText("Press space on '?' to interact", getWidth() / 2, 10);
    }
}
