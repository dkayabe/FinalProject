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
    public static void main(String[] args)throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(1000, 800);
        frame.setTitle("Inferno Rifle Bestie");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //new heroes
        InfernoRifleBestie h1 = new InfernoRifleBestie(x,y);
        AutonomousCotton ct1 = new AutonomousCotton(100,100);
        
        //moves
        MachineGun mg1 = new MachineGun(350,200);
        
        //bullets
        Bullet b1 = new Bullet(x + 40, y + 250);
        Bullet b2 = new Bullet(x + 40, y + 250);
        Bullet b3 = new Bullet(x + 40, y + 250);
        Bullet b4 = new Bullet(x + 40, y + 250);
        Bullet b5 = new Bullet(x + 40, y + 250);
        
        Bullet[] bullets = {b1, b2, b3, b4, b5};
        
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
        
        Thread.sleep(500);
        frame.add(mg1);
        for (int i = 0; i < ANIMATION_TIME_IN_SECONDS; i++) {
            mg1.attack();
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
