import greenfoot.*;

public class BackButton extends Actor {
    public BackButton() {
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
            Greenfoot.setWorld(new MainMenu());
        }
    }
}