import greenfoot.*;

public class MenuButton extends Actor {
    private String text;
    private World targetWorld;

    public MenuButton(String text, World targetWorld) {
        this.text = text;
        this.targetWorld = targetWorld;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage img = new GreenfootImage(250, 50);
        img.setColor(Color.BLACK);
        img.fillRect(0, 0, 250, 50);
        img.setColor(Color.WHITE);
        img.drawRect(0, 0, 249, 49);
        img.setFont(new Font("Arial", 20));
        img.drawString(text, 20, 30);
        setImage(img);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(targetWorld);
        }
    }
}