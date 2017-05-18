import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
public class death_star extends JComponent
{
  private BufferedImage image;
  private BufferedImage laser;
  private int x;
  private int y;
  private int laser_y;
  private int laser_x;
  private int origX;
  private int origY;
  int fire_weapon = 0;
  int spawn = 0;
  int action1 =0;
  int trigger=0;
  public death_star(int posx, int posy){
      x = posx;
      y = posy;
      origX = posx;
      origY = posy;
      try{
          image = ImageIO.read(new File("Images\\death_star.png"));
          laser = ImageIO.read(new File("Images\\laser.png"));
          
        } catch(IOException e){
            System.out.println(e);
        }
    
  }
  
  public void moveToEnemy(int enemyY){
      x = origX-100;
      if (y >= enemyY+75){
          y-= 5;
          repaint();
      }
    }
  
  public void updateLoc(){
      laser_x = x-300;
      laser_y = y-70;
  }
  
  public void fire_laser(){
      if (trigger == 0){
      this.updateLoc();
      this.trigger++;
    }
      fire_weapon = 1;
      if (laser_x >= -500){
          laser_x -= 7;
          repaint();
      }
    
  }
  
  public void moveBack(){
      fire_weapon = 0;
      if (y <= origY){
          y+=5;
          repaint();
      }
      
      if(y == origY){
          this.remove();
      }
  }
  
  public void remove(){
      spawn = 1;
      repaint();
  }
  
  public void laser(int enemyY){
      if(action1 ==0){
          this.moveToEnemy(enemyY);
          if (y == enemyY+75){
              action1 = 1;
          }
      }
      else if(action1 ==1){
        this.fire_laser();
        if(laser_x<=-300){
            action1 = 2;
        }
      }
      else if(action1 ==2){
          this.moveBack();
      }
  }
  public void paintComponent(Graphics g){
      super.paintComponent(g);
      if (spawn ==0){
      g.drawImage(image,x,y,this);
      }
      if (fire_weapon == 1){
         g.drawImage(laser,laser_x,laser_y,this);
      }
    }
}
