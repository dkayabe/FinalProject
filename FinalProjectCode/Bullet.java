import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    private int distance;
    Graphics2D g2;
    /**
     * Default constructor for objects of class Bullet
     */
    public Bullet(int x, int y)
    {
        this.x = x;
        this.y = y;
        distance = 10;
    }
    
    
    public void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
        
        //draw bullet
        Line2D.Double bullet = new Line2D.Double(x - distance, y, x, y);
        g2.setColor(Color.YELLOW);
        g2.draw(bullet);
        repaint();
        
    }
    
    public void movement() {
        
        x -= 1;
        repaint();
        
    }
    
    
}
