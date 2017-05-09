import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
/**
 * Write a description of class MachineGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MachineGun extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;

    Graphics2D g2;
    
    private Line2D[] bullets = new Line2D[5];
    /**
     * Default constructor for objects of class MachineGun
     */
    public MachineGun(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        
        Line2D.Double b1 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b2 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b3 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b4 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b5 = new Line2D.Double(newX, y, x, y);
        
        
        bullets = {b1, b2, b3, b4, b5};
    }

    

}
