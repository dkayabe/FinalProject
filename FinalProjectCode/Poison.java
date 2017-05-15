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
public class Poison extends JComponent
{
   
 
    private int dy;
    private int x;
    private int y;
    private BufferedImage poison;
    private int oldx;
    private int oldy;
    private int count = 1;
    private int w = 20;
    private int h = 20;
    private boolean down = false;
  
  
    
   //
    

    public Poison(int X, int Y)
    {
        x = X;
        y = Y;
        oldx = X;
        oldy = Y;
        try{
        poison = (ImageIO.read(new File("Images/Poison.png")));
       }
       catch (IOException e) {
            
       }
    }
    
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(poison, x + 20, y + 200, w, h, this);
        g.drawImage(poison, x + 50, y + 100, w, h, this);
        g.drawImage(poison, x + 80, y + 400, w, h, this);
        
    }
    
   
    public void Attack(int EnemyX, int EnemyY)
    {
        x = EnemyX;
        
        
        if (EnemyY - 20 == y || down == true){
            down = true;
            y-= 4;
        }
        y += 2;
        
        
      
        repaint();
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
