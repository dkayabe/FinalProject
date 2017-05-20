import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/**
 * Write a description of class UserInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInterface extends JComponent
{
    // instance variables - replace the example below with your own
    private int x1 = 300;
    private int y1 = 300;
    private int width1 = 200;
    private int width2 = 200;
    private int width3 = 200;
    private int height1 = 15;
    
    private double temp;
    private double temp2;
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.GREEN);
        
        //healthbars
        Rectangle bar1 = new Rectangle(x1, y1, width1, height1);
        Rectangle bar2 = new Rectangle(x1,(y1 + 65),width2, height1);
        Rectangle bar3 = new Rectangle(x1,(y1 + 130), width3, height1);
        
        
        g2.fill(bar1);
        g2.fill(bar2);
        g2.fill(bar3);
    }
    
    public void reduceBar(int num, int damage, int maxhp) {
        if (num == 1) {
            temp2 = maxhp - damage;
            temp = (temp2) / maxhp;
            width1 = (int)(temp * width1);
        }
        else if (num == 2) {
            width1 = (int)( ((maxhp - damage) / maxhp) * width1);
        }
        else if (num == 3) {
            width1 = (int)( ((maxhp - damage) / maxhp) * width1);
        }
        repaint();
    }
    
    public int getLength() {
        return width1;
    }
    
    public double getTemp() {
        return temp;
    }
    
    public double getTemp2() {
        return temp2;
    }
}
