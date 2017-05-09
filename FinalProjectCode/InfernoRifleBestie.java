
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

    public BufferedImage getImage() {
        return img;
    }
    
    public void moveLeft() {
        x -= 5;
        
        repaint();
    }
    
    public void moveRight() {
        x += 5;
        
        repaint();
    }
    
    public void takeDamage(int incDmg) {
        hp -= incDmg;
    }
    
    public void machineGun(Graphics g) throws InterruptedException{
        g2 = (Graphics2D) g;
        int newX = x - 10;
        
        Line2D.Double b1 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b2 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b3 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b4 = new Line2D.Double(newX, y, x, y);
        Line2D.Double b5 = new Line2D.Double(newX, y, x, y);
        
        
        Line2D[] bullets = {b1, b2, b3, b4, b5};
        g2.setColor(Color.YELLOW);
        for (Line2D line:bullets) {
            g2.draw(line);
            for (int i = 0; i < 30; i++) {
                newX -= 5;
                repaint();
                Thread.sleep(1);
            }
            repaint();
            Thread.sleep(10);
        }
        
        repaint();
    }
    
    public void rocketBurst(Graphics g) {
        g2 = (Graphics2D) g;
    }
}

