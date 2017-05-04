/*
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.util.*;
*/
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 * Write a description of class InfernoRifleBestie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfernoRifleBestie extends JPanel
{
    // instance variables - replace the example below with your own
    Graphics2D g2;
    
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private BufferedImage img;
    
    private ImageIcon hero;
    /**
     * Constructor for objects of class InfernoRifleBestie
     */
    public InfernoRifleBestie()
    {
        hero = new ImageIcon("InfernoRifleBestie.PNG");
        x = 40;
        y = 60;
    }
    
    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
        
        try {
            URL url = new URL("inferno_rifle_bestie.gif");
            img = img = ImageIO.read(url);
        }
        catch (Exception e) {
            
        }
        g2.drawImage(hero5, 5, this);
    }
    
    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

}

