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
 * Write a description of class AutonomousCotton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutonomousCotton extends JComponent
{
    // instance variables - replace the example below with your own
    Graphics2D g2;
    
    private int x;
    private int y;
    
    private BufferedImage img;
    
    private int hp;
    private int atk;

    /**
     * Constructor for objects of class AutonomousCotton
     */
    public AutonomousCotton(int x, int y)
    {
        hp = 500000;
        atk = 2000;
        
        this.x = x;
        this.y = y;
        
        try {
            img = ImageIO.read(new File("Images/AutonomousCotton.png"));
        }
        catch (IOException e) {
            
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, x, y, 120, 77, this);
        
    }
    
    public void takeDamage(int incDmg) {
        hp -= incDmg;
    }
}
