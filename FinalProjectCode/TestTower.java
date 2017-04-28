import java.applet.Applet;
import java.awt.*;
/**
 * Write a description of class TestTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTower extends Applet
{
   private final int APPLET_WIDTH = 600;
   private final int APPLET_HEIGHT = 600;
   
    
   //new towers
   private Cannon c1;
   private XBow x1;
   public void init() {
      setBackground (Color.BLUE);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
      c1 = new Cannon(400, 200, 300, 300);
      x1 = new XBow(200, 400, 200, 200);
    }
   
   public void paint (Graphics page) {
       c1.draw(page);
       x1.draw(page);
      
    }
    
    
}
