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
   
    private int w = 19;
    private int h = 20;
    private int count = 0;
    
  
  
    
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
       
        
      
   
        
        count ++;
        if (count < 10){
        w ++;
        h +=5;
       }
       else{
            h -= 9;
            w += 2;
        }
        
       if (h > 0){
           g.drawImage(poison, x + 100 , y + 20, w, h, this);
        g.drawImage(poison, x + 120, y + 90 , w, h, this);
        g.drawImage(poison, x + 50, y + 100, w, h, this);
        g.drawImage(poison, x + 80 , y + 160, w, h, this);
        g.drawImage(poison, x + 60, y + 120 , w, h, this);
        g.drawImage(poison, x + 150, y + 10, w, h, this);
       }
       
    }
    
   
    public void reset(int EnemyX, int EnemyY)
    {
        x = EnemyX;
        y = EnemyY;
        
        count = 0;
        h = 20;
        w = 20;
        
      
        
    }
    public void Attack()
    {
        y -= 3;
        
        
       
        
        
      
        repaint();
    }
    
   
    
    public void setX(int sX)
    {
        x = sX;
    }
   
    public void setY(int sY)
    {
        y = sY;
    }
}
