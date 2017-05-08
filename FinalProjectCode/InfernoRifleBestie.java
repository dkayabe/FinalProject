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
import java.awt.image.BufferedImage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
    
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private BufferedImage img;
    
    
    
    /**
     * Constructor for objects of class InfernoRifleBestie
     */
    public InfernoRifleBestie(int x, int y)
    {
        
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
    
    public void moveLeft() {
        x -= 5;
        
        repaint();
    }
    
    public void moveRight() {
        x += 5;
        
        repaint();
    }
    
    
}

