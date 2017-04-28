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
    
    private Color color;
    private boolean upgraded = false;

    private double range;
    private double distance;

    /**
     * Constructor for objects of class Cannon
     */
    public Cannon(int damage, int cost, double xPos, double yPos)
    {
        super(damage, cost, xPos, yPos);
        radius = 30;
        
        range = 180;
        
        color = Color.YELLOW;
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval((int)(xPos), (int)(yPos), (int)(radius), (int)(radius));
    }
    
    public boolean target(double x, double y) {
        distance = Math.sqrt(Math.pow((xPos - x), 2) + Math.pow((yPos - y), 2));
        
        if (distance <= range) {
            return true;
        }
        else {
            return false;
        }
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
