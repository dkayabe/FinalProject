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
  
  
    
   
    

    public Zap(int X, int Y)
    {
        x = X;
        y = Y;
        try{
        zap = (ImageIO.read(new File("Images/Zap.png")));
       }
       catch (IOException e) {
            
       }
    }
    
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(zap, x, y, 250, 200, this);
        
    }
    
   
    public void MoveToEnemy(int EnemyX, int EnemyY)
    {
        x += (int)((EnemyX-x)/10)  ;
        y += (int)((EnemyY-y)/10) ;
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
