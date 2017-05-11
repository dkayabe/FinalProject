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
        RocketBurst r1;
        NuclearAirStrike n1 = new NuclearAirStrike(150,-50);
        
        ChiefPat c1 = new ChiefPat(390,220);
        
        
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
        f1 = new Fireball(updateX + 100, updateY + 50);
        frame.add(f1);
        for (int i = 0; i < 30; i++) {
            f1.attack();
            Thread.sleep(50);
            frame.setVisible(true);
        }
        Thread.sleep(2000);
        
        r1 = new RocketBurst(updateX + 100, updateY + 50);
        frame.add(r1);
        for (int i = 0; i < 30; i++) {
            r1.attack();
            Thread.sleep(50);
            frame.setVisible(true);
        }
        
        Thread.sleep(2000);
        
        frame.add(n1);
        for (int i = 0; i < 30; i++) {
            n1.attack();
            Thread.sleep(50);
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
