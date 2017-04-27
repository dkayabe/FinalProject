import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Tower
{
    protected int damage, cost;
    protected double xPos, yPos;
    /**
     * Constructor for objects of class Tower
     */
    public Tower(int d, int c, double xPos, double yPos)
    {
        damage = d;
        cost = c;
        this.xPos = xPos;
        this.yPos = yPos;
        
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getCost() {
        return cost;
    }
    
    public double getXpos()
    {
        return xPos;
    }
    public double getYpos()
    {
        return yPos;
    }
    
    public abstract void draw(Graphics g);
}
