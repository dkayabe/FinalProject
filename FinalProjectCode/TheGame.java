import java.util.*;
import javax.swing.JFrame;
import java.awt.Color;

/**
 * Write a description of class TheGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheGame 
{
    /** description of instance variable x (add comment for each instance variable) */
   

    public static void main(String[] args) throws InterruptedException
    {
       
      
       JFrame frame = new JFrame();
       frame.setSize(1000, 800);
       
       
       

        //Level 1
       //Draws enemy with full health bar
       frame.getContentPane().setBackground(Color.white);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       AutonomousCotton enemy1 = new AutonomousCotton(50, 200);
       frame.add(enemy1);
       frame.setVisible(true);
       
       
        //new heroes
       InfernoRifleBestie hero1 = new InfernoRifleBestie(0, 0);
       frame.add(hero1);
       frame.setVisible(true);
       ChiefPat hero2 = new ChiefPat(250, 300);
       frame.add(hero2);
       frame.setVisible(true);
       //lukeskywalker hero3 = new lukeskywalker(700, 500);
       //frame.add(hero3);
       //frame.setVisible(true);
       //Draws heroes with full health bars
       
       //While loop that runs while enemys have health
            //Daniel Hero Turn
                //Chooses move
                //Shows moves
                //Does damage based on move
                //If enemy health is below, change to zero so health bar doesn't glitch out
                    //If enemy health is zero, remove enemy
                //Shows health bar
                //Checks if its a super move
                    //If super move minus 5 elixer
                //If not plus 1 elixer
                    //if elixir is max, then don't add
                
            //Enemy turn (if has health)
            //David Hero Turn (if any enemy has health)
            //Enemy turn (if has health)
            //Tanair Hero Turn (if any enemy has health)
            //Enemy turn (if has health)
    }
    
    
    }


