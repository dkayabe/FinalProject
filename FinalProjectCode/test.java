import java.util.*;
import javax.swing.JFrame;
import java.awt.Color;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setSize(800,700);
        frame.setTitle("Health Bar Test");
        
        UserInterface u1 = new UserInterface();
        
        frame.add(u1);
        frame.setVisible(true);
        
        u1.reduceBar(1,5000,10000);
        frame.setVisible(true);
        
        System.out.println(u1.getLength()+" "+u1.getTemp()+" "+u1.getTemp2());
        
    }
}
