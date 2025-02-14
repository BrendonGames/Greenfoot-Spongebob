import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * You're inside Patrick's house now. Jump the platforms to save Gary
 * 
 * @Brendon
 * @13/02/2025
 */
public class GaryIsMissing extends Minigames
{
    /**
     * Constructor for objects of class GaryIsMissing.
     * 
     */
    public GaryIsMissing(int languageId, int totalJellyfish)
    {
        super(947, 720, 1);
        getBackground().scale((int)Math.round(getBackground().getWidth() / 1.5), (int)Math.round(getBackground().getHeight() / 1.5));
        addObject(new PlatformerSpongebob(languageId, totalJellyfish), 888, 638);
        addObject(new Text(languageId, 6), 1, 1);

        // add platforms
        addObject(new Platform(), 496, 573);
    }
}
