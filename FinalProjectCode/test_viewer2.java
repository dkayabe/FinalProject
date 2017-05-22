import javax.swing.*;
import java.awt.*;
import java.util.*;
public class test_viewer2
{
    public static void main(String args[])throws InterruptedException{
        Scanner keyboard = new Scanner(System.in);
        JFrame frame = new JFrame();
        
        frame.setSize(1365,1200);
        frame.setTitle("Test Game Fram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        AutonomousCotton enemy = new AutonomousCotton(0,0);
  
        InfernoRifleBestie hero = new InfernoRifleBestie(200,200);
        lukeskywalker  hero2 = new lukeskywalker(600,100);
        
        Fireball fire1 = new Fireball(0,0);
        
        
        frame.add(hero);
        frame.setVisible(true);
        
        frame.add(hero2);
        frame.setVisible(true);
        
        frame.add(enemy);
        frame.setVisible(true);
        
        int turn=0;
        System.out.println("Attack moves:\nBasic - 1\nThrow - 2\nSpecial -3\n");
        int attack = 0;
     
        
        while (true){
        if (turn ==0){
            System.out.println("HERO 1 turn");
            System.out.println("Choose an Attack {1,2,3}");
            attack = keyboard.nextInt();
            if (attack == 1){
                for (int i =0; i<30;i++){
                    hero.moveLeft(0,0);
                    frame.setVisible(true);
                    Thread.sleep(17);
                 }
                 frame.add(fire1);
                 fire1.setCoord(hero.getX() + 100, hero.getY() + 25);
                 frame.setVisible(true);
                 for (int i = 0; i < 30; i++) {
                     fire1.attack();
                     Thread.sleep(17);
                    }
                for (int i =0; i<30;i++){
                    hero.moveRight(0,0);
                    Thread.sleep(17);
                 }
            }

        }
        break;
    }
}
}