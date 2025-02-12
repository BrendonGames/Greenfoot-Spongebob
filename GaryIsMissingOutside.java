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
    public int langId;
    /**
     * Constructor for objects of class GaryIsMissing.
     * 
     */
    public GaryIsMissingOutside(int jellyfish, int languageId /* other vars settings; secrets */)
    {
        super(1000, 761, 1);
        scorePlatformer = jellyfish;
        langId = languageId;
        addObject(new PlatformerSpongebobOutside(langId), 731, 541);
        addObject(new Text(langId, 1), 1, 1);
        addObject(new Text(langId, 5), 1, 1);
    }
}
