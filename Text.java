import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This actor is an important reference for all the text that appears in the game. 
 * Instead of hardcoding the text within different actors and having to search for 
 * it when you need to edit some text, you can just do so here.
 * 
 * This also allows us to add support for a different language (For example Dutch 
 * like we planned if we have time).
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

    // Constructor variables to local variables
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
