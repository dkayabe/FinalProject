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
        
        InfernoRifleBestie h1 = new InfernoRifleBestie(250,200);
        frame.add(h1);
        
        /*
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            h1.attack();
            
            Thread.sleep( 100 );
            frame.setVisible(true);
            
        }
        */

        frame.setVisible(true);
    }
}
