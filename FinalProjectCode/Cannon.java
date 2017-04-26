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
    /**
     * Constructor for objects of class Cannon
     */
    public Cannon(int damage, int cost, double radius, double xPos, double yPos)
    {
        super(damage, cost, xPos, yPos);
        this.radius = radius;
        width = 10;
        height = 30;
    }
    
    public void draw(Graphics g) {
        
    }
}
