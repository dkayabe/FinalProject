import java.util.*;
import javax.swing.JFrame;
import java.awt.Color;
/**
 * Write a description of class Viewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Viewer
{
    final static int ANIMATION_TIME_IN_SECONDS = 30;
    static int x = 350;
    static int y = 200;
    static int updateX;
    static int updateY;
    public static void main(String[] args)throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(1000, 800);
        frame.setTitle("Inferno Rifle Bestie");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //new heroes
        InfernoRifleBestie h1 = new InfernoRifleBestie(x,y);
        AutonomousCotton ct1 = new AutonomousCotton(100,100);
        
        
        
        //bullets
        Fireball f1;
        Flamethrower r1;
        BestieBlast b1;
        LaserBlast lb = new LaserBlast(100 + 125,100 - 70);

        

        
        
        frame.add(ct1);
        frame.setVisible(true);

        frame.setVisible(true);
        frame.add(h1);
        frame.setVisible(true);
        
        //goes forward
        for( int i = 0; i < ANIMATION_TIME_IN_SECONDS; i++ )
        {
            h1.moveLeft(100,100);

            Thread.sleep(50);
            frame.setVisible(true);
            
        }
        //System.out.println(x+" "+y);
        updateX = h1.getX();
        updateY = h1.getY();
        //System.out.println(updateX+" "+updateY);
        Thread.sleep(500);
        
        
        //bullets
        f1 = new Fireball(updateX + 100, updateY + 100);
        frame.add(f1);
        for (int i = 0; i < 30; i++) {
            f1.attack();
            Thread.sleep(50);
            frame.setVisible(true);
        }
        Thread.sleep(2000);
        
        r1 = new Flamethrower(updateX - 100, updateY + 75);
        frame.add(r1);
        frame.setVisible(true);
        Thread.sleep(1000);
        for (int i = 0; i < 30; i++) {
            r1.attack();
            Thread.sleep(1);
            //frame.setVisible(true);
        }
        
        Thread.sleep(2000);
        
        b1 = new BestieBlast(updateX, updateY - 25);
        frame.add(b1);
        frame.setVisible(true);
        Thread.sleep(2000);
        for (int i = 0; i < 30; i++) {
            b1.adjustSize();
            Thread.sleep(1);
            frame.setVisible(true);
        }
        
        Thread.sleep(5000);
        
        
        //cotton's turn
        frame.add(lb);
        frame.setVisible(true);
        Thread.sleep(2000);
        for (int i = 0; i < 30; i++) {
            lb.adjustSize();
            Thread.sleep(1);
            frame.setVisible(true);
        }

        
        
        //goes back
        for( int i = 0; i < ANIMATION_TIME_IN_SECONDS; i++ )
        {
            h1.moveRight(100,100);
            
            Thread.sleep(50);
            frame.setVisible(true);
            
        }

        frame.setVisible(true);
    }
    
    
}
