import java.util.*;
import javax.swing.JFrame;
import java.awt.Color;
/**
 * Write a description of class Viewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChiefPatTesting
{
    final static int ANIMATION_TIME_IN_SECONDS = 20;
   
    public static void main(String[] args)throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(1000, 800);
        frame.setTitle("Inferno Rifle Bestie");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //new heroes
      
        
        ChiefPat c1 = new ChiefPat(390,220);
        
       
        frame.add(c1);
        frame.setVisible(true);
        AutonomousCotton ct1 = new AutonomousCotton(0,0);
        frame.add(ct1);
        frame.setVisible(true);
        
        //goes forward
        for( int i = 0; i < ANIMATION_TIME_IN_SECONDS; i++ )
        {
            
            c1.MoveToEnemy(0, 0);
            Thread.sleep(50);
            frame.setVisible(true);
            
        }
        
       
        
    }
}