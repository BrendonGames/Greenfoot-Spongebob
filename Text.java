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
    private boolean textShown;
    private int appearTime;

    // Constructor variables to local variables
    public Text(int langIdConstructor, int textIdConstructor)
    {
        langId = langIdConstructor;
        textId = textIdConstructor;
        textShown = false;
    }
    
    public void act()
    {
        // Checks whether text is already shown 
        if (!textShown) {
            switch (langId) {
                // English is selected
                case 0:

                    // look for which text is selected
                    switch (textId)
                    {
                        case 0:
                            text = "Hello, am debug text";
                            locationX = getWorld().getWidth() / 2;
                            locationY = getWorld().getHeight() / 2;
                            break;

                        case 1:
                            text = "GARY, WHERE ARE YOU!?";
                            locationX = 731;
                            locationY = 469;
                            appearTime = 125;
                            break;

                        case 2:
                            text = "No... he's not at home";
                            locationX = 731;
                            locationY = 469;
                            appearTime = 100;
                            break;

                        case 3:
                            text = "WHAT DO YOU WANT\nSPONGEBOB!?\nGO AWAY!\n(Gained 10 jellyfish for annoying Squidward)";
                            locationX = 472;
                            locationY = 350;
                            appearTime = 150;
                            break;

                        case 4:
                            text = "Maybe Gary's over here!?\nPatrick's not home, it'll probably be fine to go in";
                            locationX = 220;
                            locationY = 450;
                            appearTime = 200;
                            break;

                        case 5:
                            text = "Press space on '?' to interact";
                            locationX = getWorld().getWidth() / 2;
                            locationY = 10;
                            appearTime = -1;
                            break;

                        case 6:
                            text = "Press space to jump";
                            locationX = getWorld().getWidth() / 2;
                            locationY = 10;
                            appearTime = -1;
                            break;

                        case 7:
                            text = "GARY, THERE YOU ARE!";
                            locationX = 888;
                            locationY = 608;


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
            textShown = true;
        }
        
        appearTime--;

        // Text appears for appearTime amount of acts
        if (appearTime == 0)
        {
            getWorld().showText("", locationX, locationY);
            getWorld().removeObject(this);
        }
    }
}
