import javax.swing.*;
import java.awt.*;
public class skywalker_viewer
{
    public static void main(String args[])throws InterruptedException{
        JFrame frame = new JFrame();
        
        frame.setSize(1365,1200);
        frame.setTitle("Luke Skywalker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lukeskywalker hero = new lukeskywalker(0,0);
        int enemyX = 800;
        int enemyY = 300;
        lukeskywalker enemy = new lukeskywalker(enemyX,enemyY);
        
        death_star special = new death_star(800,200);
        lightsaber_throw saber = new lightsaber_throw(800,300);
        frame.add(hero);
        frame.setVisible(true);
        frame.add(enemy);
        frame.setVisible(true);
        frame.add(special);
        frame.setVisible(true);
        
        
        for (int i =0; i<100;i++){
            enemy.moveToEnemy(0,0);
            Thread.sleep(17);
        }
        
        for (int i =0; i<500;i++){
            enemy.moveBack();
            Thread.sleep(17);
        }
        
       
       
       for(int i =0;i<=200;i++){
           special.moveToEnemy(0);
           Thread.sleep(17);
       }
       
       for(int i =0;i<=200;i++){
           special.fire_laser();
           Thread.sleep(17);
       }
       
       for(int i =0;i<=200;i++){
           special.moveBack();
           Thread.sleep(17);
       }
       
      
      for(int i=0;i<=200;i++){
          special.laser(0);
          Thread.sleep(17);
      }
      
     for(int i=0;i<=5000;i++){
         enemy.lightsaber_throw(0);
         Thread.sleep(17);
     }
    }
  
}