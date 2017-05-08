
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
 * Write a description of class ChiefPat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChiefPat implements Hero
{
   
    private int health = 10000;
    private int damage = 2000;
    private int dx;
    private int dy;
    private int x;
    private int y;
    try
    private BufferedImage pat = (ImageIO.read(new File("Images/ChiefPat.png")));
    private int w = pat.getWidth(null);
    private int h = pat.getHeight(null);
    
   
    

    public ChiefPat(int X, int Y)
    {
        x = X;
        y = Y;
    }
    
    public void setHealth(int health)
    {
        
        
    }
    
    public void setDamage(int damage)
    {
        
        
        
        
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getHealth()
    {
        return health;
        
    }
   
    public void move()
    {
        
        
    }
    
    public void showHealthBar()
    {
        
        
    }
    
    public void moveLeft(Graphics g){
        x += 5;
        
        
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
}
