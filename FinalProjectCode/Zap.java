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
public class Zap extends JComponent
{
   
 
    private int dy;
    private int x;
    private int y;
    private BufferedImage zap;
    private int oldx;
    private int oldy;
    private int count = 1;
  
  
    
   //
    

    public Zap(int X, int Y)
    {
        x = X;
        y = Y;
        oldx = X;
        oldy = Y;
        try{
        zap = (ImageIO.read(new File("Images/Zap.png")));
       }
       catch (IOException e) {
            
       }
    }
    
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(zap, x, y, 50, 150, this);
        
    }
    
   
    public void Attack(int EnemyX, int EnemyY)
    {
        x = EnemyX - 20;
        y += 5;
        if (EnemyY - 150 <= y){
            y+= 1000;
        }
        count++;
        if (count %20 == 0){
            y += 1000;
            
        }
        
        
      
        repaint();
    }
    
    public void Remove(){
        x = 200;
        y = 200;
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
