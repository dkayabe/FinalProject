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

        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //new heroes


        ChiefPat c1 = new ChiefPat(390,220);
        Zap z1 = new Zap(200,0);
        frame.add(z1);
        frame.setVisible(true);
        Poison p1 = new Poison(200,0);
        frame.add(p1);
        frame.setVisible(true);
        Heal h1 = new Heal(200,0);
        frame.add(h1);
        frame.setVisible(true);
        frame.add(c1);
        frame.setVisible(true);
        AutonomousCotton ct1 = new AutonomousCotton(100,200);
        frame.add(ct1);
        frame.setVisible(true);

        //goes forward
        for( int i = 1; i < ANIMATION_TIME_IN_SECONDS; i++ )
        {

            c1.MoveToEnemy(0, 0);
            z1.Attack(100, 200);
            
         
            Thread.sleep(50);
            frame.setVisible(true);
            
        }
        Thread.sleep(500);
         for( int i = 1; i < ANIMATION_TIME_IN_SECONDS; i++ )
        {

            c1.MoveToEnemy(0, 0);
            p1.Attack();
            
         
            Thread.sleep(50);
            frame.setVisible(true);
            
        }
        Thread.sleep(500);
        for( int i = 1; i < ANIMATION_TIME_IN_SECONDS; i++ )
        {

            c1.MoveToEnemy(0, 0);
            h1.Attack();
            
         
            Thread.sleep(50);
            frame.setVisible(true);
            
        }



    }
}