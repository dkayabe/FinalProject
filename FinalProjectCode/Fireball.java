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
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    
    private BufferedImage fireball;
    /**
     * Default constructor for objects of class Fireball
     */
    public Fireball(int x, int y)
    {
        this.x = x;
        this.y = y;
        
        try {
            fireball = ImageIO.read(new File("Images/Fireball.png"));
        }
        catch (IOException e) {
            
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fireball, x, y, 300, 50, this);
    }
    
    public void attack() throws InterruptedException{
        for (int i = 0; i < 30; i++) {
            x -= 2;
            repaint();
            Thread.sleep(1);
        }
        repaint();
        Thread.sleep(10);
        
    }
}
