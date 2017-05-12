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

    private int health = 10000;
    private int damage = 2000;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private BufferedImage pat;
    private int oldx;
    private int oldy;






    public ChiefPat(int X, int Y)
    {
        x = X;
        y = Y;
        oldx = X;
        oldy = Y;
        try{
        pat = (ImageIO.read(new File("Images/ChiefPat.png")));
       }
       catch (IOException e) {

       }
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
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(pat, x, y, 250, 200, this);

    }
    public int getHealth()
    {
        return health;

    }

    public void MoveToEnemy(int EnemyX, int EnemyY)
    {
        x += (int)((EnemyX-oldx)/30)  ;//because x changes
        y += (int)((EnemyY-oldy)/20) ;//because y changes
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
    public void setOldX()
    {
        oldx = x;
    }

    public void setOldY()
    {
        oldy = y;
    }
}
