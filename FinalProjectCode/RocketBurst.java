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
public class RocketBurst extends JComponent
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    private BufferedImage rocketleft;
    /**
     * Constructor for objects of class RocketBurst
     */
    public RocketBurst(int x, int y)
    {
        this.x = x;
        this.y = y;
        
        try {
            rocketleft = ImageIO.read(new File("Images/rocketleft.png"));
        }
        catch (IOException e) {
            
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(rocketleft, x, y, 300, 50, this);
    }
    
    public void moveLeft() throws InterruptedException{
        for (int i = 0; i < 30; i++) {
            x -= 5;
            repaint();
            Thread.sleep(1);
        }
        repaint();
        Thread.sleep(10);
        
    }
}
