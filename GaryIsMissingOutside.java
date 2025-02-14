// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GaryIsMissing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GaryIsMissingOutside extends Minigames
{
    /**
     * Constructor for objects of class GaryIsMissing.
     * 
     */
    public GaryIsMissingOutside(int jellyfish, int langId /* other vars settings; secrets */)
    {
        super(1000, 761, 1);
        // most actions happen within Spongebob, thus he gets all the settings and variables to also bring to the next stage.
        addObject(new PanickedSpongebobOutside(langId, jellyfish), 731, 541);
        addObject(new Text(langId, 1), 1, 1);
        addObject(new Text(langId, 5), 1, 1);
    }
}
