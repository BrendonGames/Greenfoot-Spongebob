import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * You're inside Patrick's house now. Jump the platforms to save Gary
 * 
 * @Brendon
 * @13/02/2025
 */
public class GaryIsMissing extends Minigames
{
    // Text
    public boolean isTextActive;
    private boolean jellyfishInUI;
    private int textActiveTimer;

    // Loading next minigame
    private int nextLevelCountdown;
    private int langId;
    private int jellyfish;
    /**
     * Constructor for objects of class GaryIsMissing.
     * 
     */
    public GaryIsMissing(int languageId, int totalJellyfish)
    {
        super(947, 720, 1);
        getBackground().scale((int)Math.round(getBackground().getWidth() / 1.5), (int)Math.round(getBackground().getHeight() / 1.5));
        addObject(new PlatformerSpongebob(), 888, 638);
        showText("Jellyfish: " + totalJellyfish, 60, 20);
    }
}
