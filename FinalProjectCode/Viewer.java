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
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("Inferno Rifle Bestie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        InfernoRifleBestie h1 = new InfernoRifleBestie(200,100);


        
        InfernoRifleBestie[] heroes = {h1};
        for (InfernoRifleBestie h:heroes) {
            frame.add(h);
            frame.setVisible(true);
        }
        
        frame.setVisible(true);
    }
}
