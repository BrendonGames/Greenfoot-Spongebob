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
        super(710, 540, 1);
        getBackground().scale(getBackground().getWidth() / 2, getBackground().getHeight() / 2);
        addObject(new PlatformerSpongebob(), 1, 1);
        showText("Jellyfish: " + totalJellyfish, 60, 20);
    }
}
