
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
import java.awt.geom.Line2D;
//import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;

/**
 * Write a description of class InfernoRifleBestie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfernoRifleBestie extends JComponent
{
    // instance variables - replace the example below with your own
    Graphics2D g2;
    
    private int x;
    private int y;
    
    private BufferedImage img;
    private BufferedImage rocketdown;

    
    private int hp;
    private int atk;
    
    
    /**
     * Constructor for objects of class InfernoRifleBestie
     */
    public InfernoRifleBestie(int x, int y)
    {
        hp = 10000;
        atk = 5000;
        
        this.x = x;
        this.y = y;
        
        //the hero
        try {
            img = ImageIO.read(new File("Images/InfernoRifleBestie.png"));
        }
        catch (IOException e) {
            
        }
        
        
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, x, y, 200, 119, this);
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getHP() {
        return hp;
    }
    
    public BufferedImage getImage() {
        return img;
    }
    
    public void moveLeft(int EnemyX, int EnemyY) {
        x += (int)((EnemyX - x) / 70);
        y += (int)((EnemyY - y) / 30) - 4;
        
        repaint();
    }
    
    public void moveRight(int EnemyX, int EnemyY) {
        x -= (int)((EnemyX - x) / 70);
        y -= (int)((EnemyY - y) / 30) - 4;
        
        repaint();
    }
    
    public void setHealth(int hpCount) {
        hp += hpCount;
    }
    
    
}

