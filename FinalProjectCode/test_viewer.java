import javax.swing.*;
import java.awt.*;
import java.util.*;
public class test_viewer
{
    public static void main(String args[])throws InterruptedException{
        Scanner keyboard = new Scanner(System.in);
        JFrame frame = new JFrame();
        
        frame.setSize(1365,1200);
        frame.setTitle("Test Game Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        lukeskywalker enemy = new lukeskywalker(0,0);
  
        lukeskywalker  hero = new lukeskywalker(600,400);
        lukeskywalker  hero2 = new lukeskywalker(600,0);
        
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
        //first player's turn
        if (turn ==0){
            System.out.println("HERO 1 turn");
            System.out.println("Choose an Attack {1,2,3}");
            
            //checks for a vaild attack number
            while(true){
                attack = keyboard.nextInt();
                if (attack != 1 &&attack != 2 && attack != 3){
                    System.out.println("Invalid Attack ");
                }else
                    break;
            }
 
        
            if (attack == 1){
                for (int i =0; i<100;i++){
                    hero.moveToEnemy(0,0);
                    Thread.sleep(17);
                 }
                for (int i =0; i<300;i++){
                    hero.moveBack();
                    Thread.sleep(17);
                 }
                turn = 1;
                
            }

        }
        
        //second players turn
        if (turn == 1){
            System.out.println("ENEMY'S turn");
            System.out.println("Choose an Attack {1,2,3}");
            attack = keyboard.nextInt();
            System.out.println(attack);
            if (attack == 1){
                for (int i =0; i<100;i++){
         
                    enemy.moveToEnemy2(600,600);
                    Thread.sleep(17);
                 }
                for (int i =0; i<300;i++){
                    enemy.moveBack();
                    Thread.sleep(17);
                 }
                turn = 2;
            }

        }
        
        break;
    }
}
}