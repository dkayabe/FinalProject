import javax.swing.*;
import java.awt.*;
public class skywalker_viewer
{
    public static void main(String args[])throws InterruptedException{
        JFrame frame = new JFrame();
        
        frame.setSize(1365,730);
        frame.setTitle("Luke Skywalker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lukeskywalker hero = new lukeskywalker(0,0);
        int enemyX = 600;
        int enemyY = 0;
        lukeskywalker enemy = new lukeskywalker(enemyX,enemyY);
        
        frame.add(hero);
        frame.setVisible(true);
        frame.add(enemy);
        frame.setVisible(true);
        
        for (int i =0; i<100;i++){
            hero.moveToEnemy(enemyX,enemyY);
            Thread.sleep(17);
        }
        
        for (int i =0; i<500;i++){
            hero.moveBack();
            Thread.sleep(17);
        }
        
        System.out.println();
    }
  
}
