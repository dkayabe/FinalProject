import javax.swing.*;
import java.awt.*;
public class skywalker_viewer
{
    public static void main(String args[])throws InterruptedException{
        JFrame frame = new JFrame();
        
        frame.setSize(1365,730);
        frame.setTitle("Luke Skywalker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lukeskywalker hero = new lukeskywalker(200,200);
        lukeskywalker enemy = new lukeskywalker(500,200);
        
        frame.add(hero);
        frame.setVisible(true);
        frame.add(enemy);
        frame.setVisible(true);
        
        for(int i = 0; i<= 100;i++){
            hero.moveRight();
            Thread.sleep(17);
        }
    
    
    }
  
}
