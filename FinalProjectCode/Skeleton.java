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
public class ChiefPat extends JComponent
{

    private int health = 5000;
    private int damage = 1000;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private BufferedImage skele;
    private int oldx;
    private int oldy;






    public Skeleton(int X, int Y)
    {
        x = X;
        y = Y;
        oldx = X;
        oldy = Y;
        try{
        skele = (ImageIO.read(new File("Images/Skeleton.png")));
       }
       catch (IOException e) {

       }
    }

  

    public int getDamage()
    {
        return damage;
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(skele, x, y, 250, 200, this);

    }
    public int getHealth()
    {
        return health;

    }
    public void setHealth(int h)
    {
        health = h;

    }

    public void Show()
    {
       
        repaint();
    }

    public void showHealthBar()
    {


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
