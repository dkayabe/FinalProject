import java.util.*;
import javax.swing.JFrame;
import java.awt.Color;

/**
 * Write a description of class MainViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainViewer
{
    //hero
    static InfernoRifleBestie h1;
    
    //moves
    Fireball m1;
    Flamethrower f1;
    BestieBlast b1;
    
    //x and y stuff
    static int x = 350;
    static int y = 200;
    static int updateX;
    static int updateY;
    
    //frame
    static JFrame frame = new JFrame();
    public static void main(String[] args) throws InterruptedException {
        
        frame.setSize(1000, 800);
        frame.setTitle("Inferno Rifle Bestie");
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //bestie hero
        h1 = new InfernoRifleBestie(x,y);
    }
    
    public void atk1()throws InterruptedException {
        updateX = h1.getX();
        updateY = h1.getY();
        m1 = new Fireball(updateX + 100, updateY);
        frame.add(m1);
    }
    
    public void atk2()throws InterruptedException {
        
    }
    
    public void atk3()throws InterruptedException {
        
    }
}
