import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Write a description of class RocketBurst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamethrower extends JComponent
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    private int origX;
    private int origY;
    
    private int origWidth;
    private int origHeight;
    
    private int width;
    private int height;
    
    private BufferedImage rocketleft;
    

    /**
     * Constructor for objects of class RocketBurst
     */
    public Flamethrower(int x, int y)
    {
        this.x = x;
        this.y = y;
        origX = x;
        origY = y;
        
        width = 550;
        height = 100;
        origWidth = 550;
        origHeight = 100;
        try {
            rocketleft = ImageIO.read(new File("Images/flamethrower.png"));
        }
        catch (IOException e) {
            
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(rocketleft, x, y, width, height, this);
    }
    
    public void attack() throws InterruptedException{
        for (int i = 0; i < 30; i++) {
            if (width > 0) {
                width -= 1;
                height -= 2;
                y += 1;
                repaint();
                Thread.sleep(1);
            }
        }


        
    }
    
    public void reset() {
        x = origX;
        y = origY;
        width = origWidth;
        height = origHeight;
    }
}
