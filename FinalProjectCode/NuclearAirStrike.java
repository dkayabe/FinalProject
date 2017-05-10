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
 * Write a description of class NuclearStrike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NuclearAirStrike extends JComponent
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    private BufferedImage rocketdown;
    /**
     * Constructor for objects of class NuclearStrike
     */
    public NuclearAirStrike()
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        
        try {
            rocketdown = ImageIO.read(new File("Images/rocketdown.png"));
        }
        catch (IOException e) {
            
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(rocketdown, x, y, 300, 50, this);
    }
    
    public void moveDown() throws InterruptedException{
        for (int i = 0; i < 30; i++) {
            y += 5;
            repaint();
            Thread.sleep(1);
        }
        repaint();
        Thread.sleep(10);
    }
}
