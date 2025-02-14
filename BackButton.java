import greenfoot.*;

/*
 * Go back to the main menu
 * 
 * @jesse
 * @14/02/2025
 */

public class BackButton extends Actor
{
    int volume;
    int gameSpeed;
    boolean music;
    int langId;

    public BackButton(int volumeSet, int gameSpeedSet, boolean musicSet, int languageId)
    {
        volume = volumeSet;
        gameSpeed = gameSpeedSet;
        music = musicSet;
        langId = languageId;

        GreenfootImage img = new GreenfootImage(100, 40);
        img.setColor(Color.RED);
        img.fillRect(0, 0, 100, 40);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Arial", 16));
        img.drawString("Terug", 25, 25);
        setImage(img);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MainMenu(volume, gameSpeed, music, langId));
        }
    }
}
