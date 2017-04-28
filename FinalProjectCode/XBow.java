import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class XBow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class XBow extends Tower
{
    // instance variables - replace the example below with your own
    private double radius;
    private Color color;
    private boolean upgraded = false;
    private double range;
    private double distance;
    private double side;

    /**
     * Constructor for objects of class XBow
     */
    public XBow(int damage, int cost, double xPos, double yPos)
    {
        super(damage, cost, xPos, yPos);
        side = 30;
        range = 210;
        color = new Color(130, 82, 1);
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect((int)(xPos - 30), (int)(yPos - 30), (int)(side), (int)(side));
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
