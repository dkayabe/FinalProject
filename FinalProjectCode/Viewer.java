import java.util.*;
import javax.swing.JFrame;
/**
 * Write a description of class Viewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Viewer
{
    final static int ANIMATION_TIME_IN_SECONDS = 30;
    public static void main(String[] args)throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("Inferno Rifle Bestie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //new heroes
        InfernoRifleBestie h1 = new InfernoRifleBestie(250,200);
        //ChiefPat c1 = new ChiefPat(700,0);
        
        frame.add(h1);
		
        frame.setVisible(true);
        
        //goes forward
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            h1.moveLeft();
            
            Thread.sleep(50);
            frame.setVisible(true);
            
        }
        Thread.sleep(1000);
        //goes back
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            h1.moveRight();
            
            Thread.sleep(50);
            frame.setVisible(true);
            
        }

        frame.setVisible(true);
    }
}
