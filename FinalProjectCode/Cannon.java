import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Tower
{
    // instance variables - replace the example below with your own
    private double radius;
    private double width;
    private double height;
    private Color color;
    private boolean upgraded = false;
    private double range;

    /**
     * Constructor for objects of class Cannon
     */
    public Cannon(int damage, int cost, double xPos, double yPos)
    {
        super(damage, cost, xPos, yPos);
        radius = 30;
        width = 10;
        height = 30;
        range = 180;
        
        color = Color.YELLOW;
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval((int)(xPos), (int)(yPos), (int)(radius), (int)(radius));
        g.setColor(Color.GRAY);
        g.fillRect((int)(xPos + 10), (int)(yPos - 15), (int)(width), (int)(height));
    }
    
    public void target(double x, double y) {
        
    }
    
    public int upgrade(int money) {
        if (money >= 400) {
            damage = 800;
            upgraded = true;
            return 400;
        }
        else{
            return 0;
        }
    }
}
