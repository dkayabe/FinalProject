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
 * Write a description of class LaserBlast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BestieBlast extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private int width;
    private int height;
    
    private int origX;
    private int origY;
    private int origWidth;
    private int origHeight;
    
    private BufferedImage img;
    /**
     * Default constructor for objects of class LaserBlast
     */
    public BestieBlast(int x, int y)
    {
        width = 800;
        height = 300;
        
        this.x = x - (width / 2);
        this.y = y;
        origX = x - (width / 2);
        origY = y;
        
        try {
            img = ImageIO.read(new File("Images/incineration.png"));
        }
        catch (IOException e) {
            
        }
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, x, y, width, height, this);

    }
    
    public void adjustSize() throws InterruptedException{
        for (int i = 0; i < 30; i++) {
            if (height > 0) {
                height -= 2;
                y += 1;
                repaint();
                Thread.sleep(1);
            }
        }
        repaint();
    }
    
    public void reset() {
        
    }
}
