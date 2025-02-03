import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class textActor here.
 * 
 * @Brendon
 * @03/02/2025
 */
public class Text extends Actor
{
    private int langId;
    private int textId;
    private String text;
    private int locationX;
    private int locationY;

    public Text(int langIdConstructor, int textIdConstructor)
    {
        langId = langIdConstructor;
        textId = textIdConstructor;
    }
    
    public void act()
    {
        switch (langId) {
            // English is selected
            case 0:

                // look for which text is selected
                switch (textId) {
                    case 0:
                        text = "Hello, am debug text";
                        locationX = getWorld().getWidth() / 2;
                        locationY = getWorld().getHeight() / 2;
                        break;

                    // Shows which textId is selected, should only appear when textId doesn't exist
                    default:
                        text = "Hellow, wrong textId: " + textId;
                        locationX = getWorld().getWidth() / 2;
                        locationY = getWorld().getHeight() / 2;
                        break;
                }
                // end of possible English text
                break;
            // End of English
            // Dutch is selected
            case 1:
                text = "NL selected";
                locationX = getWorld().getWidth() / 2;
                locationY = getWorld().getHeight() / 2;
                // Dutch: only if time
                break;
            // End of Dutch
            default:
                text = "How did you get a different langId?: " + langId;
                locationX = getWorld().getWidth() / 2;
                locationY = getWorld().getHeight() / 2;
                break;
        }

        getWorld().showText(text, locationX, locationY);
    }
}
