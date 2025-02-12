// import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This icon appears when close to something you can interact with
 * 
 * @Brendon
 * @06/02/2025
 */
public class SomethingsUp extends Assets
{
    public SomethingsUp()
    {
        // Scale image at spawn
        getImage().scale(getImage().getWidth() * 3, getImage().getHeight() * 3);
    }

    public void act()
    {
        // Checks if PlatformferSpongebobOutside is at a point of interest (something to interact with)
        PlatformerSpongebobOutside spongebob = (PlatformerSpongebobOutside) getWorld().getObjects(PlatformerSpongebobOutside.class).get(0);
        if (!spongebob.isAtPOI) {
            beGone();
        } 
        else if (spongebob.isTextActive)
        {
            beGone();
        }
    }
    
    // Deletes the actor when no longer at a point of interest
    public void beGone()
    {
        getWorld().removeObject(this);
    }
}
