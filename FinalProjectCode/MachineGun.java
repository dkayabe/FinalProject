import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.*;

import java.io.*;

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
    
    Line2D.Double b1;
    Line2D.Double b2;
    Line2D.Double b3;
    Line2D.Double b4;
    Line2D.Double b5;
    
    private Line2D[] bullets = {b1, b2, b3, b4, b5};
    /**
     * Default constructor for objects of class MachineGun
     */
    public MachineGun(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        
        
        Line2D.Double b1 = new Line2D.Double(x - 10, y, x, y);
        Line2D.Double b2 = new Line2D.Double(x - 10, y, x, y);
        Line2D.Double b3 = new Line2D.Double(x - 10, y, x, y);
        Line2D.Double b4 = new Line2D.Double(x - 10, y, x, y);
        Line2D.Double b5 = new Line2D.Double(x - 10, y, x, y);
        
        
        
    }

    
    public void paintComponent(Graphics g){
        g2 = (Graphics2D) g;
        g2.setColor(Color.YELLOW);
        
        for (Line2D line:bullets) {
            g2.draw(line);
            for (int i = 0; i < 30; i++) {
                x -= 5;
                repaint();
                try {
                    Thread.sleep(1);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            repaint();
            try {
                Thread.sleep(10);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
        }
        repaint();
    }

}
